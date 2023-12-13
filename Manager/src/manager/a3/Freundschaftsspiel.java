package manager.a3;

import java.util.Random;

public class Freundschaftsspiel {
    Mannschaft heim; 
    Mannschaft gast; 
    int ergebnissHeim = 0;
    int ergebnissGast = 0; 
    int spielzeit = 0;
    int spiellaenge = 90;

    private Random ran = new Random();

    public Freundschaftsspiel(Mannschaft heim, Mannschaft gast) {
        this.heim = heim;
        this.gast = gast;
    }

    public void starteSpiel() {
        
        //zufällig 1-15 min 
        do{
            spielzeit += ran.nextInt(15);

            //wer schies+st
            double stHeim = (0.8 * heim.durchStaerke()) + (0.15 * heim.durchMotivation()) + (0.05 * heim.trainer.erfahrung);
            double stGast = (0.8 * gast.durchStaerke()) + (0.15 * gast.durchMotivation()) + (0.05 * gast.trainer.erfahrung);
        
            boolean tor = false;
            if(ran.nextDouble(stHeim + stGast) - stHeim > 0){
                Torwart keeper = null;
                for (Spieler s : gast.spieler) {
                    if(s instanceof Torwart) keeper = (Torwart) s;
                }
                //torchangse Heim
                tor = torchange(heim.spieler.get(ran.nextInt(heim.spieler.size()-1)), keeper, spielzeit, this.heim);
            }else {
                Torwart keeper = null;
                for (Spieler s : heim.spieler) {
                    if(s instanceof Torwart) keeper = (Torwart) s;
                }
                //torchangse Heim
                tor = torchange(gast.spieler.get(ran.nextInt(gast.spieler.size()-1)), keeper, spielzeit, this.gast);
            
            }

            if(tor){
                System.out.println("TOR");
            }

        }while(spielzeit < spiellaenge);


    }

    public boolean torchange(Spieler s, Torwart tw, int aktuelleZeit, Mannschaft m){
        System.out.println("In min: "+aktuelleZeit+" schießt "+ s.name + " für Mannschaft: " + m.mannschaftsName+" auf Torwart: "+ tw.name);
        //treffer?
        return false;
    }

}
