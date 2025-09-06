public class Program {
    public static void main(String[] args){
        Multiply multiply = new Multiply();
        long mul = multiply.secondMultiply(3,5);
        System.out.println(mul);
        mul = multiply.simpleMultiply(3,5);
        System.out.println(mul);
        mul = multiply.fastMultiply(3,5);
        System.out.println(mul);
        String mul1 = multiply.bigIntMultiply("3","5");
        System.out.println(mul1);
    }
}
