/**
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */
@SuppressWarnings
import java.util.ArrayList;
import java.util.List;

public class Author extends Person {
    @SuppressWarnings
    private List books;
    @SuppressWarnings
    public Author(String firstName, String lastName) {
        super(firstName, lastName);
        books = new ArrayList();
    }

    /**
     * @deprecated Use publishedBooks instead
     */
    @deprecated
    public List<String> getBooks() {
        return books;
    }
    @SuppressWarnings
    public List<String> publishedBooks() {
        return books;
    }
    @SuppressWarnings
    public void addBook(String book) {
        books.add(book);
    }

    @Override
    public String sortName() {
        return String.format("%s, %s", lastName, firstName);
    }
}
