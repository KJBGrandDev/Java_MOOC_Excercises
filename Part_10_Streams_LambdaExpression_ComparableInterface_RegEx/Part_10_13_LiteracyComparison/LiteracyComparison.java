package Part_10_Streams_LambdaExpression_ComparableInterface_RegEx.Part_10_13_LiteracyComparison;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LiteracyComparison {

    public static void main(String[] args) {
        try {
            Files.lines(Paths.get("Part_10_Streams_LambdaExpression_ComparableInterface_RegEx/Part_10_13_LiteracyComparison/literacy.csv"))
                    .map(s -> s.split(","))
                    .filter(s -> s.length >= 6)
                    .sorted((a, b) -> Double.compare(
                            Double.parseDouble(a[5].trim()),
                            Double.parseDouble(b[5].trim())
                    ))
                    .forEach(s -> {
                        String country = s[3].trim();
                        int year = Integer.parseInt(s[4].trim());
                        String gender = s[2].replace(" (%)", "").replace("(%)", "").trim();
                        double literacyRate = Double.parseDouble(s[5].trim());

                        System.out.println(country + " (" + year + "), " + gender + ", " + literacyRate);
                    });
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
