
package com.github.desakirt.bankapplication.views.custom;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;

/**
 *
 * @author desakirt
 */
public class BackgroundDesktopPane extends JDesktopPane {
    
    private final ImageIcon image;

    public BackgroundDesktopPane()
    {
        image = new ImageIcon(getClass().getResource("/images/desktop-background.png"));
    }

    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        int x = (getWidth() - image.getIconWidth()) / 2;
        int y = (getHeight() - image.getIconHeight()) / 2;
        g.drawImage(image.getImage(), x, y, this);
    }

}
