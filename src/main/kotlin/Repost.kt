class Repost(
    id: Long,
    ownerId: Long,
    fromId: Long,
    createdBy: Long,
    date: Long,
    text: String,
    replyPostId: Long,
    friendsOnly: Boolean,
    replyOwnerId: Long,
    comments: Int,
    likes: Int = 0,
    original: Post?,
    reposts: Int,
    postType: String,
    singerId: String,
    canPin: Boolean,
    canEdit: Boolean,
    markedAsAdds: Boolean,
    isFavorite: Boolean,
    copyHistory: Array<Post> = emptyArray<Post>()
) : Post(id, ownerId, fromId, createdBy, date, text, replyPostId, friendsOnly, replyOwnerId, comments, likes, original, reposts, postType, singerId, canPin, canEdit, markedAsAdds, isFavorite) {
    override var id: Long = 0
        get() = TODO("Not yet implemented")
    override var ownerId: Long = 0
        get()= TODO("Not yet implemented")
    override var createdBy: Long = 0
        get() = TODO("Not yet implemented")
    override var date: Long = 0
        get()= TODO("Not yet implemented")
    override var likes: Int = 0

    fun checkRepost(post: Post): Post {
        val original = post.original ?: post
        TODO()
    }
}