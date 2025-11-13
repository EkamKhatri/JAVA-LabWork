class Parent {
    void display() {
        System.out.println("This is the Parent class.");
    }
}
interface One {
    void methodOne();
}
interface Two {
    void methodTwo();
}
class Child extends Parent implements One, Two {
    public void methodOne() {
        System.out.println("Implemented method from Interface One.");
    }
    public void methodTwo() {
        System.out.println("Implemented method from Interface Two.");
    }
}
public class exp6_1a{
    public static void main(String[] args) {
        System.out.print("Ekam Khatri, 24csu335\n");
        Child obj = new Child();
        obj.display();
        obj.methodOne();
        obj.methodTwo();
    }
}


