

public class ExceptionsHandler {
    public static void main(String[] args) {
        int n = 11 ;
        int m = 0;
        try {
            int div = n/m;
            System.out.println(div);
            
        } catch (ArithmeticException e) {
            System.out.println("Error Division by Zero is not allowed !");
        }
        finally{
            System.out.println("Program continue after handling the exception.");
        }
    }
}
