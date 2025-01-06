import java.util.*;
public class Evenodd {
        public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int evenc = 0;
            int oddc = 0;
            int[]arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++){
             if(arr[i]%2 == 0){
              evenc++;  
             }
             else{
             oddc++;
            }  
        }
            System.out.println("even count:"+evenc);
            System.out.println("odd count"+oddc);
    
        }
    }
