public class Fibonacci {
    public static void main(String[] args) {
        int first=0,second=1;
        int num=10;
        System.out.print(first+" "+second+" ");
        for(int i=2;i<num;i++){
            int next=first+second;
            first=second;
            second=next;
            System.out.print(next+" ");
        }
    }
}
