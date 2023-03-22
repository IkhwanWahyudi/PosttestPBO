package posttest3pbo;


public class User {
    private String Username, Password, Address, Email;

    public User(String user, String pass, String address, String email) {
        this.Username = user;
        this.Password = pass;
        this.Address = address;
        this.Email = email;
    }
    
    public void setUsername(String Username) {
        this.Username = Username;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    public String getUsername() {
        return Username;
    }

    public String getPassword() {
        return Password;
    }

    public String getAddress() {
        return Address;
    }

    public String getEmail() {
        return Email;
    }
    
}
