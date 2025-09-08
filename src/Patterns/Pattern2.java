package Patterns;
/*
 *
 * *
 * * *
 * * * *
 * * * * *
 */
class Demo2{
    public void print(int n){
        for(int i = 0; i<n; i++){
            for(int j = 0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

public class Pattern2 {
    public static void main(String[] args) {
        Demo2 print = new Demo2();
        print.print(5);

    }
}
