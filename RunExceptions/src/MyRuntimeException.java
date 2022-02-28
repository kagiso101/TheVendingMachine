public class MyRuntimeException extends RuntimeException {

    public MyRuntimeException(String errorMessage) {
        super(errorMessage);
    }

    public void theMethodThrowsMyException() {
        throw new MyRuntimeException("This is an error");
    }

    public void useMethod() {
        theMethodThrowsMyException();
    }


    public static void main(String[] args) {

    }
}