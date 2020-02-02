package tryspring.impl.cache;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class BookRepo
{
    @Cacheable("books")
    public String getAuthor(String isbn) throws Exception
    {
        Thread.sleep(3000l);
        return isbn + ":Antriksh";
    }

}
