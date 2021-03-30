import java.util.Scanner;
class Login{
   static int count =0;
    public String loginUser(String user, String pass) {
        String userId = "Ajay",password = "password";
        if((user.equals(userId)) && (pass.equals(password))) {
            System.out.println("Welcome");
        }
        else {
            while (count <= 3)
            {
                if(count == 3)
                {
                    System.out.println("Contact admin");
                    break;
                }
                System.out.println("You have entered wrong credentials ,please enter the right credentials ");

                System.out.println("please enter username and password again");
                Scanner a = new Scanner(System.in);
                System.out.println("enter user name");
                String use = a.nextLine();
                System.out.println("enter password");
                String pas = a.nextLine();
                count++;
                loginUser(use, pas);

            }
            }

        return user;
    }
}
public class Assignment1Q6 {
    public static <string> void main(String[] args) {
        Login lg = new Login();
        Scanner a = new Scanner(System.in);
        System.out.println("enter user name: ");
        String user = a.nextLine();
        System.out.println("enter passwd: ");
        String pass = a.nextLine();
        System.out.println(lg.loginUser(user, pass));

    }

}
