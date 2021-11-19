import java.util.Scanner;

public class string
{
public static void main(String [] args)
{
Scanner sc = new Scanner(System.in);
String str =sc.nextLine();
String [] s = str.split(" ");
String str1 = s[0];
int n=str1.length();
//System.out.println(n);
int [] arr = new int[n];
int var=0,res=0,r=0,p=0;
char ch = ' ';
//logic 
//loop to check the length of the elements...
for(int i=0;i<n;i++)
{
if(n != s[i].length())
{
    r=1;
}
}

//2nd condition....
if(r!=1)
{
for(int a=0;a<n;a++)
{
str1 = s[a];
for(int b=1;b<n;b++)
{
if(str1.charAt(0) == str1.charAt(b))
{
    p=1;
}
}
}
}
//logic to calculate the output...
if(p==0 && r==0)
{
for(int k=0;k<n;k++)
{
for(int j=0;j<n;j++)
{
str1=s[j];
ch = str1.charAt(k);
var= Integer.parseInt(ch+"");
res=res+var;
}
arr[k]=res;
res=0;
}
}
//loop ends....
if(r==1 || p==1)
{
System.out.println("Invalid input");
}
else
{
for(int l=0;l<n;l++)
{
if(arr[l] == 0 )
{
    System.out.println("Invalid input");
}
else
{
System.out.print(arr[l]+" ");
}
}
}
}
}