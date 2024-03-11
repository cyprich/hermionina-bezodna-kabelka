import java.util.Optional;

public class Zmensenina implements Vlozitelny {
    private int velkost;
    private String nazov;
    private boolean jeZmenseny;

    Zmensenina(Zmensitelny zmensitelny) {
        this.nazov = zmensitelny.getNazov();
        this.velkost = zmensitelny.getVelkost() / 2;
        this.jeZmenseny = true;
        zmensitelny.setJeZmenseny();
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

    public boolean getJeZmenseny() {
        return this.jeZmenseny;
    }
}
