import java.util.Optional;

public class Predmet implements Vlozitelny, Zmensitelny {
    private String nazov;
    private int velkost;
    private boolean jeZmenseny;
    public Predmet(String nazov, int velkost) {
        this.nazov = nazov;
        this.velkost = velkost;
        this.jeZmenseny = false;
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

    @Override
    public void setJeZmenseny() {
        this.jeZmenseny = true;
    }

    @Override
    public boolean getJeZmenseny() {
        return this.jeZmenseny;
    }
}
