interface Car {
    public void carType();
    public void fuelType();
}

class Maruti implements Car {
    public void carType() {
        System.out.println("Maruti: Sedan");
    }
    public void fuelType() {
        System.out.println("Petrol");
    }
}

class Interface {
    public static void main(String[] args) {
        Maruti m = new Maruti();
        m.carType();
        m.fuelType();
    }
}