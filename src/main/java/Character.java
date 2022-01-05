/**
 * Интерфейс персонажа
 */
public interface Character {

    String getName(); // имя персонажа
    int getCanJump(); // высота которую может прыгать
    int getCanRun(); // дистанция которую может пробежать


    void run(Barrier barrier); // метод бега
    void jump(Barrier barrier); // метод прыжка

}
