import java.util.Scanner;
class NegorPos{
  public static void main(String[] args){
    int x;
    Scanner s = new Scanner(System.in);
    
    System.out.println("Please enter the number :");
    x = s.nextInt();

    if(x>0){
      System.out.println("The number is positive!");
    }
    else if(x<0){
      System.out.println("The number is negative!");
      }
    else{
      System.out.println("The number is zero!");
    }
    }
}

