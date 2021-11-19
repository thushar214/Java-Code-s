import java.util.*;

public class Main
{
public static void main(String [] args)
{ 
Scanner sc = new Scanner(System.in);
String [] str = {"1111110","0110000","1101101","1111001","0110011","1011011","0011111","1110000","1111111","1110011"};
String s =sc.nextLine();
int n=s.length();
String [] str2 =new String[n];
char ch =' ',ch1=' ';
int a;
String st1="";
//taking input and stroing in new String array.
for(int i=0;i<s.length();i++)
{
ch = s.charAt(i);
a   = Integer.parseInt(ch+"");
st1 =str[a];
str2[i] = st1;
//System.out.println(str2[i]);
}

//Logic...
st1="";
String st2="";
ch=' ';
n=str[0].length();
int count=0;
st1 =str2[0];
for(int k=1;k<str2.length;k++)
{
st2 = str2[k];
for(int l=0;l<7;l++)
{
ch = st1.charAt(l);
ch1=st2.charAt(l);
if(ch1!=ch)
{
count++;
//System.out.println(ch);
}
}
st1=st2;
//System.out.println(st1);
}
System.out.println(count);
}
}