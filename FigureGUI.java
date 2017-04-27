package UI;

import Model.Figure;
import java.awt.Color;
import java.awt.Graphics;

public class FigureGUI {
    private Figure figure;
    private Color color;
    
    public FigureGUI(Figure figure, Color color) {
        this.figure = figure; 
        this.color = color;
    }

    public Figure getFigure() {
        return figure;
    }

    public void setFigure(Figure figure) {
        this.figure = figure;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
    
    
    public void init(){
       figure.setMoving(true);
       new Thread(figure).start();
    }
    
    public void draw(Graphics graphics){
        graphics.setColor(this.color);
        graphics.fillOval((int) figure.getX(),(int) figure.getY(), figure.getSize(), figure.getSize());
    }
}







