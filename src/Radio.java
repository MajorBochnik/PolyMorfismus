public class Radio implements IPrehravac{
    String radio;

    public Radio(String radio){
        this.radio = radio;
    }

    public void prehraj(boolean hraj) {
        if(hraj){
            System.out.println("Rádio značky "+radio+" spuštěno.");
        }
        else{
            System.out.println("Rádio značky "+radio+" ukončeno.");
        }
    }

    @Override
    public String toString() {
        return "Radio";
    }
}
