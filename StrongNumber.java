public class StrongNumber {
    public static int factorial(int num){
        int fact=1;
        for(int i=2;i<=num;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        int num=146,sum=0,origin=num;
        while(num!=0){
            sum=sum+factorial(num%10);
            num/=10;
        }
        if(origin==sum){
            System.out.println(origin+" is Strong number");
        }else{
            System.out.println(origin+" is not strong number");
        }
    }
}
