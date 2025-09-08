package Patterns;

class Demo3{
    public void pattern(int n){
        for(int i = 1; i <=n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}

public class Pattern3 {
    public static void main(String[] args) {
        Demo3 print = new Demo3();
        print.pattern(5);
    }
}
