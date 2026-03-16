public class Armstrong {
    public static void main(String[] args) {
        int num=371,origin=num;
        int sum=0;
        int len=String.valueOf(num).length();
        while(num!=0){
            sum=(int)(sum+Math.pow(num%10, len));
            num/=10;
        }
        if(sum==origin){
            System.out.println(origin+" is armstrong number");
        }else{
            System.out.println(origin+" is not armstrong number");
        }
    }
}
