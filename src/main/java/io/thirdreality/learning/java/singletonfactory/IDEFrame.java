package io.thirdreality.learning.java.singletonfactory;

import javax.swing.*;
import java.util.*;
import java.lang.*;
import java.awt.*;

public class IDEFrame extends JFrame
{
    private IDEFrame()
    {
        initWindow("Java");
    }

    /**
     * Singleton method to initialize major window settings.
     *
     * @param programmingLanguageName Programming language that is supported by this IDE.
     */
    private void initWindow(String programmingLanguageName)
    {
        // Singleton part here to check for unintialized variable.
        if(programmingLanguageName == null)
        {
            // Second singleton part here to initialize the missing value.
            programmingLanguageName = "unknown programming language?";
        }

        // Now it is safe to use the variable 'programmingLanguageName'

        setTitle("Integrated Development Environment (for " + programmingLanguageName + ")");

        setMinimumSize(new Dimension(800, 600));
    }

    /**
     * Factory method to encapsulate the constructor.
     */
    public static IDEFrame getInstance()
    {
        return new IDEFrame();
    }
}
