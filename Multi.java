import java.util.Scanner;
public class Multi
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    if(a>b)
    {
      if(a>c)
       System.out.println("max" + a);
      else
      System.out.println("max" + c);
    }
    if(b>c)
    {
      if(b>c)
       System.out.println("max" + b);
      else
      System.out.println("max" + c);
    }

  }
}