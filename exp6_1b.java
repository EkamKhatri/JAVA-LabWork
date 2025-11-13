interface A {
    void methodA();
}
interface B extends A {
    void methodB();
}
class Test implements B {
    public void methodA() {
        System.out.println("From Interface A");
    }
    public void methodB() {
        System.out.println("From Interface B");
    }
}
public class exp6_1b {
    public static void main(String[] args) {
        System.out.print("Ekam Khatri, 24csu335\n");
        Test t = new Test();
        t.methodA();
        t.methodB();
    }
}

