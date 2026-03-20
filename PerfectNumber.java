public class PerfectNumber {
    public static void main(String[] args) {
        int num=6,sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        if(num==sum){
            System.out.println("PerfectNumber");
        }else{
            System.out.println("not PerfectNumber");
        }
    }
}
