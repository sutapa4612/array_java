import java.util.Scanner;
class array
{
public static void main(String args[])
{
Scanner Sc=new Scanner(System.in);
System.out.print("Enter Size");
int n=Sc.nextInt();
int marks[]=new int[n];
System.out.println("Arrays length"+marks.length);
System.out.println("Enter"+n+"Elements");
for(int i=0;i<marks.length;i++)
{
marks[i]=Sc.nextInt();
}
int total=0;
System.out.print("Elements are");
for(int i=0;i<marks.length;i++)
{
System.out.println(marks[i]);
total=total+marks[i];
}
System.out.print("Total"+total);
}
}