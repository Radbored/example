package four;

public class ErrorBean {
    public void errorPhoneMethod() throws Exception{
        throw new Exception("Generic Exception");
    }
    public void otherErrorPhoneMethod()throws IllegalArgumentException{
        throw new IllegalArgumentException("IllegalArgument Exception");
    }
}
