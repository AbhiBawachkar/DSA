package Maths;

public class CheckPalindrome {
    public static void main(String[] args) {
        int pDigit = 4554;
        int dup = pDigit;
        int pRev = 0;
        while(pDigit > 0){
            int lastDigit = pDigit % 10;
            pRev = pRev * 10 + lastDigit;
            pDigit = pDigit / 10;
        }
        if(pRev == dup){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
