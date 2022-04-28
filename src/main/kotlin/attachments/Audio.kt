package attachments

data class Audio(
    val id: Int,
    val ownerId: Int,
    val title: String,
    val artist: String,
    val url: String,
    val duration: Int,
    val date: Int,
)