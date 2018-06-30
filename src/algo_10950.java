import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class algo_10950 {
    public static void main(String[] args) throws IOException {
        BufferedReader count = new BufferedReader(new InputStreamReader(System.in));

        int countInt = Integer.parseInt(count.readLine());
        int i = 0;

        while(i < countInt){
            BufferedReader num1 = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader num2 = new BufferedReader(new InputStreamReader(System.in));
            int a = Integer.parseInt(num1.readLine());
            int b = Integer.parseInt(num2.readLine());
            i++;
            System.out.println(a+b);
        }
    }
}
