import java.util.Scanner;
class EvenOdd{
  public static void main(String[] args){
    int x;
    Scanner s = new Scanner(System.in);
    
    System.out.println("Please enter the number :");
    x = s.nextInt();

    if(x%2==0){
      System.out.println("The number is even!");
    }
    else{
      System.out.println("The number is odd!");
    }
    }
}

