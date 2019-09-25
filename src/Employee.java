public class Employee {

    private String name, username, email;
    private String password;

    public Employee() {

        name = setName();
        username = username;
        email = email;
        password = password;

    }//end of Employee constructor

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Employee\n" +
                "name:  " + name + "\n" +
                "username: " + username + "\n" +
                "email:  " + email + "\n" +
                "password='" + password + "\n";
    }
}
