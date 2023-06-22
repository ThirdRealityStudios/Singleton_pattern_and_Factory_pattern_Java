package io.thirdreality.learning.java.singletonfactory;

public class Main
{
    private static IDEFrame ide0, ide1;

    public static void main(String[] args)
    {
        ide0 = IDEFrame.getInstance();
        ide1 = IDEFrame.getInstance();

        // TODO Make JUnit assertion to assertEquals(ide0.hashcode(), ide1.hashcode());

        ide0.setVisible(true);
    }
}

