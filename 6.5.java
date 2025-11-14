abstract class Marks {
    abstract double getPercentage();
}
class A extends Marks {
    int mark1, mark2, mark3;
    A(int m1, int m2, int m3) {
        mark1 = m1;
        mark2 = m2;
        mark3 = m3;
    }
    double getPercentage() {
        return (mark1 + mark2 + mark3) / 3.0;
    }
}
class B extends Marks {
    int mark1, mark2, mark3, mark4;
    B(int m1, int m2, int m3, int m4) {
        mark1 = m1;
        mark2 = m2;
        mark3 = m3;
        mark4 = m4;
    }
    double getPercentage() {
        return (mark1 + mark2 + mark3 + mark4) / 4.0;
    }
}
public class exp6_5 {
    public static void main(String[] args) {
        A studentA = new A(85, 90, 95);
        B studentB = new B(70, 75, 80, 85);
        System.out.println("Percentage of Student A: " + studentA.getPercentage() + "%");
        System.out.println("Percentage of Student B: " + studentB.getPercentage() + "%");
    }
}

