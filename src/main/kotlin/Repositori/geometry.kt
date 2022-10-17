package Repositori


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
@SerialName("geometry")
@Serializable
data class Geometry (@SerialName("coordinates") val coordinates: Coordinates)
