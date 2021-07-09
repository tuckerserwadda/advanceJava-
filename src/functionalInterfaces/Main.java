package functionalInterfaces;

public class Main {
    public static void main(String[] args) {

        BinaryOperation add = (a, b) -> a + b;
        System.out.println(add.apply(2, 4));
        assert 5 == add.apply(2, 3);
    }
}
