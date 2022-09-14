import java.util.Arrays;

public class DizilerdeHarmonikOrt {
    public static void main(String[] args) {

        int[] dizi= {1,2,3,4};

        System.out.println("Dizimizin Elemanlari: " + Arrays.toString(dizi));

        double ortalama=0,harmonikSeri=0,sayiAdet=0;

        for (int i=0; i<dizi.length; i++){

            harmonikSeri=harmonikSeri+(1.0/dizi[i]);
            sayiAdet++;

        }
        ortalama=sayiAdet/harmonikSeri;
        System.out.println("Dizimizin Harmonik Ortalamasi: " + ortalama);
    }
}
