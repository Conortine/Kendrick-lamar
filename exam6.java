package Java_Exam;

class Outer {
    int value=10;

    class Inner {
        int value=20;
        void method1() {
            int value=30;
            System.out.println(value);
            System.out.println(this.value);
            System.out.println(Outer.this.value);
        }
    } // Inner클래스의 끝
} // Outer클래스의 끝

public class exam6 {
    public static void main(String args[]) {

        Outer outer = new Outer();

        Outer.Inner inner = outer.new Inner();

        inner.method1();
    }
}

