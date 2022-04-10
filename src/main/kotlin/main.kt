import Post.WallService

fun main(){
    val service = WallService
    service.add(Post(
        id = 1,
        ownerId = 123,
        fromId = 123,
        createdBy = 123,
        text = "Abracadabra",
        date = 123,
        replyOwnerId = 123,
        replyPostId = 123,
        friendsOnly = false,
        comments = Comments(123, true, false),
        geo = Geo("type", "12.221, 12.221"),
        postSource = PostSource("","","","https://"),
        likes = 123,
        reposts = 123,
        postType = "Abacadaba",
        singerId = "Abacadaba",
        canPin = false,
        canEdit = false,
        markedAsAdds = false,
        isFavorite = false,
        original = null))
    service.likeById(1)

    service.update(Post(
        id = 1,
        ownerId = 123,
        fromId = 123,
        createdBy = 123,
        text = "Abra",
        date = 123,
        replyOwnerId = 123,
        replyPostId = 123,
        friendsOnly = false,
        comments = Comments(123, true, false),
        geo = Geo("type", "12.221, 12.221"),
        postSource = PostSource("","","","https://"),
        likes = 123,
        reposts = 123,
        postType = "Abra",
        singerId = "Abra",
        canPin = false,
        canEdit = false,
        markedAsAdds = false,
        isFavorite = false,
        original = null))
}