/**
 * Created by Tika on 07/07/2015.
 */
public class Main {
    public static void main(String[] args) {
        //konstruktor liga
        LIGA Spanyol = new LIGA("Spanyol");
        LIGA Inggris = new LIGA("Inggris");

        //konstruktor divisi
        Divisi primera = new Divisi("Primera",Spanyol);
        Divisi tercera = new Divisi("Tercera",Spanyol);
        Divisi EPL = new Divisi("English Premier League",Inggris);
        Divisi champion = new Divisi("Champion",Inggris);

        //konstruktor club
        CLUB barcelona = new CLUB("Barcelona",primera,Spanyol);
        CLUB realmadrid = new CLUB("RealMadrid",primera,Spanyol);
        CLUB gerena = new CLUB("Gerena",tercera,Spanyol);
        CLUB cayon = new CLUB("Cayon",tercera,Spanyol);
        CLUB arsenal = new CLUB("Arsenal",EPL,Inggris);
        CLUB chelsea = new CLUB("Chelsea",EPL,Inggris);
        CLUB wigan = new CLUB("Wigan",champion,Inggris);
        CLUB wathford = new CLUB("Wathford",champion,Inggris);

        Spanyol.setDaftarDivisi(primera);
        Spanyol.setDaftarDivisi(tercera);
        Inggris.setDaftarDivisi(EPL);
        Inggris.setDaftarDivisi(champion);

        primera.setDaftarClub(barcelona);
        primera.setDaftarClub(realmadrid);
        tercera.setDaftarClub(gerena);
        tercera.setDaftarClub(cayon);
        EPL.setDaftarClub(cayon);
        EPL.setDaftarClub(arsenal);
        champion.setDaftarClub(wigan);
        champion.setDaftarClub(wathford);

        //1 get daftar divisi by nama liga
        System.out.println("1. Daftar nama divisi dengan nama Liga");
        System.out.println("Daftar divisi liga Spanyol");
        Spanyol.getDaftarDivisi("Spanyol");
        System.out.println();

        //2 get daftar klub by nama liga
        System.out.println("2. Daftar klub dengan nama liga");
        System.out.println("Daftar nama klub liga Spanyol");
        primera.getDaftarClubLiga("Spanyol");

        System.out.println("Daftar nama Club Liga Inggris");
        EPL.getDaftarClubLiga("Inggris");
        System.out.println();

        //3 Get daftar klub by nama divisi
        System.out.println("3. Daftar Club dengan nama Divisi");
        System.out.println("Daftar nama Club Divisi Championship Divisi");
        primera.getDaftarClubDivisi("Primera");
        System.out.println("Daftar Nama Club Divisi EPL");
        EPL.getDaftarClubDivisi("EPL");
        System.out.println();

        //4. Get klub ini berada di divisi mana by nama Klub
        System.out.println("4. Nama Divisi berdasarkan nama club");
        System.out.println("Klub Barcelona berada di divisi =");
        barcelona.getDivisi("Barcelona");
        System.out.println();

        //5. get klub ini berada di liga apa by nama klub
        System.out.println("5. Nama liga berdasarkan nama klub ");
        System.out.println("Klub Arsenal berada di liga =");
        arsenal.getLiga("Arsenal");
        System.out.println("Klub Chelsea berada di liga =");
        chelsea.getLiga("Chelsea");



    }
}
