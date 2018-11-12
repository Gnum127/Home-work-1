public class Main {
    public static void main(String[] args) {
        Summator mySum = new Summator(); // присвоение переменной результата класса Summator

        long result; // объявление выводимой переменной

        mySum.setFirstNumber(2_000_000_000); // обращение к переменным класса Summator и ввод их значений
        mySum.setSecondNumber(2_000_000_000);

        result = mySum.Sum(); // присвоение значения класса переменной

        System.out.print(result); // вывод результата вычеслений
    }
}
