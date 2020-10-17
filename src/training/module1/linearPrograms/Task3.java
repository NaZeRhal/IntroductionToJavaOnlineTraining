package training.module1.linearPrograms;

public class Task3 {

    //вычислить значение выражения по формуле (sin(x) + cos(y)) / (cos(x) - sin(y)) * tg(xy)
    public static double findFuncValue(double x, double y) {
        double radX = Math.toRadians(x);
        double radY = Math.toRadians(y);
        double radXY = Math.toRadians(x * y);
        return (Math.sin(radX) + Math.cos(radY)) / (Math.cos(radX) - Math.sin(radY)) * Math.tan(radXY);
    }
}
