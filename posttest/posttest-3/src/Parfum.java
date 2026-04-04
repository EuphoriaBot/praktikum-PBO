import java.util.ArrayList;
import java.util.Scanner;

public class Parfum {
    private String nama;
    private int harga;
    private int isi;

    public Parfum() {
    }

    public Parfum(String nama, int harga, int isi) {
        this.nama = nama;
        this.harga = harga;
        this.isi = isi;
    }

    public String getNama() {
        return nama;
    }

    public boolean setNama(String nama) {
        if (nama == null || nama.trim().isEmpty()) {
            System.out.println("Nama parfum tidak boleh kosong");
            return false;
        }
        this.nama = nama;
        return true;
    }

    public int getHarga() {
        return harga;
    }

    public boolean setHarga(int harga) {
        if (harga <= 0) {
            System.out.println("Harga parfum harus lebih dari 0");
            return false;
        }
        this.harga = harga;
        return true;
    }

    public int getIsi() {
        return isi;
    }

    public boolean setIsi(int isi) {
        if (isi <= 0) {
            System.out.println("Isi parfum harus lebih dari 0 ml");
            return false;
        }
        this.isi = isi;
        return true;
    }

    public String getJenis() {
        return "Parfum";
    }

    public String getLabelTambahan() {
        return "detail";
    }

    public String getDetailTambahan() {
        return "-";
    }

    public boolean setDetailTambahan(String detail) {
        return true;
    }

    protected void Output() {
        System.out.println("Jenis : " + getJenis());
        System.out.println("Nama  : " + getNama());
        System.out.println("Harga : " + getHarga());
        System.out.println("Isi   : " + getIsi() + " ml");
    }

    public static void mainMenu() {
        ArrayList<Parfum> daftarParfum = new ArrayList<Parfum>();
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n===== MENU PARFUM =====");
            System.out.println("1. Tambah Parfum");
            System.out.println("2. Tampil Data");
            System.out.println("3. Update Data");
            System.out.println("4. Hapus Data");
            System.out.println("5. Keluar Program");
            System.out.print("Masukkan pilihan anda: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    tambah(daftarParfum, input);
                    break;
                case 2:
                    tampil(daftarParfum);
                    break;
                case 3:
                    update(daftarParfum, input);
                    break;
                case 4:
                    hapus(daftarParfum, input);
                    break;
                case 5:
                    System.out.println("Program selesai");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        } while (pilihan != 5);

        input.close();
    }

    static void tambah(ArrayList<Parfum> daftarParfum, Scanner input) {
        Parfum parfumBaru = inputDataParfum(input);

        if (parfumBaru != null) {
            daftarParfum.add(parfumBaru);
            System.out.println("Data berhasil ditambahkan");
        }
    }

    static Parfum pilihJenisParfum(Scanner input) {
        int jenis;

        System.out.println("\nPilih jenis parfum:");
        System.out.println("1. Parfum Pria");
        System.out.println("2. Parfum Wanita");
        System.out.println("3. Parfum Unisex");
        System.out.print("Masukkan pilihan: ");
        jenis = input.nextInt();
        input.nextLine();

        if (jenis == 1) {
            return new ParfumPria();
        } else if (jenis == 2) {
            return new ParfumWanita();
        } else if (jenis == 3) {
            return new ParfumUnisex();
        } else {
            System.out.println("Jenis parfum tidak valid");
            return null;
        }
    }

    static Parfum inputDataParfum(Scanner input) {
        Parfum parfumBaru = pilihJenisParfum(input);

        if (parfumBaru == null) {
            return null;
        }

        while (true) {
            System.out.print("Masukkan nama parfum: ");
            String nama = input.nextLine();
            if (parfumBaru.setNama(nama)) {
                break;
            }
        }

        while (true) {
            System.out.print("Masukkan harga parfum: ");
            int harga = input.nextInt();
            input.nextLine();
            if (parfumBaru.setHarga(harga)) {
                break;
            }
        }

        while (true) {
            System.out.print("Masukkan isi parfum (ml): ");
            int isi = input.nextInt();
            input.nextLine();
            if (parfumBaru.setIsi(isi)) {
                break;
            }
        }

        while (true) {
            System.out.print("Masukkan " + parfumBaru.getLabelTambahan() + ": ");
            String detail = input.nextLine();
            if (parfumBaru.setDetailTambahan(detail)) {
                break;
            }
        }

        return parfumBaru;
    }

    static void tampil(ArrayList<Parfum> daftarParfum) {
        if (daftarParfum.isEmpty()) {
            System.out.println("Data parfum masih kosong");
            return;
        }

        int nomor = 1;
        for (Parfum parfum : daftarParfum) {
            System.out.println("\nData ke " + nomor);
            parfum.Output();
            nomor++;
        }
    }

    static void update(ArrayList<Parfum> daftarParfum, Scanner input) {
        if (daftarParfum.isEmpty()) {
            System.out.println("Data parfum masih kosong");
            return;
        }

        tampil(daftarParfum);
        System.out.print("\nMasukkan nomor data yang ingin diupdate: ");
        int index = input.nextInt();
        input.nextLine();

        if (index < 1 || index > daftarParfum.size()) {
            System.out.println("Nomor data tidak valid");
            return;
        }

        System.out.println("\nMasukkan data parfum baru:");
        Parfum parfumBaru = inputDataParfum(input);

        if (parfumBaru != null) {
            daftarParfum.set(index - 1, parfumBaru);
            System.out.println("Data berhasil diupdate");
        }
    }

    static void hapus(ArrayList<Parfum> daftarParfum, Scanner input) {
        if (daftarParfum.isEmpty()) {
            System.out.println("Data parfum masih kosong");
            return;
        }

        tampil(daftarParfum);
        System.out.print("\nMasukkan nomor data yang ingin dihapus: ");
        int index = input.nextInt();
        input.nextLine();

        if (index < 1 || index > daftarParfum.size()) {
            System.out.println("Nomor data tidak valid");
            return;
        }

        daftarParfum.remove(index - 1);
        System.out.println("Data berhasil dihapus");
    }
}