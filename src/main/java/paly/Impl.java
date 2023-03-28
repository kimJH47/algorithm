package paly;

public class Impl implements A {
    private A.b inner;

    public Impl() {
        this.inner = new Inner();
    }

    public Inner aMethod() {
        int key = Inner.KEY;
        inner.bMethod();
        return new Inner();
    }


    static class Inner implements A.b {
        private final static int KEY = 10;
        @Override
        public void bMethod() {
            b.methodB();
        }
        public void cMethod() {

        }

    }
}
