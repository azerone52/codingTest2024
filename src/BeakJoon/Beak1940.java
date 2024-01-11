package BeakJoon;

import java.util.Scanner;

public class Beak1940 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int N = sc.nextInt(); // 재료의 수
        int M = sc.nextInt(); // 2개 재료의 합 목표값
        int[] goyu = new int[N];
        for(int i = 0; i < N; i++){
            goyu[i] = sc.nextInt();
        }

        for(int i = 0; i < N-1; i++){
            long sum = 0;
            int k = i+1;
            while(sum != M && k < N){
                sum = goyu[i] + goyu[k];
                k++;
            }
            if(sum == M){
                count++;
            }
        }
        System.out.println(count);
    }
}
