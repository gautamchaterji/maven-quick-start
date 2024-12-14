package clinic.programming.training;

import java.util.ArrayList;
import java.util.List;

public class Application {

    Application() {
        System.out.println("From inside application!!");
    }

    private void displayList() {
        List<String> list = new ArrayList<>();
        list.add("USA");
        list.add("Canada");
        list.add("Mexico");
        list.add("Panama");
        list.add("Costa Rica");

        list.stream().forEach(x -> System.out.println(x));
    }

    public static void main(String[] args) {
        System.out.println("Starting application.");
        Application app = new Application();
        app.displayList();
    }
}
