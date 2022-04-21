import java.util.Scanner;
class CharAlpha{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    char ch;
    System.out.println("Please enter the character :");
    ch = s.next().charAt(0);

    if((ch>='a'&&ch<='z') || (ch>='A' && ch<='Z')){
      System.out.println("The character is an alphabet!");
      }
    else{
      System.out.println("The character is not an alphabet!");
    }
  }
}


    