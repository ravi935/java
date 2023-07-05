import java.util.*;
public class condition {
    public static void main(String arg[]) {
        Scanner s = new Scanner(System.in);
        int age = s.nextInt();
        if (age > 18) {
            System.out.println("Adult");
        } else{
            System.out.println("Not Adult");
        }
    }
}