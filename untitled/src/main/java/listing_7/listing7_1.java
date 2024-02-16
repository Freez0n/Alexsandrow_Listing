package listing_7;

import java.io.File;

public class listing7_1 {
    public static void deletedDir(String dirPath) {

        File walkDir = new File(dirPath);

        String[] dirList = walkDir.list();

        for (int i = 0; i < dirList.length; i++) {

            File f = new File(dirList[i]);
            if (f.isDirectory()) {

                deletedDir(f.getPath());
            }

            f.delete();
        }
        walkDir.delete();
    }
}
