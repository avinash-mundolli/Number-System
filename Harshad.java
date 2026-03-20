public class Harshad {
    public static void main(String[] args) {
        int num=18,sum=0;
        int origin=num;
        while(num!=0){
            int last=num%10;
            sum+=last;
            num/=10;
        }
        if(origin%sum==0){
            System.out.println(" Harshad Number");
        }else{
            System.out.println("not Harshad Number");
        }
    }
}
