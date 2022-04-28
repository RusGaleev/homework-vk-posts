data class Post(
    val id: Long,
    val ownerId: Long,
    val fromId: Long,
    val createdBy: Long,
    val date: Long,
    val text: String,
    val replyPostId: Long,
    val friendsOnly: Boolean,
    val replyOwnerId: Long,
    val comments: Int,
    val likes: Int,
    val reposts: Int,
    val postType: String,
    val singerId: String,
    val canPin: Boolean,
    val canDelete: Boolean,
    val canEdit: Boolean,
    val markedAsAdds: Boolean,
    val isFavorite: Boolean
)


