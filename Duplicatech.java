import java.util.Scanner;

public class Duplicatech {

	public static void main(String[] args) {
		int v=0,c=0,s=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the string name");
	   String s1=scan.nextLine();
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
				if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
				{
					v++;
				}
				else if(ch>='a' && ch<='z' || ch>='A' && ch<='Z' )
				{
					c++;
				}
				else 
				{
					s++;
				}
			}
		
		System.out.println("vowels:" +v);
		System.out.println("consonants:" +c);
		System.out.println("special characters:" +s);
}
}
		


