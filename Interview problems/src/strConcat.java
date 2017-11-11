import java.util.Scanner;

public class strConcat {


	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        int seci=scan.nextInt();
        double secd=scan.nextDouble();
        String  secs=scan.nextLine();
      String ss=s.concat(secs);
        System.out.println(ss);
       /* Declare second integer, double, and String variables. */
      
     
        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
         
        /* Print the sum of both integer variables on a new line. */
            System.out.println(i+seci);
        /* Print the sum of the double variables on a new line. */
		  System.out.println(d+secd);
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        
             System.out.println(ss);
    }
}
