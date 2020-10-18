package training.module4.simpleClassesAndObjects.Task7;

public class Runner {
    public static void main(String[] args) {
        Triangle.Point pointA = new Triangle.Point(5, 3);
        Triangle.Point pointB = new Triangle.Point(8, 15);
        Triangle.Point pointC = new Triangle.Point(-6, -3);

        Triangle triangle = new Triangle(pointA, pointB, pointC);
        System.out.println("Сторона AB: " + triangle.getSideAB());
        System.out.println("Сторона BC: " + triangle.getSideBC());
        System.out.println("Сторона CD: " + triangle.getSideCA());
        System.out.println();
        System.out.println("Медиана A: " + triangle.getMedianA());
        System.out.println("Медиана B: " + triangle.getMedianB());
        System.out.println("Медиана C: " + triangle.getMedianC());
        System.out.println();
        System.out.println("Периметр: " + triangle.getPerimeter(triangle));
        System.out.println("Площадь: " + triangle.getTriangleSquare(triangle));
        System.out.println("Точка пересечения медиан: " + triangle.getMedianIntersectionPoint());

    }
}
