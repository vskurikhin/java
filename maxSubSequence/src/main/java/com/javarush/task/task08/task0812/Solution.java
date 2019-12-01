package com.javarush.task.task08.task0812;

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
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        for (int i = 0; i < 10; ++i) {
            list.add(scanner.nextInt());
        }
        Integer previos = null;
        int current = 0;
        for (int i : list) {
            if (previos == null) {
                previos = i;
            } else if (i == previos) {
                current++;
            } else {
                list2.add(++current);
                previos = i;
                current = 0;
            }
        }
        list2.add(++current);
        int max = Collections.max(list2);
        System.out.println(max);
    }
}
