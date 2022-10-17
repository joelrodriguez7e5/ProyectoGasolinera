package Repositori

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("properties")
data class Properties (
    @SerialName("FID"        ) var FID       : Int,
    @SerialName("Field1"     ) var Field1    : Int,
    @SerialName("Provincia"  ) var Provincia : String,
    @SerialName("Municipio"  ) var Municipio : String,
    @SerialName("Localidad"  ) var Localidad : String,
    @SerialName("Código_po"  ) var CódigoPo  : Int,
    @SerialName("Dirección"  ) var Dirección : String,
    @SerialName("Margen"     ) var Margen    : String,
    @SerialName("Longitud"   ) var Longitud  : Double,
    @SerialName("Latitud"    ) var Latitud   : Double,
    @SerialName("Toma_de_da" ) var TomaDeDa  : Int,
    @SerialName("Precio_gas" ) var PrecioGas : Double,
    @SerialName("Precio_g_1" ) var PrecioG1  : String,
    @SerialName("Precio_g_2" ) var PrecioG2  : Int,
    @SerialName("Precio_g_3" ) var PrecioG3  : Double,
    @SerialName("Precio_g_4" ) var PrecioG4  : String,
    @SerialName("Precio_g_5" ) var PrecioG5  : Double,
    @SerialName("Precio_g_6" ) var PrecioG6  : Int,
    @SerialName("Precio_g_7" ) var PrecioG7  : Int,
    @SerialName("Precio_g_8" ) var PrecioG8  : String,
    @SerialName("Precio_bio" ) var PrecioBio : String,
    @SerialName("F__bioalco" ) var F_bioalco : String,
    @SerialName("Precio_b_1" ) var PrecioB1  : String,
    @SerialName("F__éster_"  ) var F_éster_  : String,
    @SerialName("Precio_g_9" ) var PrecioG9  : Double,
    @SerialName("Precio__10" ) var Precio_10 : Int,
    @SerialName("Precio__11" ) var Precio_11 : Int,
    @SerialName("Precio_hid" ) var PrecioHid : String,
    @SerialName("Rótulo"     ) var Rótulo    : String,
    @SerialName("Tipo_venta" ) var TipoVenta : String,
    @SerialName("Rem_"       ) var Rem_      : String,
    @SerialName("Horario"    ) var Horario   : String,
    @SerialName("Tipo_servi" ) var TipoServi : String,
    @SerialName("fecha"      ) var fecha     : Int
)