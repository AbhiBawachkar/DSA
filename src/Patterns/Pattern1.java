package Patterns;
/*
 ****
 ****
 ****
 ****
 */

class demo{
    public void print(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}

public class Pattern1 {
    public static void main(String[] args) {
        demo pattern = new demo();
        pattern.print(3);
    }
}