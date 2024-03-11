public class Main {
    public static void main(String[] args) {


        var policaSJedlom = new Vlozitelny[]{
            new Predmet("Babovka", 10),
            new Predmet("Jaternica", 1),
            new Predmet("Jablko", 3),
            new Predmet("Cukrovinky Cierny Princ", 5)
        };
        var jedloBelka = new Kabelka("Jedlobelka", 10, 20);
        jedloBelka.vlozVeci(policaSJedlom);

        var policaSoZvieratami = new Vlozitelny[]{
            new Tvor("Blcha Eliska", 1),
            new Tvor("Ratafak Plachta", 4),
            new Tvor("Krokodil Zubajdo", 50),
            new Tvor("Slon slon", 100),
            new Tvor("Myska Hrzyka", 2)
        };
        var zveroBelka = new Kabelka("Zverobelka", 30, 50);
        zveroBelka.vlozVeci(policaSoZvieratami);

        var kebyNahodou = new Vlozitelny[]{
            new Predmet("Auto", 120),
            new Predmet("Rebrik", 30),
            new Predmet("Stan", 20),
        };
        var nahodoboBelka = new Kabelka("NahodoboBelka", 20, 60);
        nahodoboBelka.vlozVeci(kebyNahodou);

        var osobneVeci = new Vlozitelny[]{
            new Predmet("Zubna Kefka", 1),
            new Predmet("Malovatka", 40),
            new Predmet("Ponozky", 2),
            new Predmet("Kniznica", 80),
            new Predmet("Vreckovky", 2),
            jedloBelka,
            zveroBelka,
            nahodoboBelka
        };

        var hlavnaKabela = new Kabelka("HlavnoKabelka", 35, 20);
        hlavnaKabela.vlozVeci(osobneVeci);

        var p = hlavnaKabela.najdiVacsiAko(0);

        //System.out.println("Najvacsi predmet je " + p.get().getNazov());
    }
}
