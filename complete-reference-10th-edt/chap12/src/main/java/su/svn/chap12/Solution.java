package su.svn.chap12;

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

    public static void main(String args[]) {
        separator(AskMe.class);
        AskMe.main(args);
        separator(EnumDemo.class);
        EnumDemo.main(args);
        separator(Marker.class);
        Marker.main(args);
        separator(Meta.class);
        Meta.main(args);
        separator(Meta2.class);
        Meta2.main(args);
        separator(Meta3.class);
        Meta3.main(args);
        separator(RepeatAnno.class);
        RepeatAnno.main(args);
        separator(Single.class);
        Single.main(args);
        separator(TypeAnnoDemo.class);
        TypeAnnoDemo.main(args);
    }
}
