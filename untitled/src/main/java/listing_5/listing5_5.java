package listing_5;

import java.io.File;

class listing5_5{
    public static void sameDateToDirFiles(String dir) {

        long modifiled = System.currentTimeMillis();
        File walkDir = new File(dir);
        String[] dirList = walkDir.list();
        for (int i = 0; i < dirList.length; i++) {

            File f = new File(dirList[i]);
            if (f.isDirectory()) {
                sameDateToDirFiles(f.getPath());
                continue;
            }
            f.setLastModified(modifiled);
        }
    }
}

