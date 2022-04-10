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
                    posts[index].likes = posts[index].likes + 1
                }
            }
        }
        //TODO comments count
        //TODO reposts count
        //TODO post type. Type of the post, can be: post, copy, reply, postpone, suggest.
    }


}

class PostSource(
    val type: String,
    val platform: String,
    val data: String,
    val url: String
) {
}

class Comments(
    var count: Int,
    var canPost: Boolean = true,
    val groupsCanPost: Boolean = false
) {
}

class Geo(
    val type: String,
    val coordinates: String,
    //val place:Place
) {
    class Place(
        val id: Long,
        val title: String,
        var latitude: Long,
        val longitude: String,
        val created: Long,
        val icon: String,
        val country: String,
        val city: String
    ) {
    }
}

