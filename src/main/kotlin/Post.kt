data class Post(
    private var id: Long,
    var ownerId: Long,
    val fromId: Long,
    val createdBy: Long,
    var date: Long,
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
) {
    object WallService {
        var posts = emptyArray<Post>()
        //get() = field

        fun add(post: Post): Post {
            //if (posts.lastIndex == -1) return throw IllegalArgumentException("Posts array is empty")
            posts += post
            post.id = posts.lastIndex + 1L
            return posts.last()
        }

        fun update(post: Post): Boolean {
            if (posts.lastIndexOf(post) == -1) return false
            for ((index, arrayPost) in posts.withIndex()) {
                if (arrayPost.id == post.id) {
                    post.id = arrayPost.id
                    post.date = arrayPost.date
                    post.ownerId = arrayPost.ownerId
                    posts[index] = post
                }
            }
            return true
        }

        fun likeById(id: Long) {
            for ((index, post) in posts.withIndex()) {
                if (post.id == id) {
                    posts[index] = post.copy(likes = post.likes + 1)
                }
            }
        }
        //TODO comments count
        //TODO reposts count
        //TODO post type. Type of the post, can be: post, copy, reply, postpone, suggest.

    }
}


