import java.util.Objects;

public class Book {
    private String name;
    private Author author;
    private int year;

    public Book(String name, Author author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String getName() {
        return this.name;
    }

    public int getYear() {
        return this.year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        return "Название книги: " + name + ", " + author.toString() + ", Год выпуска: " + year;
    }

    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book x = (Book) other;
        return name.equalsIgnoreCase(x.name) && author.equals(x.author) && year == x.year;
    }

    public int hashCode() {
        return java.util.Objects.hash(name, author, year);
    }
}


