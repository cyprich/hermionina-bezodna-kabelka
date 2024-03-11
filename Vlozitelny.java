import java.util.Optional;

public interface Vlozitelny {
    int getVelkost();
    String getNazov();
    Optional<Vlozitelny> najdiVacsiAko(int velkost);
}
