import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Random;
import java.util.Set;

// дз.1 Реализовать алгоритм сортировки слиянием

/**
 * sem3
 */
// public class sem3 {

//     public static void main(String[] args) {
//          Random rand = new Random();
//          int array[] = new int[10];
//          for (int i = 0; i < array.length; i++) {
//             array[i] = rand.nextInt(100);
//          }

//         System.out.println(Arrays.toString(array));
//         int[] result = mergesort(array);
//         System.out.println("результат сортировки слиянием :");
//         System.out.println(Arrays.toString(result));
//     }
 
//     public static int[] mergesort(int[] array) {
//         int[] arrayForSort = Arrays.copyOf(array, array.length);
//         int[] buffer = new int[array.length];
//         int[] result = mergesortInner(arrayForSort, buffer, 0, array.length);
//         return result;
//     }
 
//     /**
//      * 
//      * @param arrayForSort Массив для сортировки.
//      * @param buffer Буфер. Размер должен быть равен размеру buffer1.
//      * @param startIndex Начальный индекс в buffer1 для сортировки.
//      * @param endIndex Конечный индекс в buffer1 для сортировки.
//      * @return
//      */
//     public static int[] mergesortInner(int[] arrayForSort, int[] buffer,
//             int startIndex, int endIndex) {
//         if (startIndex >= endIndex - 1) {
//             return arrayForSort;
//         }
        
//         // уже отсортирован.
//         int middle = startIndex + (endIndex - startIndex) / 2;
//         int[] sorted1 = mergesortInner(arrayForSort, buffer, startIndex, middle);
//         int[] sorted2 = mergesortInner(arrayForSort, buffer, middle, endIndex);
        
//         // Слияние
//         int index1 = startIndex;
//         int index2 = middle;
//         int destIndex = startIndex;
//         int[] result = sorted1 == arrayForSort ? buffer : arrayForSort;
//         while (index1 < middle && index2 < endIndex) {
//             result[destIndex++] = sorted1[index1] < sorted2[index2]
//                     ? sorted1[index1++] : sorted2[index2++];
//         }
//         while (index1 < middle) {
//             result[destIndex++] = sorted1[index1++];
//         }
//         while (index2 < endIndex) {
//             result[destIndex++] = sorted2[index2++];
//         }
//         return result;
//     }
// }


// дз 2. Пусть дан произвольный список целых чисел, удалить из него четные числа

/**
 * sem3
 */
// public class sem3 {

//     public static void main(String[] args) {
//         Random rand = new Random();
//         List<Integer> list = new ArrayList<>();
//         for (int i = 0; i < 10; i++) {
//             list.add(rand.nextInt(10));   
//         }

//         System.out.println("исходный список :" + list);

  
//             Iterator<Integer> it = list.iterator();
         
//             while (it.hasNext())
//             {
//                 if (it.next() % 2 == 0) {    
//                     it.remove();
//                 }
//             }
        
//             System.out.println("без четных чисел : "+list);

        
//     }
// }


// дз3. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.


public class sem3 {

    public static void main(String[] args) {
        int n = 10;
        Random rand = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(rand.nextInt(100));   
        }
    
        System.out.println("исходный список :" + list);

        double sum = 0;
        for (int x: list) {
        sum += x;
        }
        System.out.println("среднее арифметическое чисел равно: " + sum/n);
        System.out.println("max: " + Collections.max(list));
        System.out.println("min : " + Collections.min(list));
        
    }
}

