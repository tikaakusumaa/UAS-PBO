import java.util.ArrayList;

/**
 * Created by Tika on 07/07/2015.
 */
public class LIGA {
    private String namaLIGA;
    ArrayList<Divisi>daftarDivisi = new ArrayList<Divisi>();

    public LIGA(String namaLIGA){
        this.namaLIGA = namaLIGA;
    }

    public String getNamaLIGA(){return namaLIGA;
    }

    public void setNamaLIGA(String namaLIGA)
    {this.namaLIGA = namaLIGA;}

    public ArrayList<Divisi>getDaftarDivisi(){
        return daftarDivisi;
    }
    public void
    setDaftarDivisi(ArrayList<Divisi>daftarDivisi)
    {this.daftarDivisi = daftarDivisi;}

    //question 1
    public void getDaftarDivisi(String Liga){
        if(Liga == getNamaLIGA()){
            for (int f = 0; f < daftarDivisi.size();
                 f++)
            {
                System.out.println(daftarDivisi.get(f));
            }
        }else{
            System.out.println("Tidak Memiliki Divisi");
        }
    }
    public void setDaftarDivisi (Divisi divisi){this.daftarDivisi.add(divisi);}

    @Override
    public String toString(){
        return "NAMA LIGA = " +namaLIGA;
    }
}
