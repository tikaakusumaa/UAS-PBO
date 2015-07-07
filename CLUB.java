/**
 * Created by Tika on 07/07/2015.
 */
public class CLUB {
    private String namaClub;
    private Divisi divisi;
    private LIGA liga;

    public CLUB(String namaClub, Divisi divisi, LIGA liga) {
        this.namaClub = namaClub;
        this.divisi = divisi;
        this.liga = liga;
    }

    public String getNamaClub() {
        return namaClub;
    }

    public void setNamaClub(String namaClub) {
        this.namaClub = namaClub;
    }

    //question 4
    public void getDivisi(String club){
        for (int f = 0; f < liga.daftarDivisi.size();f++){
            Divisi a =liga.daftarDivisi.get(f);
            for (int c = 0; c < divisi.daftarClub.size();c++){
                a.daftarClub.get(c);
                CLUB i = a.daftarClub.get(c);
                if (club == i.getNamaClub()){
                    System.out.println(a.getNamaDivisi());
                }
            }
        }

    }

    public void setDivisi(Divisi divisi) {
        this.divisi = divisi;
    }

    //question 5
    public void getLiga(String club){
        for ( int f = 0; f < liga.daftarDivisi.size();f++){
            Divisi a = liga.daftarDivisi.get(f);
            for (int c = 0; c < divisi.daftarClub.size();c++){
                a.daftarClub.get(c);
                CLUB i = a.daftarClub.get(c);
                if (club == i.getNamaClub()){
                    System.out.println(liga.getNamaLIGA());
                }
            }
        }
    }

    public void setLiga(LIGA liga) {
        this.liga = liga;
    }

    @Override
    public String toString() {
        return "CLUB =" +namaClub;
    }
}
