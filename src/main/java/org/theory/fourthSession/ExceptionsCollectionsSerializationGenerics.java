package org.theory.fourthSession;

// =====================================================
// ЛЕКЦИЯ ПО JAVA — ТЕМЫ 12–15
// Исключения, Коллекции, Сериализация, Дженерики
// =====================================================

public class ExceptionsCollectionsSerializationGenerics {

    // =====================================================
    // 12. ОБРАБОТКА ИСКЛЮЧЕНИЙ
    // =====================================================

    /*
     * Исключения (Exceptions) — это ошибки, возникающие во время выполнения программы.
     * Они позволяют:
     * - предотвратить аварийное завершение программы
     * - обработать ошибку
     * - передать информацию о проблеме
     *
     * Иерархия:
     *
     * Throwable
     *  ├─ Error (ошибки JVM, обычно не обрабатываются)
     *  └─ Exception
     *       ├─ RuntimeException (непроверяемые)
     *       └─ Checked Exception (проверяемые)
     *
     * Примеры RuntimeException:
     * - NullPointerException
     * - ArithmeticException
     * - ArrayIndexOutOfBoundsException
     *
     * Примеры Checked Exception:
     * - IOException
     * - FileNotFoundException
     */

    // -------------------------------
    // try / catch
    // -------------------------------
    /*
    try {
        int a = 10 / 0;
    } catch (ArithmeticException e) {
        // обработка ошибки
    }
    */

    // -------------------------------
    // несколько catch
    // -------------------------------
    /*
    try {
        String s = null;
        s.length();
    } catch (NullPointerException e) {
        // обработка NPE
    } catch (Exception e) {
        // обработка всех остальных исключений
    }
    */

    // -------------------------------
    // finally
    // -------------------------------
    /*
    try {
        // код
    } catch (Exception e) {
        // обработка
    } finally {
        // выполняется всегда
    }
    */

    // -------------------------------
    // throw
    // -------------------------------
    /*
    if (age < 0) {
        throw new IllegalArgumentException("Возраст не может быть отрицательным");
    }
    */

    // -------------------------------
    // throws
    // -------------------------------
    /*
    public void readFile() throws IOException {
        // код, который может выбросить исключение
    }
    */

    // -------------------------------
    // try-with-resources
    // -------------------------------
    /*
    try (FileInputStream fis = new FileInputStream("file.txt")) {
        int data = fis.read();
    } catch (IOException e) {
        // обработка
    }
    */

    // try-with-resources автоматически закрывает ресурсы,
    // реализующие интерфейс AutoCloseable.


    // =====================================================
    // 13. КОЛЛЕКЦИИ (Collections Framework)
    // =====================================================

    /*
     * Коллекции — структуры данных для хранения групп объектов.
     *
     * Основные интерфейсы:
     * - List
     * - Set
     * - Map
     * - Queue
     */

    // -------------------------------
    // List (упорядоченные, допускают дубликаты)
    // -------------------------------
    /*
    List<String> list = new ArrayList<>();
    list.add("Java");
    list.add("Python");
    list.add("Java");

    list.get(0);
    list.size();
    */

    // -------------------------------
    // Set (уникальные элементы)
    // -------------------------------
    /*
    Set<Integer> set = new HashSet<>();
    set.add(1);
    set.add(1);
    set.add(2);
    */

    // -------------------------------
    // Map (ключ → значение)
    // -------------------------------
    /*
    Map<String, Integer> map = new HashMap<>();
    map.put("Alice", 25);
    map.put("Bob", 30);

    map.get("Alice");
    */

    // Перебор Map:
    /*
    for (Map.Entry<String, Integer> entry : map.entrySet()) {
        entry.getKey();
        entry.getValue();
    }
    */

    // -------------------------------
    // Queue
    // -------------------------------
    /*
    Queue<String> queue = new LinkedList<>();
    queue.add("A");
    queue.add("B");

    queue.poll();
    */

    /*
     * Важные особенности коллекций:
     * - хранят только объекты
     * - используют Generics
     * - работают с equals() и hashCode()
     */


    // =====================================================
    // 14. СЕРИАЛИЗАЦИЯ И ДЕСЕРИАЛИЗАЦИЯ
    // =====================================================

    /*
     * Сериализация — преобразование объекта в поток байт.
     * Десериализация — восстановление объекта из потока байт.
     *
     * Используется для:
     * - сохранения объектов в файл
     * - передачи по сети
     */

    // Класс должен реализовать Serializable
    /*
    class Person implements Serializable {
        private static final long serialVersionUID = 1L;

        String name;
        int age;

        transient String password; // не сериализуется
    }
    */

    // -------------------------------
    // Сериализация
    // -------------------------------
    /*
    ObjectOutputStream oos = new ObjectOutputStream(
        new FileOutputStream("person.dat")
    );

    Person p = new Person("Alice", 25);
    oos.writeObject(p);
    oos.close();
    */

    // -------------------------------
    // Десериализация
    // -------------------------------
    /*
    ObjectInputStream ois = new ObjectInputStream(
        new FileInputStream("person.dat")
    );

    Person p = (Person) ois.readObject();
    ois.close();
    */

    /*
     * transient — поле не участвует в сериализации
     * serialVersionUID — версия класса для совместимости
     */


    // =====================================================
    // 15. ДЖЕНЕРИКИ (Generics)
    // =====================================================

    /*
     * Generics позволяют работать с типами безопасно на этапе компиляции.
     */

    // -------------------------------
    // Без Generics (плохо)
    // -------------------------------
    /*
    List list = new ArrayList();
    list.add("Java");
    list.add(10);

    String s = (String) list.get(1); // ClassCastException
    */

    // -------------------------------
    // С Generics (хорошо)
    // -------------------------------
    /*
    List<String> list = new ArrayList<>();
    list.add("Java");
    */

    // -------------------------------
    // Обобщённый класс
    // -------------------------------
    /*
    class Box<T> {
        T value;

        void set(T value) {
            this.value = value;
        }

        T get() {
            return value;
        }
    }

    Box<String> box = new Box<>();
    box.set("Hello");
    */

    // -------------------------------
    // Обобщённый метод
    // -------------------------------
    /*
    public <T> void print(T value) {
        // использование T
    }
    */

    // -------------------------------
    // Ограничения (bounds)
    // -------------------------------
    /*
    class Calculator<T extends Number> {
        T num;
    }
    */

    // -------------------------------
    // Wildcards
    // -------------------------------
    /*
    List<?> list;
    List<? extends Number> numbers;
    List<? super Integer> integers;
    */

    /*
     * Преимущества Generics:
     * - безопасность типов
     * - отсутствие ClassCastException
     * - читаемость кода
     * - активно используются в коллекциях
     */

}

