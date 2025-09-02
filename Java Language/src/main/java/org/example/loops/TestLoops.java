package org.example.loops;

public class TestLoops {
    public static void main(String[] args) {

        // while loop

        int i = 1;
        while(i<=3){
            System.out.println("hi "+ i);
            int j = 1;
            while(j<=3){
               System.out.println("hello "+ j);
               j++;
           }
            i++;
        }

        // do while loop
        int k=5;
        do{
            System.out.println("hi");
            k++;
        }while(k<=4);
    }

    // for loop
}
