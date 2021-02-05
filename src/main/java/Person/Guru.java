package Person;

// Membuat class guru extends person
public class Guru extends Person{
    private int nip;
    private String namaKelas;
    private String namaMapel;
    
    public void setDataGuru(String nama, int NIP, String namamapel, String namakelas){
    this.nama = nama;
    this.nip = NIP;
    this.namaMapel = namamapel;
    this.namaKelas = namakelas;
    }
    
    //Mengoverride method infoPerson di class Guru
    @Override
    public void infoPerson(){
        super.infoPerson();
        System.out.println(nip+"\t"+nama+"\t"+namaMapel+"\t"+namaKelas);
    }
    
    public String getNamaKelas(){
        return namaKelas;
    }
    
    public String getNamMael(){
        return namaMapel;
    }
    
}
