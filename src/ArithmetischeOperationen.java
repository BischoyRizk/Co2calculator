public class ArithmetischeOperationen {
    public static void main(String[] args) {
        int a = 8;
        int b = 5;

        int multi = a * b;
        int p = 2 + multi;
        System.out.println(p);
        int divison = a / b;
        int r = 4 * divison;
        System.out.println(r);

        System.out.println("Addition: " + (a + b));
        System.out.println(a - b);
        System.out.println(multi);
        System.out.println(divison);
        System.out.println(a % b);

        printResult(a+b);
       int result = add(2, 5);
       printResult(result);
       printResult(add(2,5));

       int sub = subb(6,4);
        System.out.println(sub);
        printResult(subb(4,7));
        printResult(add(4,7));
        printResult(div(4,7));
        printResult(mult(4,7));

    }

    public static void printResult ( double result){
        System.out.println("Result: " + result);
    }

    public static int add(int a, int b){
        return a + b;

    }


    public static int subb(int a, int b){

        return a - b;
    }

    public static double div( double a, double b){

        return a/b;

    }

    public static int mult(int a, int b){
        return a*b;
    }
}
