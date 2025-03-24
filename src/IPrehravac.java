public interface IPrehravac {
    void prehraj(boolean hraj);

    default void prehraj(String nazevPisnicky) {
        System.out.println("Prozatím není možné vybírat konkretní písníčky.");
    }
}
