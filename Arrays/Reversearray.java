import java.util.Scanner;

public class Reversearray {
    public static void main(String[] args){
        int n =5;
        Scanner sc=new Scanner(System.in);
        int[]arr=new int[n];
        int even=0;
        int odd=0;
        for(int i=0;i<=n-1;i++){
            if(i%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("even:"+even);
        System.out.println("odd:"+odd);


        
        }
}
