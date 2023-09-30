package org.example;

public class User {
    private String username;
    private String email;
    private String password;

    private int age;


    public User(String username,String email,String password,int age) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.age = age;
    }


    public String getUsername(){
        return this.username;
    }

    public void setUsername(String username){
        this.username=username;
    }

    public String getEmail(){
        return this.email;
    }

    public void  setEmail(String email){
        this.email=email;
    }

    public String getPassword(){
        return this.password;
    }

    public void setPassword(String password){
        this.password=password;
    }

    public int getAge(){
        return  this.age;
    }

    public void setAge(int age){
        this.age=age;
    }

    // Method 1: Display user information
    public void displayUserInfo() {
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("Age: " + age);
    }

    // Method 2: Check if the user is a minor
    public boolean isMinor() {
        return age < 18;
    }

    // Method 3: Change the user's password
    public void changePassword(String newPassword) {
        this.password = newPassword;
    }

    // Method 4: Validate user credentials
    public boolean validateCredentials(String inputUsername, String inputPassword) {
        return username.equals(inputUsername) && password.equals(inputPassword);
    }

    // Method 5: Increment the user's age
    public void incrementAge() {
        age++;
    }

    // Method 6: Check if the user has a valid email format
    public boolean isValidEmail() {
        // Implement email validation logic here
        // For simplicity, we'll assume all emails are valid
        return true;
    }

    // Method 7: Reset the user's password
    public void resetPassword() {
        this.password = generateRandomPassword();
    }

    // Method 8: Generate a random password
    private String generateRandomPassword() {
        // Implement password generation logic here
        // For simplicity, we'll return a static value
        return "RandomPassword123";
    }

    // Method 9: Check if the user's username is unique
    public boolean isUsernameUnique(String inputUsername) {
        // Implement logic to check username uniqueness in a database
        // For simplicity, we'll assume it's always unique
        return true;
    }

    // Method 10: Check if the user is eligible for a discount
    public boolean isEligibleForDiscount() {
        return age >= 50;
    }

}

