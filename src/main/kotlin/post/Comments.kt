package post

class Comments(
    var count: Int,
    var canPost: Boolean = true,
    val groupsCanPost: Boolean = false
)