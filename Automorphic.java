public class Automorphic {
    public static void main(String[] args) {
        int num=7;
        int len=String.valueOf(num).length();
        int last=(int)(num*num%Math.pow(10, len));
        if(num==last){
            System.out.println("Automorphic number");
        }else{
            System.out.println("Not Automorphic number");
        }
    }
}
