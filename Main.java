import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        DynamicArray<String> da = new DynamicArray();


        da.add("X");
        da.add("Y");
        da.add("Z");

        System.out.println(da.remove()); // Returns Z
        System.out.println(da.remove()); // Returns Y
        System.out.println(da.remove()); // Returns X
        System.out.println(da.remove()); // Returns null



    }






}