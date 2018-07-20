import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Scanner;

public class algo_5789 {
    public static void main(String[] args)throws Exception{
        Scanner s = new Scanner(System.in);
        int count = Integer.parseInt(s.next());
        String a[] = new String[count];
        String answer[] = new String[count];
        String brige = " ";
        for (int i = 0; i <count; i++) {
            Scanner sc = new Scanner(System.in);
            a[i] = sc.next();
            if(a[i].length()%2 == 0){
                char[] c_arr = a[i].toCharArray();
                for (int j = 0; j < c_arr.length; j++) {
                    if(c_arr[j] == '0' || c_arr[j] == '1'){
                        if(c_arr[j] == c_arr[c_arr.length - j-1]){
                            brige = "Do-it";
                        }else brige = "Do-it-Not";
                    }else {
                        brige ="0 또는 1이 아니다.";
                        break;
                    }
                }
            }else brige = "항이 홀수개.";
            answer[i]= brige;
            brige = " ";
        }
        for (int i = 0; i < count; i++) {
            System.out.println(answer[i]);
        }
    }
}
