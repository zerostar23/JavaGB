import java.io.FileWriter;
import java.io.IOException;

public class main {

    public static void main(String[] args) {
        

        // 1. Выбросить случайное целое число и сохранить в i

        double x = (Math.random()*100000);
        int i = (int) x;
        System.out.println(i);

        // 2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа

        int n = Integer.toBinaryString(i).length();
        System.out.println(n);

        // 3. Найти все кратные n числа большие i и сохранить в массив m1
    
        int indexMax = Integer.MAX_VALUE;
        System.out.println(Integer.MAX_VALUE);
        int arraySize = 0;

        for (int j = indexMax; j > i; j--) {
            if (j%n == 0) {
                arraySize++;
            }
        }

        int[] m1 = new int[arraySize];
        int arrayindexMax = arraySize;
        for (int j = i; j <= indexMax; j++) {
            if (j%n == 0) {
                m1[arraySize-arrayindexMax] = j ;
                System.out.println((m1[arraySize-arrayindexMax]));
                try (FileWriter fw = new FileWriter("m1.txt", false)) {
                    fw.write(m1[arraySize-arrayindexMax]);
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
                arrayindexMax--;
            }
        }   

        //4. Найти все некратные n числа меньшие i и сохранить в массив m2

        
        // int indexMin = Integer.MIN_VALUE;
        // System.out.println(Integer.MIN_VALUE);
        // int arraym2Size = 0;

        // for (int j = indexMin; j < i; j++) {
        //     if (j%n != 0) {
        //         arraym2Size++;
        //     }
        // }
        // System.out.println(arraym2Size);
        // int[] m2 = new int[arraym2Size];
        // int arrayindexMin = arraym2Size;
        // for (int j = indexMin; j < 0; j++) {
        //     if (j%n != 0) {
        //         m2[arraym2Size-arrayindexMin] = j ;
        //         System.out.println(m2[arraym2Size-arrayindexMin]);
        //         arrayindexMin--;
        //     }
        // }   

        //5. Сохранить оба массива в файлы с именами m1 и m2 соответственно.
        // Добавил запись в фалйы внутрь циклов записи массивов




    }

}
