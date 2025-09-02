package org.example.typeCasting;

public class TestTypeCasting {
    public static void main(String[] args) {

        // explicit casting

        byte b;
        int a = 120;
        b = (byte) a;
        System.out.println(b);

        float f = 3.17f;
        int val = (int) f; // lose points value
        System.out.println(val);


        // implicit casting => conversion

        int c;
        byte d = 111;
        c = d;
        System.out.println(c);

        // type promotion

        byte num1 = 30;
        byte num2 = 40;

        int result = num1 * num2;
        System.out.println(result);


    }
}
