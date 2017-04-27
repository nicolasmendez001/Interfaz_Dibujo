package UI;

import java.awt.Color;
import java.util.Random;

public class RndomColor {
    public Color[] colors;
    Random random;
    
    public RndomColor(Color[] colors) {
        this.colors = colors;
        random = new Random();
    }
    
    public Color next(){
      return colors[random.nextInt(colors.length)];
    }
}
