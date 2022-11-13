import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s1="keep";
		String s2="";
		String s3="peek";
		String s4="";
		for(int i=0;i<s1.length();i++)
		{
			s2=s2+(char)(s1.charAt(i)-32);
		}
		for(int j=0;j<s3.length();j++)
		{
			s4=s4+(char)(s3.charAt(j)-32);
		}
		char[] ch1=s1.toCharArray();
		char[] ch2=s3.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		if(Arrays.equals(ch1, ch2))
		{
			System.out.println("its a Anagram");
		}
		else
		{
			System.out.println("its not a Anagaram");
		}
	}
}

