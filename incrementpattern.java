import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    
    int i=0,j=0,space=1;
    int n = sc.nextInt();
    for(i=1;i<=n;i++)
    {
      for(j=1;j<=i;j++)
     { System.out.print(space+" ");
      space++;
     }
     System.out.println();
    }

  }
}



1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
