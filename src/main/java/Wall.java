public class Wall implements Barrier {

    @Override
    public int getSize() {
        return size;
    }

    private int size;

    Wall(int size) {
        this.size = size;
    }

    @Override
    public boolean isPassed(Character character) {
        return this.size <= character.getCanJump();
    }

    /**
     * метод для взаимодействия персонажа с препятствием
     * @param character персонаж
     */
    public void overcome(Character character) {

        if (isPassed(character)) {

            character.jump(this);

        } else {

            System.out.println(character.getName() + " не перепрыгнуть стену");

        }

    }
}
