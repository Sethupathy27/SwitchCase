package pkgswitch;

import java.util.Scanner;

/**
 *
 * @author sethu
 */
public class Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int choice;
        System.out.println("pick one : 1. Hi\t2. Hey\t3. hello\t");
        Scanner s = new Scanner(System.in);
        choice = s.nextInt();
        switch (choice)
        {
            case 1 : System.out.println("You said Hi");
                    break;
            case 2 : System.out.println("You said Hey");
                    break;
            case 3 : System.out.println("You said Hello");
                    break;
            default : System.out.println("Invalid choice");        
        }    
            
            
    }
    
}
