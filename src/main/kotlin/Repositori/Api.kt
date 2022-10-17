import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.engine.cio.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.request.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import java.sql.Timestamp

@Serializable
data class Gasolineras(@SerialName("Fecha")val fecha: Timestamp, @SerialName("ListaEESSPrecio")val listaEESSPrecio: ListaEESSPrecio)
@Serializable
data class ListaEESSPrecio(@SerialName("C.P.")val cp: String,
                           @SerialName("Dirección") val direccion: String)
suspend fun main() {
    val gasolineras: Gasolineras = client().get("https://sedeaplicaciones.minetur.gob.es/ServiciosRESTCarburantes/PreciosCarburantes/EstacionesTerrestres/").body()
    println(gasolineras)
}
fun client () = HttpClient(CIO){
    install(ContentNegotiation) {
        json(Json {
            ignoreUnknownKeys = true
        })
    }
}