package transport;

public class Truck extends Transport {

    @Override
    public void startMoving() {
        System.out.println("начало движения");
    }

    @Override
    public void finishMoving() {
        System.out.println("конец движения");
    }

    public Truck(String brand, String model, Double engineVolume) {
        super(brand, model, engineVolume);
        this.setType("C");
    }

    @Override
    public String toString() {
        return "Грузовое авто - марка: " + getBrand() + ", модель: " + getModel() + ", объем двигателя: " +
                getEngineVolume();
    }

    @Override
    public void pitStop() {
        System.out.println("пит стоп грузового автомобиля");
    }

    @Override
    public void bestTime() {
        System.out.println("лучшее время грузового автомобиля");
    }

    @Override
    public void maxSpeed() {
        System.out.println("максимальная скорость грузового автомобиля");
    }
}