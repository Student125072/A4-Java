package eindopdracht;

import java.util.Observable;
import java.util.Random;

public class Model extends Observable {
    String password;

    public void generate_password(int password_length) {
        int leftLimit = 97;
        int rightLimit = 122;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(password_length);
        for (int i = 0; i < password_length; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        password = buffer.toString();

        setChanged();
        notifyObservers();
    }

    public String getPassword() {
        return password;
    }

}
