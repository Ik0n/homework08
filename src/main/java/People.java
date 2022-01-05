/**
 * класс человека
 */
public class People implements Character {

    private String name; // имя

    public int getCanJump() {
        return canJump;
    }

    public int getCanRun() {
        return canRun;
    }

    private int canJump = 1;
    private int canRun = 5;


    @Override
    public String getName() {
        return name;
    }

    /**
     * Конструктор человека
     * @param name имя
     */
    People(String name) {
        this.name = name;
    }

    /**
     * Метод бега
     * @param barrier барьер который нужно преодалеть
     */
    public void run(Barrier barrier){

        System.out.println(name + " пробежал " + barrier.getSize() + " метров по беговой дорожке");

    }

    /**
     * Метод прыжка
     * @param barrier барьер который нужно преодалеть
     */
    public void jump(Barrier barrier) {

        System.out.println(name + " прыгнул на " + barrier.getSize() + " метров и перепрыгнул стену");

    }

}
