package post

class Geo(
    val type: String,
    val coordinates: String,
) {
    class Place(
        val id: Long,
        val title: String,
        var latitude: Long,
        val longitude: String,
        val created: Long,
        val icon: String,
        val country: String,
        val city: String
    )
}