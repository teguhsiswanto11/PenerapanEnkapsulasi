public class Persegi {
    private double sisi;

    //tambahkan bagian konstruktor ini
    public Persegi(double sisi){
        this.sisi = sisi;
        System.out.println("Objek persegi diinstansiasi");
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi; //this mengacu pada atribut internal kelas || supaya dapat dibedakan dengan nama parameter input
    }

    public double hitungKeliling(){
        return 4*sisi;
    }

    public double hitungLuas(){
        return sisi*sisi;
    }

}
