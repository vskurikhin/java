package su.svn.chap10;

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

    public static void main(String[] args) {
        separator(Exc0.class);
        Exc0.main(args);
        separator(Exc1.class);
        Exc1.main(args);
        separator(Exc2.class);
        Exc2.main(args);
        separator(HandleError.class);
        HandleError.main(args);
        separator(MultipleCatches.class);
        MultipleCatches.main(args);
        separator(SuperSubCatch.class);
        SuperSubCatch.main(args);
        separator(NestTry.class);
        NestTry.main(args);
        separator(MethNestTry.class);
        MethNestTry.main(args);
        separator(ThrowsDemo.class);
        ThrowsDemo.Listing10.main(args);
        ThrowsDemo.Listing12.main(args);
        separator(FinallyDemo.class);
        FinallyDemo.main(args);
        separator(ExceptionDemo.class);
        ExceptionDemo.main(args);
        separator(ChainExcDemo.class);
        ChainExcDemo.main(args);
        separator(MultiCatch.class);
        MultiCatch.main(args);
    }
}
