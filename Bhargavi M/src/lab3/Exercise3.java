package lab3;

import java.util.Scanner;
//Create a method which accepts a String and replaces all the consonants in the String 
//with the next alphabet. 
//Note: Consonant refers to all alphabets excluding vowels

public class Exercise3 {

	 public String replaceConsonants(String str)
     {
            StringBuffer sbr = new StringBuffer(str);
            for(int i=0;i<str.length();i++)
            {
                   char c = sbr.charAt(i);
                   if(!(c == 'A' || c =='a' || c=='I'||c=='i'||c=='O'||c=='o'||c=='U'||c=='u'||c=='E'||c=='e'))
                   {
                         sbr.replace(i,i+1,String.valueOf((char)(c+1)));
                   }
            }
            return sbr.toString();
     }
	public static void main(String[] args) {
		 Exercise3 e3 = new Exercise3();
         Scanner s = new Scanner(System.in);
         System.out.println("Enter a string");
         String str = s.next();
         System.out.println(e3.replaceConsonants(str));

	}

}
