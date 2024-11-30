public class Launch {
    public static void main(String[] args) {
        Book insurgent = new Book("Insurgent", new Author("Veronica", "Roth"), 2012);
        insurgent.setTitle("Insurgent");
        System.out.println("insurgent.getTitle() = " + insurgent.getTitle());
        System.out.println(new Author("Veronica", "Roth"));
        insurgent.setYear(2012);
        System.out.println("insurgent.getYear() = " + insurgent.getYear());
        insurgent.setYear(2010);
        System.out.println("insurgent.getYear() = " + insurgent.getYear());

    }}










