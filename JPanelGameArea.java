package UI;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class JPanelGameArea extends JPanel implements Runnable{
    public static final int REFRESH_TIME = 50;
    
    private FigureGUIGroup figuresGUI;
    
    public JPanelGameArea(FigureGUIGroup figuresGUI) {
        super();
        this.figuresGUI = figuresGUI;
    }
    
    public void init(){
       new Thread(this).start();
       this.figuresGUI.init();
    }
    
    @Override
    public void paint(Graphics graphics){
       super.paint(graphics);
       this.figuresGUI.draw(graphics);
    }

    @Override
    public void run() {
        while(true){
           repaint();
            try {
                Thread.sleep(REFRESH_TIME);
            } catch (InterruptedException ex) {
            }
        }
    }
}





