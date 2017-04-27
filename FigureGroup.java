package Model;
public class FigureGroup extends Thread{
  private Figure[] figures;

    public FigureGroup(Figure[] figures) {
        this.figures = figures;
    }

    public Figure[] getFigures() {
        return figures;
    }

    public void setFigures(Figure[] figures) {
        this.figures = figures;
    }
  
    
    public boolean isIntersection(Figure figure, Figure figure1){
        return  (Math.sqrt(
                (Math.pow((figure.x+figure.getSize()/2) - (figure1.x+figure1.getSize()/2), 2) +
                (Math.pow((figure.y+figure.getSize()/2) - (figure1.y+figure1.getSize()/2), 2))))
                < (figure.getSize()/2+figure1.getSize()/2));
    }
    
    public void colision(){
        for (int i = 0; i < figures.length-1; i++) {
            for (int j = i+1; j < figures.length; j++){
                if ( isIntersection(figures[i],figures[j])){
                  figures[i].setCrash(true);
                  figures[j].setCrash(true);
                }
            }
        }
    }
    
  @Override
    public void run(){
       while(true){
          colision();
       }
    }
  
}
