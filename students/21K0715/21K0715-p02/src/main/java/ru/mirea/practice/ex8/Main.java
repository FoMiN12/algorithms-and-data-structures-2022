package ru.mirea.practice.ex8;

public final class Main {
    private Main() {

    }

    public static void main(final String[] args) {
        String[] someArray = new String[10];
        for (int i = 0; i < someArray.length; i++) {
            someArray[i] = String.valueOf(i * i);
        }
        String tempString;
        for (int i = 0; i < someArray.length / 2; i++) {
            tempString = someArray[i];
            someArray[i] = someArray[someArray.length - 1 - i];
            someArray[someArray.length - 1 - i] = tempString;
        }

        for (String element: someArray) {
            System.out.println(element);
        }
    }
}
