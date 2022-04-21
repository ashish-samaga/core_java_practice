import java.util.Scanner;
class AlphNumSp{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.println("Please enter the character :");
    char ch;
    ch = s.next().charAt(0);

    if((ch>='a'&& ch<='z')|| (ch>='A'&& ch<='Z')){
      System.out.println("Entered character is an alphabet");
    }
    else if(ch>='0' && ch<='9'){
      System.out.println("Entered character is a number");
    }
    else{
      System.out.println("Entered character is a special character");
    }
  }
}

