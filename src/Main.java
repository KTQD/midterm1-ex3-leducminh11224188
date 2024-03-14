import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Main {
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            StringBuilder content = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
            reader.close();

            String replacedContent = content.toString().replaceAll("Nha Trang", "Vũng Tàu");

            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
            writer.write(replacedContent);
            writer.close();

            System.out.println("Đã thay thế và ghi nội dung ra tệp " + outputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
