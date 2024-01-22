import java.util.Scanner;

public class Calculator {
    public static String calc(String input) throws Exception {
        String[] cup = input.split ("\\s+");
        if (cup.length != 3){
            throw new RuntimeException("Строка не является математической операцией");
        }
        int a = Integer.parseInt(cup[0]);
        int b = Integer.parseInt(cup[2]);
        char op = cup[1].charAt(0);
        int result = switch (op) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> a / b;
            default -> throw new Exception("Строка не является математической операцией");
        };

        if(a < 1 || a > 10 || b < 1 || b > 10){
            throw new Exception("Введите цифры от 1 до 10!");
        }

        return Integer.toString(result);
    }

    public static void main(String[] args) throws Exception {
        Scanner scr = new Scanner(System.in);
        while (true){
            System.out.println("Введите данные, (пример: 1 + 2): ");
            String input = scr.nextLine();
            if(input.equals("exit")){
                break;
            }
            String result = calc(input);
            System.out.println("Result: "+result);

        }
    }
}