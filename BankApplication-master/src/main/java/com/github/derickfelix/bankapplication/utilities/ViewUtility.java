
package com.github.desakirt.bankapplication.utilities;

import java.awt.Cursor;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ViewUtility {
    
    public static final Cursor WAIT_CURSOR = new Cursor(Cursor.WAIT_CURSOR);
    public static final Cursor DEFAULT_CURSOR = new Cursor(Cursor.DEFAULT_CURSOR);
    
    private ViewUtility()
    {
    }
    
    public static void addIconTo(java.awt.Window frame)
    {
        try {
            java.net.URL url = frame.getClass().getResource("/images/logo.png");
            java.awt.image.BufferedImage image = javax.imageio.ImageIO.read(url);
            frame.setIconImage(image);
        } catch (java.io.IOException ex) {
            MessageUtility.error(null, ex);
        }
    }
    
    public static void addRowsToTable(List<String[]> rows, JTable table)
    {
        rows.forEach((row) -> {
            ((DefaultTableModel) table.getModel()).addRow(row);
        });
    }
    
    public static void clearTable(javax.swing.JTable table)
    {
        DefaultTableModel dm = (DefaultTableModel) table.getModel();
        dm.getDataVector().removeAllElements();
        dm.fireTableDataChanged(); // notifies the JTable that the model has changed
    }

}
