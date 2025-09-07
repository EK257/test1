public class Program {
    public static void main(String[] args){
        Multiply multiply = new Multiply();
        long mul = multiply.secondMultiply(6,4);
        System.out.println(mul);
        mul = multiply.simpleMultiply(6,4);
        System.out.println(mul);
        mul = multiply.fastMultiply(6,4);
        System.out.println(mul);
        String mul1 = multiply.bigIntMultiply("6","4");
        System.out.println(mul1);
    }
}

