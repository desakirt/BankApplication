
package com.github.desakirt.bankapplication.utilities;

import com.github.derickfelix.bankapplication.views.dialogs.ExceptionDialog;
import javax.swing.JOptionPane;

public class MessageUtility {

    private MessageUtility()
    {
    }
    
    public static void info(String message)
    {
        info(null, message);
    }
    
    public static void info(java.awt.Frame parent, String message)
    {
        JOptionPane.showMessageDialog(parent, message, "Zwei Bank Application", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void warning(String message)
    {
        warning(null, message);
    }
    public static void warning(java.awt.Frame parent, String message)
    {
        JOptionPane.showMessageDialog(parent, message, "Zwei Bank Application", JOptionPane.WARNING_MESSAGE);
    }
    
    public static int confirmWarning(java.awt.Frame parent, String message)
    {
        return JOptionPane.showConfirmDialog(null, message, "Zwei Bank Application", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
    }

    /**
     * Show an exception dialog with two buttons, okay (closes the dialog) and
     * detail (shows another dialog detailing the exception).
     *
     * @param parent the calling frame of this dialog
     * @param e the exception which this dialog is showing
     */
    public static void error(java.awt.Frame parent, Exception e)
    {
        error(parent, e.getMessage(), e);
    }

    public static void error(java.awt.Frame parent, String message, Exception e)
    {
        Object[] choices = {"Ok", "Details >>>"};
        Object defaultChoice = choices[1];

        if (JOptionPane.showOptionDialog(null, message, "Zwei Bank Application", JOptionPane.YES_NO_OPTION,
                JOptionPane.ERROR_MESSAGE, null, choices, defaultChoice) == 1) {
            new ExceptionDialog(parent, true, e).setVisible(true);
        }
    }
}
