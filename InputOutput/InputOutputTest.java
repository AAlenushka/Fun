package InputOutput;

import java.io.*;
import java.net.URL;

public class InputOutputTest {
    public static void main(String[] args) throws IOException, InterruptedException {

        InputStream src = new URL("http://www.bottegaverde.at/").openStream();
       OutputStream dst = new FileOutputStream("C:/Users/Alena/bottegaverde.txt");

        //MyBufferedReader buf = new MyBufferedReader(new FileReader("/home/viktor/input.txt"));
        //Writer dst = new FileWriter("/home/viktor/input2.txt");

        //String s = buf.getString();
        //while(s != null){
            //dst.write(s);
            //s = buf.getString();
        //}

        //buf.close();
        //dst.close();



        copy(src,dst);
        copy(src, System.out);
        copy(new FileInputStream("C:/Users/Alena/bottegaverde.txt"),System.out);

    }

    public static void copy(InputStream src, OutputStream dst)throws IOException {

        while(true) {
            int data = src.read();
            if (data != -1) {

                dst.write(data);
            } else {
                return;
            }

        }

     }

}

