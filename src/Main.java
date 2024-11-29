
public class Main {


    public static void main(String[] args) {
        Book greenMile = new Book("Green mile", 1996, "Stephen King");
        System.out.println("greenMile.title = " + greenMile.title);
        System.out.println("greenMile.year = " + greenMile.year);
        System.out.println("greenMile.author = " + greenMile.author);

        Author writer = new Author("Stephen", "King");
        System.out.println("writer.name = " + writer.name);
        System.out.println("writer.surname = " + writer.surname);


    }
}