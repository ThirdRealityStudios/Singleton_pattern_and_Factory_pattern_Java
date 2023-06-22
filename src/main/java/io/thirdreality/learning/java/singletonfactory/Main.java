package io.thirdreality.learning.java.singletonfactory;

public class Main
{
    private static IDEFrame ide;

    public static void main(String[] args)
    {
        ide = IDEFrame.getInstance();

        ide.setVisible(true);
    }
}

