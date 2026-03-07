import java.util.*;

public class Parfum {

    class DataParfum {
        String nama;
        int harga;
        int isi;

        DataParfum(String nama, int harga, int isi) {
            this.nama = nama;
            this.harga = harga;
            this.isi = isi;
        }
    }

    ArrayList<DataParfum> daftarParfum = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Parfum app = new Parfum();
        app.menu();
    }

    void menu() {
        int pilihan;

        do {
            System.out.println("\n=== MENU PARFUM ===");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Update Data");
            System.out.println("4. Hapus Data");
            System.out.println("5. Exit");
            System.out.print("Masukkan pilihan anda: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1 -> tambah();
                case 2 -> tampil();
                case 3 -> update();
                case 4 -> hapus();
                case 5 -> System.out.println("Program selesai.");
                default -> System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
    }

    void tambah() {
        System.out.print("Masukkan nama parfum: ");
        String nama = input.nextLine();

        System.out.print("Masukkan harga parfum: ");
        int harga = input.nextInt();

        System.out.print("Masukkan isi parfum (ml): ");
        int isi = input.nextInt();
        input.nextLine();

        daftarParfum.add(new DataParfum(nama, harga, isi));
        System.out.println("Data berhasil ditambahkan");
    }

    void tampil() {
        if (daftarParfum.isEmpty()) {
            System.out.println("Data parfum masih kosong");
            return;
        }

        for (int i = 0; i < daftarParfum.size(); i++) {
            System.out.println("Data ke-" + (i + 1));
            System.out.println("Nama  : " + daftarParfum.get(i).nama);
            System.out.println("Harga : " + daftarParfum.get(i).harga);
            System.out.println("Isi   : " + daftarParfum.get(i).isi + " ml");
            System.out.println();
        }
    }

    void update() {
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

        System.out.print("Masukkan nama parfum baru: ");
        String namaBaru = input.nextLine();

        System.out.print("Masukkan harga baru: ");
        int hargaBaru = input.nextInt();

        System.out.print("Masukkan isi baru (ml): ");
        int isiBaru = input.nextInt();
        input.nextLine();

        daftarParfum.get(index - 1).nama = namaBaru;
        daftarParfum.get(index - 1).harga = hargaBaru;
        daftarParfum.get(index - 1).isi = isiBaru;

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