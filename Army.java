import java.util.Scanner;
class Army
{
public static void main(String[] args)
{

Scanner obj=new Scanner(System.in);
int[] a=new int[5];
for(int i=0;i<5;i++)
{
System.out.println("enter numbers");
a[i]=obj.nextInt();
}
for(int j=0;j<5;j++)
{
System.out.println(a[j]);
}
}
}


