public class Circle extends Shape {
    private int radius;
    private double circleAreaDouble;
    private int circleArea;

    public void setRadius(int radius){
        this.radius = radius;
    }

    public int getRadius(){
        return(radius);
    }

    public int getArea(){
        double circleAreaDouble = (Math.PI*Math.pow(radius, 2));
        int circleArea = (int)circleAreaDouble;
        return(circleArea);
    }
}
