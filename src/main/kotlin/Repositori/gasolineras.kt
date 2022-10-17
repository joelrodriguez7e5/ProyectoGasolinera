package Repositori

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Gasolineras (@SerialName("features") var features: List<Features>)