package class12;

public class T3createEmail {
    String completeEmail(String firstName,String lastName,String emailType){
        String result=firstName+lastName+"@"+emailType;
        return result;

    }
}
