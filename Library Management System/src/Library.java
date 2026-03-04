import java.util.ArrayList;
import java.util.List;

public class Librery {
    private String name;
    private List<Books> bookList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Books> getBookList() {
        return bookList;
    }

    public void setBookList(List<Books> bookList) {
        this.bookList = bookList;
    }

    Librery(String name, List<Books> listbokk) {
        this.bookList = new ArrayList<>();
        this.name = name;
    }

    // the responsibility of the class is

    public Books issureBook(Books books, User user) {

    }

    public void returnBook(Books books, User user) {

    }

    public boolean isavlable(Books book) {

    }

    public void addbook(Books book) {

    }
}