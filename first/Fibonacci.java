public class Fibonacci
{
  public static void main(String[] args)
  {
    int a = 1;
    int b = 1;
    int c;

    System.out.println(a);
    System.out.println(b);

    for (a=1; a<1000;)
    {
    c=a+b;
    System.out.println(c);
    a=b;
    b=c;

}

}
}
