package su.svn.chap13;

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
    private static void separator(Class<?> c) {
        System.out.println();
        for (int j = 0; j < 80; ++j)
            System.out.print('#');
        System.out.println();
        System.out.println("###");
        System.out.println("### " + c.getSimpleName());
        System.out.println("###");
    }

    public static void main(String[] args) throws IOException {
        separator(Listing1.class);
        Listing1.BRRead.main(args);
        separator(Listing2.class);
        Listing2.BRReadLines.main(args);
        separator(Listing3.class);
        Listing3.TinyEdit.main(args);
        separator(Listing4.class);
        Listing4.WriteDemo.main(args);
        separator(Listing5.class);
        Listing5.PrintWriterDemo.main(args);
        separator(Listing6.class);
        Listing6.ShowFile.main(args);
        separator(Listing7.class);
        Listing7.ShowFile.main(args);
        separator(Listing8.class);
        Listing8.CopyFile.main(args);
        separator(Listing9.class);
        Listing9.ShowFile.main(args);
        separator(Listing10.class);
        Listing10.CopyFile.main(args);
        separator(Listing11.class);
        Listing11.InstanceOf.main(args);
        separator(Listing12.class);
        Listing12.AssertDemo.main(args);
        separator(Listing13.class);
        Listing13.AssertDemo.main(args);
        separator(Listing14.class);
        Listing14.Hypot.main(args);
        separator(Listing15.class);
        Listing15.Hypot.main(args);
        separator(Listing16.class);
        separator(Listing17.class);
    }
}

