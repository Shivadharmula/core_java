package Programs;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number::");
        int num =sc.nextInt();
        int temp=num;
        int rev=0;
        while(num!=0) 
        {
        	rev=rev*10 + num%10;
        	num=num/10;
        }
      //  System.out.println(rev);
        if(temp==rev) 
        {
        	System.out.println("palindrome number:"+temp);
        }
        else
        {
        	System.out.println("not palindrome number:"+temp);
        }
	    }

}
