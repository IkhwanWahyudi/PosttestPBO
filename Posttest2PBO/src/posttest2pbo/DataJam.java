package posttest2pbo;

public class DataJam {
    
    private String namaJam, merkJam, tipeJam, kodeJam, warnaJam;
    private int hargaJam, stokJam;
    
    public DataJam(String nama, String kode, String merk, String tipe, String warna, int harga, int stok) {
        this.namaJam = nama;
        this.kodeJam = kode+"J4M";
        this.merkJam = merk;
        this.tipeJam = tipe;
        this.warnaJam = warna;
        this.hargaJam = harga;
        this.stokJam = stok;
    }
    
    // Getter ===================================================================
    public String getNama(){return this.namaJam;}
    
    public String getMerk(){return this.merkJam;}
    
    public String getTipe(){return this.tipeJam;}
    
    public String getKode(){return this.kodeJam;}
    
    public String getWarna(){return this.warnaJam;}
    
    public int getHarga(){return this.hargaJam;}
    
    public int getStok(){return this.stokJam;}
    
    // Setter ===================================================================
    public void SetEdit(String property, String NamaBaru, String KodeBaru, String MerkBaru, String TipeBaru, String WarnaBaru, int HargaBaru, int StokBaru){
        switch (property) {
            case "Name":
                this.namaJam = NamaBaru;
                break;
                
            case "Code":
                this.kodeJam = KodeBaru + "J4M";
                break;
                
            case "Merk":
                this.merkJam = MerkBaru;
                break;
                
            case "Type":
                this.tipeJam = TipeBaru;
                break;
            
            case "Warna":
                this.warnaJam = WarnaBaru;
                break;
                
            case "Price":
                this.hargaJam = HargaBaru;
                break;
                
            case "Quantity":
                this.stokJam = StokBaru;
                break;
                
            default:
                break;
        }
    }
}
