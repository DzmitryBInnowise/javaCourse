package org.practiceAnswers.KirylPalianokAnswers.fourthSession.bonus.writer;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileNumberWriter {

	public void writeNumbers(List<Integer> numbers, String path) throws IOException {

		Path filePath = Path.of(path);

		if (Files.notExists(filePath)) {
			Files.createFile(filePath);
		}

		try (BufferedWriter writer = Files.newBufferedWriter(filePath)) {
			for (Integer number : numbers) {
				writer.write(number.toString());
				writer.newLine();
			}
		}
	}
}
