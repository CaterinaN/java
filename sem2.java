
// дз 1 Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

/**
 * sem2
 */

 import java.io.IOException;
 import java.util.Arrays;
 import java.util.Random;
 import java.util.logging.FileHandler;
 import java.util.logging.Logger;
 import java.util.logging.SimpleFormatter;
 
 public class sem2 {
     public static void main(String[] args) throws IOException {
         
         Random rand = new Random();
         int arr[] = new int[8];
         for (int i = 0; i < arr.length; i++) {
             arr[i] = rand.nextInt(100);
         }
         System.out.println("Исходный массив:");
         System.out.println(Arrays.toString(arr));
 
         Logger loger = Logger.getLogger(sem2.class.getName());
         FileHandler fHandler = new FileHandler("LogSem2Dz1.txt");
         SimpleFormatter sFormatter = new SimpleFormatter();
         fHandler.setFormatter(sFormatter);
         loger.addHandler(fHandler);
 
         int sort;
         for (int i = 0; i < arr.length - 1; i++) {    
             for (int j = 0; j < arr.length - 1; j++) {
                 if (arr[j] > arr[j + 1]) {
                     sort = arr[j];
                     arr[j] = arr[j + 1];
                     arr[j + 1] = sort;
                 }
             }
             loger.info(Arrays.toString(arr));            
         }
         System.out.println("Сортированный массив:");
         System.out.print(Arrays.toString(arr));
     }
 }
 





//2. К калькулятору из предыдущего дз добавить логирование.


// import java.util.Scanner;
// import java.io.IOException;
// import java.util.logging.FileHandler;
// import java.util.logging.Level;
// import java.util.logging.Logger;
// import java.util.logging.SimpleFormatter;

// public class sem2 {
//     public static void main(String[] args) throws IOException { 
//         double num1 = 0;
//         double num2 = 0;
//         double result =0;
//         Logger loger = Logger.getLogger(sem2.class.getName());
//         FileHandler fHandler = new FileHandler("LogSem2DZ2.txt", true);
//         SimpleFormatter sFormatter = new SimpleFormatter();
//         fHandler.setFormatter(sFormatter);
//         loger.addHandler(fHandler);

//         Scanner scan = new Scanner(System.in);
//         try {
//         System.out.print("Введите первое число: ");               		
// 		num1 = scan.nextDouble (); 
//         loger.info("Первое введенное число: " + num1);       
//         }catch (Exception e) {            
//             loger.log(Level.SEVERE,
//                     "не верный ввод первого числа", e);
//         }
        
//         try {
//         System.out.print("Введите второе число: ");		
// 		num2 = scan.nextDouble ();
//         loger.info("Второе введенное число: " + num2); 
//         }catch (Exception e) {            
//             loger.log(Level.SEVERE,
//                     "не верный ввод второго числа", e);
//         }      
        
        
//         Scanner scan_oper = new Scanner(System.in);
//         System.out.print("выберете номер операции : 1-умножение, 2 - деление, 3 - сложение, 4- вычитание : " );
//         int operation =scan.nextInt();       
//         loger.info("Операция: " +  operation);   
//         switch (operation) {
//             case 1:
//               result = num1*num2;
//               loger.info("Результат: " +  result);
//                break;
//            case 2:
//                if (num2 !=0){result = num1/num2;
//                loger.info("Результат: " +  result);}
//                else loger.info("на ноль не делим! " );
//                 break;
//            case 3:
//                 result = num1+num2;
//                 loger.info("Результат: " +  result);
//                  break;
//            case 4:
//                result = num1-num2;
//                loger.info("Результат: " +  result);
//                   break;
//            default:
//            System.out.println("такой операции нет");
//            loger.info("нет такой операции : " +  operation);
//                break;
//        }

//    }    
// }