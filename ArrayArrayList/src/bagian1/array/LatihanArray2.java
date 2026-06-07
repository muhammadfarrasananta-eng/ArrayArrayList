package bagian1.array;

public class LatihanArray2 {
    public static void main(String[] args) {

        String[] hari = {
            "Senin",
            "Selasa",
            "Rabu",
            "Kamis",
            "Jumat"
        };

        for(String h : hari){
            if(h.length() > 5){
                System.out.println(h);
            }
        }
    }
}