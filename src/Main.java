public class Main {
    public static void main(String[] args) {
        Book greenMile = new Book();
        greenMile.title = "Green mile";
        System.out.println("greenMile.title = " + greenMile.title);
        greenMile.year = 1996;
        System.out.println("greenMile.year = " + greenMile.year);
        greenMile.author = "Stephen King";
        System.out.println("greenMile.author = " + greenMile.author);

        Author writer = new Author();
        writer.name = "Stephen";
        System.out.println("writer.name = " + writer.name);
        writer.surname = "King";
        System.out.println("writer.surname = " + writer.surname);



    }
}