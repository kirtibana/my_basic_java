class Book
{
String bname;
int pages;
Book()
{
bname="JAVA Programming";
pages=300;
}
void display()
{
System.out.println("the book name is"+bname);
System.out.println("no. of pages is"+pages);
}
}
class SoftwareBook extends Book
{
String sname;
SoftwareBook()
{
sname="JAVA JDK1.7";
}
void print()
{
System.of.println("the software name is"+sname);
}
}
class Parent
{
public static void main(String[] args)
{
SoftwareBook s = new SoftwareBook();
s.print();
}
}
