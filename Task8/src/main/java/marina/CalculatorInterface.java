package marina;

import java.util.Scanner;

public class CalculatorInterface {
    private Calculator calculator;

    public CalculatorInterface() {
        calculator = new Calculator();
    }

    public void make() {

        try (Scanner scanner = new Scanner(System.in)) {
            CalculatorOperation currentOperation;
            while (true) {
                System.out.println("Введите тип операции (+,-,/,*) для вычисления. Для выхода нажмите r:");
                String operation = scanner.nextLine();
                currentOperation = CalculatorOperation.parse(operation);

                if (currentOperation == CalculatorOperation.Unknown)
                {
                    System.out.println("Операция введена некорректно!");
                } else if (currentOperation == CalculatorOperation.EXIT) {
                    break;
                }
                else
                    {
                    boolean inputCorrect;
                    double a = 0;
                    double b = 0;
                    inputCorrect = false;
                    while (!inputCorrect) {
                        System.out.println("Введите первое число:");
                        String inputA = scanner.nextLine();
                        try {
                            a = Double.parseDouble(inputA);
                            inputCorrect = true;
                        } catch (NumberFormatException nex) {
                            System.out.println("Можно вводить только числа!");
                        }
                    }
                    inputCorrect = false;
                    while (!inputCorrect) {
                        System.out.println("Введите второй аргумент:");
                        String inputB = scanner.nextLine();
                        try {
                            b = Double.parseDouble(inputB);
                        } catch (NumberFormatException nex) {
                            System.out.println("Можно вводить только числа!");
                            continue;
                        }
                        inputCorrect = true;
                    }

                    switch (currentOperation) {
                        case Addition:
                            System.out.printf("Сумма равна: %.4f\n", calculator.Addition(a, b));
                            break;
                        case Subtraction:
                            System.out.printf("Разность равна: %.4f\n", calculator.Subtraction(a, b));
                            break;
                        case Multiplication:
                            System.out.printf("Произведение равно: %.4f\n", calculator.Multiplication(a, b));
                            break;
                        case Division:
                            System.out.printf("Частное равно: %.4f\n", calculator.Division(a, b));
                            break;
                    }
                }
            }
        }
    }
}
