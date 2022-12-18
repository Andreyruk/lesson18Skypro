import transport.*;

import java.time.LocalDate;

public class Main {
    private static Car[] auto;
    private static Truck[] trucks;
    private static Bus[] buses;

    public static void main(String[] args) {
        System.out.println("Домашнее задание 18.");
        System.out.println();
        car();
        truck();
        buses();
        Car currentCar = auto[0];
        Bus currentBus = buses[0];
        Truck currentTruck = trucks[1];
        Driver driver1 = new Driver("Ivan", 5.0, Car.class);
        infoAuto(currentCar, driver1);
//        if (driver1.startMoving(currentCar.getClass())) {
//            System.out.println(String.format("водитель %s участвует в гонках", driver1.getName()));
//            infoAuto(currentCar);
//        } else {
//            System.out.println(String.format("водитель не может управлять транспортным средством типа %s",currentCar.getType()));
//        }
        Driver driver2 = new Driver("Stepan", 6.0, Truck.class);
        infoAuto(currentTruck, driver2);
        Driver driver3 = new Driver("Fedor", -6.0, Car.class);
        infoAuto(currentBus, driver3);
    }

    public static <T extends Transport> void infoAuto(T auto, Driver driver) {
        System.out.println(driver);
        System.out.println(auto);
        if (driver.startMoving(auto.getClass())) {
            System.out.println(String.format("водитель %s участвует в гонках", driver.getName()));
            auto.startMoving();
            auto.pitStop();
            auto.bestTime();
            auto.maxSpeed();
            driver.stopMoving();
            driver.refuelCar();
            auto.finishMoving();
        } else {
            System.out.println(String.format("водитель %s не может управлять транспортным средством типа %s", driver.getName(), auto.getType()));
        }
        System.out.println();
    }

    public static void car() {
        auto = new Car[5];
        auto[0] = new Car("Lada", "Granta", -1.7);
        auto[1] = new Car("Audi", "A8 50 L TDI quattro", 3.0);
//        auto[2] = new transport.Car("BMW", "Z8", 3, "чёрный", "Германия");
        auto[3] = new Car("Kia", "Sportage 4-го поколения", 2.4);
        auto[4] = new Car("Hyundai", "Avante", -1.6);
        infoCar();
        System.out.println();
    }

    public static void infoCar() {
//        for (int i = 0; i < auto.length; i++) {
//            if (auto[i] != null)
//        System.out.println(auto[i]);
//        или так
        for (Car auto : auto) {
            if (auto != null) {
                System.out.println(auto);
            }
        }
    }

    public static void truck() {
        trucks = new Truck[2];
        trucks[0] = new Truck("Камаз", "", 11.0);
        trucks[1] = new Truck("МАЗ", "В-901", 11.0);
        infoTruck();
        System.out.println();
    }

    public static void infoTruck() {
        for (Truck truck : trucks) {
            if (truck != null) {
                System.out.println(truck);
            }
        }
    }

    public static void buses() {
        buses = new Bus[2];
        buses[0] = new Bus("Ласточка", "В-901", 31.0);
        buses[1] = new Bus("Ленинград", /*"В-901"*/"", 31.0);
        infoBus();
        System.out.println();
    }

    public static void infoBus() {
        for (Bus buses : buses) {
            if (buses != null) {
                System.out.println(buses);
//                buses.startMoving();
//                buses.finishMoving();
//                buses.pitStop();
//                buses.bestTime();
//                buses.maxSpeed();
            }
        }
    }
}