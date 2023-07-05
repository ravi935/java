 import java.util.*;
public class switchcase {
    public static void main (String arg[]) {
        Scanner s = new Scanner(System.in);
        int button = s.nextInt();
        switch(button){
            case 1 : System.out.println("Hello");
            break;
            case 2 : System.out.println("Namaste");
            break;
            case 3 : System.out.println("Bojour");
            break;
            default : System.out.println("Invalid Button");

        }
    }
}
