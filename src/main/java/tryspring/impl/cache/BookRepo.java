package tryspring.impl.cache;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BookRepo
{
    List<BookDTO> bookList = new ArrayList<>();

    @Cacheable("bookByISBN")
    public String getAuthor(String isbn) throws Exception
    {
        Thread.sleep(3000l);
        return isbn + ":BY-ISBN";
    }

    @Cacheable(value="bookBySpringEL", key = "#book.isbn")
    public String getAuthor(BookDTO book) throws Exception
    {
        Thread.sleep(3000l);
        return book.getIsbn() + ":BY-BOOK OBJECT";
    }
}
