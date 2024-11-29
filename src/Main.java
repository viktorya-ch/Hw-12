
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

        //Object#1
        Book freeFall = new Book("Free fall", 2019, "Jessica Barry");
        freeFall.setTitle("Free fall");
        System.out.println("freeFall.getTitle() = " + freeFall.getTitle());
        freeFall.setYear(2019);
        System.out.println("freeFall.getYear() = " + freeFall.getYear());
        freeFall.setAuthor("Jessica Barry");
        System.out.println("freeFall.getAuthor() = " + freeFall.getAuthor());

        //Object#2
        Book insurgent = new Book("Insurgent", 2012, "Veronica Roth");
        insurgent.setTitle("Insurgent");
        System.out.println("insurgent.getTitle() = " + insurgent.getTitle());
        insurgent.setYear(2012);
        System.out.println("insurgent.getYear() = " + insurgent.getYear());
        insurgent.setAuthor("Veronica Roth");
        System.out.println("insurgent.getAuthor() = " + insurgent.getAuthor());

        //Object#3
        Author author = new Author("Jessica", "Barry");
        author.setName("Jessica");
        System.out.println("author.getName() = " + author.getName());
        author.setSurname("Barry");
        System.out.println("author.getSurname() = " + author.getSurname());

        //Object#4
        Author author1 = new Author("Veronica", "Roth");
        author1.setName("Veronica");
        System.out.println("author1.getName() = " + author1.getName());
        author.setSurname("Roth");
        System.out.println("author1.getSurname() = " + author1.getSurname());
    }
}