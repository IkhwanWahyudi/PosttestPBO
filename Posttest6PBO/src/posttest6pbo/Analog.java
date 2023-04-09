package posttest6pbo;

public class Analog extends Jam{
    private final String kode;
    private String fitur;
    
    public Analog(String nama, String merk, String kode, String warna, int harga, int stok, String fitur){
        this.namaJam = nama;
        this.merkJam = merk;
        this.warnaJam = warna;
        this.hargaJam = harga;
        this.stokJam = stok;
        this.fitur = fitur;
        this.kode = kode + "J4M";
    }
    
    public String getKode(){
        return kode;
    }
    
    public String getFitur(){
        return fitur;
    }
    
    public void setFitur(String fitur){
        this.fitur = fitur;
    }
    
    @Override
    public void tampil(){
        super.tampil();
        System.out.println("  Fitur         : " + this.fitur);
        System.out.println("  Price         : Rp." + this.hargaJam);
        System.out.println("  Quantity      : " + this.stokJam);
    }
    
    public void tampil(boolean showProps){
        if (showProps) {
            System.out.println("  Code          : " + this.kode);
            tampil();
        }
        else tampil();
    }
    
    @Override
    protected String getNama() {
        return namaJam;
    }

    @Override
    protected String getMerk() {
        return merkJam;
    }

    @Override
    protected String getWarna() {
        return warnaJam;
    }

    @Override
    protected int getHarga() {
        return hargaJam;
    }

    @Override
    protected int getStok() {
        return stokJam;
    }

    @Override
    protected void SetEdit(String property, String NamaBaru, String MerkBaru, 
            String WarnaBaru, int HargaBaru, int StokBaru) {
        switch (property) {
            case "Name":
                this.namaJam = NamaBaru;
                break;
                
            case "Merk":
                this.merkJam = MerkBaru;
                break;
            
            case "Warna":
                this.warnaJam = WarnaBaru;
                break;
                
            case "Harga":
                this.hargaJam = HargaBaru;
                break;
                
            case "Stok":
                this.stokJam = StokBaru;
                break;
                
            default:
                break;
        }
    }
}
