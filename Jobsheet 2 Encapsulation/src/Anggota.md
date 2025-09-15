public class Anggota {
    private String nama;
    private String alamat;
    private float simpanan;
    private String noKTP;
    private float jumlahPinjaman;
    private float limitPinjaman;
    
    Anggota(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
        this.simpanan = 0;
    }

    Anggota(String noKTP, String nama, float limitPinjaman) {
        this.noKTP = noKTP;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
        this.jumlahPinjaman = 0;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public float getLimitPinjaman() {
        return limitPinjaman;
    }

    public void pinjamUang(int uang) {
        if (jumlahPinjaman + uang > limitPinjaman) {
            System.out.println("Maaf Jumlah pinjaman melebihi Limit");
        } else {
            jumlahPinjaman += uang;
        }
    }

    public double getJumlahPeminjaman() {
        return jumlahPinjaman;
    }

    public String getAlamat() {
        return alamat;
    }

    public float getSimpanan() {
        return simpanan;
    }

    public void setor(float uang) {
        simpanan += uang;
    }

    public void pinjam(float uang) {
        simpanan -= uang;
    }

    public void angsur(int uang) {
        float minimalAngsuran = jumlahPinjaman * 0.10f;

        if (uang < minimalAngsuran) {
            System.out.println(
                    "Maaf, angsuran minimal adalah 10% dari jumlah pinjaman saat ini (" + minimalAngsuran + ")");
        } else {
            jumlahPinjaman -= uang;
            System.out.println("Angsuran berhasil. Sisa pinjaman: " + jumlahPinjaman);
        }
    }
}
