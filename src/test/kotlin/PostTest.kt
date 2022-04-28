import org.junit.Assert.*
import org.junit.Test

class PostTest {
    @Test
    fun addTest() {
        val service = WallService
        val index = 1L
        val post = Post(
            id = index,
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
            isFavorite = false
        )
        assertEquals(service.add(post), post)
    }

    @Test
    fun updateExisting() {
        // создаём целевой сервис
        val service = WallService
        // заполняем несколькими постами
        service.add(
            Post(
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
                isFavorite = false
            )
        )
        service.add(
            Post(
                id = 2,
                ownerId = 321,
                fromId = 321,
                createdBy = 321,
                text = "Aba",
                date = 321,
                replyOwnerId = 321,
                replyPostId = 321,
                friendsOnly = true,
                comments = 321,
                likes = 321,
                reposts = 321,
                postType = "adaba",
                singerId = "adaba",
                canPin = true,
                canDelete = true,
                canEdit = true,
                markedAsAdds = true,
                isFavorite = true
            )
        )
        service.add(
            Post(
                id = 3,
                ownerId = 321,
                fromId = 321,
                createdBy = 321,
                text = "abra",
                date = 321,
                replyOwnerId = 321,
                replyPostId = 321,
                friendsOnly = false,
                comments = 321,
                likes = 321,
                reposts = 321,
                postType = "abra",
                singerId = "abra",
                canPin = true,
                canDelete = false,
                canEdit = true,
                markedAsAdds = false,
                isFavorite = true
            )
        )
        // создаём информацию об обновлении
        val update = Post(
            id = 3,
            ownerId = 321,
            fromId = 321,
            createdBy = 321,
            text = "abra",
            date = 321,
            replyOwnerId = 321,
            replyPostId = 321,
            friendsOnly = false,
            comments = 321,
            likes = 321,
            reposts = 321,
            postType = "abra",
            singerId = "abra",
            canPin = true,
            canDelete = false,
            canEdit = true,
            markedAsAdds = false,
            isFavorite = true
        )

        // выполняем целевое действие
        val result = service.update(update)

        // проверяем результат (используйте assertTrue или assertFalse)
        assertTrue(result)
    }
    @Test
    fun likeByIdTest(){
        val service = WallService
        val id = 1L
        val likes = 222
        service.add(
            Post(
                id = id,
                ownerId = 123,
                fromId = 123,
                createdBy = 123,
                text = "Abacadaba",
                date = 123,
                replyOwnerId = 123,
                replyPostId = 123,
                friendsOnly = false,
                comments = 123,
                likes = likes,
                reposts = 123,
                postType = "Abacadaba",
                singerId = "Abacadaba",
                canPin = false,
                canDelete = false,
                canEdit = false,
                markedAsAdds = false,
                isFavorite = false
            )
        )
        assertEquals(service.likeById(id), likes+1)
    }
}
