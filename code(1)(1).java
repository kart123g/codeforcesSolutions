import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;

        int ar[] = new int[n];
        for(int i=0;i<n;i++){
            ar[i] = sc.nextInt();
            if(ar[i] >= ar[k-1]  & ar[i]>0){
                count = count + 1;
            }
        }
        System.out.println(count);
    }
}