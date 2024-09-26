public class Driver {
    public static void main (String[] args) {
        Rectangle rectangle1 = new Rectangle(4,8);
        Rectangle rectangle2 = new Rectangle(6,10);
        Rectangle rectangle3 = new Rectangle(1,4);
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(3);
        Circle circle3 = new Circle(7);
        Ellipse ellipse1 = new Ellipse(2,4);
        Ellipse ellipse2 = new Ellipse(6,9);
        Ellipse ellipse3 = new Ellipse(1,3);

        System.out.println(rectangle1.getArea());
        System.out.println(rectangle2.getArea());
        System.out.println(rectangle3.getArea());
        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println(circle3);
        System.out.println(ellipse1);
        System.out.println(ellipse2);
        System.out.println(ellipse3);
    }
}
