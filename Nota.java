public class Nota {
    private double valoare;
    private Materie materie;

    public Nota(double valoare, Materie materie) {
        this.valoare = valoare;
        this.materie = materie;
    }

    public double getValoare() {
        return valoare;
    }

    public Materie getMaterie() {
        return materie;
    }

    @Override
    public String toString() {
        return "Nota: " + valoare + " la " + materie.getNume();
    }
}
