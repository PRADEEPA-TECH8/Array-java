import java.util.*;
public class Oddeven {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=5;
        int even = 0;
        int odd = 0;
        int[]arr=new int[n];
        for(int i=0;i<=n-1;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<=n-1;i++){
            if(i%2==0){
              even++;
            }
            else{
               odd++;
            } 
        }
        System.out.println("even: "+even); 
        System.out.println("odd: "+odd);
        
        }

}
