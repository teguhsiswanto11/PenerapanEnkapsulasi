public class Tester {

    public static void main(String[] args) {
        Persegi psegi = new Persegi(10);
//        psegi.setSisi(11);

        PersegiPanjang ppanjang = new PersegiPanjang(5,4);
//        ppanjang.setPanjang(6);
//        ppanjang.setLebar(8);

        System.out.println("Sisi Persegi = "+psegi.getSisi());
        System.out.println("Keliling Persegi = "+psegi.hitungKeliling());
        System.out.println("Luas Persegi sisi = "+psegi.hitungLuas()+"\n");

        System.out.println("Panjang Persegi Panjang = "+ppanjang.getPanjang());
        System.out.println("Lebar Persegi Panjang = "+ppanjang.getLebar());
        System.out.println("Keliling Persegi Panjang = "+ppanjang.hitungKeliling());
        System.out.println("Luas Persegi Panjang = "+ppanjang.hitungLuas());

    }
}
