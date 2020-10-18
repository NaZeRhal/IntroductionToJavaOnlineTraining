package training.module4.simpleClassesAndObjects;

//Создайте класс с двумя переменными. Добавьте метод вывода на экран и методы изменения этих
//переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
//наибольшее значение из этих двух переменных.
public class Task1 {
    private int x;
    private int y;

    public void printX() {
        System.out.println(x);
    }

    public void printY() {
        System.out.println(y);
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getSum(int x, int y) {
        return x + y;
    }

    public int getMax(int x, int y) {
        return Math.max(x, y);
    }
}
