package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	    // Регулярные выражения (фильтр для текста)

        // на прямую проверяем подходит ли по условию (true|false)
        System.out.println("my@mail.ru".matches("\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9._]+\\.[A-Za-z]{2,4}\\b"));

        // Настраиваемый фильтр
        Pattern p = Pattern.compile("\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9._]+\\.[A-Za-z]{2,4}\\b");
        Matcher m = p.matcher("my email tom@gmail.com");
        // получим место нахождения и найденое слово по условию
        while (m.find()){
            System.out.println(m.start() + " " +m.group() +" ");
        }
    }
}
