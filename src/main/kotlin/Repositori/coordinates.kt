package Repositori

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("coordinates")
data class Coordinates(@SerialName("x" ) var x : Double,
                       @SerialName("y" ) var y : Double)