import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

// дз 1. Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

/**
 * sem5
 */
public class sem5 {

    public static void main(String[] args) {
        Map<String, List<String>> phoneBook = new HashMap<>();
        phoneBook.put("Катя", List.of("8 917 356 45 12", "39 66 15"));
        phoneBook.put("Sasha", List.of("8 927 564 12 33", "44 55 66"));
       

        menu(phoneBook);

    }

    public static String scanner() {
        Scanner scanner = new Scanner(System.in,  "Cp866");
        String scan = scanner.nextLine();
        return scan;
    }

    public static void find(Map<String, List<String>> phoneBook) {
        System.out.println("Введите имя: ");
        String name = scanner();
        System.out.println(phoneBook.get(name));
    }

    public static void allBook(Map<String, List<String>> phoneBook) {
        System.out.println(phoneBook);

    }

    public static Map<String, List<String>> add(Map<String, List<String>> phonBook) {
        System.out.println("Введите имя: ");    
        String name = scanner();
        List<String> number = new ArrayList<>();

        while (true) {
            System.out.println("Для завершения записи введите 'stop'");
            System.out.println("Введите номер: ");
            String phon = scanner();
            if (phon.equals("stop")) {
                break;
            } else {
                number.add(phon);
            }
        }
        phonBook.put(name, number);

        return phonBook;
    }

    public static Map<String, List<String>> menu(Map<String, List<String>> phonBook) {
        while (true) {
            System.out.println("Введите команду из списка:  1- найти контакт, 2 - добавить контакт, 3 - показать телефонную книгу, 0 - выйти");
            String comands = scanner();
            if (comands.equals("0")) {
                break;
            } else {
                switch (comands) {
                    case "1":
                        find(phonBook);
                        break;
                    case "2":
                        add(phonBook);
                        break;
                    case "3":
                        allBook(phonBook);
                        break;
                    default:
                        break;
                }
            }
        }
        return phonBook;
    }
    }



// дз 2. Пусть дан список сотрудников:Иван Иванов ( и остальные, полный текст дз будет на платформе) 
// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.

/**
 * sem5
 */
// public class sem5 {

//     public static void main(String[] args) {
//         Map<String, Integer> listWorkers = new HashMap<>();
//         String workers = "Иван Иванов Светлана Петрова Кристина Белова Анна Мусина Анна Крутова " +
//                 "Иван Юрин Петр Лыков Павел Чернов Петр Чернышов Мария Федорова " +
//                 "Марина Светлова Мария Савина Мария Рыкова Марина Лугова " +
//                 "Анна Владимирова Иван Мечников Петр Петин Иван Ежов ";
//         System.out.println("Список сотредников : " +workers);
//         String[] NamesSurnames = workers.split(" ");
//         for (int i = 0; i < NamesSurnames.length; i += 2) {
//             if (listWorkers.containsKey(NamesSurnames[i])) {
//                 listWorkers.replace(NamesSurnames[i], listWorkers.get(NamesSurnames[i]) + 1);
//             } else {
//                 listWorkers.put(NamesSurnames[i], 1);
//             }
//         }
//         System.out.println("\nСписок имен:");
//         System.out.println(listWorkers);

//         System.out.println("\nСписок имен по популярности:");
//         listWorkers.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
//                 .forEach(System.out::println);
//     }
// }



// дз.3 Реализовать алгоритм пирамидальной сортировки (HeapSort).

/**
 * sem5
 */
// public class sem5 {

//     private static int LEFT(int i) {
//         return (2 * i + 1);
//     }

//     private static int RIGHT(int i) {
//         return (2 * i + 2);
//     }

//     private static void swap(int[] A, int i, int j) {
//         int temp = A[i];
//         A[i] = A[j];
//         A[j] = temp;
//     }

//     private static void heapify(int[] A, int i, int size) {

//         int left = LEFT(i);
//         int right = RIGHT(i);

//         int largest = i;

//         if (left < size && A[left] > A[i]) {
//             largest = left;
//         }

//         if (right < size && A[right] > A[largest]) {
//             largest = right;
//         }

//         if (largest != i) {
//             swap(A, i, largest);
//             heapify(A, largest, size);
//         }
//     }

//     public static int pop(int[] A, int size) {

//         if (size <= 0) {
//             return -1;
//         }

//         int top = A[0];

//         A[0] = A[size - 1];

//         heapify(A, 0, size - 1);

//         return top;
//     }

//     public static void heapsort(int[] A) {

//         int n = A.length;

//         int i = (n - 2) / 2;
//         while (i >= 0) {
//             heapify(A, i--, n);
//         }

//         while (n > 0) {
//             A[n - 1] = pop(A, n);
//             n--;
//         }
//     }

//     public static void main(String[] args) {

//         int[] A = { 0, 9, 4, 15, 9, 5 };

//         heapsort(A);

//         System.out.println(Arrays.toString(A));

//     }
// }