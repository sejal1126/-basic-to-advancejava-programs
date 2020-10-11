class Main {
  Main()
  {System.out.println("Base class constructer is invoked");}
  
  public static void main(String[] args) {
    System.out.println("Hello world!");
  child c2 = new child();
  }
}

class child extends Main
{
  
  {System.out.println("child class");}
  {System.out.println("Running instance Initialiser block");}
}
