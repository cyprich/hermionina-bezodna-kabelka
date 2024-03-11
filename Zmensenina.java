import java.util.Optional;

public class Zmensenina implements Vlozitelny {
    private int velkost;
    private String nazov;

    Zmensenina(Zmensitelny zmensitelny) {
        this.nazov = zmensitelny.getNazov();
        this.velkost = zmensitelny.getVelkost() / 2;
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
