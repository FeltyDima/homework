class WrongPasswordException extends Exception{
    WrongPasswordException(){
        super();
    }

    WrongPasswordException(String message){
        super(message);
    }
}

class WrongLoginException extends Exception{
    WrongLoginException(){
        super();
    }

    WrongLoginException(String message){
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(validateCredentials("user", "password123", "password123"));
        System.out.println(validateCredentials("user_12@", "password123", "password123"));
        System.out.println(validateCredentials("user", "password123@", "password123@"));
        System.out.println(validateCredentials("user", "password123", "password12"));
    }

    public static boolean validateCredentials(String login, String password, String confirmPassword){
        try{
            if (login == null || !login.matches("^[a-zA-Z0-9_]{1,19}$")){
                throw new WrongLoginException("Login must contain only letters, digits, or underscores, and be less than 20 characters.");
            }
            if (password == null || !password.matches("^[a-zA-Z0-9_]{1,19}$") || !password.equals(confirmPassword)){
                throw new WrongPasswordException("Password must contain only letters, digits, or underscores, be less than 20 characters, and match confirm password.");
            }
            return true;
        } catch (WrongLoginException | WrongPasswordException e){
            e.printStackTrace();
            return false;
        }

    }
}
