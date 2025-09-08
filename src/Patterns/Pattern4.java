package Patterns;
/*
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
*/
class Demo4{
    public void pattern(int n){
        for(int i = 1; i <=n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i+ " ");
            }
            System.out.println();
        }
    }
}

public class Pattern4 {
    public static void main(String[] args) {
        Demo4 print = new Demo4();
        print.pattern(5);
    }
}
