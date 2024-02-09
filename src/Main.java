import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = in.nextLine();
        String [] result = str.split(" ");
        int k=0;
        int count = 0;
        for (int i=0;i<result.length;i++){
            k=0;
            for(int j = 0; j < result[i].length(); j++) {
                char character = result[i].charAt(j);
                if ((character >= 'A' && character <= 'Z') || (character >= 'a' && character <= 'z')) {
                    k = k+1;
                }


            }
            if (k==result[i].length()) {
                System.out.println (result[i]);
                count++;
            }


        }
        System.out.println (count);


    }
}
