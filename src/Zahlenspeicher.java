public class Zahlenspeicher {

    // Attribute
    private int kapazität;
    private int[] speicher;

    // Pre-Konstruktor (wird ausgeführt vor dem Aufruf des Konstruktors)
    private int elementeImSpeicher = 0;

    public Zahlenspeicher(int kapazität) {
        this.kapazität = kapazität;
        this.speicher = new int[ kapazität ];
        //elementeImSpeicher = 0;
    }

    // Methoden
    public void hinzufügen(int zahl) {
        if (elementeImSpeicher >= kapazität)
            return;

        this.speicher[ elementeImSpeicher ] = zahl;
        elementeImSpeicher++;
    }

}
