package attachments

class LinkAttachment(
    val url: String,
    val title: String,
    val caption: String,
    val description: String,
    val photo: Photo
) : Attachments {
    override val type: String = "link"
}