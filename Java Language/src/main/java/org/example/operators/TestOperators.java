package org.example.operators;

public class TestOperators {
    public static void main(String[] args) {

        // arithmatic operators

        int num1 = 10;
        int num2 = 20;

        int sum = num1 + num2;
        System.out.println(sum);

        int dif = num2 - num1;
        System.out.println(dif);

        int mul = num1 * num2;
        System.out.println(mul);

        int div = num2 / num1;
        System.out.println(div);

        int mod = num1 % num2;
        System.out.println(mod);

        num1 +=20;
        System.out.println(num1);

        num2++; // preincrement
        System.out.println(num2);

        ++num2; // postincrement
        System.out.println(num2);

        num1--;
        System.out.println(num1);


        // relational operator

        int x = 10;
        int y = 11;

        System.out.println(x>y);
        System.out.println(x<y);
        System.out.println(x==y);
        System.out.println(x>=y);
        System.out.println(x<=y);
        System.out.println(x!=y);


        // logical operator

        boolean flag1 = true;
        boolean  flag2 = false;

        boolean flag3 = flag1 && flag2;
        System.out.println(flag3);
        boolean flag4 = flag1 || flag2;
        System.out.println(flag4);
        System.out.println(!flag3);

    }
}
