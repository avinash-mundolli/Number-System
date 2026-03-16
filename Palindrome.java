public class Palindrome {
    public static  boolean isPalindrome(String str){
        str=str.replaceAll("[\\W_\\s]", "").toLowerCase();
        return str.equals(new StringBuilder(str).reverse().toString());
        
    }
    public static void main(String[] args) {
        String num="avinashmundoli";
        if(isPalindrome(num)){
            System.out.println(num+" is palinf=drome");
        }else{
            System.out.println(num+" is not palindrome");
        }

    }
}
