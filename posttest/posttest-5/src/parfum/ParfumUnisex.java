package parfum;

public class ParfumUnisex extends Parfum implements Aroma {

    @Override
    protected void Output() {
        System.out.println("Nama Parfum  : " + getNama());
        System.out.println("Jenis Parfum : " + getJenis());
        System.out.println("Harga Parfum : " + getHarga());
        System.out.println("Isi Parfum   : " + getIsi() + " ml");
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