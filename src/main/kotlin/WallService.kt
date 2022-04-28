object WallService {
    var posts = emptyArray<Post>()
    var lastIndex = 0

    fun add(post: Post): Post {
        //if (posts.lastIndex == -1) return throw IllegalArgumentException("Posts array is empty")
        posts += post.copy(id = lastIndex + 1L)
        return posts.last()
    }

    fun update(post: Post): Boolean {
        var postId:Long
        if (posts.isEmpty()) {
            postId = 1L
        } else {
            postId = posts.lastOrNull()!!.id + 1
        }
        for ((index, arrayPost) in posts.withIndex()) {
            if (arrayPost.id == post.id) {
                posts[index] = post.copy(
                    id = arrayPost.id,
                    date = arrayPost.date,
                    ownerId = arrayPost.ownerId
                )
            }
        }
        return true
    }

    fun likeById(id: Long):Int {
        var postLike:Int = 0
        for ((index, post) in posts.withIndex()) {
            if (post.id == id) {
                posts[index] = post.copy(likes = post.likes + 1)
                postLike = post.likes + 1
            }
        }
        return postLike
    }
    //TODO comments count
    //TODO reposts count
    //TODO post type. Type of the post, can be: post, copy, reply, postpone, suggest.

}