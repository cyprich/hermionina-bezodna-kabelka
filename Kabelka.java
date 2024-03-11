import java.util.ArrayList;
import java.util.Optional;

public class Kabelka implements Vlozitelny, Zmensitelny {
    private String nazov;
    private int velkostKabelky;
    private int velkostOtvoru;
    private ArrayList obsah;

    public Kabelka(String nazov, int velkostKabelky, int velkostOtvoru) {
        this.nazov = nazov;
        this.velkostKabelky = velkostKabelky;
        this.velkostOtvoru = velkostOtvoru;
        this.obsah = new ArrayList();
    }

    public void vlozVeci(Vlozitelny[] veci) {

    }

    public boolean vloz(Vlozitelny vec) {
        if (vec.getVelkost() <= this.velkostOtvoru) {
            this.obsah.add(vec);
            return true;
        }

        return false;
    }

    @Override
    public int getVelkost() {
        return this.velkostKabelky;
    }

    @Override
    public String getNazov() {
        return this.nazov;
    }

    @Override
    public Optional<Vlozitelny> najdiVacsiAko(int velkost) {
        return Optional.empty();
    }
}
