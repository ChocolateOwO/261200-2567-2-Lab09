package LSP;

public class Eagle implements Flyable{
    @Override
    public void move() {
        System.out.println("Eagle moving...");
    }
    @Override
    public void fly() {
        System.out.println("Eagle flying...");
    }
}