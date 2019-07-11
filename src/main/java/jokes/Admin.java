package jokes;

import java.util.ArrayList;
import java.util.List;

public class Admin extends User {

    private List<String> roles = new ArrayList<>();


    public Admin(String username, String password) {
        super(username, password);
    }
}
