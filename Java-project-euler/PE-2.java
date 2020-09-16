public class Main
{
	public static void main(String[] args) {
         int sum = 0;
         int t1=0;
         int t2 =1;
         int t0 = 0;
        while(t0 < 4000000){
            if(t0%2==0){
                sum+=t0;
            }
            t1=t2;
            t2=t0; 
            t0=t1+t2;
        }
        System.out.print(sum);
     }
}

