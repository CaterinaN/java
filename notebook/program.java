

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class program {
    
    public static void main(String[] args) {
        Notebook notebook1 = new Notebook("Asus", "8", "512", "Windows", "grey");
        Notebook notebook2 = new Notebook("Lenovo", "8", "256", "Lunex", "red");
        Notebook notebook3 = new Notebook("Xiaomi", "8", "256", "Windows", "black");
        Notebook notebook4 = new Notebook("HP", "12", "256", "Windows", "grey");
        Notebook notebook5 = new Notebook("Honor", "16", "512", "Без ОС", "black");
  
        Set<Notebook> notebooks = new HashSet<>(List.of(notebook1, notebook2,
              notebook3, notebook4, notebook5));
  
        Map<String, String> sel = selectCriteria();
        sort(sel, notebooks);
  
     }
  
     public static String scanner() {
        Scanner scanner = new Scanner(System.in);
        String scan = scanner.nextLine();
        return scan;
     }
  
     public static Map<String, String> selectCriteria() {
        Map<String, String> resultCriterias = new HashMap<>();
        while (true) {
           System.out.println("Выбор ноутбука по критериям '1', посмотреть подходящие ноутбуки '2'");
           String question = scanner();
           if (question.equals("2")) {
              break;
           } else {
  
              System.out.println(
                    "Введите цифру, соответствующую необходимому критерию: \n 1 - Название \n 2 - ОЗУ \n 3 - Объем ЖД \n 4 - Операционная система \n 5 - Цвет");
              String key = scanner();
              System.out.println("Введите значения для выбранного критерия: ");
              String value = scanner();
  
              resultCriterias.put(key, value);
           }
        }
        System.out.println(resultCriterias);
        return resultCriterias;
  
     }
  
     public static void sort(Map<String, String> criterias, Set<Notebook> notebooks) {
  
        Set<Notebook> temp = new HashSet<>(notebooks);
        for (Notebook notebook : notebooks) {
  
           for (Object pair : criterias.keySet()) {
  
              if (pair.equals("1") && !notebook.getName().equals(criterias.get(pair))) {
                 temp.remove(notebook);
              }
              for (Object pair1 : criterias.keySet()) {
  
                 if (pair1.equals("2") && !notebook.getRam().equals(criterias.get(pair1))) {
                    temp.remove(notebook);
  
                 }
                 for (Object pair2 : criterias.keySet()) {
  
                    if (pair2.equals("3") && !notebook.getHardDisk().equals(criterias.get(pair2))) {
                       temp.remove(notebook);
  
                    }
                    for (Object pair3 : criterias.keySet()) {
  
                       if (pair3.equals("4") && !notebook.getOperatingSystem().equals(criterias.get(pair3))) {
                          temp.remove(notebook);
  
                       }
                       for (Object pair4 : criterias.keySet()) {
  
                          if (pair4.equals("5") && !notebook.getColour().equals(criterias.get(pair4))) {
                             temp.remove(notebook);
  
                          }
                       }
                    }
                 }
              }
           }
  
        }
        if (temp.isEmpty()) {
           System.out.println("ничего не найдно");
        } else {
           System.out.println("Подходящие ноутбуки: \n" + temp.toString());
        }
  
     }
  
}
