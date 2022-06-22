package class18;

public class Task6 {
    private Task6() {
        System.out.println("private");
    }
    Task6(String name) {
        System.out.println("default");
    }
    protected Task6(int num){
        System.out.println("protected");
    }
    public Task6(boolean flag){
        System.out.println("public");
    }
    public static void main(String[] args) {
        new Task6();
        new Task6("lovely Zombie");
        new Task6(15);
        new Task6(true);


    }
}

