package String_Concepts;


import java.util.Scanner;
class Main {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.next();
        Main m1 = new Main();
        if(m1.isPalindrome(str))
        {
            System.out.println(str+" is palindrome");
        }
        else
        {
             System.out.println(str+" is not a palindrome");
        }
        sc.close();
    }
    public boolean isPalindrome(String str)
    {
        String reverse="";
        if(str==null)
        return false;
        if(str.indexOf(0)!=str.lastIndexOf(str.length()-1))
        	return false;
        for(int i=str.length()-1;i>=0;i--)
        {
            reverse += str.charAt(i);
        }
        return reverse.equals(str);
    }
}