import Repositori.Features
import Repositori.Gasolineras
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.engine.cio.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.request.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.json.Json


suspend fun main(){
    val datosGasolineras : List<Features> = client().get("https://services1.arcgis.com/nCKYwcSONQTkPA4K/arcgis/rest/services/Gasolineras_Pro/FeatureServer/0/query?outFields=*&where=1%3D1&f=geojson").body()
    for (i in datosGasolineras){
        println(i)
    }
}
fun client () = HttpClient(CIO){
    install(ContentNegotiation) {
        json(Json {
            ignoreUnknownKeys = true
        })
    }
}