class JavaApplication7 {
    JavaApplication7()
    {
    System.out.println("hello java");
    }
    JavaApplication7(int a,int b)
    {
        int sum;
        sum=a+b;
        System.out.println("sum is"+sum);
    }
JavaApplication7(int a,int b,int c)
    {
        int sum,avg;
        sum=a+b+c;
         avg=sum/3;

        System.out.println("avg is"+avg);
    }
int getData( )
{
int i,sum=0;
for(i=1;i<=10;i++)
{
sum=sum+i;
}
return(sum);

}



    
    public static void main(String[] args) {
        JavaApplication7 obj1=new JavaApplication7();
        JavaApplication7 obj2=new JavaApplication7(3,5);
JavaApplication7  obj3=new JavaApplication7(4,6,8);
        int d=obj1.getData();
          System.out.println("value"+" "+d);

}
        
        
    }
    

