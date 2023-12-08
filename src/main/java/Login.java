import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import uttils.Utils;

import java.io.IOException;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) throws IOException, ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your account no:");
        String accNo = scanner.nextLine();
        System.out.println("Input your password:");
        String password = scanner.nextLine();
        Utils utils = new Utils();
        JSONObject userObj = utils.getUser(accNo, password);
        if (userObj != null) {
            RouteMenu routeMenu = new RouteMenu();
            String role = userObj.get("role").toString();
            routeMenu.getMenu(role);
        } else {
            System.out.println("no user found");
        }
    }
}
