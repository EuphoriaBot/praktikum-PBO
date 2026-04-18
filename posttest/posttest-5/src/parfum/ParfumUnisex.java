package parfum;

public class ParfumUnisex extends Parfum implements Aroma {

    @Override
    protected void Output() {
        System.out.println("Nama  : " + getNama());
        System.out.println("Jenis : " + getJenis());
        System.out.println("Harga : " + getHarga());
        System.out.println("Isi   : " + getIsi() + " ml");
        infoAroma();
        kategoriAroma();
    }

    @Override
    public void infoAroma() {
        System.out.println("Aroma netral aktif");
    }

    @Override
    public void kategoriAroma() {
        System.out.println("Kategori: Unisex");
    }
}