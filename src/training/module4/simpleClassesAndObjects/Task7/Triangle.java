package training.module4.simpleClassesAndObjects.Task7;

public class Triangle {
    private Point apexA;
    private Point apexB;
    private Point apexC;

    private Line sideAB;
    private Line sideBC;
    private Line sideCA;

    private Line medianA;
    private Line medianB;
    private Line medianC;

    public Triangle(Point apexA, Point apexB, Point apexC) {
        if ((apexA.getX() == apexB.getX() && apexB.getX() == apexC.getX()) ||
                (apexA.getY() == apexB.getY() && apexB.getY() == apexC.getY())) {
            throw new IllegalArgumentException("Невозможно построить треугольник по заданным координатам");
        }
        this.apexA = apexA;
        this.apexB = apexB;
        this.apexC = apexC;
        this.sideAB = new Line(apexA, apexB);
        this.sideBC = new Line(apexB, apexC);
        this.sideCA = new Line(apexC, apexA);
        this.medianA = getMedian(apexA, sideBC);
        this.medianB = getMedian(apexB, sideCA);
        this.medianC = getMedian(apexC, sideAB);
    }

    public Point getApexA() {
        return apexA;
    }

    public Point getApexB() {
        return apexB;
    }

    public Point getApexC() {
        return apexC;
    }

    public Line getSideAB() {
        return sideAB;
    }

    public Line getSideBC() {
        return sideBC;
    }

    public Line getSideCA() {
        return sideCA;
    }

    public Line getMedianA() {
        return medianA;
    }

    public Line getMedianB() {
        return medianB;
    }

    public Line getMedianC() {
        return medianC;
    }

    public double getPerimeter(Triangle triangle) {
        return triangle.getSideAB().getSideLength() + triangle.getSideBC().getSideLength() + triangle.getSideCA().getSideLength();
    }

    public double getTriangleSquare(Triangle triangle) {
        double halfPerimeter = getPerimeter(triangle) / 2;
        return Math.sqrt(halfPerimeter *
                (halfPerimeter - triangle.getSideAB().getSideLength()) *
                (halfPerimeter - triangle.getSideBC().getSideLength()) *
                (halfPerimeter - triangle.getSideCA().getSideLength()));
    }

    private Line getMedian(Point apexPoint, Line side) {
        Point start = side.getPointOne();
        Point end = side.getPointTwo();
        Point middle = new Point((start.getX() + end.getX()) / 2, (start.getY() + end.getY()) / 2);
        return new Line(apexPoint, middle);
    }

    public Point getMedianIntersectionPoint() {
        Point apexMedianPoint = getMedianA().getPointOne();
        Point endMedian = getMedianA().getPointTwo();
        double x = (apexMedianPoint.getX() + 2 * endMedian.getX()) / 3;
        double y = (apexMedianPoint.getY() + 2 * endMedian.getY()) / 3;
        return new Point(x, y);
    }


    static class Point {
        private final double x;
        private final double y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }

        @Override
        public String toString() {
            return "Point {" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }

    static class Line {
        private final Point pointOne;
        private final Point pointTwo;

        public Line(Point pointOne, Point pointTwo) {
            this.pointOne = pointOne;
            this.pointTwo = pointTwo;
        }

        public Point getPointOne() {
            return pointOne;
        }

        public Point getPointTwo() {
            return pointTwo;
        }

        public double getSideLength() {
            return Math.sqrt(Math.pow(getPointTwo().getX() - getPointOne().getX(), 2) + Math.pow(getPointTwo().getY() - getPointOne().getY(), 2));
        }

        @Override
        public String toString() {
            return "Line: " + pointOne +
                    ", " + pointTwo +
                    ", length=" + getSideLength();
        }
    }

}

