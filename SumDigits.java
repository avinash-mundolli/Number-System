public class SumDigits {
    public static void main(String[] args) {
        int num=12345,original=num;
        int sum=0;
        while(num!=0){
            sum=sum+num%10;
            num/=10;
        }
        System.out.println(original+" sum is "+sum);
    }
}
