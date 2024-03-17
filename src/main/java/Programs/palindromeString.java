package Programs;

import java.util.Scanner;

public class palindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String::");
        String str=sc.next();
        String temp=str;
        
        String rev="";
        
        int len=str.length();
        for(int i=len-1;i>=0;i--) 
        {
        	rev=rev+str.charAt(i);
        }
      //System.out.println(rev);
        if(temp.equals(rev)) {
        	System.out.println("is palindrome:"+temp);
        }
        else {
        	System.out.println("not palindrome:"+temp);
        }
        
	}

}
