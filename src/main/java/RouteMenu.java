import admin.AdminUser;
import agent.AgentUser;

public class RouteMenu {
    public void getMenu(String role){
        if(role.equals("admin")){
            new AdminUser();
        }
        else if(role.equals("agent")){
            new AgentUser();
        }

    }

}

