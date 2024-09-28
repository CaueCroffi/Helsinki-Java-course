
import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        HashMap<String,String> nicknames = new HashMap<>();
        
        nicknames.put("matthew", "matt");
        nicknames.put("michael", "mix");
        nicknames.put("arthur", "artie");
        // Do the operations required here!
        
        System.out.println("matthew's nickname is " + nicknames.get("matthew"));
    }

}
