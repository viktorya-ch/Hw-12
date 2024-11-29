public class Launch {
    public static void main(String[] args) {
        Book insurgent = new Book("Insurgent", 2012, "Veronica Roth");
        insurgent.setTitle("Insurgent");
        System.out.println("insurgent.getTitle() = " + insurgent.getTitle());
        insurgent.setYear(2012);
        System.out.println("insurgent.getYear() = " + insurgent.getYear());
        insurgent.setAuthor("Veronica Roth");
        System.out.println("insurgent.getAuthor() = " + insurgent.getAuthor());
        insurgent.setYear(2010);
        System.out.println("insurgent.getYear() = " + insurgent.getYear());
    }}










