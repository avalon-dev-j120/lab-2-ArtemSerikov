package ru.avalon.java.j20.labs.tasks;

import ru.avalon.java.j20.labs.Task;
import ru.avalon.java.j20.labs.models.Country;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Задание №6
 *
 * <p>Тема: "Потоковый ввод-вывод. Получение объекта на
 * основании прочитанных данных".
 */
public class Task6 implements Task {

    /**
     * {@inheritDoc}
     */
    @Override
    public void run() throws IOException {
        File input = new File("assets/countries.txt");
        Collection<Country> countries = read(input);

        /*
         * TODO(Студент): Выполнить задание №6
         *
         * 1. Реализовать метод read.
         *
         * 2. При реализации следует пользоваться классами:
         *    BufferedReader и Country.
         *
         * 3. С использованием отладчика проверить корректность работы программы.
         */
    }

    private Collection<Country> read(File file) throws IOException {

        Reader reader = new FileReader(file);
        BufferedReader bfReader = new BufferedReader(reader);
        //Collection <String> coll = new ArrayList<String>();
        Collection<Country> country = new ArrayList<Country>();
        String i;


        String [] str;
        while ((i = bfReader.readLine()) != null)
        {
            str = i.split(":");
            country.add(new Country(str[0], str[1]));
            //coll.add(i);
        }

        return country;
        //throw new UnsupportedOperationException("Not implement yet!");
    }
}
