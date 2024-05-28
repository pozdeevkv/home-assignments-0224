package ru.sberbank.jd.lesson01;

import java.util.Collection;
import java.util.List;

/**
 * Реализация получения информации о владельце.
 */
public class GreetingImpl implements Greeting {

    /**
     * Получение имени.
     */
    @Override
    public String getFirstName() {
        return "Константин";
    }

    /**
     * Получение фамилии.
     */
    @Override
    public String getLastName() {
        return "Поздеев";
    }

    /**
     * Получение года рождения.
     */
    @Override
    public int getBirthYear() {
        return 1994;
    }

    /**
     * Получение набора хобби.
     */
    @Override
    public Collection<String> getHobbies() {
        return List.of("Ребенок", "Прогулки");
    }

    /**
     * Получение имени репозитория.
     */
    @Override
    public String getRepoUrl() {
        return "https://github.com/pozdeevkv/home-assignments-0224/";
    }

    /**
     * Получение телефона.
     */
    @Override
    public String getPhone() {
        return "89223130737";
    }

    /**
     * Получение набора ожиданий от курса.
     */
    @Override
    public Collection<String> getCourseExpectations() {
        return List.of("Погрузиться в бэкенд", "Анализировать код");
    }
}