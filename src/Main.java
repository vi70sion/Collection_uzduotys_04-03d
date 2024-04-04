import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

//        Sukurti atsitiktiniu skaiciu masyva:
//        1. masyvo dydis - 8
//        2. masyvo reiksmiu tipas - byte
//        3. generuojami atsitiktiniai skaiciai nuo 1 iki 10
//        4. uzpildyti masyva su sugeneruotais atsitiktiniais skaiciais
//        5. graziai atspausdinti gautus rezultatus
//        Automatizuoti atsitiktiniu skaiciu idejima i ansciau sukurta masyva.

        byte[] masyvas = new byte[8];
        for(int i = 0; i < masyvas.length; i++){
            masyvas[i] = (byte) new Random().nextInt(1, 11);
            System.out.println(masyvas[i]);
        }
        System.out.println();


//        1oje uzduotyje sukurto masyvo rezultatus sutikrinti ir
//        atspausdinti, kurie yra daugiau uz 4.
//
//        Rezultatai, kurie yra maziau arba lygu 4, ideti i nauja
//        masyva ir atspausdinti
//
//        Suskaiciuoti ir graziai atspausdinti pirmo masyvo visu elementu
//        rezultatu suma.



//        Sukurti List prideti astuonias atsitiktines reiksmes intervale nuo 1 iki 10 ir atsapsudinti
//        Sukurti nauja List ir prideti visas reiksmes kurios daugiau nei 4, atspausdinti
//        Sukurti nauja List ir prideti visas reiksmes kurios maziau arba lygios 4, atspausdinti
//        Suskaiciuoti visu pirmo List elementu suma ir vidurki atskirai, atspausdinti.

        ArrayList<Integer> atsitiktinis = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            atsitiktinis.add(new Random().nextInt(1,11));
        }
        System.out.println(atsitiktinis);


        ArrayList<Integer> daugiauKeturiu = new ArrayList<>();
        ArrayList<Integer> maziauLygu4 = new ArrayList<>();
        for(int i = 0; i < atsitiktinis.size(); i++){
            if(atsitiktinis.get(i) > 4 ) daugiauKeturiu.add(atsitiktinis.get(i));
                else maziauLygu4.add(atsitiktinis.get(i));
        }
        System.out.println(daugiauKeturiu);
        System.out.println(maziauLygu4);
        System.out.println();

    }
}