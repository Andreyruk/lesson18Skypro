package transport;

public class Car extends Transport {
    @Override
    public void startMoving() {
        System.out.println("начало движения");
    }

    @Override
    public void finishMoving() {
        System.out.println("конец движения");
    }

    public Car(String brand, String model, Double engineVolume) {
        super(brand, model, engineVolume);
        this.setType("B");
//        this.brand = validateString(brand, DEFAULT_MESSAGE);
//        this.model = validateParameter(model);
//        this.engineVolume = validateEngineVolume(engineVolume);
//        this.color = validateColor(color);
//        this.year = validateYear(year);
//        this.country = validateParameter(country);
//        this.transmission = validateString(transmission, DEFAULT_MESSAGE);
//        this.body = validateParameter(body);
//        this.registrationNumber = registrationNumber;
//        this.numberPlaces = validateYearAndNumber(numberPlaces).intValue();
//        this.tyre = validateTyre(validateString(tyre, DEFAULT_MESSAGE));
//        this.key = new Key(remoteStartEngine, keylessAccess);
//        this.insurance = new Insurance(timeAction, cost, number);
    }

    @Override
    public String toString() {
        return "Легковое авто - марка: " + getBrand() + ", модель: " + getModel() + ", объем двигателя: " +
                getEngineVolume();
    }

    @Override
    public void pitStop() {
        System.out.println("пит стоп легкового автомобиля");
    }

    @Override
    public void bestTime() {
        System.out.println("лучшее время легкового автомобиля");
    }

    @Override
    public void maxSpeed() {
        System.out.println("максимальная скорость легкового автомобиля");
    }
}