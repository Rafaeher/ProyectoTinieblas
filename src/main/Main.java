package main;

import java.io.IOException;

public class Main
{

    public static void main(String[] args)
    {
        System.out.println("Bye bye");

        int a = 0;

        a -= 1;
        a++;

        System.out.println(a);
        try {
            int b = System.in.read();
            System.out.println(b);
        } catch (IOException e) {
            e.printStackTrace(); // Hola
        }

    }
}
