package attachments

class PhotoAttachment(
    id: Int, width: Int, height: Int, date: Int, text: String, userId: Int, albumId: Int,
    ownerId: Int,override val type: String = "photo", val photo: Photo = Photo(id, width, height, date, text, userId, albumId, ownerId)
) : Attachments