public class PerfectSquare {
    public static void main(String[] args) {
        int num=36;
        int sqrt=(int)(Math.sqrt(num));
        if(num==sqrt*sqrt){
            System.out.println("Perfect Square");
        }else{
            System.out.println("Not Perfect Number");
        }
    }
}
