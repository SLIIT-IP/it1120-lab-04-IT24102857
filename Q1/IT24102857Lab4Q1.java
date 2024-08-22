import java.util.Scanner;

     public class IT24102857Lab4Q1{

     public static void main(String[] args){

     	Scanner input = new Scanner(System.in);

	System.out.print("Enter an amount: ");
        double num = input.nextDouble();

        if(num > 0){
		System.out.println("The number is Positive");
        }
        else if(num < 0){
		System.out.println("The number is Negative");
        }
        else if(num ==0){
                System.out.println("The number is Zero");
        }
        input.close();
}

}

        