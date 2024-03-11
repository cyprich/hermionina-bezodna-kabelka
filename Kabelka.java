import java.util.ArrayList;
import java.util.Optional;

public class Kabelka implements Zmensitelny, Vlozitelny {
    private String nazov;
    private int velkostKabelky;
    private int velkostOtvoru;
    private ArrayList<Vlozitelny> obsah;
    private boolean jeZmenseny;

    public Kabelka(String nazov, int velkostKabelky, int velkostOtvoru) {
        this.nazov = nazov;
        this.velkostKabelky = velkostKabelky;
        this.velkostOtvoru = velkostOtvoru;
        this.obsah = new ArrayList<Vlozitelny>();
        this.jeZmenseny = false;
    }

    public void vlozVeci(Vlozitelny[] veci) {
        for (Vlozitelny v : veci) {
            this.vloz(v);
        }
    }

    public boolean vloz(Vlozitelny vec) {
        if (vec.getVelkost() <= this.velkostOtvoru) {
            // ak sa zmesti
            this.obsah.add(vec);
            if (vec instanceof Zmensenina) {
                System.out.println(vec.getNazov() + " sa po zmenseni vojde.");
            } else {
                System.out.println(vec.getNazov() + " sa vosiel.");
            }
            return true;
        } else {
            // ak sa nezmesti
            if (vec instanceof Zmensitelny) {
                // ak je zmensitelny
                System.out.println(vec.getNazov() + " je prilis velky na vlozenie.");
                if (!((Zmensitelny)vec).getJeZmenseny()) {
                    // ak este nie je zmenseny
                    Zmensenina zmensenina = new Zmensenina((Zmensitelny)vec);
                    return this.vloz(zmensenina);
                } else {
                    // ak uz je zmenseny
                    System.out.println(vec.getNazov() + " sa neda vlozit ani po zmenseni.");
                    return false;
                }
            } else if (vec instanceof Tvor) {
                // ak je tvor
                System.out.println(vec.getNazov() + " sa nemoze zmensit.");
                return false;
            }
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

    @Override
    public void setJeZmenseny() {
        this.jeZmenseny = true;
    }

    @Override
    public boolean getJeZmenseny() {
        return this.jeZmenseny;
    }
}
