import java.util.Objects;

public class Author {
    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String toString() {
        return "Имя автора: " + firstName + ' ' + lastName;
    }

    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author x = (Author) other;
        return firstName.equals(x.firstName) && lastName.equals(x.lastName);
    }

    public int hashCode() {
        return java.util.Objects.hash(firstName, lastName);
    }
}
