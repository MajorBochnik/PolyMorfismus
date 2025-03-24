public class MP3 implements IPrehravac{
    String znacka;

    public MP3(String znacka){
        this.znacka = znacka;
    }


    public void prehraj(boolean hraj) {
        if(hraj){
            System.out.println("MP3 zařízení značky "+znacka+" spuštěno.");
        }
        else{
            System.out.println("MP3 zařízení značky "+znacka+" ukončeno.");
        }

    }

    @Override
    public String toString() {
        return "MP3";
    }
}
