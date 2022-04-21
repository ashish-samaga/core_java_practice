import java.util.Scanner;
class DivBy{
  public static void main(String[] args){
    int x;
    Scanner s = new Scanner(System.in);
    
    System.out.println("Please enter the number :");
    x = s.nextInt();

    if((x%5==0) && (x%11==0)){
      System.out.println("The number is divisible by 5 & 11");
    }
    else{
      System.out.println("The number is not divisible by 5 & 11");
    }
    }
}

