import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nЗадание 1:");
        Scanner input = new Scanner(System.in);
        System.out.print("Введите количество строчек и столбцов массива: ");
        int rows = input.nextInt();
        int cols = input.nextInt();
        input.nextLine();
        double[][] array = new double[rows][cols];
        System.out.println("Введите массив:");
        for (int i = 0; i < rows; i++) {
            String line = input.nextLine();
            String[] numbers = line.split(" ");
            for (int j = 0; j < cols; j++) {
                array[i][j] = Double.parseDouble(numbers[j]);
            }
        }
        Location location = locateLargest(array);
        System.out.printf("Наибольший элемент массива, равный %.1f, находится в позиции (%d, %d)\n",
                location.maxValue, location.row, location.column);

        System.out.println("\nЗадание 2:");
        MyTime time1 = new MyTime();
        MyTime time2 = new MyTime(555550000L);
        MyTime time3 = new MyTime(5, 23, 55);
        System.out.println("Текущее время: " + time1);
        System.out.println("Время от миллисекунд: " + time2);
        System.out.println("Время в часах, минутах и секундах: " + time3);

        System.out.println("\nЗадание 3:");
        MyInteger myInt1 = new MyInteger(12);
        MyInteger myInt2 = new MyInteger(17);
        MyInteger myInt3 = new MyInteger(25);
        System.out.println("Is Even: " + myInt1.isEven());
        System.out.println("Is Odd: " + myInt1.isOdd());
        System.out.println("Is Prime: " + myInt1.isPrime());
        System.out.println("Is Even: " + myInt2.isEven());
        System.out.println("Is Odd: " + myInt2.isOdd());
        System.out.println("Is Prime: " + myInt2.isPrime());
        System.out.println("Is Even: " + myInt3.isEven());
        System.out.println("Is Odd: " + myInt3.isOdd());
        System.out.println("Is Prime: " + myInt3.isPrime());
        System.out.println("Static isEven(10): " + MyInteger.isEven(10));
        System.out.println("Static isOdd(10): " + MyInteger.isOdd(10));
        System.out.println("Static isPrime(19): " + MyInteger.isPrime(19));
        System.out.println("Static isEven(myInt2): " + MyInteger.isEven(myInt2));
        System.out.println("Static isOdd(myInt2): " + MyInteger.isOdd(myInt2));
        System.out.println("Static isPrime(myInt2): " + MyInteger.isPrime(myInt2));
        System.out.println("myInt1.equals(12): " + myInt1.equals(12));
        System.out.println("myInt1.equals(new MyInteger(12)): " + myInt1.equals(new MyInteger(12)));
        System.out.println("myInt1.equals(15): " + myInt1.equals(15));
        char[] chars = {'3', '4', '5'};
        System.out.println("ParseInt chars {'3', '4', '5'}: " + MyInteger.parseInt(chars));
        String str = "789";
        System.out.println("String \"789\": " + MyInteger.parseInt(str));
    }

    public static Location locateLargest(double[][] a) {
        int maxRow = 0;
        int maxCol = 0;
        double maxValue = a[0][0];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > maxValue) {
                    maxValue = a[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }
        return new Location(maxRow, maxCol, maxValue);
    }
}