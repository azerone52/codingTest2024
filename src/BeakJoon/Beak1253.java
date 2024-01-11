package BeakJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Beak1253 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        //수의 개수 받기
        int N = Integer.parseInt(st.nextToken());
        //배열 생성
        long[] arr = new long[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i] = Long.parseLong(st.nextToken());
        }
        //배열 정렬
        Arrays.sort(arr);
        //다른 두 수의 합으로 표현 되는 수 찾기
        int count = 0;
        for(int i=2; i<N; i++){
            int min = 0;
            int max = i-1;

            while(min<max){
                long sum = arr[min]+arr[max];
                if(arr[i] == sum){
                    count++;
                    break;
                }else if(arr[i] < sum){
                    max--;
                }else{
                    min++;
                }
            }
        }
        System.out.println("count = " + count);
    }
}