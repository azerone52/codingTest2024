package BeakJoon;

import java.util.Scanner;

public class Beak2018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int length = 0;
        int cnt = 1;//무조건 자기 자신은 가짐

        if(N%2 == 0) length = N/2 - 1;
        else length = N/2;

        for(int i = 1; i<=length; i++){
            int sum = 0;
            int x = i;
            while(sum < N){
                sum += x;
                x++;
            }
            if(sum == N){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
