public class Rectangle extends Shape
{
    private int widths;
    private int heights;

    public void setHeight(int heights)
    {
        this.heights = heights;
    }

    public int getHeight()
    {
        return(heights);
    }

    public void setWidth(int widths)
    {
        this.widths = widths;
    }

    public int getWidth()
    {
        return(widths);
    }

    public int getArea()
    {
        return(widths*heights);
    }

    Rectangle(int widths, int heights) {
        super(2);

        this.heights = heights;
        this.widths = widths;
    }
    public String toString(){
        return "Rectangle: width=" + widths + ", height=" + heights + ", area=" + getArea();
    }
}
