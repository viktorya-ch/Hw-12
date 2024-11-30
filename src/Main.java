public class Main {

    public static void main(String[] args) {

        Book greenMile = new Book("Green mile", new Author("Stephen", "King"), 1996);
        System.out.println("greenMile.title = " + greenMile.getTitle());
        System.out.println(new Author("Stephen", "King"));
        System.out.println("greenMile.year = " + greenMile.getYear());
        greenMile.setYear(1994);
        System.out.println("greenMile.getYear() = " + greenMile.getYear());


        Author writer = new Author("Stephen", "King");
        System.out.println("writer.name = " + writer.getName());
        System.out.println("writer.surname = " + writer.getSurname());

        //Object#1
        Book freeFall = new Book("Free fall", new Author("Jessica", "Barry"), 2019);
        freeFall.setTitle("Free fall");
        System.out.println("freeFall.getTitle() = " + freeFall.getTitle());
        System.out.println(new Author("Jessica", "Barry"));
        freeFall.setYear(2019);
        System.out.println("freeFall.getYear() = " + freeFall.getYear());


        //Object#2
        Book insurgent = new Book("Insurgent", new Author("Veronica", "Roth"), 2012);
        insurgent.setTitle("Insurgent");
        System.out.println("insurgent.getTitle() = " + insurgent.getTitle());
        System.out.println(new Author("Veronica", "Roth"));
        insurgent.setYear(2012);
        System.out.println("insurgent.getYear() = " + insurgent.getYear());


        //Object#3
        Author author = new Author("Jessica", "Barry");
        author.setName("Jessica");
        System.out.println("author.getName() = " + author.getName());
        author.setSurname("Barry");
        System.out.println("author.getSurname() = " + author.getSurname());

        //Object#4
        Author roth = new Author("Veronica", "Roth");
        roth.setName("Veronica");
        System.out.println("roth.getName() = " + roth.getName());
        roth.setSurname("Roth");
        System.out.println("roth.getSurname() = " + roth.getSurname());
    }
}