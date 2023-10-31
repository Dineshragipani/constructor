class A
{
    int x=10;
    int y=10;
    public int A()
    {
        int z=x+y;
        System.out.println(z);
        return z;
    }
}
class Main
{
    public static void main(String[] args)
    {
        A a=new A();
        a.A();
    }
}