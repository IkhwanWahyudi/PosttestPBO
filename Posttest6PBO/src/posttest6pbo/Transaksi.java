package posttest6pbo;

public class Transaksi implements Profit{
    private String namaCustomer, namaBarang, merkBarang, kodeBarang, warnaBarang, fitur, Status;
    private int jumlahBarang, hargaBarang;

    public Transaksi(String namaCustomer, String namaBarang, String merkBarang, 
            String kodeBarang, String warnaBarang, String fitur, String Status, int jumlahBarang, int hargaBarang) {
        this.namaCustomer = namaCustomer;
        this.namaBarang = namaBarang;
        this.merkBarang = merkBarang;
        this.kodeBarang = kodeBarang;
        this.warnaBarang = warnaBarang;
        this.fitur = fitur;
        this.Status = Status;
        this.jumlahBarang = jumlahBarang;
        this.hargaBarang = hargaBarang;
    }

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

    public String getStatus() {
        return Status;
    }

    public int getJumlahBarang() {
        return jumlahBarang;
    }

    public int getHargaBarang() {
        return hargaBarang;
    }

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

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public void setJumlahBarang(int jumlahBarang) {
        this.jumlahBarang = jumlahBarang;
    }

    public void setHargaBarang(int hargaBarang) {
        this.hargaBarang = hargaBarang;
    }
    
    public void tampil(){
        System.out.print(this.namaCustomer + " | " + this.namaBarang + " | " + 
                        this.merkBarang + " | " + this.kodeBarang + " | " + 
                        this.warnaBarang + " | " + this.jumlahBarang + " | Rp.");
    }

    /**
     *
     */
    @Override
    public void TampilkanData() {
        System.out.println("  Customer Name : " + this.namaCustomer);
        System.out.println("  Product Name  : " + this.namaBarang);
        System.out.println("  Code Product  : " + this.kodeBarang);
        System.out.println("  Merk          : " + this.merkBarang);
        System.out.println("  Color         : " + this.warnaBarang);
        System.out.println("  Fitur         : " + this.fitur);
        System.out.println("  Price         : Rp." + this.hargaBarang);
        System.out.println("  Quantity      : " + this.jumlahBarang);
    }
    
    /**
     *
     * @return 
     */
    @Override
    public double TotalProfit() {
        double satuan = 0;
        if (this.Status == "Sukses"){
            satuan += jumlahBarang * hargaBarang;
        }
        return satuan;
    }
}