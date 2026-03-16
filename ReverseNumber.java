public class ReverseNumber {
    public static void main(String[] args) {
        int num=12345,sum=0,origin=num;
        while(num!=0){
            sum=sum*10+num%10;
            num/=10;
        }
        System.out.println(origin+" reverse is "+sum);
    }
}
