import java.util.Scanner;
class Max_twonum{
  public static void main(String[] args){
    int x,y;
    Scanner s = new Scanner(System.in);
    
    System.out.println("Please enter the first number :");
    x = s.nextInt();
    
    System.out.println("Please enter the second number :");
    y= s.nextInt();

    if(x>y){
      System.out.println("The Largest number is :" + x);
    }
    else if(y>x){
      System.out.println("The Largest number is :" + y);
    }
    else {
      System.out.println("The numbers are equal!");
    }
  }
}