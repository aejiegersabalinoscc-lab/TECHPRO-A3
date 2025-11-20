class SEATWORK2_P1_SEM2 {
    protected String brand = "TOYOTA";
    public void honk() {
        System.out.println("STUTUTUTUTU!");
    }
}

class Car extends SEATWOOK2_P1_SEM2 {
    private String modelName = "SUPRA";
    public static void main(String[] args) {
        Car myFastCar = new Car();
        myFastCar.honk();
        System.out.println(myFastCar.brand + " " + myFastCar.modelName);
    }
}
