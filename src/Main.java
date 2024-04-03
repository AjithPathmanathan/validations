import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {

        email_validation email =new email_validation();
        ChangeDateFormate changedate= new ChangeDateFormate();
        ToString tostring =new ToString();
        AddNumbers addnum= new AddNumbers();
        String str= null;

        System.out.println(email.emailValidation("nathanajithgmail.com"));
        System.out.println(tostring.changetoString(str));
        System.out.println(changedate.Changetodate("11-02-2022"));
        System.out.println(addnum.addnumbers(17.5,13));
    }

}