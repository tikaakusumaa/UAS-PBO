import java.util.ArrayList;

/**
 * Created by Tika on 07/07/2015.
 */
public class Divisi {
    private String namaDivisi;
    private LIGA liga;
    ArrayList<CLUB> daftarClub = new ArrayList<CLUB>();

    //Constructor


    public Divisi(String namaDivisi, LIGA liga) {
        this.namaDivisi = namaDivisi;
        this.liga = liga;
    }

    //setter getter


    public String getNamaDivisi() {
        return namaDivisi;
    }

    public void setNamaDivisi(String namaDivisi) {
        this.namaDivisi = namaDivisi;
    }

    public LIGA getLiga() {
        return liga;
    }

    public void setLiga(LIGA liga) {
        this.liga = liga;
    }

    public void setDaftarClub(CLUB club) {
        this.daftarClub.add(club);
    }

    //2
    public void getDaftarClubLiga(String cariLiga) {
        if (cariLiga == liga.getNamaLIGA()) {
            for (int b = 0; b < liga.daftarDivisi.size(); b++) {
                Divisi d = liga.daftarDivisi.get(b);
                System.out.println(d.getNamaDivisi());
                for (int c = 0; c < daftarClub.size(); c++) {
                    System.out.println(d.daftarClub.get(c));
                }
            }
        } else
            System.out.println("Tidak ada club di liga");
    }

    //3
    public void getDaftarClubDivisi(String cariDivisi) {
        for (int b = 0; b < liga.daftarDivisi.size(); b++) {
            Divisi d = liga.daftarDivisi.get(b);
            if (cariDivisi == d.getNamaDivisi()) {
                for (int g = 0; g < daftarClub.size(); g++) {
                    System.out.println(d.daftarClub.get(g));
                }
            }
        }

        for (int b = 0; b < liga.daftarDivisi.size(); b++) {
            Divisi d = liga.daftarDivisi.get(0);
            Divisi e = liga.daftarDivisi.get(1);
            if (cariDivisi != d.getNamaDivisi()) {
                if (cariDivisi != e.getNamaDivisi()) {
                    System.out.println("Tidak ada Club");
                    break;
                }
            }
        }
    }
    //tostring

    @Override
    public String toString() {
        return "Divisi{" +
                "namaDivisi='" + namaDivisi + '\'' +
                '}';
    }
}
