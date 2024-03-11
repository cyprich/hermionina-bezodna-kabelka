import java.util.Optional;

public class Kabelka implements Vlozitelny {
    private String nazov;
    private int velkostKabelky;
    private int velkostOtvoru;

    public Kabelka(String nazov, int velkostKabelky, int velkostOtvoru) {
        this.nazov = nazov;
        this.velkostKabelky = velkostKabelky;
        this.velkostOtvoru = velkostOtvoru;
    }

    public void vlozVeci(Vlozitelny[] veci) {

    }

    public boolean vloz(Vlozitelny vec) {
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
