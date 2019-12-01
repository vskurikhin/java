package com.javarush.task.task07.task0716;

/*
Я думаю, быть программистом - это круто
*/

// Я не отвечаю за этот код. Меня заставили написать его против моего желания.

// Дорогой я_из_будущего! Пожалуйста, прости меня за этот код.

// Если я еще раз увижу такое, мне придется начать носить на работу оружие.

// Если это условие когда-нибудь выполнится, пожалуйста,

// сообщите мне по тел. ххх-ххх-ххх за вознаграждение.

/* Дорогой программист:
   Когда ты закончишь «оптимизировать» эту подпрограмму
   и поймешь, насколько большой ошибкой было делать это,
   пожалуйста, увеличь счетчик внизу как предупреждение

   для следующего парня:
   количество_часов_потраченных_здесь = 42
 */

/* Когда я начинал это писать, только Бог и я понимали, что я делаю
   Сейчас остался только Бог
   иногда мне кажется, что компилятор игнорирует все мои комментарии
 */

/* Я посвящаю весь свой код, всю работу своей жене Дарлин, которой
   придётся содержать меня, наших троих детей и собаку, когда
   это пойдет в паблик.
 */

// Магия. Не трогать.

import java.io.*;
import java.lang.reflect.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static Stream<String> applyConditions(String s) {
        if (s.contains("р") && s.contains("л")) return Stream.of(s);
        if (s.contains("р")) return null;
        if (s.contains("л")) return Stream.of(s, s);
        return Stream.of(s);
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        //напишите тут ваш код
        Stream<Stream<String>> streamOfStream = strings.stream()
                .map(Solution::applyConditions);
        Stream<String> stream = streamOfStream.flatMap(Function.identity());
        return stream.filter(Objects::nonNull).collect(Collectors.toCollection(ArrayList::new));
    }
}
