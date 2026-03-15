import java.util.*;

public class Parfum {

    class DataParfum {
        private String nama;
        private int harga;
        private int isi;

        public DataParfum() {
        }

        public String getNama() {
            return nama;
        }

        public boolean setNama(String nama) {
            if (nama == null) {
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
    }

    ArrayList<DataParfum> daftarParfum = new ArrayList<>();
    private Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Parfum app = new Parfum();
        app.menu();
    }

    void menu() {
        int pilihan;

        do {
            System.out.println("MENU PARFUM");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Update Data");
            System.out.println("4. Hapus Data");
            System.out.println("5. Keluar Program");
            System.out.print("Masukkan pilihan anda: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1 -> tambah();
                case 2 -> tampil();
                case 3 -> update();
                case 4 -> hapus();
                case 5 -> System.out.println("Program selesai");
                default -> System.out.println("Pilihan tidak valid");
            }
        } while (pilihan != 5);
    }

    public void tambah() {
        DataParfum parfumBaru = new DataParfum();

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

        daftarParfum.add(parfumBaru);
        System.out.println("Data berhasil ditambahkan");
    }

    protected void tampil() {
        if (daftarParfum.isEmpty()) {
            System.out.println("Data parfum masih kosong");
            return;
        }

        int nomor = 1;
        for (DataParfum parfum : daftarParfum) {
            System.out.println("Data ke " + nomor);
            System.out.println("Nama  : " + parfum.getNama());
            System.out.println("Harga : " + parfum.getHarga());
            System.out.println("Isi   : " + parfum.getIsi() + " ml");
            System.out.println();
            nomor++;
        }
    }

    private void update() {
        if (daftarParfum.isEmpty()) {
            System.out.println("Data parfum masih kosong");
            return;
        }

        tampil();
        System.out.print("Masukkan nomor data yang ingin diupdate: ");
        int index = input.nextInt();
        input.nextLine();

        if (index < 1 || index > daftarParfum.size()) {
            System.out.println("Nomor data tidak valid");
            return;
        }

        DataParfum parfum = daftarParfum.get(index - 1);

        while (true) {
            System.out.print("Masukkan nama parfum baru: ");
            String namaBaru = input.nextLine();
            if (parfum.setNama(namaBaru)) {
                break;
            }
        }

        while (true) {
            System.out.print("Masukkan harga baru: ");
            int hargaBaru = input.nextInt();
            input.nextLine();
            if (parfum.setHarga(hargaBaru)) {
                break;
            }
        }

        while (true) {
            System.out.print("Masukkan isi baru (ml): ");
            int isiBaru = input.nextInt();
            input.nextLine();
            if (parfum.setIsi(isiBaru)) {
                break;
            }
        }

        System.out.println("Data berhasil diupdate");
    }

    void hapus() {
        if (daftarParfum.isEmpty()) {
            System.out.println("Data parfum masih kosong");
            return;
        }

        tampil();
        System.out.print("Masukkan nomor data yang ingin dihapus: ");
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