package posttest3pbo;

public class Transaksi {
    private String namaCustomer, namaBarang, merkBarang, kodeBarang, warnaBarang, fitur;
    private int jumlahBarang, hargaBarang; 

    public Transaksi(String nama, String barang, String merk, String kode, String warna, int jumlah, int harga, String fitur){
        this.namaCustomer = nama;
        this.namaBarang = barang;
        this.merkBarang = merk;
        this.kodeBarang = kode;
        this.warnaBarang = warna;
        this.jumlahBarang = jumlah;
        this.hargaBarang = harga;
        this.fitur = fitur;
    }
    
    // Getter ==================================================================
    public String getNamaCustomer() {
        return namaCustomer;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public String getMerkBarang() {
        return merkBarang;
    }

    public String getKodeBarang() {
        return kodeBarang;
    }

    public String getWarnaBarang() {
        return warnaBarang;
    }

    public String getFitur() {
        return fitur;
    }

    public int getHargaBarang() {
        return hargaBarang;
    }
    
    public int getJumlahBarang() {
        return jumlahBarang;
    }

    
    // Setter ==================================================================
    public void setNamaCustomer(String namaCustomer) {
        this.namaCustomer = namaCustomer;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public void setMerkBarang(String merkBarang) {
        this.merkBarang = merkBarang;
    }

    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    public void setWarnaBarang(String warnaBarang) {
        this.warnaBarang = warnaBarang;
    }

    public void setFitur(String fitur) {
        this.fitur = fitur;
    }

    public void setHargaBarang(int hargaBarang) {
        this.hargaBarang = hargaBarang;
    }
    
    public void setJumlahBarang(int jumlahBarang) {
        this.jumlahBarang = jumlahBarang;
    }
}
