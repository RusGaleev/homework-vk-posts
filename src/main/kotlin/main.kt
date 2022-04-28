fun main(){
    val service = WallService
    service.add(Post(
        id = 1,
        ownerId = 123,
        fromId = 123,
        createdBy = 123,
        text = "Abacadaba",
        date = 123,
        replyOwnerId = 123,
        replyPostId = 123,
        friendsOnly = false,
        comments = 123,
        likes = 123,
        reposts = 123,
        postType = "Abacadaba",
        singerId = "Abacadaba",
        canPin = false,
        canDelete = false,
        canEdit = false,
        markedAsAdds = false,
        isFavorite = false))
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
        comments = 123,
        likes = 123,
        reposts = 123,
        postType = "Abra",
        singerId = "Abra",
        canPin = false,
        canDelete = false,
        canEdit = false,
        markedAsAdds = false,
        isFavorite = false))
}