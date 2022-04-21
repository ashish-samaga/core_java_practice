import java.util.Scanner;
class AlphCons{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    char ch;
    System.out.println("Please enter the character :");
    ch = s.next().charAt(0);

    switch (ch){
      case 'a':
      case 'e':
      case 'i':
      case 'o':
      case 'u':
      case 'A':
      case 'E':
      case 'I':
      case 'O':
      case 'U':
        System.out.println(ch +" is a vowel");
        break;
      default:
        System.out.println(ch +" is a consonant");
    }
  }
}

