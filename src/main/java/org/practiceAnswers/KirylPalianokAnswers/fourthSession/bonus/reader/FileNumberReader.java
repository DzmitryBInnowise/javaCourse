package org.practiceAnswers.KirylPalianokAnswers.fourthSession.bonus.reader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileNumberReader {

	public List<Integer> readNumbers(String path) throws IOException {

		Path filePath = Path.of(path);

		List<String> lines = Files.readAllLines(filePath);
		List<Integer> result = new ArrayList<>();

		for (String line : lines) {

			if (line == null) {
				continue;
			}

			String trimmed = line.trim();
			if (trimmed.isEmpty()) {
				continue;
			}

			result.add(Integer.parseInt(trimmed));
		}

		return result;
	}
}
