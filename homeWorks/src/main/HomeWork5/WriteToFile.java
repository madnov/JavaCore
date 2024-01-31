package homeWorks.src.main.HomeWork5;

// Предположить,что числа в исходном массиве из 9 элементов имеют диапазон[0,3],и представляют собой,например,
// состояния ячеек поля для игры в крестикинолики,где 0 – это пустое поле,1 – это поле с крестиком,2 – это поле с ноликом,
// 3 – резервное значение.Такое предположение позволит хранить в одном числе типа int всё поле 3х3.Записать в файл 9значений так,
// чтобы они заняли три байта.

import java.io.*;

public class WriteToFile {
    public static void main(String[] args) {
        int[] values = {1, 0, 3, 2, 1, 2, 0, 3, 1};

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("homeWorks/src/main/HomeWork5/source/file.bin"))) {
            int packedValues = 0;

            for (int i = 0; i < values.length; i++) {
                packedValues |= (values[i] << (i * 2));
            }

            dos.writeByte(packedValues & 0xFF);
            dos.writeByte((packedValues >> 8) & 0xFF);
            dos.writeByte((packedValues >> 16) & 0xFF);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
