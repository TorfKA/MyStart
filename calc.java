import java.util.Scanner;

public class calc {
    public static void main(String[] args) {

//калькулятор для вычисления % от исходного числа, только целые числа. Как сделать что бы программа работала при вводе не целых чисел?
        Scanner sc1 = new Scanner(System.in);//прерменная sc1 статновится сканнером ввода
        System.out.println("введите число от которого требуется вычислить %");
        double x = sc1.nextDouble();
        Scanner sc2 = new Scanner(System.in); //переменная sc2 это новый сканер ввода
        System.out.println("введите нужный процент");
        double y = sc2.nextDouble();
        double z=x*y/100;// вычисление %
        System.out.println("результат: "+y+"% от "+x+" это "+z);
    }
}
