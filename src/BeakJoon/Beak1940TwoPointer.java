package BeakJoon;

import java.util.Arrays;
import java.util.Scanner;

public class Beak1940TwoPointer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int N = sc.nextInt(); // 재료의 수
        int M = sc.nextInt(); // 2개 재료의 합 목표값
        int[] goyu = new int[N];
        for(int i = 0; i < N; i++) {
            goyu[i] = sc.nextInt();
        }
        Arrays.sort(goyu); //배열 정렬(nlogn)
        int min = 0;
        int max = N-1;
        long sum=0;
        while (max-min >= 1){
            sum = goyu[min]+goyu[max];
            if(sum==M){
                count++;
                min++;
                max--;
            }else if(sum < M){
                min++;
            }else{
                max--;
            }
        }
        System.out.println(count);
    }
}
