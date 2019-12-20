package module6Tasks.task2;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Блокнот. Разработать консольное приложение, работающее с Заметками
 * в Блокноте. Каждая Заметка это: Заметка (тема, дата создания, e-mail, сообщение).
 * Общие пояснения к практическому заданию.
 * • В начале работы приложения данные должны считываться из файла, в конце
 * работы – сохраняться в файл.
 * • У пользователя должна быть возможность найти запись по любому параметру
 * или по группе параметров (группу параметров можно определить
 * самостоятельно), получить требуемые записи в отсортированном виде, найти
 * записи, текстовое поле которой содержит определенное слово, а также
 * добавить новую запись.
 * • Особое условие: поиск, сравнение и валидацию вводимой информации
 * осуществлять с использованием регулярных выражений.
 * • Особое условие: проверку введенной информации на валидность должен
 * осуществлять код, непосредственно добавляющий информацию.
 */

public class Main {

    public static void main(String[] args) {

        Execution execution = new Execution();
        execution.action();


    }



}