import task.Task;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Task t = new Task();
        Task j = new Task();
        System.out.println(t.equals(j));
        System.out.println(t);
    }
}
