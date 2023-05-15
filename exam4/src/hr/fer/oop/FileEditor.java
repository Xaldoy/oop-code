package hr.fer.oop;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

class FileEditor {

    public static void processFile(Path inputFile, Path outputFile) throws IOException {
        List<String> lines = Files.readAllLines(inputFile, StandardCharsets.UTF_8);

        try (BufferedWriter writer = Files.newBufferedWriter(outputFile, StandardCharsets.UTF_8)) {
            for (String line : lines) {
                String[] columns = line.split(",");
                String processedLine = String.join("\t", columns);
                writer.write(processedLine);
                writer.newLine();
            }
        }
    }
}