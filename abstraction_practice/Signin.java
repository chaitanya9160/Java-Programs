package abstraction;

abstract class Login {
    abstract void authenticate();
}

class GoogleLogin extends Login {
    void authenticate() {
        System.out.println("Logging in with Google");
    }
}

class FacebookLogin extends Login {
    void authenticate() {
        System.out.println("Logging in with Facebook");
    }
}

public class Signin {
    public static void main(String[] args) {
        GoogleLogin google = new GoogleLogin();
        FacebookLogin facebook = new FacebookLogin();

        google.authenticate();    
        facebook.authenticate();  
    }
}

