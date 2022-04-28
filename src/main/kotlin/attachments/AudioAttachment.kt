package attachments

class AudioAttachment(
    id: Int, ownerId: Int, title: String, artist: String, url: String, duration: Int, date: Int,
    override val type: String = "audio", val audio: Audio = Audio(id, ownerId, title, artist, url, duration, date)):
    Attachments
