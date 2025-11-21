public class SEATWORK14.java {
    public static void main(String args[]) {
        
        //my motocycle is unique
        
        Motorcycle m = new Motorcycle();
        m.make = "Aufklärungspanzer 38 (t) 2cm KwK 38 (Sd.Kfz.140/1).";
        m.color = "Zimmerit";
        System.out.println("Berufung Kommandant!......");
        m.showAtts();
        System.out.println("...........");
        System.out.println("Motor startet, Fahrer bereit!....");
        m.startEngine();
        System.out.println("..........");
        System.out.println("Panzerungsdurchdringung laden....");
        m.showAtts();
        System.out.println("..........");
        System.out.println("Schütze bereit, Fahrer vorwärts!...");
        m.startEngine();
    }
}

class Motorcycle {
    String make;
    String color;
    boolean engineState = false;

    void startEngine() {
        if (engineState) {
            System.out.println("APCR loaded, Tank is driving forwards.");
        } else {
            engineState = true;
            System.out.println("Engine started.");
        }
    }

    void showAtts() {
        System.out.println("Motorcycle make: " + make);
        System.out.println("Motorcycle color: " + color);
        System.out.println("Engine state: " + (engineState ? "Running" : "Stopped"));
    }
}
