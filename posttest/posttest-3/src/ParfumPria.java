public class ParfumPria extends Parfum {
    private String aromaMaskulin;

    public ParfumPria() {
        super();
    }

    public ParfumPria(String nama, int harga, int isi, String aromaMaskulin) {
        super(nama, harga, isi);
        this.aromaMaskulin = aromaMaskulin;
    }

    public String getAromaMaskulin() {
        return aromaMaskulin;
    }

    public boolean setAromaMaskulin(String aromaMaskulin) {
        if (aromaMaskulin == null || aromaMaskulin.trim().isEmpty()) {
            System.out.println("Aroma maskulin tidak boleh kosong");
            return false;
        }
        this.aromaMaskulin = aromaMaskulin;
        return true;
    }

    public String getJenis() {
        return "Parfum Pria";
    }

    public String getLabelTambahan() {
        return "aroma maskulin";
    }

    public String getDetailTambahan() {
        return getAromaMaskulin();
    }

    public boolean setDetailTambahan(String detail) {
        return setAromaMaskulin(detail);
    }

    protected void Output() {
        super.Output();
        System.out.println("Aroma : " + getAromaMaskulin());
    }
}