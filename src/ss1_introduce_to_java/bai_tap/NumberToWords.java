package ss1_introduce_to_java.bai_tap;
import  java.util.Scanner;
public class NumberToWords {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Nhập số nguyên không âm (tối đa 3 chữ số): ");
//        int number = scanner.nextInt();
//
//        if (number < 0 || number > 999) {
//            System.out.println("Out of ability");
//        } else {
//            if (number <= 10 && number >= 0) {
//                switch (number) {
//                    case 0:
//                        System.out.println("zero");
//                        break;
//                    case 1:
//                        System.out.println("one");
//                        break;
//                    case 2:
//                        System.out.println("two");
//                        break;
//                    case 3:
//                        System.out.println("three");
//                        break;
//                    case 4:
//                        System.out.println("four");
//                        break;
//                    case 5:
//                        System.out.println("five");
//                        break;
//                    case 6:
//                        System.out.println("six");
//                        break;
//                    case 7:
//                        System.out.println("seven");
//                        break;
//                    case 8:
//                        System.out.println("eight");
//                        break;
//                    case 9:
//                        System.out.println("nine");
//                        break;
//                    case 10:
//                        System.out.println("ten");
//                        break;
//                    default:
//                        System.out.println("out of ability");
//                        break;
//                }
//            } else if (number > 10 && number <= 20) {
//                int one = number % 10;
//                switch (one) {
//                    case 0:
//                        System.out.println("Twenty");
//                        break;
//                    case 1:
//                        System.out.println("eleven");
//                        break;
//                    case 2:
//                        System.out.println("twelve");
//                        break;
//                    case 3:
//                        System.out.println("thirteen");
//                        break;
//                    case 4:
//                        System.out.println("fourteen");
//                        break;
//                    case 5:
//                        System.out.println("fifteen");
//                        break;
//                    case 6:
//                        System.out.println("sixteen");
//                        break;
//                    case 7:
//                        System.out.println("seventeen");
//                        break;
//                    case 8:
//                        System.out.println("eightteen");
//                        break;
//                    case 9:
//                        System.out.println("nineteen");
//                        break;
//                    default:
//                        System.out.println("out of ability");
//                        break;
//                }
//            } else if (number > 20 && number <= 99) {
//                int two = number / 10;
//                int ones = number % 10;
//                switch (two) {
//                    case 2:
//                        System.out.print("twenty");
//                        break;
//                    case 3:
//                        System.out.print("thirty");
//                        break;
//                    case 4:
//                        System.out.print("fourty");
//                        break;
//                    case 5:
//                        System.out.print("fifty");
//                        break;
//                    case 6:
//                        System.out.print("sixty");
//                        break;
//                    case 7:
//                        System.out.print("seventy");
//                        break;
//                    case 8:
//                        System.out.print("eighty");
//                        break;
//                    case 9:
//                        System.out.print("ninety");
//                        break;
//                    default:
//                        System.out.print("out of ability");
//                        break;
//                }
//                switch (ones) {
//                    case 0:
//                        System.out.println(" zero");
//                        break;
//                    case 1:
//                        System.out.println(" one");
//                        break;
//                    case 2:
//                        System.out.println(" two");
//                        break;
//                    case 3:
//                        System.out.println(" three");
//                        break;
//                    case 4:
//                        System.out.println(" four");
//                        break;
//                    case 5:
//                        System.out.println(" five");
//                        break;
//                    case 6:
//                        System.out.println(" six");
//                        break;
//                    case 7:
//                        System.out.println(" seven");
//                        break;
//                    case 8:
//                        System.out.println(" eight");
//                        break;
//                    case 9:
//                        System.out.println(" nine");
//                        break;
//                    default:
//                        System.out.println("out of ability");
//                        break;
//                }
//
//            } else if (number >= 100 && number < 1000) {
//                int three = number / 100;
//                int two = (number % 100) / 10;
//                int ones = number % 10;
//                switch (three) {
//                    case 1:
//                        System.out.print("One hundred");
//                        break;
//                    case 2:
//                        System.out.print("Two hundred");
//                        break;
//                    case 3:
//                        System.out.print("Three hundred");
//                        break;
//                    case 4:
//                        System.out.print("Four hundred");
//                        break;
//                    case 5:
//                        System.out.print("Five hundred");
//                        break;
//                    case 6:
//                        System.out.print("Six hundred");
//                        break;
//                    case 7:
//                        System.out.print("Seven hundred");
//                        break;
//                    case 8:
//                        System.out.print("Eight hundred");
//                        break;
//                    case 9:
//                        System.out.print("Nine hundred");
//                        break;
//                    default:
//                        System.out.print("out of ability");
//                        break;
//                }
//                switch (two) {
//                    case 2:
//                        System.out.print(" twenty");
//                        break;
//                    case 3:
//                        System.out.print(" thirty");
//                        break;
//                    case 4:
//                        System.out.print(" fourty");
//                        break;
//                    case 5:
//                        System.out.print(" fifty");
//                        break;
//                    case 6:
//                        System.out.print(" sixty");
//                        break;
//                    case 7:
//                        System.out.print(" seventy");
//                        break;
//                    case 8:
//                        System.out.print(" eighty");
//                        break;
//                    case 9:
//                        System.out.print(" ninety");
//                        break;
//                    default:
//                        System.out.print("out of ability");
//                        break;
//                }
//                switch (ones) {
//                    case 0:
//                        System.out.println(" zero ");
//                        break;
//                    case 1:
//                        System.out.println(" one ");
//                        break;
//                    case 2:
//                        System.out.println(" two ");
//                        break;
//                    case 3:
//                        System.out.println(" three ");
//                        break;
//                    case 4:
//                        System.out.println(" four ");
//                        break;
//                    case 5:
//                        System.out.println(" five ");
//                        break;
//                    case 6:
//                        System.out.println(" six ");
//                        break;
//                    case 7:
//                        System.out.println(" seven ");
//                        break;
//                    case 8:
//                        System.out.println(" eight ");
//                        break;
//                    case 9:
//                        System.out.println(" nine ");
//                        break;
//                    default:
//                        System.out.println("out of ability");
//                        break;
//                }
//            }
//        }
//        scanner.close();
//    }
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Input Your Number: ");
    String valueOnes = "";
    String valueTens = "";
    String valueHundreds = "Hundred";
    int number = Integer.parseInt(scanner.nextLine());
    int one = 0;
    int ten = 0;
    int hundred = 0;
    if (number < 0 || number >= 1000) {
        System.out.println("out of ability");
    } else if (number == 0) {
        System.out.println("Zero");
    } else if (number < 100) {
        one = number % 10;
        ten = number / 10;
    } else {
        hundred = number / 100;
        one = (number % 100) % 10;
        ten = (number % 100) / 10;
    }
    switch (one) {
        case 1:
            valueOnes = "One";
            break;
        case 2:
            valueOnes = "Two";
            break;
        case 3:
            valueOnes = "Three";
            break;
        case 4:
            valueOnes = "Four";
            break;
        case 5:
            valueOnes = "Five";
            break;
        case 6:
            valueOnes = "Six";
            break;
        case 7:
            valueOnes = "Seven";
            break;
        case 8:
            valueOnes = "Eight";
            break;
        case 9:
            valueOnes = "Nine";
            break;
    }
    switch (ten) {
        case 1:
            switch (one) {
                case 0:
                    valueOnes = "Ten";
                    break;
                case 1:
                    valueOnes = "Eleven";
                    break;
                case 2:
                    valueOnes = "Twelve";
                    break;
                case 3:
                    valueOnes = "Thirteen";
                    break;
                case 4:
                    valueOnes = "Fourteen";
                    break;
                case 5:
                    valueOnes = "Fifteen";
                    break;
                case 6:
                    valueOnes = "Sixteen";
                    break;
                case 7:
                    valueOnes = "Seventeen";
                    break;
                case 8:
                    valueOnes = "Eighteen";
                    break;
                case 9:
                    valueOnes = "Nineteen";
                    break;
            }
            break;
        case 2:
            valueTens = "Twenty";
            break;
        case 3:
            valueTens = "Thirty";
            break;
        case 4:
            valueTens = "Forty";
            break;
        case 5:
            valueTens = "Fifty";
            break;
        case 6:
            valueTens = "Sixty";
            break;
        case 7:
            valueTens = "Seventy";
            break;
        case 8:
            valueTens = "Eighty";
            break;
        case 9:
            valueTens = "Ninety";
            break;
    }
    switch (hundred) {
        case 1:
            valueHundreds = "One " + valueHundreds;
            break;
        case 2:
            valueHundreds = "Two " + valueHundreds;
            break;
        case 3:
            valueHundreds = "Three " + valueHundreds;
            break;
        case 4:
            valueHundreds = "Four " + valueHundreds;
            break;
        case 5:
            valueHundreds = "Five " + valueHundreds;
            break;
        case 6:
            valueHundreds = "Six " + valueHundreds;
            break;
        case 7:
            valueHundreds = "Seven " + valueHundreds;
            break;
        case 8:
            valueHundreds = "Eight " + valueHundreds;
            break;
        case 9:
            valueHundreds = "Nine " + valueHundreds;
            break;
    }
    if (!(one == 0 && ten == 0)) {
        valueHundreds = valueHundreds + " and";
    }
    if (number < 20) {
        System.out.println(valueOnes);
    } else if (number < 100) {
        System.out.println(valueTens + " " + valueOnes);
    } else if (number < 1000) {
        System.out.println(valueHundreds + valueTens + " " + valueOnes);
    }
}
}
