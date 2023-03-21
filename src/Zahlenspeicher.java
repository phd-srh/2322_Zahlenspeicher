import java.util.Arrays;

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

    public String anzeigen() {
        String ausgabe = "[";
        for (int i=0; i < elementeImSpeicher; i++) {
            if (i > 0) ausgabe += ", ";
            ausgabe += speicher[i];
        }
        ausgabe += "]";
        return ausgabe;
    }
}
