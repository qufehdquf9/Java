import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class algo_10950 {
    public static void main(String[] args) throws IOException {

        BufferedReader count = new BufferedReader(new InputStreamReader(System.in));
        String s_count = count.readLine();
        int count_Integer = Integer.valueOf(String.valueOf(s_count));
        int[] answer = new int[count_Integer];
        int num = 0;
        int[] token = new int[2];
        int counter = count_Integer;

        while(counter > 0){
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);
            answer[num] = 0;
            if(st.countTokens() == 2){
                int i = 0;
                while (st.hasMoreTokens()){
                    token[i] =Integer.valueOf(st.nextToken());
                    i++;
//
                }
                if(token[0]>0 && token[1] < 10){
                    answer[num]=token[0]+token[1];
                }else System.out.println("0 < A, B < 10 으로 적어주세요.");
            }else System.out.println("2개의 값만 입력해주세요.");
            num ++;
            counter --;
        }
        for (int i = 0; i < num; i++) {
            System.out.println(answer[i]);
        }
    }
}
