package UI;

import Model.Area;
import Model.FigureGroup;
import java.awt.Color;
import java.awt.Graphics;
public class FigureGUIGroup {
    private FigureGUI[] figuresGUI;
    
    public FigureGUIGroup(FigureGroup figureGroup, RndomColor rndomColor) {
        figuresGUI = new FigureGUI[figureGroup.getFigures().length];
        for (int i = 0; i < figureGroup.getFigures().length; i++) {
            figuresGUI[i] = new FigureGUI(figureGroup.getFigures()[i],rndomColor.next());
        }
    }
    
    public void add(FigureGUI figureGUI){
       // to do...
    }
    
    public void init(){
        for (int i = 0; i < figuresGUI.length; i++) {
            figuresGUI[i].init();
        }
    }
    
    public void draw(Graphics graphics){
        graphics.setColor(Color.BLACK);
        Area area = figuresGUI[0].getFigure().getArea();
        graphics.drawRect((int)area.getX(),(int)area.getY(),
                (int)area.getWidth(),(int) area.getHeight());
        for (FigureGUI figureGUI : figuresGUI) { 
            if (figureGUI.getFigure().isMoving())figureGUI.draw(graphics);
        }
    }
}
