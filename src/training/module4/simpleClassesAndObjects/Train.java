package training.module4.simpleClassesAndObjects;

//Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
//Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
//номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
//Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
//назначения должны быть упорядочены по времени отправления

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Comparator;

public class Train {
    private String destination;
    private int trainNumber;
    private LocalDateTime arrivalTime;

    public Train(int trainNumber, String destination, LocalDateTime arrivalTime) {
        this.trainNumber = trainNumber;
        this.destination = destination;
        this.arrivalTime = arrivalTime;
    }

    public String getDestination() {
        return destination;
    }


    public int getTrainNumber() {
        return trainNumber;
    }


    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }


    public static Train[] sortTrainListByTrainNumber(Train... trains) {
        return Arrays.stream(trains)
                .sorted(Comparator.comparingInt(Train::getTrainNumber))
                .toArray(Train[]::new);
    }

    public static void getTrainInfo(int trainNumber, Train... trains) {
        Arrays.stream(trains)
                .filter(aTrain -> aTrain.getTrainNumber() == trainNumber)
                .findFirst()
                .ifPresent(System.out::println);
    }

    public static Train[] sortTrainByDestinationAndArrivalTime(Train... trains) {
        return Arrays.stream(trains).sorted((Train o1, Train o2) ->
                o1.getDestination().compareTo(o2.getDestination()) == 0 ?
                        o1.getArrivalTime().compareTo(o2.getArrivalTime()) :
                        o1.getDestination().compareTo(o2.getDestination()))
                .toArray(Train[]::new);
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
        return String.format("Train #%d, Destination: %s, Arrival: %s.",
                getTrainNumber(),
                getDestination(),
                formatter.format(getArrivalTime())
        );
    }

    public static void main(String[] args) {
        Train[] trains = new Train[5];
        trains[0] = new Train(5484, "Minsk", LocalDateTime.of(2020, 10, 20, 10, 22));
        trains[1] = new Train(6874, "Moscow", LocalDateTime.of(2020, 10, 21, 11, 43));
        trains[2] = new Train(2564, "Berlin", LocalDateTime.of(2020, 10, 19, 8, 34));
        trains[3] = new Train(1245, "Minsk", LocalDateTime.of(2020, 10, 26, 9, 15));
        trains[4] = new Train(3657, "Minsk", LocalDateTime.of(2020, 10, 21, 12, 5));


        Train[] sortedTrains = Train.sortTrainListByTrainNumber(trains);
        for (Train sortedTrain : sortedTrains) {
            System.out.println(sortedTrain);
        }
        System.out.println();

        Train.getTrainInfo(2564, trains);

        System.out.println();

        Train[] sortedByDestinationAndArrivalTime = Train.sortTrainByDestinationAndArrivalTime(trains);
        for (Train train : sortedByDestinationAndArrivalTime) {
            System.out.println(train);
        }
    }
}
