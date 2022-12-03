import java.util.Scanner;

public class NumToWord {
    public static void main(String[] args) {
        String[] word = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        n = reverse(n);
        for ( ;n>0; n /= 10) {
            int h = n%10;
            switch (h){
                case 0:
                    System.out.print(word[0]+ " ");
                    break;
                case 1:
                    System.out.print(word[1]+ " ");
                    break;
                case 2:
                    System.out.print(word[2]+ " ");
                    break;
                case 3:
                    System.out.print(word[3]+ " ");
                    break;
                case 4:
                    System.out.print(word[4]+ " ");
                    break;
                case 5:
                    System.out.print(word[5]+ " ");
                    break;
                case 6:
                    System.out.print(word[6]+ " ");
                    break;
                case 7:
                    System.out.print(word[7]+ " ");
                    break;
                case 8:
                    System.out.print(word[8]+ " ");
                    break;
                case 9:
                    System.out.print(word[9]+ " ");
                    break;
            }
        }
    }

    static int reverse(int n) {
        int i = 0, newNo = 0;
        while(n>0){
            int r = n%10;
            newNo = newNo*10 + r;
            n /= 10;
        }
        return newNo;
    }
}
