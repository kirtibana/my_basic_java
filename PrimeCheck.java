import java.util.Scanner;
class PrimeCheck
{
   public static void main(String args[])
   {		
	int i,num,p=0;
	
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter any number:");
	
	 num=scan.nextInt();
for(i=1;i<=num;i++)
{
if(num%i==0)
{
p++;
}
}
        
	if(p==2)
{
	   System.out.println(num + " is a Prime Number");
}
	else
{
	   System.out.println(num + " is not a Prime Number");
}
   }
}