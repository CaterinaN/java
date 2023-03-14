import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Random;

// дз 1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

/**
 * sem4
 */
// public class sem4 {

//     public static void main(String[] args) {
//         Random rand = new Random();

//         LinkedList<Integer> llist = new LinkedList<Integer>();
//         LinkedList<Integer> reverse = new LinkedList<Integer>();

//         for (int i = 0; i < 7; i++) {
//             llist.add(rand.nextInt(100));
//         }
//         System.out.println("Исходный  список: " + llist);

//         for (int i = 0; i < 7; i++) {
//             reverse.push(llist.removeFirst());
//         }
//         System.out.println("Перевернутый список:" + reverse);

//     }
// }


// дз2. Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.



/**
 * sem4
 */
// public class sem4 {

//     public static void main(String[] args) {
//         Random rand = new Random();
//         ArrayDeque<Integer> llist = new ArrayDeque<>();        
//         for (int i = 0; i < 10; i++) {
//             llist.add(rand.nextInt(50));
//         }
    
//             int newElement = 34;
//             System.out.println("Созданная очередь: " + llist);
//             System.out.println("Добавляем элемент " + newElement + "\n" + 
//                                 "Результат: " + enqueue(llist, newElement));
//             System.out.println("Удаляемый элемент (первый): " + dequeue(llist) + "\n" + 
//                                 "Результат: " + llist);
//             System.out.println("Первый элемент: " + first(llist));
//         }
        
//     public static ArrayDeque<Integer> enqueue(ArrayDeque<Integer> llist, int newElement) {
//         llist.addLast(newElement);        
//         return llist;
//     }

//     public static int dequeue(ArrayDeque<Integer> llist) {
//         int firstElement = llist.getFirst(); 
//         llist.pollFirst(); 
//         return firstElement;
//     }

//     public static int first(ArrayDeque<Integer> llist) {
//         return llist.getFirst();
//     }
//     }




// дз. 3 
// В калькулятор добавьте возможность отменить последнюю операцию.

/**
 * sem4
 */
public class sem4 {

    public static void main(String[] args) {

        
        
    }
}
