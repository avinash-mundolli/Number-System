public class PrimeRange {
    public static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        for(int i=2;i<num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int start=13,end=45;
        for(int i=start;i<=end;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
}
