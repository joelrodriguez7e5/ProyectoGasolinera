import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.engine.cio.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.request.*
import io.ktor.http.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import nl.adaptivity.xmlutil.serialization.XML
import java.net.URL
import java.sql.Timestamp
// To parse the JSON, install Klaxon and do:
//
//   val welcome10 = Welcome10.fromJson(jsonString)

import com.beust.klaxon.*

private val klaxon = Klaxon()

data class Welcome10 (
    @com.beust.klaxon.Json(name = "PreciosEESSTerrestres")
    val preciosEESSTerrestres: PreciosEESSTerrestres
) {
    public fun toJson() = klaxon.toJsonString(this)

    companion object {
        public fun fromJson(json: String) = klaxon.parse<Welcome10>(json)
    }
}

data class PreciosEESSTerrestres (
    @com.beust.klaxon.Json(name = "Fecha")
    val fecha: String,

    @com.beust.klaxon.Json(name = "ListaEESSPrecio")
    val listaEESSPrecio: ListaEESSPrecio,

    @com.beust.klaxon.Json(name = "Nota")
    val nota: String,

    @com.beust.klaxon.Json(name = "ResultadoConsulta")
    val resultadoConsulta: String,

    @com.beust.klaxon.Json(name = "_xmlns")
    val xmlns: String
)

data class ListaEESSPrecio (
    @com.beust.klaxon.Json(name = "EESSPrecio")
    val eessPrecio: List<EESSPrecio>
)

data class EESSPrecio (
    @com.beust.klaxon.Json(name = "C.P.")
    val cP: String,

    @com.beust.klaxon.Json(name = "Dirección")
    val dirección: String,

    @com.beust.klaxon.Json(name = "Horario")
    val horario: String,

    @com.beust.klaxon.Json(name = "Latitud")
    val latitud: String,

    @com.beust.klaxon.Json(name = "Localidad")
    val localidad: String,

    @com.beust.klaxon.Json(name = "Longitud_x0020__x0028_WGS84_x0029_")
    val longitudX0020X0028WGS84X0029: String,

    @com.beust.klaxon.Json(name = "Margen")
    val margen: String,

    @com.beust.klaxon.Json(name = "Municipio")
    val municipio: String,

    @com.beust.klaxon.Json(name = "Precio_x0020_Biodiesel")
    val precioX0020Biodiesel: String,

    @com.beust.klaxon.Json(name = "Precio_x0020_Bioetanol")
    val precioX0020Bioetanol: String,

    @com.beust.klaxon.Json(name = "Precio_x0020_Gas_x0020_Natural_x0020_Comprimido")
    val precioX0020GasX0020NaturalX0020Comprimido: String,

    @com.beust.klaxon.Json(name = "Precio_x0020_Gas_x0020_Natural_x0020_Licuado")
    val precioX0020GasX0020NaturalX0020Licuado: String,

    @com.beust.klaxon.Json(name = "Precio_x0020_Gases_x0020_licuados_x0020_del_x0020_petróleo")
    val precioX0020GasesX0020LicuadosX0020DelX0020Petróleo: String,

    @com.beust.klaxon.Json(name = "Precio_x0020_Gasoleo_x0020_A")
    val precioX0020GasoleoX0020A: String,

    @com.beust.klaxon.Json(name = "Precio_x0020_Gasoleo_x0020_B")
    val precioX0020GasoleoX0020B: String,

    @com.beust.klaxon.Json(name = "Precio_x0020_Gasoleo_x0020_Premium")
    val precioX0020GasoleoX0020Premium: String,

    @com.beust.klaxon.Json(name = "Precio_x0020_Gasolina_x0020_95_x0020_E10")
    val precioX0020GasolinaX002095_X0020E10: String,

    @com.beust.klaxon.Json(name = "Precio_x0020_Gasolina_x0020_95_x0020_E5")
    val precioX0020GasolinaX002095_X0020E5: String,

    @com.beust.klaxon.Json(name = "Precio_x0020_Gasolina_x0020_95_x0020_E5_x0020_Premium")
    val precioX0020GasolinaX002095_X0020E5X0020Premium: String,

    @com.beust.klaxon.Json(name = "Precio_x0020_Gasolina_x0020_98_x0020_E10")
    val precioX0020GasolinaX002098_X0020E10: String,

    @com.beust.klaxon.Json(name = "Precio_x0020_Gasolina_x0020_98_x0020_E5")
    val precioX0020GasolinaX002098_X0020E5: String,

    @com.beust.klaxon.Json(name = "Precio_x0020_Hidrogeno")
    val precioX0020Hidrogeno: String,

    @com.beust.klaxon.Json(name = "Provincia")
    val provincia: String,

    @com.beust.klaxon.Json(name = "Remisión")
    val remisión: String,

    @com.beust.klaxon.Json(name = "Rótulo")
    val rótulo: String,

    @com.beust.klaxon.Json(name = "Tipo_x0020_Venta")
    val tipoX0020Venta: String,

    @com.beust.klaxon.Json(name = "_x0025__x0020_BioEtanol")
    val x0025X0020BioEtanol: String,

    @com.beust.klaxon.Json(name = "_x0025__x0020_Éster_x0020_metílico")
    val x0025X0020ÉsterX0020Metílico: String,

    @com.beust.klaxon.Json(name = "IDEESS")
    val ideess: String,

    @com.beust.klaxon.Json(name = "IDMunicipio")
    val idMunicipio: String,

    @com.beust.klaxon.Json(name = "IDProvincia")
    val idProvincia: String,

    @com.beust.klaxon.Json(name = "IDCCAA")
    val idccaa: String
)

suspend fun main() {
    val welcome10 = Welcome10.fromJson("https://sedeaplicaciones.minetur.gob.es/ServiciosRESTCarburantes/PreciosCarburantes/EstacionesTerrestres/")
    println(welcome10)
}