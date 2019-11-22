public class methodReturn {//class methodReturn
  public static String nama = "Madara Uciha";//deklarasi
  public static String getNama(){//mengembalikan nilai nama
    return nama;
  }
  public static int hitungUmur (int lahir,int sekarang){//fungsi dengan parameter lahir dan sekarang
    int umur = sekarang - lahir;//mengurangi sekarang dengan lahir dan memasukannya ke int umur
    return umur;//mengembalikan nilai umur
  }
  public static void main(String[] args) {//method prosedure class utama
    String namaSaya = getNama();//mengisi nilai namaSaya dengan fungsi getNama()
    System.out.println("Nama saya :"+getNama());//menampilkan
    int umurSaya = hitungUmur(1995,2018);//mengisi umurSaya dengan rumus di hitungUmur dan memberikan nilai lahir dan sekarang
    System.out.println("umur saya :"+umurSaya);//menampilkan
  }
}
