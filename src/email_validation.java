import java.util.regex.Pattern;



public class email_validation {
    public String emailValidation(String email){
        if(email == null || email.isEmpty())
            return "not valid";

        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

        Pattern pattern = Pattern.compile(emailRegex);

        if (Pattern.matches(emailRegex, email)){
            return "valied";
        }
        return "not valied";

    }
}
