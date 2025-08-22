package Ex;

import java.util.Scanner;

public class LoginRun {
    public static void main(String[] args) {
        String id = "id";
        String password = "password";
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your ID");
        String idInput = sc.nextLine();
        if(!idInput.equals(id)){
            System.out.println("Wrong ID");
            throw new LoginException("Wrong ID", LoginException.ErrorType.ID_MISMATCH);
        }
        System.out.println("Enter your Password");
        String passwordInput = sc.nextLine();
        if(!passwordInput.equals(password)){
            System.out.println("Wrong Password");
            throw new LoginException("Wrong password", LoginException.ErrorType.PW_MISMATCH);
        }
    }
}
