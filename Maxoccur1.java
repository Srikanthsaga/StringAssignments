
public class Maxoccur1 {

	public static void main(String[] args) {
		String s1="Go get green vegetables";
		int[] index=new int[256];
		int max=-1;
		char count=' ';
		for(int i=0;i<s1.length();i++)
		{
			index[s1.charAt(i)]=index[s1.charAt(i)]+1;
		}
		for(int i=0;i<s1.length();i++)
		{
		if(max<index[s1.charAt(i)])
		{
			max=index[s1.charAt(i)];
			count=s1.charAt(i);
		}
	}
System.out.println("maxoccur:" +count);
}
}
