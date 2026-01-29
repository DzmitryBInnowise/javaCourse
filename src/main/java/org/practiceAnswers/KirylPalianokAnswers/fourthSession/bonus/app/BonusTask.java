package org.practiceAnswers.KirylPalianokAnswers.fourthSession.bonus.app;

import org.practiceAnswers.KirylPalianokAnswers.fourthSession.bonus.config.AppConfig;
import org.practiceAnswers.KirylPalianokAnswers.fourthSession.bonus.model.NumberData;
import org.practiceAnswers.KirylPalianokAnswers.fourthSession.bonus.reader.FileNumberReader;
import org.practiceAnswers.KirylPalianokAnswers.fourthSession.bonus.serializer.DataSerializer;
import org.practiceAnswers.KirylPalianokAnswers.fourthSession.bonus.service.NumberService;
import org.practiceAnswers.KirylPalianokAnswers.fourthSession.bonus.writer.FileNumberWriter;

import java.util.List;

public class BonusTask {

	public static void main(String[] args) {

		// ================================
		// БОНУС ЗАДАНИЕ
		// ================================
		/*
		 * Создай программу, которая:
		 * - читает список чисел из файла
		 * - сохраняет его в коллекцию
		 * - сериализует коллекцию
		 * - затем десериализует
		 * - и находит максимальное число
		 */

		String inputPath = AppConfig.INPUT_PATH;
		String serializePath = AppConfig.SERIALIZE_PATH;

		FileNumberWriter writer = new FileNumberWriter();
		FileNumberReader reader = new FileNumberReader();
		DataSerializer serializer = new DataSerializer();
		NumberService service = new NumberService();


		try {
			writer.writeNumbers(List.of(1, 3, 100, 7, 15), inputPath);
			List<Integer> numbers = reader.readNumbers(inputPath);
			NumberData data = new NumberData(numbers);

			serializer.serialize(data, serializePath);
			NumberData restored = serializer.deserialize(serializePath);

			int max = service.findMax(restored);
			System.out.println("Максимальное число: " + max);

		} catch (Exception e) {
			System.err.println("Ошибка выполнения программы: " + e.getMessage());
			e.printStackTrace();
		}
	}

}

