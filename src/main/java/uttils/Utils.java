package uttils;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class Utils {
    public static void main(String[] args) throws IOException, ParseException {

    }
    static String fileLoc="./src/main/resources/users.json";
    public JSONObject getUser(String accNo, String password) throws IOException, ParseException {
        JSONParser parser=new JSONParser();
        {
            JSONArray userArray = (JSONArray) parser.parse(new FileReader(fileLoc));

            for (Object obj : userArray) {
                JSONObject userObject = (JSONObject) obj;
                if(userObject.get("account").equals(accNo)){
                    if (userObject.get("account").equals(accNo) && userObject.get("password").equals(password)){
                        return userObject;
                    }
                    else{
                        System.out.println("Wrong creds!");
                    }
                }

            }
        }
        return null;
    }



}
