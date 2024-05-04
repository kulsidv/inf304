import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Bracket {
    public int check(String pathname) {
        File file = new File(pathname);
        try(BufferedInputStream input = new BufferedInputStream(new FileInputStream(file))) {

        }catch(IOException e) {
            throw new RuntimeException();
        }
        return 0;
    }
}
