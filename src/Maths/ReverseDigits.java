package Maths;

public class ReverseDigits {
    public static void main(String[] args) {
        int rDigit = 12345;
        int rev = 0;
        while (rDigit > 0){
            int lastDigit = rDigit % 10;
            rev = (rev * 10) + lastDigit;
            rDigit = rDigit/10;
        }
        System.out.println(rev);
    }
}
