
public class Removedup {

	public static void main(String[] args) {
		String s1="aabbccdd";
		StringBuffer s2=new StringBuffer();
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			int index=s1.indexOf(ch,i+1);
			if(index==-1)
			{
				s2.append(ch);
			}
		}
		System.out.println(""+s2);
	}

}
