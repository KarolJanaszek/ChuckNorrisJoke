package jokes;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    @GetMapping("/user")
    public String getUser(ModelMap modelMap){
        RegularUser user = new RegularUser("adam", "kowalsky");
        RegularUser user2 = new RegularUser("adam2", "kowalsky2");
        Admin admin = new Admin("adminAdam", "adminKowalsky");
        Admin admin2 = new Admin("adminAdam2", "adminKowalsky2");
        Admin admin3 = new Admin("adminAdam3", "adminKowalsky3");

        List<User> users = new ArrayList(); //Admin jest traktowany jako user
        users.add(user);
        users.add(user2);
        users.add(admin);
        users.add(admin2);
        users.add(admin3);

        modelMap.put("users", users);
        return "users";
    }
}
