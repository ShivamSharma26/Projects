/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypkg;

/**
 *
 * @author SHIVAM
 */
public class StrOp 
{
  
    public static String Reverse(String str)
    {
         String rstr="";
		for(int i=str.length()-1;i>=0;i--)
			rstr+=str.charAt(i);
                return rstr;
    }
    public static String ChangeCase(String str)
    {
        String cstr="";
		for(int i=0;i<str.length();i++)
		{
			int n=(int)str.charAt(i);
			if(n>=65 & n<97)
				n+=32;
			else if(n>=97 & n<=123)
				n-=32;
			
			cstr+=(char) n;
		}//End of loop
		return cstr;
    }
   public static int VowelCount(String str)
   {
       int vc=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='a'  || ch=='A'||ch=='e'  || ch=='E'||ch=='i'  || ch=='I'||ch=='o'  || ch=='O'||ch=='u'  || ch=='U')
				vc++;
		}
       return vc;
   }
    public static int ConsonantCount(String str)
   {
      int c;
        int vc=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='a'  || ch=='A'||ch=='e'  || ch=='E'||ch=='i'  || ch=='I'||ch=='o'  || ch=='O'||ch=='u'  || ch=='U')
				vc++;
		}
		c=str.length()-vc;
		return c;
   }
}
