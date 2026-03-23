public class HCF {
    public static void main(String[] args) {
        int num1=36,num2=60;
        int ans=0;
        int max=Math.max(num1, num2);
        for(int i=1;i<=max;i++){
            if(num1%i==0&&num2%i==0){
                ans=i;
            }
        }
        System.out.println(ans);
    }
}