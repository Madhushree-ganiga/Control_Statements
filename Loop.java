

import java.util.Scanner;
class Loop
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter ua fav number");
	byte number=sc.nextByte();
	System.out.println("number is="+number);
byte marks[]={90,89,67,87,98,90};
byte index=0;
int sum=0;
for(index=0;index<marks.length;index++)
{
System.out.println(marks[index]);
sum=sum+marks[index];
}
System.out.println(marks.length);
System.out.println(sum/marks.length);
System.out.println("===========================");
int num=55;
while(num<60)
{
	System.out.println(num);
	num++;
}
}
}