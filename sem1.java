import java.util.Scanner;
// 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

/**
 * sem1
 */
// public class sem1 {

//     public static void main(String[] args) {
//             Scanner iScanner = new Scanner(System.in);
//             System.out.printf("введите n: ");
//             int n = iScanner.nextInt();
//             int res =0;
//             int fac=1;

//             for (int i = 1; i <= n; i++) {
//                 res = res +i;  
//             }

//             for (int i = 1; i <= n; i++) {
//                 fac = fac *i;  
//             }


//             System.out.println(" n-ое треугольного число = "+ res);
//             System.out.println(" n! = "+ fac);
//     }
// }


// 2. Вывести все простые числа от 1 до 1000 

/**
 * sem1
 */
// public class sem1 {

//     public static void main(String[] args) {
//         int x, y;
//         for (x = 2; x <1000; x++) {
//             y = 0;
//             for (int i = 1; i <= x; i++) {
//                 if (x % i == 0)
//                     y++;
//                  }
//                 if (y == 2)
//                 System.out.print(x+" ");
 
//         }
//     }
        
//     }


// 3. Реализовать простой калькулятор

/**
 * sem1
 */
public class sem1 {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
            System.out.print("введите первое число: ");
            double a = iScanner.nextDouble();
            System.out.print("введите второе число: ");
            double b = iScanner.nextDouble();
            double result =0;
            System.out.print("выберете номер операции : 1-умножение, 2 - деление, 3 - сложение, 4- вычитание : " );
            int c =iScanner.nextInt();
            switch (c) {
                 case 1:
                   result = a*b;
                    break;
                case 2:
                    result = a/b;
                     break;
                case 3:
                     result = a+b;
                      break;
                case 4:
                    result = a-b;
                       break;
                default:
                    break;
            }

            System.out.println("ресультат операции ="+result);


        
    }
}


