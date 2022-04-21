import java.util.Scanner;
class LeapYear{
  public static void main(String[] args){
    int x;
    boolean leap =false;
    Scanner s = new Scanner(System.in);
    
    System.out.println("Please enter the year :");
    x = s.nextInt();

    if(x%4==0){
      if(x%400==0){
        if(x%100==0){
        leap = true;
          }
        else{leap= false;
          }
      }
    }
    if(leap){
      System.out.println("The year " +x +" is a leap year");
    }
    else{
      System.out.println("The year " +x +" is not a leap year");
    }
  }
}



    