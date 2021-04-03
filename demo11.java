class demo11
{
static
{
System.out.println("Static block");
}


public demo11()
{
System.out.println("Default constructor");
}

public demo11(int a)
{
System.out.println("A=="+a);
}

public demo11(int a,int b)
{
System.out.println("Parametized constructorr=="+""+a);
System.out.println("Parametized constructorr=="+""+b);
}

public static void main(String args[])
{

demo11 k= new demo11(2);
demo11 k2=new demo11(2,4);
demo11 k1=new demo11();
}
}