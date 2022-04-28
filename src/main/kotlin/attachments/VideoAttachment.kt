package attachments

class VideoAttachment(
    id: Int, ownerId: Int, title: String, description: String, duration: Int,
     views: Int, override val type: String="video", val video: Video = Video(id,
    ownerId,
    title,
    description,
    duration,
    views
    )) :Attachments
