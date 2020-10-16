import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    
    int i=0,j=0,space=1;
    int n = sc.nextInt();
    for(i=1;i<=n;i++)
    {
      for(j=1;j<=n;j++)
     { if(j<=n-i)
     {System.out.print(" ");}
     else
     {System.out.print(" *");}
     }
     System.out.println();
    }
   }
}
