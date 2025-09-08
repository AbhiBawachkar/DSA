package Hashing;
import java.util.*;
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"Abhi");
        map.put(1,"Max");
        System.out.println(map.get(1));
        //Looping through HashMap using lambda function
        map.forEach((K, V) -> {
            System.out.println("key = "+ K + " value = " + V);
        });

    }
}
