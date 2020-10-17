package training.module1.linearPrograms;

public class Task5 {

    // Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
    //данное значение длительности в часах, минутах и секундах в следующей форме:
    //ННч ММмин SSc.

    public static String getTimeFromSeconds(int seconds) {
        if (seconds < 0) {
            return "input parameter is a negative number";
        }
        int hours = seconds / 3600;
        int minutes = (seconds - hours * 3600) / 60;
        int sec =  (seconds - hours * 3600) % 60;
        String hoursString = hours >= 10 ?  "" + hours : "0" + hours;
        String minString = minutes >= 10 ? "" + minutes : "0" + minutes;
        String secString = sec >= 10 ? "" + sec : "0" + sec;
        return String.format("%sч %sмин %sс", hoursString, minString, secString);
    }
}
