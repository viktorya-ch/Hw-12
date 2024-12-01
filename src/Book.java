import java.util.Objects;

public class Book {
    private String title;
    private Author author;
    private int year;


    public Book(String title, Author author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;


    }

    public String getTitle() {
        return this.title;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return this.author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }


    public String toString() {
        return " Название " + this.title + " Автор " + author.toString() + " " + this.year + " Год ";
    }

    @Override
    public boolean equals(Object o) {
        if ( this == o)
         return true;
        if (o == null || getClass() != o.getClass())
         return false;
        Book that = (Book) o;
        if (title != that.title) return false;
        return Objects.equals(year, that.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, year);
    }


}

