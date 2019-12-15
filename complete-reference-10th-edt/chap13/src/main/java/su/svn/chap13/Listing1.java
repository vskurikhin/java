package su.svn.chap13;

import java.io.*;

public class Listing1 {

    // Use a BufferedReader to read characters from the console.
    static class BRRead {
        public static void main(String args[]) throws IOException {
            char c;
            BufferedReader br = new
                    BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter characters, 'q' to quit.");
            // read characters
            do {
                c = (char) br.read();
                System.out.println(c);
            } while (c != 'q');
        }
    }
}
