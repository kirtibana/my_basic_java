    class Student10{  
     int rollno;  
     String name;  
     String city;  
      
     Student10(int rollno, String name, String city){  
     this.rollno=rollno;  
     this.name=name;  
     this.city=city;  
     }  
      
     public static void main(String args[]){  
       Student10 s1=new Student10(101,"Raj","lucknow");  
       Student10 s2=new Student10(102,"Vijay","ghaziabad");  
         
       System.out.println(s1); 
//compiler writes here s1.toString()  
       System.out.println(s2);
//compiler writes here s2.toString()  
     }  
    }  