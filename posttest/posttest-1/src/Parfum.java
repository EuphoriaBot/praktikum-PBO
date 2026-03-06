import java.util.ArrayList;
import java.util.Scanner;

public class Parfum {

    class DataParfum {
        String jenis;
        int harga;

        DataParfum(String jenis, int harga) {
            this.jenis = jenis;
            this.harga = harga;
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
            System.out.println("0. Exit");
            System.out.print("Masukkan pilihan anda: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    tambah();
                    break;
                case 2:
                    tampil();
                    break;
                case 3:
                    update();
                    break;
                case 4:
                    hapus();
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
    }

    void tambah() {
        System.out.print("Masukkan jenis parfum: ");
        String jenis = input.nextLine();

        System.out.print("Masukkan harga parfum: ");
        int harga = input.nextInt();
        input.nextLine();

        daftarParfum.add(new DataParfum(jenis, harga));
        System.out.println("Data berhasil ditambahkan.");
    }

    void tampil() {
        if (daftarParfum.isEmpty()) {
            System.out.println("Data parfum masih kosong.");
            return;
        }

        for (int i = 0; i < daftarParfum.size(); i++) {
            System.out.println("Data ke-" + (i + 1));
            System.out.println("Jenis : " + daftarParfum.get(i).jenis);
            System.out.println("Harga : " + daftarParfum.get(i).harga);
            System.out.println();
        }
    }

    void update() {
        if (daftarParfum.isEmpty()) {
            System.out.println("Data parfum masih kosong.");
            return;
        }

        tampil();
        System.out.print("Masukkan nomor data yang ingin diupdate: ");
        int index = input.nextInt();
        input.nextLine();

        if (index < 1 || index > daftarParfum.size()) {
            System.out.println("Nomor data tidak valid.");
            return;
        }

        System.out.print("Masukkan jenis parfum baru: ");
        String jenisBaru = input.nextLine();

        System.out.print("Masukkan harga baru: ");
        int hargaBaru = input.nextInt();
        input.nextLine();

        daftarParfum.get(index - 1).jenis = jenisBaru;
        daftarParfum.get(index - 1).harga = hargaBaru;

        System.out.println("Data berhasil diupdate.");
    }

    void hapus() {
        if (daftarParfum.isEmpty()) {
            System.out.println("Data parfum masih kosong.");
            return;
        }

        tampil();
        System.out.print("Masukkan nomor data yang ingin dihapus: ");
        int index = input.nextInt();
        input.nextLine();

        if (index < 1 || index > daftarParfum.size()) {
            System.out.println("Nomor data tidak valid.");
            return;
        }

        daftarParfum.remove(index - 1);
        System.out.println("Data berhasil dihapus.");
    }
}