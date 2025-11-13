interface A {
    void methodA();
}
interface B {
    void methodB();
}
interface C extends A, B {
    void methodC();
}
class Test implements C {
    public void methodA() {
        System.out.println("From Interface A");
    }
    public void methodB() {
        System.out.println("From Interface B");
    }
    public void methodC() {
        System.out.println("From Interface C");
    }
}
public class exp6_1c {
    public static void main(String[] args) {
        System.out.print("Ekam Khatri, 24csu335\n");
        Test t = new Test();
        t.methodA();
        t.methodB();
        t.methodC();
    }
}


