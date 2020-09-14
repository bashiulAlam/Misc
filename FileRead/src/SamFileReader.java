import java.io.*;
import java.util.Properties;

/**
 * Created by Sabab on 4/28/2017.
 */
public class SamFileReader {

    public static void main(String[] args) {

        String filePath = "E:\\IntelliJ Source Projects\\FileRead\\src\\raw_data.SAM";
        String dir = "E:\\IntelliJ Source Projects\\FileRead\\src";
        File file = lastFileModified(dir);
        String str = file.toString();
        //readWithBufferedReader(filePath);
        //readFirstLine(str);
        checkStringArray();
    }

    public static void checkStringArray() {
        String[] str = new String[] {"aa", "bb", "cc"};
        System.out.print(str[0]);
    }

    public static void readWithBufferedReader(String filePath) {

        BufferedReader br = null;
        FileReader fr = null;

        try {

            fr = new FileReader(filePath);
            br = new BufferedReader(fr);

            String sCurrentLine;

            br = new BufferedReader(new FileReader(filePath));

            while ((sCurrentLine = br.readLine()) != null) {
                System.out.println(sCurrentLine);
            }

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            try {

                if (br != null)
                    br.close();

                if (fr != null)
                    fr.close();

            } catch (IOException ex) {

                ex.printStackTrace();

            }

        }
    }

    public static void readFirstLine(String filePath) {

        BufferedReader br = null;
        FileReader fr = null;
        try {
            fr = new FileReader(filePath);
            br = new BufferedReader(fr);

            br = new BufferedReader(new FileReader(filePath));

            String text = br.readLine();
            System.out.println("Reading from path : " + text);

            String subStr = text.substring(text.indexOf('=') + 1, text.length() - 1);
            System.out.println("Reading from path : " + subStr);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static File lastFileModified(String dir) {
        File fl = new File(dir);
        File[] files = fl.listFiles(new FileFilter() {
            public boolean accept(File file) {
                return file.isFile();
            }
        });
        long lastMod = Long.MIN_VALUE;
        File choice = null;
        for (File file : files) {
            if (file.lastModified() > lastMod) {
                choice = file;
                lastMod = file.lastModified();
            }
        }
        System.out.println(choice);
        return choice;
    }
}
