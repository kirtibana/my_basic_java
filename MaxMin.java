class MaxMin
{
public static void main(String[] args)
{
int[] a={2,5,6,8};
int max,min;
max=a[0];
min=a[0];

for(int i=0;i<4;i++)
{
if(a[i]<min)
min=a[i];
if(a[i]>max)
max=a[i];
}
System.out.println(min);
System.out.println(max);
}
}
