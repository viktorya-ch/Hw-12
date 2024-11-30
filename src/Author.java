public class Author {
    private String nameAuthor;
    private String surnameAuthor;


    public Author(String nameAuthor, String surnameAuthor) {
        this.nameAuthor = nameAuthor;
        this.surnameAuthor = surnameAuthor;

    }

    public String getName() {
        return this.nameAuthor;
    }

    public String getSurname() {
        return this.surnameAuthor;
    }

    public void setName(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    public void setSurname(String surnameAuthor) {
        this.surnameAuthor = surnameAuthor;
    }

}
