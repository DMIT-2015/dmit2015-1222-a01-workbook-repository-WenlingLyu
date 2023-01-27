package dmit2015.model;

import lombok.Getter;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class CanadianIncomeTaxManager {
    //define a private constructor to implement single pattern
    private CanadianIncomeTaxManager(){

    }
    //define a single instance of this class
    private static  CanadianIncomeTaxManager INSTANCE;

    //define a static class-level to access the singleton
    public static CanadianIncomeTaxManager getInstance(){
        if(INSTANCE == null){
            INSTANCE = new CanadianIncomeTaxManager();
        }
        return INSTANCE;
    }
    @Getter
    public List<CanadianPersonalIncomeTaxRate> incomeTaxRates;
    public List<String> fetchIncomeTaxData(){
        List<String> incomeTaxData = new ArrayList<>();
        Path csvPath = null;
        try {
            csvPath = Path.of(
                    getClass()
                            .getClassLoader()
                            .getResource("data/CanadianPersonalIncomeTaxRates")
                            .toURI());
            incomeTaxData = Files.readAllLines(csvPath);
        } catch (URISyntaxException | IOException e) {
            throw new RuntimeException(e);
        }

        // Use the following code to access a resource file not stored in your project
        // Path csvPath = Path.of("d:/temp/electricity-exports-and-imports-data-dictionary.csv");

        // Use the `Files.readAllLines()` method to read all lines from a file as a List.
        return incomeTaxData;
    }
}
