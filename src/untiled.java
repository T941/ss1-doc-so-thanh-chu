import java.util.Scanner;

public class untiled {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number :");
        int number = scanner.nextInt();
        int remainder = number % 10;
        int division = number / 10;
        if (number < 10) {
            switch (number) {
                case 0:
                    System.out.println("zero");
                    break;
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
            }
        }
        else if (number >= 10 && number < 20) {

            switch (remainder) {
                case 0:
                    System.out.println("ten");
                    break;
                case 1:
                    System.out.println("eleven");
                    break;
                case 2:
                    System.out.println("twelve");
                    break;
                case 3:
                    System.out.println("thirteen");
                    break;
                case 4:
                    System.out.println("fourteen");
                    break;
                case 5:
                    System.out.println("fiveteen");
                    break;
                case 6:
                    System.out.println("sixteen");
                    break;
                case 7:
                    System.out.println("seventeen");
                    break;
                case 8:
                    System.out.println("eighteen");
                    break;
                case 9:
                    System.out.println("nineteen");
                    break;
            }
        }
        else if (number >= 20 && number < 100) {
            String str = "";
            switch (division) {
                case 2:
                    str += "twenty"+" ";
                    break;
                case 3:
                    str += "thirty"+" ";
                    break;
                case 4:
                    str += "forty"+" ";
                    break;
                case 5:
                    str += "fifty"+" ";
                    break;
                case 6:
                    str += "sixty"+" ";
                    break;
                case 7:
                    str += "seventy"+" ";
                    break;
                case 8:
                    str += "eighty"+ " ";
                case 9:
                    str += "ninety"+" ";
            }
            switch (remainder) {
                case 1:
                    str+="one";
                    break;
                case 2:
                    str+="two";
                    break;
                case 3:
                    str+="three";
                    break;
                case 4:
                    str+="four";
                    break;
                case 5:
                    str+="five";
                    break;
                case 6:
                    str+="six";
                    break;
                case 7:
                    str+="seven";
                    break;
                case 8:
                    str+="eight";
                    break;
                case 9:
                    str+="nine";
                    break;
            }
            System.out.println(str);
        }else {
            System.out.println("đợi cập nhật thêm mới đoc được.");
        }
    }
}
