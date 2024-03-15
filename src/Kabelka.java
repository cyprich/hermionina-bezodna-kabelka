package src;

import java.util.ArrayList;
import java.util.Optional;

public class Kabelka implements Zmensitelny, Vlozitelny {
    private String nazov;
    private int velkostKabelky;
    private int velkostOtvoru;
    private ArrayList<Vlozitelny> obsah;
    private Vlozitelny najvacsiObjekt;

    public Kabelka(String nazov, int velkostKabelky, int velkostOtvoru) {
        this.nazov = nazov;
        this.velkostKabelky = velkostKabelky;
        this.velkostOtvoru = velkostOtvoru;
        this.obsah = new ArrayList<Vlozitelny>();
    }

    public void vlozVeci(Vlozitelny[] veci) {
        for (Vlozitelny v : veci) {
            this.vloz(v);
        }
    }

    public boolean vloz(Vlozitelny vec) {
        if (vec.getVelkost() <= this.velkostOtvoru) {
            // ak sa zmesti
            if (vec instanceof Zmensenina) {
                // ak bol predtym zmenseny
                System.out.println(vec.getNazov() + " sa po zmenseni vojde.");
            } else {
                // ak este nebol zmenseny
                System.out.println(vec.getNazov() + " sa vosiel.");
            }
            this.obsah.add(vec);
            return true;
        } else {
            // ak sa nezmesti
            if (vec instanceof Zmensenina) {
                // ak je to zmensenina
                System.out.println(vec.getNazov() + " sa neda vlozit ani po zmenseni.");
                return false;
            } else {
                // ak este zmenseny nebol
                System.out.println(vec.getNazov() + " je prilis velky na vlozenie.");  // tento print som musel dat sem, ked bol pred touto podmienkou, vypisoval sa 2-krat v pripade kniznice (nezmestila sa ani normalne ani zmensena)
                if (vec instanceof Zmensitelny) {
                    // ak je mozne ho zmensit
                    return this.vloz(new Zmensenina((Zmensitelny)vec));
                } else {
                    // ak nie je mozne ho zmensit (src.Tvor)
                    System.out.println(vec.getNazov() + " sa nemoze zmensit.");
                    return false;
                }
            }
        }
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
        // nepochopil som ako mam spravit tuto metodu
        Vlozitelny najvacsiPredmet = this.obsah.get(0);

        for (Vlozitelny p : this.obsah) {
            if (p.getVelkost() > najvacsiPredmet.getVelkost()) {
                najvacsiPredmet = p;
            }
        }

        return Optional.of(najvacsiPredmet);
    }
}
