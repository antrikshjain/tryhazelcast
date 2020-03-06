package tryspring.impl.cache;

/**
 * Created by antjain on 2/2/20.
 */
public class BookDTO
{
    private String isbn;

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }


    public BookDTO(String isbn) {
        this.isbn = isbn;
    }
}
