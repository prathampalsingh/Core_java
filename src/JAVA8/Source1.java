package JAVA8;

@FunctionalInterface
interface Authenticate {
    boolean validate(String username, String password);
}

public class Source1 {
    
    	boolean validateMethod(String usernamem, String passwordm) {
        Authenticate v1 = (username, password) -> {
            if (username.equals("ABC") && password.equals("DEF")) {
                return true;
            } else{
                return false;
            }
        };
        return v1.validate(usernamem, passwordm);
    }
    	public static void main(String[] args) {
    		Source1 s=new Source1();
    
       boolean s1 = s.validateMethod("ABC", "DEF");
        System.out.println("Authentication successful: " + s1);
    }
}