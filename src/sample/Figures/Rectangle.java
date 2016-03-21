package sample.Figures;

public class Rectangle extends Shape {

    private int widht;
    private int height;

    public Rectangle(int x, int y, int w, int h){
        super(x, y);
        widht = w;
        height = h;
    }

    public int getWidht(){
        return widht;
    }
    public void setWidht(int w){
        widht = w;
    }

    public int getHeight(){
        return height;
    }
    public void setHeight(int h){
        height = h;
    }
}