public interface Barrier {

    int getSize(); // размер барьепа

    boolean isPassed(Character character); // методо который проверяет может ли персонаж переодалеть препятствие
    void overcome(Character character); // метод для взаимодействия персонажа с препятствием
}
