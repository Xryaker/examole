package data;

public class User {
    String firstName,lastName,email;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public User(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public User() {
        this.firstName = "firstName";
        this.lastName = "lastName";
        this.email = "email";
    }
}
