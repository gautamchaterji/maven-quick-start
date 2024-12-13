package clinic.programming.training;

public class Application {

    Application() {
        System.out.println("From inside application!!");
    }

    public static void main(String[] args) {
        System.out.println("Starting application.");
        Application app = new Application();

    }
}
