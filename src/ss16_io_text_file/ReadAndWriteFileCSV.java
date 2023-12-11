package ss16_io_text_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFileCSV {
    public static void writeListStringToCSV(String pathFile, List<String> stringList, boolean append){
        File file = new File(pathFile);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file,append);
            bufferedWriter= new BufferedWriter(fileWriter);
            for (String line: stringList) {
                bufferedWriter.write(line);
                // xuống dòng
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("lỗi ghi file");
        }
    }
    // đọc file
    public static List<String> readFileCSV(String pathFile){
        List<String> stringList = new ArrayList<>();
        File file = new File(pathFile);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line ="";
            while ((line=bufferedReader.readLine())!=null){
                stringList.add(line);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            System.out.println("Lỗi đọc file");
        }
        return stringList;
    }
    public static void deleteDataFile(String filePatch) {
        File file = new File(filePatch);
        FileWriter fileWriter;
        BufferedWriter bufferedWriter;
        try {
            fileWriter = new FileWriter(file, false);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("");
            bufferedWriter.close();
            fileWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");

        } catch (IOException e) {
            System.out.println("Error, we got some problems to delete data");
        }
    }
}
