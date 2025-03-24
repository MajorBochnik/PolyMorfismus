public class Radio implements IPrehravac{

    public void prehraj(boolean hraj) {
        if(hraj){
            System.out.println("Rádio spuštěno.");
        }
        else{
            System.out.println("Rádio ukončeno.");
        }
    }

    @Override
    public String toString() {
        return "Radio";
    }
}
