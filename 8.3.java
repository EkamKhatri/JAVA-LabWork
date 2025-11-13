// Three custom exception classes forming a hierarchy
class BaseException extends Exception {}
class MidLevelException extends BaseException {}
class TopLevelException extends MidLevelException {}
// Base class A
class A {
    void show() throws BaseException {
        throw new BaseException();
    }
}
// Derived class B
class B extends A {
    void show() throws MidLevelException {
        throw new MidLevelException();
    }
}
// Derived class C
class C extends B {
    void show() throws TopLevelException {
        throw new TopLevelException();
    }
}
// Main class
public class ExceptionHierarchyDemo {
    public static void main(String[] args) {
        System.out.print("Ekam Khatri, 24csu335\n");
        A obj = new C(); // Upcasting
        try {
            obj.show(); // This will throw TopLevelException
        } 
        catch (TopLevelException e) {
            System.out.println("Caught TopLevelException");
        } 
        catch (MidLevelException e) {
            System.out.println("Caught MidLevelException");
        } 
        catch (BaseException e) {
            System.out.println("Caught BaseException");
        }
    }
}











