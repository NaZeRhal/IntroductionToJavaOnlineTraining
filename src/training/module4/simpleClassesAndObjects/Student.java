package training.module4.simpleClassesAndObjects;

import java.util.Arrays;

//Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
//из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
//номеров групп студентов, имеющих оценки, равные только 9 или 10
public class Student {
    private String surname;
    private String initials;
    private int[] progress;

    public Student(String surname, String initials, int[] progress) {
        this.surname = surname;
        this.initials = initials;
        this.progress = progress;
    }

    public String getSurname() {
        return surname;
    }

    public String getInitials() {
        return initials;
    }

    public int[] getProgress() {
        return progress;
    }

    public static void main(String[] args) {
        Student[] students = new Student[10];
        students[0] = new Student("Smith", "K.", new int[]{8, 9, 8, 9, 10});
        students[1] = new Student("Couper", "D.", new int[]{9, 9, 9, 9, 9});
        students[2] = new Student("Lin", "W.", new int[]{8, 9, 8, 9, 8});
        students[3] = new Student("Small", "O.", new int[]{8, 8, 8, 8, 9});
        students[4] = new Student("Roll", "P.", new int[]{10, 9, 9, 9, 10});
        students[5] = new Student("Wick", "F.", new int[]{8, 9, 8, 8, 9});
        students[6] = new Student("Mirale", "D.", new int[]{8, 8, 8, 9, 8});
        students[7] = new Student("Nood", "S.", new int[]{8, 9, 9, 9, 8});
        students[8] = new Student("Moon", "M.", new int[]{9, 9, 9, 9, 10});
        students[9] = new Student("Gorgon", "K.", new int[]{9, 9, 10, 9, 10});

        for (Student student : students) {
            if (Arrays.stream(student.getProgress()).filter(i -> i == 9 || i == 10).toArray().length == 5) {
                System.out.printf("%s %s", student.getSurname(), student.getInitials());
                System.out.println();
            }
        }

    }
}
