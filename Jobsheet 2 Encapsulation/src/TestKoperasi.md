import java.util.Scanner;

public class TestKoperasi {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    Anggota donny = new Anggota("111333444", "Donny", 5000000);
    System.out.println("Nama anggota: " + donny.getNama());
    System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());

    System.out.print("\nMasukkan jumlah pinjaman: ");
    int jumlahPinjaman = input.nextInt();
    donny.pinjamUang(jumlahPinjaman);
    System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPeminjaman());

    System.out.print("\nMasukkan jumlah angsuran: ");
    int jumlahAngsuran = input.nextInt();
    donny.angsur(jumlahAngsuran);
    System.out.println("Jumlah pinjaman setelah angsuran: " + donny.getJumlahPeminjaman());

    input.close();
  }
}