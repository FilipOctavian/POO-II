public class Materie implements Comparable<Materie> {
    private String nume;

    public Materie(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    @Override
    public int compareTo(Materie other) {
        return this.nume.compareTo(other.nume);
    }

    @Override
    public String toString() {
        return nume;
    }
}
