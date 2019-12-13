package su.svn.chap10;

public class ThrowsDemo {
    public static class Listing10 {
        // Demonstrate throw.
        static void demoproc() {
            try {
                throw new NullPointerException("demo");
            } catch (NullPointerException e) {
                System.out.println("Caught inside demoproc.");
                throw e; // re-throw the exception
            }
        }

        public static void main(String args[]) {
            try {
                demoproc();
            } catch (NullPointerException e) {
                System.out.println("Recaught: " + e);
            }
        }
    }

    public static class Listing11 {
        // // This program contains an error and will not compile.
        // static void throwOne() {
        //     System.out.println("Inside throwOne.");
        //     throw new IllegalAccessException("demo");
        // }
        //
        // public static void main(String args[]) {
        //     throwOne();
        // }
    }

    public static class Listing12 {
        // This is now correct.
        static void throwOne() throws IllegalAccessException {
            System.out.println("Inside throwOne.");
            throw new IllegalAccessException("demo");
        }

        public static void main(String args[]) {
            try {
                throwOne();
            } catch (IllegalAccessException e) {
                System.out.println("Caught " + e);
            }
        }
    }
}
