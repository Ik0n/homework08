public class Cat implements Character {

    private int canJump = 2;

    public int getCanJump() {
        return canJump;
    }

    public int getCanRun() {
        return canRun;
    }

    private int canRun = 10;

    @Override
    public String getName() {
        return name;
    }

    Cat(String name) {
        this.name = name;
    }

    private String name;
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
