package src;

import java.util.Optional;

public class Tvor implements Vlozitelny {
    private String nazov;
    private int velkost;

    public Tvor(String nazov, int velkost) {
        this.nazov = nazov;
        this.velkost = velkost;
    }

    @Override
    public int getVelkost() {
        return this.velkost;
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
