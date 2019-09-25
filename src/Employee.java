public class Employee {

    private String name, username, email;
    private String password;

    public Employee() {

        name = setName();
        username = setUsername(name);
        email = setEmail(username);
        password = setPassword(username);

    }//end of Employee constructor

    public String getName() {
        return name;
    }

    public void setName() {

        this.name = name;

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String name) {
        this.username = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String username) {

        this.email = username;

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
