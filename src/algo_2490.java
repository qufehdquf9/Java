import java.util.Scanner;

public class algo_2490{
    public static void main(String[] args) {
        char[][] array = new char[3][4];
        int count = 0;
        Scanner scan = new Scanner(System.in);

        for(int i = 0 ; i < 3 ; i++) {
            for (int j = 0; j < 4; j++) {
                array[i][j] = scan.next().charAt(0);
                if (array[i][j] == '0') count++;
                if (j == 3) {
                    if (count == 0) System.out.println("E");
                    else if (count == 1) System.out.println("A");
                    else if (count == 2) System.out.println("B");
                    else if (count == 3) System.out.println("C");
                    else if (count == 4) System.out.println("D");


                }

            }
            count = 0;
        }
    }
}