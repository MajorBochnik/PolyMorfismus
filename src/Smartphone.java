public class Smartphone implements IPrehravac {
    String model;

    public Smartphone(String model) {
        this.model = model;
    }

    public void prehraj(boolean hraj) {
        if (hraj) {
            System.out.println("Přehrávání na mobilu "+model+" spuštěno.");
        }
        else{
            System.out.println("Přehrávání na mobilu "+model+" ukončeno.");
        }
    }

    @Override
    public String toString() {
        return "Smartphone";
    }
}
