package homeWorks.src.main.HomeWork5;

// Написать функцию, добавляющую префикс к каждому из набора файлов,
// названия которых переданы ей в качестве параметров через пробел.

import java.io.File;
public class AddPrefixToFiles {
    public static void main(String[] args) {
        String prefix = "pre_";
        for (String fileName : args) {
            File file = new File(fileName);
            String newFileName = prefix + file.getName();
            File newFile = new File(file.getParent(), newFileName);
            if (file.renameTo(newFile)) {
                System.out.println("Renamed " + file.getName() + " to " + newFile.getName());
            } else {
                System.out.println("Failed to rename " + file.getName());
            }
        }
    }

}
