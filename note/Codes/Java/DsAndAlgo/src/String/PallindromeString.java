package String;

public class PallindromeString {

    public static boolean isPallindrome(String word) {
        char[] charArray = word.toCharArray();
        int start = 0;
        int end = word.length()-1;
        while(start<end){
            if(charArray[start]!=charArray[end])return false;
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPallindrome("madam"));
    }
}
