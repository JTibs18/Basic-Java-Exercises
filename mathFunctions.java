import java.util.Scanner;

public class mathFunctions {
  public static void main(String[] args){
    int num1;
    int num2;
    num1 = reader("first");
    num2 = reader("second");
    int result = add(num1, num2);
    System.out.println("The sum of " + num1 + " + "+ num2 + " = " + result);
    }

//get the user's input for numbers
  public static int reader(String num){
    Scanner iReader = new Scanner (System.in);
    System.out.print("Please enter the " + num + " number: ");
    String n = iReader.nextLine();
    int i =  Integer.parseInt(n);
    return i;
  }

//function to add numbers 
  public static int add(int n1, int n2){
    int result = n1 + n2;
    return result;
  }
}
