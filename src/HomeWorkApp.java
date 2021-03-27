//Дисциплина: Java.Уровень 1
//Домашнее задание №: 1
//Студент: Алексей Пирогов
//Дата: 27.03.2021

import java.util.Scanner;

public class HomeWorkApp
{
    public static void main(String[] args)
    {
        System.out.println("Пример работы функции printTreeWords:");
        printTheeWords();
        pressAnyKey();

        System.out.println("Пример работы функцци checkSumSign:");
        chekSumSign();
        pressAnyKey();

        System.out.println("Пример работы функции printColor:");
        printColor();
        pressAnyKey();

        System.out.println("Пример работы функциии compareNumbers:");
        compareNumbers();
    }

    //Ex.2: Print word
    public static void printTheeWords()
    {
        System.out.println("Функция выводит в столбец слова: Orange, Banana, Apple. Вывод:");
        System.out.println("Orange\nBanana\nApple");
    }

    //Ex.3: Addition variable
    public static void chekSumSign()
    {
        //объявление переменных с предварительной инициализацей
        int a=0, b=0;
        System.out.println("Функция осуществляет операцию сложения двух чисел вводимых с клавиатуры.\n");
        //ввод переменных
        a = inputNum();
        b = inputNum();
        if((a+b)>=0)
        {
            System.out.println("Сумма a+b=" + (a+b) + " - положительная. Значения переменных: a=" + a + " и b=" + b + ".");
        }
        else
        {
            System.out.println("Сумма a+b=" + (a+b) + " - отрицаельная. Значения переменных: a=" + a + " и b=" + b + ".");
        }
    }

    //Ex.4: print key-word for color
    public static void printColor()
    {
        System.out.println("Функция осуществляет вывод цвета в зависимости от введённого значения." +
                           "Если число меньше или равно 0, то слово \"Красный\",\n" +
                           "если принимает значение от 1 до 100 включительно, то слово \"Желтый\"," +
                           "а в иных случаях, начиная со значения 101, слово \"Зелёный\".");

        //Объявление переменной и инициализация её значением передаваемым из фунции inputNum
        int keyWord = inputNum();

        if(keyWord<=0)
        {
            System.out.println("Красный");
        }
        else
        {
            if(keyWord<=100)
            {
                System.out.println("Желтый");
            }
            else
            {
                System.out.println("Зелёный");
            }
        }
    }

    //Ex 5. Compare two numbers
    public static void compareNumbers()
    {
        //Объявление переменной
        int a=0,b=0;

        System.out.println("Функция осуществляет сравление двух чисел вводимых с клавиатуры.");
        System.out.println("Проверяемое условие: a>=b.");

        a = inputNum();
        b = inputNum();

        if(a>=b)
        {
            System.out.println("Значение переменных: a=" + a + ", b=" + b + ". Результат сравнения: a>=b.");
        }
        else
        {
            System.out.println("Значение перменных: a=" + a + ", b=" + b + ". Результат сравнения: a<b.");
        }
    }

    //Заглушка для ожидания перехода к следующему шагу
    public static void pressAnyKey()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Нажмите любую кнопку для пеехода к следующему шагу...");
        in.nextLine();
    }

    //Функция для ввода числовых данных
    public static int inputNum()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите любое число от -1000 до 1000:");
        return in.nextInt();
    }
}
