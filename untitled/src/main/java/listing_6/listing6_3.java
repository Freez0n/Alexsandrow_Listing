package listing_6;

import java.io.*;
public class listing6_3 {
    String cmd = null;
    Process proc = null;
    InputStream input = null;

    BufferedReader in = null;
    public listing6_3(String cmd) throws IOException {
        this.cmd = cmd;
        try {
            proc = Runtime.getRuntime().exec(cmd);
            input = proc.getInputStream();
            in = new BufferedReader(new InputStreamReader(input));
        } catch (IOException ioe) {
            throw ioe;
        }
    }
    public String readLine() throws IOException {
        String line = in.readLine();
        while ((line == "\r") | (line == "")) {
            line = in.readLine();
        }
        return line;
    }
    public void close() {
        try {
            in.close();
            input.close();
            proc.destroy();
            proc.destroy();

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }   finally {
            in = null;
            input = null;
            proc = null;
        }
    }
    public static void main(String[] args) {
        String cmd = null;
        listing6_3 ri = null;
        if (args.length > 0) {
            cmd = args[0];
        } else {
            cmd = "ping localhost";
        }

        try {
            ri = new listing6_3(cmd);

            String line = null;
            while ((line = ri.readLine()) != null)
                if (line != "\r") {
                    System.out.println("java:>" + line);
                }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }finally {
            ri.close();
            ri= null;
        }
    }
}
