package attachments

data class Photo(
    val id: Int,
    val width: Int,
    val height: Int,
    val date: Int,
    val text: String,
    val userId: Int,
    val albumId: Int,
    val ownerId: Int
)