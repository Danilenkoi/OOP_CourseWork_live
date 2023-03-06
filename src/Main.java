import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        HashMap<String,String> greetingWish = new HashMap<String,String>();

        greetingWish.put("Hello!", " have a nice day!");
        greetingWish.put("Привет!", " хорошего тебе дня!");

        System.out.println(greetingWish.size());

        // Пример цикла While

        Iterator iter = greetingWish.entrySet().iterator();
        while(iter.hasNext()) {
            Map.Entry sayHello = (Map.Entry) iter.next();
            System.out.println("Приветствие: " + sayHello.getKey() + "; Пожелание хорошего дня: " + sayHello.getValue());
        }

        // Пример цикла For

        for(Map.Entry sayHello1: greetingWish.entrySet()) {
            System.out.println("Приветствие: " + sayHello1.getKey() + "; Пожелание хорошего дня: " + sayHello1.getValue());

        }
    }
}