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
    val comments: Int,
    likes: Int = 0,
    val original: Post?,
    val reposts: Int,
    val postType: String,
    val singerId: String,
    val canPin: Boolean,
    val canEdit: Boolean,
    val markedAsAdds: Boolean,
    val isFavorite: Boolean,
    var copyHistory: Array<Post> = emptyArray<Post>()
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

    object WallService {
        var posts = emptyArray<Post>()
        get() = field

        fun add(post: Post): Post {
            //if (posts.lastIndex == -1) return throw IllegalArgumentException("Posts array is empty")
            posts += post
            //post.id = posts.lastIndex + 1L
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
                    posts[index].likes = posts[index].likes  + 1
                }
            }
        }
        //TODO comments count
        //TODO reposts count
        //TODO post type. Type of the post, can be: post, copy, reply, postpone, suggest.
    }

    object postSource {
        val type: String = ""
        val platform: String = ""
        val data: String = ""
        val url: String = ""
    }

    object geo {
        val type: String = ""
        val coordinates: String = ""

        object place {
            val id: Long = 0
            val title: String = ""
            var latitude: Long = 0
            val longitude: String = ""
            val created: Long = 0
            val icon: String = ""
            val country: String = ""
            val city: String = ""
        }

    }
}


