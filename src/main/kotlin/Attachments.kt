interface Attachments {
    val type: String
}

open class Audio(
    val id: Int,
    val ownerId: Int,
    val title: String,
    val artist: String,
    val url: String,
    val duration: Int,
    val date: Int,
) {}

class AudioAttachment(
    id: Int, ownerId: Int, title: String, artist: String, url: String, duration: Int, date: Int
) : Attachments, Audio(
    id, ownerId, title, artist, url, duration, date
) {
    override val type: String = "Audio"
}

open class Video(
    val id: Int,
    val ownerId: Int,
    val title: String,
    val description: String,
    val duration: Int,
    val date: Int,
    val views: Int,
) {
}

class VideoAttachment(
    id: Int, ownerId: Int, title: String, description: String, duration: Int,
    likes: Int, views: Int
) : Attachments, Video(
    id, ownerId, title,
    description,
    duration, likes, views
) {
    override val type: String = "Video"
}

open class Photo(
    val id: Int,
    val width: Int,
    val height: Int,
    val date: Int,
    val text: String,
    val userId: Int,
    val albumId: Int,
    val ownerId: Int
)

class PhotoAttachment(
    id: Int, width: Int, height: Int, date: Int, text: String, userId: Int, albumId: Int,
    ownerId: Int
) : Attachments, Photo(
    id, width, height, date, text, userId, albumId, ownerId
) {
    override val type: String = "Photo"
}

class LinkAttachment(
    val url: String,
    val title: String,
    val caption: String,
    val description: String,
    val photo: Photo
) : Attachments {
    override val type: String = "Link"
}