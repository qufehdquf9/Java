import java.util.ArrayList;
import java.util.Scanner;

public class algo_2490_collection{
    public static void main(String[] args) {

        int count = 0;
        Scanner scan = new Scanner(System.in);

        for(int i = 0 ; i < 3 ; i++) {
            ArrayList<Character> a = new ArrayList();
            count = 0;
            for (int j = 0; j < 4; j++) {
                a.add(scan.next().charAt(0));
                if(a.get(j)=='0')count++;
                System.out.println(count);
                if (j == 3) {
                    if (count == 0) System.out.println("E");
                    else if (count == 1) System.out.println("A");
                    else if (count == 2) System.out.println("B");
                    else if (count == 3) System.out.println("C");
                    else if (count == 4) System.out.println("D");
                }

            }
        }

    }
}