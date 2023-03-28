package paly;

import paly.Impl.Inner;

public interface A {
    Inner aMethod();
    interface b {
        void bMethod();
        public static void methodB() {
            System.out.println("apply");
        }
    }
}
