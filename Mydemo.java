class Calculator
{
int x = 10;
}
class Addition extends Calculator
{
void compute()
{ 
System.out.println(x*5);
}
}
class Mydemo
{
public static void main(String[] args)
{
Addition b=new Addition();
b.compute();

}
}