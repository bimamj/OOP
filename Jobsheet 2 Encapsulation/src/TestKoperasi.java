import java.util.Scanner;

public class TestKoperasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Anggota angga = new Anggota("111333444", "Angga", 5000000);
        System.out.println("Nama anggota: " + angga.getNama());
        System.out.println("Limit Pinjaman: " + angga.getLimitPinjaman());

        System.out.print("\nMasukkan jumlah pinjaman: ");
        int jumlahPinjaman = input.nextInt();
        angga.pinjamUang(jumlahPinjaman);
        System.out.println("Jumlah pinjaman saat ini: " +
                angga.getJumlahPeminjaman());

        System.out.print("\nMasukkan jumlah angsuran: ");
        int jumlahAngsuran = input.nextInt();
        angga.angsur(jumlahAngsuran);
        System.out.println("Jumlah pinjaman setelah angsuran: " +
                angga.getJumlahPeminjaman());
    }
}