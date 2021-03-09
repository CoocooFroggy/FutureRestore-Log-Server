import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

import javax.security.auth.login.LoginException;

public class Main {
    public static JDA jda;
    public static void main(String[] args) {
        String token = System.getenv("DISCORD_TOKEN");
        try {
            jda = JDABuilder.createDefault(token).build();
        } catch (LoginException e) {
            System.out.println("Unable to login to Discord :/");
            e.printStackTrace();
            return;
        }

        //Start HTTP Server
    }
}
