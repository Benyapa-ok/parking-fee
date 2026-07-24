import java.util.Scanner;
public class ii {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int min, hour, pay;
        min = input.nextInt();
        if (min <= 60) {
            System.out.println("0");
        }else if (min > 60) {
            hour = min / 60;
            if ( min % 60 != 0) {
                pay = hour * 10;
                System.out.println(pay);
            }else {
                pay = (hour - 1) * 10;
                System.out.println(pay);
            }
        }
    }
}