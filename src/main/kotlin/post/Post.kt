package post

import attachments.Attachments

open class Post(
    open var id: Long,
    open var ownerId: Long,
    val fromId: Long,
    open val createdBy: Long,
    open var date: Long,
    val text: String,
    val replyPostId: Long,
    val friendsOnly: Boolean,
    val replyOwnerId: Long,
    var comments: Comments,
    val geo: Geo,
    val postSource: PostSource,
    likes: Int = 0,
    val original: Post?,
    val reposts: Int,
    val postType: String,
    val singerId: String,
    val canPin: Boolean,
    val canEdit: Boolean,
    val markedAsAdds: Boolean,
    val isFavorite: Boolean,
    var copyHistory: Array<Post> = emptyArray<Post>(),
    var attachmentsArray: Array<Attachments> = emptyArray()
) {
    open var likes: Int = likes
        set(value) {
            if (value < 0) {
                return
            }
            field = value
        }
        get() {
            return field + (original?.likes ?: 0)
        }
}





