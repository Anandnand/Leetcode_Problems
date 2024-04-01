import java.util.Scanner;
import java.util.Stack;

//Time complexity: O(n)
//Space complexity: O(n)

public class ValidParanthesis {
	public static boolean paranthesis(String str) {
		Stack<Character> st=new Stack<>();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='(' || ch=='{' ||ch=='[') {
				st.push(ch);
				if(st.isEmpty()) {
					return false;
				}
			}else {
				if((st.peek()=='(' && ch==')') 
				|| (st.peek()=='{' && ch=='}') 
				|| (st.peek()=='[' && ch==']')){
					st.pop();
				}else {
					return false;
				}
			}
		}
		return st.isEmpty();
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the paranthesis to check whether it is valid or not");
		String str=sc.next();
		System.out.println(paranthesis(str));
		
	}

}
