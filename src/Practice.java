class A {

    int ivar = 7;

    void m1() {
        System.out.println("A as m1, ");
    }

    void m2() {
        System.out.println("A as m2, ");
    }

    void m3() {
        System.out.println("A as m3, ");
    }
}
class B extends A{
    @Override
    void m1() {
        System.out.println("B as m1, ");
    }
}

class C extends B{
        void m3(){
            System.out.println("C as m3, "+(ivar+6));
        }
}



public class Practice {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        A a2 = new C();

        a2.m1();   // A as M1
        a2.m2();     //A as M2
        a2.m3();     //A as M3

    }
}
