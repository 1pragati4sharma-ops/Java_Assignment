package Java_Assignment2.Mod5ExceptionHandling;

public class LibraryPassword extends Exception {
    LibraryPassword (String msg){
        super(msg);
    }
}
class DriveR {

    static void login(int password) throws LibraryPassword  {
        if(password!=9999){
            throw new LibraryPassword ("Entry Denied. Please enter the valid password!");
        }else {
            System.out.println("Entry Granted!");
        }
    }
    public static void main(String[] args) throws LibraryPassword {
        login(3409);
    }}

