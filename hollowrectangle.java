import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    
    int i=0,j=0,space=0;
    int n = sc.nextInt();
    for(i=1;i<=n;i++)
    {
      for(j=1;j<=n;j++)
      {if(i==1||i==n||j==1||j==n)
        {System.out.print("*");}
      else
      { System.out.print(" ");}}
      System.out.println();
      
    }

  }
}
*****
*   *
*   *
*   *
*****
