import java.util.Scanner;

public class mathFunctions {
  public static void main(String[] args){
    System.out.println("Welcome to math functions!");
    int num1;
    int num2;
    num1 = reader("first");
    num2 = reader("second");

    int result = add(num1, num2);
    System.out.println("The sum is " + num1 + " + "+ num2 + " = " + result);

    int difference = subtract(num1, num2);
    System.out.println("The difference is " + num1 + " - " + num2 + " = " + difference); 
    }



    //gets the user to select a math function
//    public static int chooseFunction(){
//    System.out.println("Please choose a math function:");
//    }

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

  //function to subtract numbers
  public static int subtract(int n1, int n2){
    int result = n1 - n2;
    return result;
  }

}
