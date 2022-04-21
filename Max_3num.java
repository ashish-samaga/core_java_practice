import java.util.Scanner;
class Max_3num{
  public static void main(String[] args){
    int x,y,z;
    Scanner s = new Scanner(System.in);
    
    System.out.println("Please enter the first number :");
    x = s.nextInt();
    
    System.out.println("Please enter the second number :");
    y= s.nextInt();

    System.out.println("Please enter the third number :");
    z= s.nextInt();

    if ((x>y) && (x>z)){
      System.out.println("The largest number is :"+x);
    }
    else if((y>x) && (y>z)){
      System.out.println("The largest number is :"+y);
    }
    else{
      System.out.println("The largest number is :"+z);
    }
  }
}