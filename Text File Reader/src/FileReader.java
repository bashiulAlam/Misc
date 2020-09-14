import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Sabab on 9/26/2017.
 */
public class FileReader {

    public static void main(String[] args) {

        ArrayList<String> email = new ArrayList<String>();
        String filePath = "E:\\Automation\\qa-repo\\km-automation-wallet-cards.txt";

        try {
            BufferedReader br = new BufferedReader(new java.io.FileReader(filePath));

            for(String line; (line = br.readLine()) != null; ) {
                email.add(line);
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < email.size(); i++)
            System.out.println(email.get(i));

        String mail = "pp@p.com";
        String id = mail.substring(0, mail.indexOf('@'));
        String domain = mail.substring(mail.indexOf('@') + 1, mail.length());
        System.out.println(id);
        System.out.println(domain);

        for(int i = 0; i < 3; i++) {
            long nanoTime = System.nanoTime();
            String mobileNumber = "015" + String.valueOf(nanoTime).substring(7);
            System.out.println(mobileNumber);
        }

        String[] userInfo = new String[2];
        String str = "pp@p.com,010000";
        String userEmail = str.substring(0, str.indexOf(','));
        String mobileNumber = str.substring(str.indexOf(',') + 1, str.length());

        userInfo[0] = userEmail;
        userInfo[1] = mobileNumber;

        System.out.println(userEmail);
        System.out.println(mobileNumber);
    }
}
