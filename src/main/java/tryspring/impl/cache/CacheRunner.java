package tryspring.impl.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * Created by antjain on 1/11/20.
 */
@Component
public class CacheRunner  implements CommandLineRunner
{
    @Autowired
    BookRepo bookRepo;

    public void run(String... args) throws Exception
    {
        System.out.println(LocalDateTime.now() + ":CACHE:" + bookRepo.getAuthor("1"));
        System.out.println(LocalDateTime.now() + ":CACHE:" + bookRepo.getAuthor("1"));
        System.out.println(LocalDateTime.now() + ":CACHE:" + bookRepo.getAuthor("1"));
        System.out.println(LocalDateTime.now() + ":CACHE:" + bookRepo.getAuthor("1"));
        System.out.println(LocalDateTime.now() + ":CACHE:" + bookRepo.getAuthor("2"));
        System.out.println(LocalDateTime.now() + ":CACHE:" + bookRepo.getAuthor("2"));
        System.out.println(LocalDateTime.now() + ":CACHE:" + bookRepo.getAuthor("2"));
        System.out.println(LocalDateTime.now() + ":CACHE:" + bookRepo.getAuthor("2"));

        System.out.println("---------------------");

        System.out.println(LocalDateTime.now() + ":CACHE BY BOOK1:" + bookRepo.getAuthor(new BookDTO("1")));
        System.out.println(LocalDateTime.now() + ":CACHE BY BOOK1:" + bookRepo.getAuthor(new BookDTO("1")));
        System.out.println(LocalDateTime.now() + ":CACHE BY BOOK1:" + bookRepo.getAuthor(new BookDTO("1")));
        System.out.println(LocalDateTime.now() + ":CACHE BY BOOK2:" + bookRepo.getAuthor(new BookDTO("2")));
        System.out.println(LocalDateTime.now() + ":CACHE BY BOOK2:" + bookRepo.getAuthor(new BookDTO("2")));
        System.out.println(LocalDateTime.now() + ":CACHE BY BOOK2:" + bookRepo.getAuthor(new BookDTO("2")));
    }

}
