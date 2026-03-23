public class Abundant {
    public static void main(String[] args) {
        int num=16;
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                System.out.print(i+" ");
                sum=sum+i;
            }
        }
        if(sum>num){
            System.out.println("Abundant  Number");
        }else{
            System.out.println("Not Abundent NUmber");
        }
    }
}
