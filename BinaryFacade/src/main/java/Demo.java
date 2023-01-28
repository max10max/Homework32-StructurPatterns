public class Demo {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        System.out.println("Результат сложения двоичных чисел 11 и" +
                " 101 :   "  + bins.sum("11","101" ));
        System.out.println("Результат умножения двоичных чисел 11 и" +
                " 101 :   "   + bins.mult("11","101" ));
    }
}
