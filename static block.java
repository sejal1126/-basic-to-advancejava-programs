import java.util.Scanner;
class Main {
  static int B;
  static int H; 
  static boolean flag;
  static
  {Scanner sc = new Scanner(System.in);
   B = sc.nextInt();
   H = sc.nextInt();
    if((B<0||H<0)||(B<0&&H<0))
    {System.out.println("Wrong!!");}
    else 
    {flag= true;}
    
  }
  
  public static void main(String[] args) {
   if(flag)
   {int area=B*H;
   System.out.println(area);}
  }
}

