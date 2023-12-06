package ss15.ss15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class DemoException {
    public static void main(String[] args){
        System.out.println("-----------------Bắt đầu chương trình-------------------");
//        Scanner scanner = new Scanner(System.in);
//        boolean flag;
//        int age=0;
//        do {
//            flag = false;
//            try {
//                System.out.println("nhập tuổi");
//               age = Integer.parseInt(scanner.nextLine());
//                checkAge(age);
//            } catch (AgeException e) {
//                System.out.println("tuổi không hợp lý");
//                System.out.println(e.getMessage());
//               flag = true;
//            }catch (NumberFormatException e){
//                System.out.println("tuổi không phải là số");
//                flag = true;
//            }
//        }while (flag);
//        System.out.println("Tuổi vừa nhập là: "+ age);
         method1();
        System.out.println("-----------------Kết thúc chương trình------------------");
    }
    public static void method1() {
        int[] arr = {10, 20, 30, 40, 50};
        Scanner scanner = new Scanner(System.in);
        int element =0;
        System.out.println("nhập vào index mà muốn lấy ra");
        int i =-1;

        try {
            i = Integer.parseInt(scanner.nextLine());
            System.out.println("vị trí mới nhập " + i);
            element = arr[i];
            return;

        }
        catch (NumberFormatException e){
            // công việc cần thực hiện khi có Ex
            System.out.println("lỗi do nhập chuỗi ");
            System.out.println("lấy phần tử đầu tiên của mảng");
            i=0;
            element = arr[i];
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("do nhập index ngoài mảng");
            i = arr.length-1;
            element = arr[i];
        }finally {
            System.out.println("finally luôn chạy");
        }

        System.out.println("phần tử cần lấy " + element);
    }
    public static void readFile(String filePath) throws FileNotFoundException {
        File file = new File(filePath);
            FileReader fileReader = new FileReader(file);

    }

    // custom Exception ( do LTV tự định nghĩa => là Checked Exception
    public static boolean checkAge(int age) throws AgeException {
        if (age<0){
            throw new AgeException("Tuổi nhỏ hơn không");
        }else if (age>100){
            throw new AgeException("Tuổi lớn hơn 100");
        }
        // tuôi hợp lý
        return true;
    }


}
