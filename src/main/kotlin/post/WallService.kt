package post

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