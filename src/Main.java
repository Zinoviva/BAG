import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // заводиим сканер

        String[] operation = {"1.Добавить", "2.Показать", "3.Удалить"};  //список операций
        ArrayList<String> list = new ArrayList<>();  // список

        while (true) {  //в цикле условие задачи
            System.out.println("Выберите операцию:");  //показываем наши операции какие есть
            for (int i = 0; i < operation.length; i++) {
                System.out.println((operation[i]).toString());
            }

            String input = scanner.nextLine();
            if (input.equals("4"))   //выход из программы если вводить 4,5,6 и тд, чтобы не падало в ошибку
                System.exit(0);

            else if (input.equals("1")) {   //добавить
                System.out.println("Какую покупку хотите добавить?");
                String eat = scanner.nextLine();

                list.add(eat);  //добавляем в лист товары путем ввода пользователем вторым сканером
                System.out.println("Итого в списке покупок:" + list.size());

            } else if (input.equals("2")) {  //показать
                System.out.println("Итого в списке покупок:" + " " + list.size() + "товара:" + list);

            } else if (input.equals("3")) {    //удалить
                System.out.println("Какую покупку хотите удалить? Введите номер или наименование" + " " + list);  //товары в корзине показываем клиенту
                String removed = scanner.nextLine();  //считать что ввели третий сканер

                if (list.contains(removed)) {  //если лист содержит введенное значение то его нужно удалить
                    list.remove(removed);
                    System.out.println("Покупка" + removed + "удалена, список покупок:" + list);
                } else {
                    int z = Integer.parseInt(removed) - 1;   //номер товара
                    list.remove(z);
                    System.out.println("Покупка" + removed + "удалена, список покупок:" + list);
                }
            }
        }
    }//аргс
}  //мейн




