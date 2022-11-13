import java.util.Scanner;

public class Uniquechar {

	public static void main(String[] args) {
		boolean flag=true;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the name");
		String str=scan.nextLine();
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					System.out.println("the string contains duplicate characters");
					flag=false;
				}
			}
		}
		if(flag==true)
		{
			System.out.println("the string has unique characters");
		}

	}

}
