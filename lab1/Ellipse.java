public class Ellipse extends Rectangle{
    public Ellipse(int widths, int heights){
        super(widths, heights);
        setSides(0);
    }

    public int getArea(){
        return (int) (Math.PI*getWidth()*getHeight()/4);
    }

    public String toString() {
        return "Ellipse: width=" + getWidth() + ", height=" + getHeight() + ", area=" + getArea() + ", sides=" +
                getSides() + ".";
    }
}
