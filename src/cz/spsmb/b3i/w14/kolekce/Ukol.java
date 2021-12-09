package cz.spsmb.b3i.w14.kolekce;

import java.util.ArrayList;

//ArrayList lze vytvořit i s předem vytvořeným počtem prvků. Takto:
//ar = new ArrayList<Integer>(N). Proveďte rychlostní test a srovnejte
//s ar = new ArrayList<Integer>() pro milión prvků;
public class Ukol {

    public static void main(String[] args) {
            int N = 1000000;
            ArrayList<Integer> ar = new ArrayList<>(N);
            ArrayList<Integer> sar = new ArrayList<>();
            long start = System.currentTimeMillis();
            for (int i = 0; i < N; i++) {
                ar.add(i);
            }
            long finish = System.currentTimeMillis();
            long tE = (finish - start);
            long start1 = System.currentTimeMillis();
            for (int i = 0; i < 1000000; i++) {
                sar.add(i);
            }
            long finish1 = System.currentTimeMillis();
            long tE2 = (finish1 - start1);
            System.out.println("ar = new ArrayList<Integer>(N) " + tE );
            System.out.println("sar = new ArrayList<Integer>() " + tE2 );
            if(tE < tE2){
                System.out.println("Rychlejší je sar");
            }
            else if(tE2 < tE){
                System.out.println("Rychlejší je ar");
            }else{
                System.out.println("Oba jsou stejně rychlé");
            }
    }
}