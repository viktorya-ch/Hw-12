public class Book {
    private String title;
    private int year;
    private String author;

    public Book(String title, int year, String author) {
        this.title = title;
        this.year = year;
        this.author = author;
    }

    public String getTitle(){
        return this.title;
    }
    public int getYear(){
        return this.year;
    }
    public String getAuthor(){
        return this.author;
    }
    public void setYear(int year){
        this.year = year;
    }


}
