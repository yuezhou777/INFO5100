import java.io.*;

public class LineCounts {
    public static void main(String[] args) throws Exception{
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i] + "'s number of lines:");
            System.out.println(countLine(args[i]));
        }
        /*
        Output:
            file1.txt's number of lines:
            2
            file2.txt's number of lines:
            1
            file3.txt's number of lines:
            3
        */
    }

    public static int countLine(String fileName) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
        int lineNum = 0;
        try {
            while (br.readLine() != null) {
                lineNum++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Have problem with reading the file");
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                System.out.println("Have problem with reading the file");
            }
        }
        return lineNum;
    }
}