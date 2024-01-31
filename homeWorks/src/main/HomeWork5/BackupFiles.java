package homeWorks.src.main.HomeWork5;

//Написать функцию, создающую резервную копию всех файлов в директории(без поддиректорий) во вновь созданную папку ./backup

import java.io.*;

public class BackupFiles {
    public static void main(String[] args) {
        File sourceDir = new File("homeWorks/src/main/HomeWork5/source");
        File backupDir = new File("homeWorks/src/main/HomeWork5/backup");

        if (!backupDir.exists()) {
            backupDir.mkdir();
        }

        File[] files = sourceDir.listFiles();

        for (File file : files) {
            if (file.isFile()) {
                try {
                    FileInputStream fis = new FileInputStream(file);
                    FileOutputStream fos = new FileOutputStream(backupDir.getPath() + "/" + file.getName());

                    byte[] buffer = new byte[1024];
                    int length;

                    while ((length = fis.read(buffer)) > 0) {
                        fos.write(buffer, 0, length);
                    }

                    fis.close();
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
