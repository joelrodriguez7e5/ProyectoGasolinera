package Repositori

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
@Serializable
@SerialName("features")
data class Features (
    @SerialName("id") var id: Int,
    @SerialName("geometry") var geometry: Geometry,
    @SerialName("properties") var attributtes: Properties)