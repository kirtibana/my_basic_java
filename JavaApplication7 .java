public class JavaApplication7 {
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

    
    public static void main(String[] args) {
        JavaApplication7 obj1=new JavaApplication7();
        JavaApplication7 obj2=new JavaApplication7(3,5);
        
        
    }
    
}
