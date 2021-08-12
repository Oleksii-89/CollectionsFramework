package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(); // По конвенции листы нужно ссылать на интерфейс
        // от которого он имплементируется.

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        System.out.println(list); // Встроин метод toString

        System.out.println(list.get(0)); // Выводит содержимое по индексу ячейки
        System.out.println(list.get(5));
        System.out.println(list.get(9));

        System.out.println(list.size()); // Выводит размер листа

        // Проходит по всем элементам листа
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i);
        }

        // Проходит по всем элементам листа 2
        for(Integer x : list){
            System.out.println(x);
        }

        // Удаляет объект под введенным индексом
        list.remove(5); // Этот метод не еффективен. При большом количестве удалений
        //лучше выбрать другой вид листа.
        System.out.println(list);

    }
}
