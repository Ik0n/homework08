public class RunningTrack implements Barrier {

    @Override
    public int getSize() {
        return size;
    }

    private int size;

    RunningTrack(int size) {
        this.size = size;
    }

    @Override
    public boolean isPassed(Character character) {

        return this.size <= character.getCanRun();

    }
    /**
     * метод для взаимодействия персонажа с препятствием
     * @param character персонаж
     */
    public void overcome(Character character) {

        if (isPassed(character)) {

            character.run(this);

        } else {

            System.out.println(character.getName() + " не смог преодалеть беговую дорожку");

        }

    }

}
