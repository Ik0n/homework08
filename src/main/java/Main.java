public class Main {

    public static void main(String[] args) {

        Character[] characters = new Character[3];
        characters[0] = new People("Петя");
        characters[1] = new Cat("Барсик");
        characters[2] = new Robot("Валли");

        Barrier[] barriers = new Barrier[5];
        barriers[0] = new RunningTrack(5);
        barriers[1] = new Wall(2);
        barriers[2] = new Wall(3);
        barriers[2] = new Wall(50);
        barriers[2] = new Wall(50);

        boolean flag = false;

        for (int i = 0; i < characters.length; i++) {
            for (int j = 0,x = 0; j < barriers.length; j++) {

                if (x == 0) {
                    barriers[j].overcome(characters[i]);
                } else {
                    continue;
                }

                if (!barriers[j].isPassed(characters[i]))
                    x += 1;

            }

        }

    }

}
