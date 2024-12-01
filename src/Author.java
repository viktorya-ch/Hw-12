import java.util.Objects;

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
    public String toString(){
        return " Имя " + this.nameAuthor + " Фамилия " + this.surnameAuthor;
    }

@Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author that = (Author) o;
        if (nameAuthor != that.nameAuthor) return false;
       return Objects.equals(surnameAuthor, that.surnameAuthor);
    }

    @Override
    public int hashCode(){
        return Objects.hash(nameAuthor, surnameAuthor);
    }




}
