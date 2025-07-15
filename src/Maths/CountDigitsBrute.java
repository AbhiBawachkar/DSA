package Maths;

public class CountDigitsBrute {
    public static void main(String[] args) {
        int Digit = 12345;
        int Count = 0;
        while (Digit > 0){
            Count++;
            Digit = Digit / 10;
        }
        System.out.println(Count);
    }
}
