package io.thirdreality.learning.java.singletonfactory;

import javax.swing.*;
import java.util.*;
import java.lang.*;
import java.awt.*;

public class IDEFrame extends JFrame
{
    // Variable to realize the concept on Singleton.
    private static IDEFrame ide;

    private IDEFrame()
    {
        initWindow();

        // TODO Add components to development.
    }

    /**
     * Initialize major window settings.
     */
    private void initWindow()
    {
        setTitle("Integrated Development Environment (for Java)");
        setMinimumSize(new Dimension(800, 600));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * Factory method (= hidden constructor) with a Singleton pattern (= always exact one instance required) to encapsulate the constructor.
     */
    public static IDEFrame getInstance()
    {
        // Singleton part to check for uninitialized instance.
        if(ide == null)
        {
            // Factory method part to call the private constructor.
            ide = new IDEFrame();
        }

        // Second singleton part to always return the same exact one instance.
        return ide;
    }
}
