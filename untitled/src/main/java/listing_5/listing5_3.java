package listing_5;

import java.io.*;
import sun.misc.*;
class BASE64Encoder{

    public String encode(byte[] bytes) {
        return null;
    }
}
class BASE64Decoder{

    public char[] decodeBuffer(String encoded) {
        return new char[0];
    }
}
class Base64Demo {
    public static void main(String[] args){
        if (args.length == 0){
            System.out.println("usage: Base64Demo text");
            System.exit(1);
        }
        String text = args[0];
        BASE64Encoder enc = new BASE64Encoder();
        String encoded = enc.encode(text.getBytes());
        enc = null;

        String decoded = null;
        BASE64Decoder dec = new BASE64Decoder();
        decoded = new String(dec.decodeBuffer(encoded));
        dec = null;
        System.out.println("Закодировано:" + encoded);
        System.out.println("Декодировано:" + decoded);

        encoded = null;
        decoded = null;
    }
}
