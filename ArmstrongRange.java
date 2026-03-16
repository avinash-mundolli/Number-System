public class ArmstrongRange {
    public static boolean isArmstrong(int  num){
        int origin=num,sum=0;
        int len=String.valueOf(num).length();
        while(num!=0){
            sum=(int)(sum+Math.pow(num%10, len));
            num/=10;
        }
        if(origin==sum){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int start=120,end=500;
        for(int i=start;i<=end;i++){
            if(isArmstrong(i)){
                System.out.print(i+" ");
            }
        }
    }
}
