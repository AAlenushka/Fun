package InputOutput;

import java.io.IOException;
import java.io.Reader;

/**
* Created by Alena on 22.12.2014.
*/


 class MyBufferedReader extends Reader {
    private Reader reader;

    @Override
    public int read(char[] cbuf, int off, int len) throws IOException {
        return reader.read(cbuf, off, len);
    }

    @Override
    public void close() throws IOException {
        reader.close();
    }

    //constructor:
    public MyBufferedReader(Reader reader) {
        this.reader = reader;
    }


    public String getString() throws IOException, InterruptedException {
        String s = null;
        int data = reader.read();
        char ch = 0X0;

        while (data != -1 || ch != '\n' || ch !='\r') {
            ch = (char) data;
            s += ch;
            data = reader.read();
        }
            Thread.sleep(1000);
        return s;
        }

    }


/*РЕАЛИЗОВАТЬ class HTMLLinkReader, который принимает в качестве 1 из параметров какой-то Reader.
Class должен иметь метод String getLink(), пока линки есть - он возвращает строки, линки закончились - он говорит 'null' */