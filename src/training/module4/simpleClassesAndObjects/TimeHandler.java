package training.module4.simpleClassesAndObjects;

//Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
//изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
//недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени на
//заданное количество часов, минут и секунд

public class TimeHandler {
    private int hours;
    private int minutes;
    private int seconds;

    public TimeHandler() {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours < 0 || hours > 99 ? 0 : hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes < 0 || minutes > 59 ? 0 : minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds < 0 || seconds > 59 ? 0 : seconds;
    }

    public void changeHours(int hours) {
        this.hours += hours;
        if (this.hours < 0 || this.hours > 99) {
            this.hours = 0;
        }
    }

    public void changeMinutes(int minutes) {
        this.minutes += minutes;
        if (this.minutes < 0 || this.minutes > 59) {
            this.minutes = 0;
        }
    }

    public void changeSeconds(int seconds) {
        this.seconds += seconds;
        if (this.seconds < 0 || this.hours > 59) {
            this.seconds = 0;
        }
    }




}
