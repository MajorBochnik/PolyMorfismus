import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Kolik je zařízení?");
        int count = sc.nextInt();
        sc.nextLine();

        IPrehravac[] prehravac = new IPrehravac[count];

        for (int i = 0; i < count; i++) {
            System.out.println("MP3, Smartphone nebo Radio?");
            String vec = sc.nextLine();

            if (vec.equals("Smartphone")) {
                System.out.println("Jaká značka?");
                String smartphone = sc.nextLine();
                prehravac[i] = new Smartphone(smartphone);
            }
            else if (vec.equals("Radio")) {
                System.out.println("Jaká značka?");
                String radio = sc.nextLine();
                prehravac[i] = new Radio();
            }
            else if (vec.equals("MP3")) {
                System.out.println("Jaká značka?");
                String mp3 = sc.nextLine();
                prehravac[i] = new MP3(mp3);
            }
        }

        boolean pokracovat = true;
        while (pokracovat) {
            System.out.println("Jakou akci chceš provést?");
            System.out.println("1 -> Zobrazit všechny zařízení");
            System.out.println("2 -> Přehrávání");
            System.out.println("3 -> Zastavení přehrávání");
            System.out.println("4 -> Přehrát uživatelem specifikovanou písničku");
            System.out.println("0 -> Ukončení");

            switch (sc.nextInt()) {
                case 1:
                    for (int i = 0; i < prehravac.length; i++) {
                        System.out.println(prehravac[i].toString());
                    }
                    break;

                case 2:
                    System.out.println("Jaké zařízení chceš přehrát?");
                    int index = sc.nextInt();
                    sc.nextLine();
                    prehravac[index].prehraj(true);
                    break;

                case 3:
                    System.out.println("Jaké zařízení chceš ukončit?");
                    int index2 = sc.nextInt();
                    sc.nextLine();
                    prehravac[index2].prehraj(false);
                    break;

                case 4:
                    System.out.println("Jakou písničku chceš přehrát?");
                    String pisnicka = sc.nextLine();
                    System.out.println("Na jakém zařízení?");
                    int index3 = sc.nextInt();
                    sc.nextLine();
                    prehravac[index3].prehraj(pisnicka);
                    break;

                case 0:
                    pokracovat = false;
                    break;


            }

        }
    }
}