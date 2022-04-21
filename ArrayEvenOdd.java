import java.util.Scanner;
class ArrayEvenOdd{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter array size :");
    int n=s.nextInt();
    int arr[]=new int[n];
    int sum=0;
    int even=0,odd=0;
    System.out.println("Enter "+n+" array values");
    for(int i=0;i<n;i++)
    {
      arr[i]=s.nextInt();
    
    }
    for(int i=0;i<n;i++)
    {
     if(arr[i]%2==0){
       even++;
    }
    else{
      odd++;
    }
      }
    System.out.println("the total even numbers in the array is =" +even);
     System.out.println("the total odd numbers in the array is =" +odd);
  }
}

