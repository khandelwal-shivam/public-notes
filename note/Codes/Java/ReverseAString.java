// Reverse a String using Stack
// Using predefined Stack class of java
import java.util.Stack;
public class ReverseAString {
	String original;
	String reverse = "";
	public ReverseAString(String str) {
		this.original = str;
	}
	
	public String getReverse(){
		Stack <Character>st = new Stack<Character>();
		char ch[] = original.toCharArray();
		int length = ch.length;
		int i = 0;
		
		// pushing all the characters
		while(i<length) {
			st.push(ch[i]);
			i++;
		}
		
		//poping all the characters and appending it to reverse
		while(!st.empty()) {
			reverse = reverse+st.pop();
		}
		
		return reverse;
	}
	
	
	public static void main(String[] args){
		String str = "Shivam";
		ReverseAString ras = new ReverseAString(str);
		System.out.println(ras.getReverse());
	}
}