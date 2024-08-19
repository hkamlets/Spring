import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        /*
        Создает и инициализирует контекст приложения Spring, используя конфигурацию, заданную в классе AppConfig
         */
        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean1 = (HelloWorld) applicationContext.getBean("helloworld");

        // Сравнение бинов HelloWorld по ссылке
        boolean helloWorldComparison = bean == bean1;
        System.out.println("Результат: " + helloWorldComparison);

        // Проверка бина cat

        Cat cat1 = (Cat) applicationContext.getBean("cat");
        Cat cat2 = (Cat) applicationContext.getBean("cat");
        System.out.println(cat1==cat2);
    }

    private static void assertNotEquals(Cat cat1, Cat cat2, String s) {
    }

}
