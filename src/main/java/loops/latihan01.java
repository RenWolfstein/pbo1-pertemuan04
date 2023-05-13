package loops;
public class latihan01 {
    public static void main(String[] args) {
        String hari[] = {"Senin" , "Selasa", "Rabu", "Kamis" , "Jumat" ,"Sabtu", "minggu"};
        System.out.println("Berikut ini nama-nama hari dalam 1 minggu : ");
        for(int i = 0; i < hari.length; i++){
            System.out.println("Hari " + hari[i]);
        }
    }
}
