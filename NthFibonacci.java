public class NthFibonacci {
    public static void main(String[] args) {
        int first=0,second=1;
        int num=7,next=0;
        if(num==1){
            System.out.println(0);
        }else if(num==2){
            System.out.println(1);
        }else{
            for(int i=2;i<num;i++){
            next=first+second;
            first=second;
            second=next;
        }
        System.out.println(num+" fibonachi is "+next);
        }
        
        
    }
}
