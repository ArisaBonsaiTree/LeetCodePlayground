
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;

public class GenerateNames {

    private List<String> list;
    private File read;
    private FileWriter write;
    private Scanner scanner;

    public static void main(String[] args) throws IOException {
        new GenerateNames().generate();
    }

    private void generate() throws IOException {
        read = new File("C:\\Users\\arisa\\IdeaProjects\\LeetCodePlayground\\src\\data");
        scanner = new Scanner(read);

        write = new FileWriter("C:\\Users\\arisa\\IdeaProjects\\LeetCodePlayground\\src\\write");

        while(scanner.hasNext()){
            // Databricks - SBQQ__Subscription__c GET Profile
            String s = scanner.nextLine();
            // Databricks - Account INSERT Connector Operation
            // [INVALID NS???] NetSuite To Databricks - Contacts
            // [INVALID NS???] NetSuite To Databricks - Contacts
            write.write("[INVALID NS???] NetSuite To Databricks - " + s + "\n");
        }

        write.close();




    }
}
