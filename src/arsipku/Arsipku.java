package arsipku;
public class Arsipku implements Biodata, Nilai{
    public static void main(String[] args) {
        Arsipku ps = new Arsipku ();
        ps.tampilNama();
        ps.tampilTempatLahir();
        ps.tampilHobi();
        ps.tampilAgama();
        ps.tampilBahasaIndonesia();
        ps.tampilMatematika();
        
    }
    public void tampilNama() {
        System.out.println("Bioadata");
        System.out.println("Namaku : Nuris Mahbubah");
    } 
    public void tampilTempatLahir() {
        System.out.println("Tempat Lahir : 19 mei 2003");
    }
    public void tampilHobi() {
        System.out.println("Hobi : berenang");
    }
    public void tampilAgama() {
        System.out.println("Nilai");
        System.out.println("Agama = 90");
    }
    public void tampilBahasaIndonesia() {
        System.out.println("Bahasa Indonesia = 85");
    }
    public void tampilMatematika() {
        System.out.println("Matematika = 80");
    }
  
}
