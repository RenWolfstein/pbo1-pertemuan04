package loops;
public class Pbo1Pertemuan04 {

    public static void main(String[] args) {
         int isiGelas = 0;
         int penuh = 225;
         
         System.out.println("Isi gelas sekarang : " + isiGelas + "ml");
         System.out.println("Isi gelas ketika Penuh : " + penuh + "ml");
         
         while(isiGelas != penuh){
             isiGelas++;
             System.out.println("Sedang mengisi gelas..");
             System.out.println("Isi gelas sekarang : " + isiGelas+ "ml");
             
         }
         System.out.println("Finale : Isi gelas sekarang : " + isiGelas + "ml");
    }
}
