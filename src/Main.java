
public class Main {


    public static void main(String[] args) {
        Book greenMile = new Book("Green mile", 1996, "Stephen King");
        System.out.println("greenMile.title = " + greenMile.getTitle());
        System.out.println("greenMile.year = " + greenMile.getYear());
        System.out.println("greenMile.author = " + greenMile.getAuthor());
        greenMile.setYear(1994);
        System.out.println("greenMile.getYear() = " + greenMile.getYear());

        Author writer = new Author("Stephen", "King");
        System.out.println("writer.name = " + writer.getName());
        System.out.println("writer.surname = " + writer.getSurname());


    }
}