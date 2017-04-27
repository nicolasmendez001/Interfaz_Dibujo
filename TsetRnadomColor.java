package Test;

import UI.RndomColor;
import java.awt.Color;

public class TsetRnadomColor {
    public static void main(String[] args) {
        Color [] colors = {Color.YELLOW,Color.RED,Color.GREEN,
                           Color.BLUE,Color.BLACK,Color.ORANGE};
        RndomColor rndomColor = new RndomColor(colors);
        for (int i = 0; i < 10; i++) {
            System.out.println(i+" "+rndomColor.next());
        }
    }
    
}
