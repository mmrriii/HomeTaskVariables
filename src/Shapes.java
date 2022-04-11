public class Shapes {
    public static void main(String[] args) {
        double rectangleWidth = 5;
        double rectangleHeight = 6;
        double rectanglePerimeter;
        double rectangleArea;
        double radius = 5;
        double pi = 3.14;
        double circumference;
        double circleArea;

        rectanglePerimeter = (rectangleWidth + rectangleHeight) * 2;
        rectangleArea = (rectangleWidth * rectangleHeight);

        String result = "rectangle width = " + rectangleWidth + ", rectangle height = " + rectangleHeight
                + ", rectangle perimeter = " + rectanglePerimeter  + ", rectangle area = " + rectangleArea;

        System.out.println(result);


        circumference = (2 * pi * radius);
        circleArea = (pi * radius * radius);
        result = "radius = " + radius + ", pi = " + pi + ", circumference = " + circumference +
                ", circle area = " + circleArea;
        System.out.println(result);


    }

}
