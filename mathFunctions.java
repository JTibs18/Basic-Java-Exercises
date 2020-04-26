import java.util.Scanner;

public class mathFunctions {
  public static void main(String[] args){
    System.out.println("Welcome to math functions!");
    int num = numReader();
    String operator = operatorReader();
    chooseFunction(num, operator);
    }


  //function gets the user's input for numbers
  public static int numReader(){
    Scanner iReader = new Scanner (System.in);
    System.out.print("Please enter a number: ");
    String n = iReader.nextLine();
    int i =  Integer.parseInt(n);
    return i;
  }

  //function reads the users input for a mathematical math operator
  public static String operatorReader(){
    Scanner iReader = new Scanner (System.in);
    System.out.print("Please enter a mathematical operator: ");
    String n = iReader.nextLine();
    return n;
  }

      //gets the user to select a math function
      public static void chooseFunction(int num1, String op){
          int num2 = numReader();
          int result =0;
         if(op.equals("+")){
          result = add(num1, num2);
        }else if(op.equals("-")){
          result = subtract(num1,num2);
        }else if(op.equals("*")){
          result = multiply(num1, num2);
        }else if (op.equals("/")){
          result = divide(num1, num2);
        }else{
          System.out.println("ERROR!");
        }
          printResult(num1, num2, result, op);
      }

      public static void printResult(int n1, int n2, int r, String op){
        System.out.println(n1 + op + n2 + "=" + r);
      }

  //function to add two numbers
  public static int add(int n1, int n2){
    int result = n1 + n2;
    return result;
  }

  //function to subtract two numbers
  public static int subtract(int n1, int n2){
    int result = n1 - n2;
    return result;
  }

  //function to divide two numbers
  public static int divide (int n1, int n2){
    int result = n1/n2;
    return result;
  }

  //function to multply two numbers
  public static int multiply (int n1, int n2){
    int result = n1*n2;
    return result;
  }

}
