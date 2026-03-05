class AreaCalculator {

    double area(double radius) {
        return 3.14 * radius * radius;
    }

    double area(int length, int width) {
        return length * width;
    }

    double area(double base, double height) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        AreaCalculator obj = new AreaCalculator();

        double circleArea = obj.area(5);
        double rectangleArea = obj.area(4, 6);
        double triangleArea = obj.area(3.8, 8.5);

        System.out.println("Area of Circle: " + circleArea);
        System.out.println("Area of Rectangle: " + rectangleArea);
        System.out.println("Area of Triangle: " + triangleArea);
    }
}