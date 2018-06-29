import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class algo_2558 {
    public static void main(String[] args) throws IOException {
        BufferedReader num1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader num2 = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(num1.readLine());
        int b = Integer.parseInt(num2.readLine());

        System.out.println(a+b);
    }
}
