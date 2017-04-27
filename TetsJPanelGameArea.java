package Test;

import UI.JPanelGameArea;
import Model.Area;
import Model.Coord;
import Model.Figure;
import Model.FigureGroup;
import UI.FigureGUIGroup;
import UI.RndomColor;
import java.awt.Color;
import java.awt.Toolkit;
import java.util.Random;
import javax.swing.JFrame;
/**
 * 
 * @author user
 */
public class TetsJPanelGameArea {
    public static void main(String[] args) {
        // Parameters -------------------------------------------------------
        int width = 1600;
        int height = 800;
        int amount = 100;
        int maxSize = 50;
        int minSize = 10;
        double maxSpeed = 200;
        double minSpeed = 20;
        
        // Model ----------------------------------------------------------
        Figure[] figures = new Figure[amount]; 
        Random  random = new Random();
        for (int i = 0; i < figures.length; i++) {
           figures[i] = new Figure(random.nextInt(maxSize-minSize)+minSize,
                   Math.toRadians(random.nextInt(360)),
                   random.nextInt((int) (maxSpeed-minSpeed))+minSpeed, 
                   new Coord(random.nextInt(width)+10,random.nextInt(height)+10));
           figures[i].setArea(new Area(20,20,width,height));
        }
        FigureGroup figureGroup = new FigureGroup(figures);
        // vista -------------------------------------------------------
        JFrame jFrame = new JFrame("Test game area");
        jFrame.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        Color [] colors = {Color.YELLOW,Color.RED,Color.GREEN,
                           Color.BLUE,Color.BLACK,Color.ORANGE};
        RndomColor rndomColor = new RndomColor(colors);
        FigureGUIGroup figureGUIGroup = new FigureGUIGroup(figureGroup,rndomColor);
        JPanelGameArea jPanelGameArea = new JPanelGameArea(figureGUIGroup);
        jFrame.add(jPanelGameArea);
        jPanelGameArea.init();
        figureGroup.start();
        jFrame.setVisible(true);
    }
    
}
