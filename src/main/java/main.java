import java.io.IOException;

class main{
    public static void main( String[] args ) throws IOException {
        Calculator calculator = new Calculator("src/main/java/number.txt", "x");
        calculator.start();
    }
}