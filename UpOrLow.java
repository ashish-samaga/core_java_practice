import java.util.Scanner;
class UpOrLow{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    char ch;
    System.out.println("Enter the character :");
    ch = s.next().charAt(0);

    if(ch>='A'&& ch<= 'Z'){
      System.out.println("Entered character is an uppercase letter");
    }
    else if(ch>='a' && ch<='z'){
      System.out.println("Entered character is lowercase letter");
    }
    else{
      System.out.println("Entered character is not an alphabet");
    }
  }
}

