public class Hogwarts {
    private String name;
    private int character;
    private int magic;
    private int transgression;

    public Hogwarts(String name, int character, int magic, int transgression) {
        this.name = name;
        this.character = character;
        this.magic = magic;
        this.transgression = transgression;
    }

    public void compare(Hogwarts first) {
        if (first.getTransgression() > transgression) {
            System.out.println(first.getName() + " лучше трансгессирует");
        } else {
            System.out.println(getName() + " лучше трансгессирует");
        }
        if (first.getMagic() > magic) {
            System.out.println(first.getName() + " лучше машет палочкой");
        } else {
            System.out.println(getName() + " лучше лучше машет палочкой");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCharacter() {
        return character;
    }

    public void setCharacter(int character) {
        this.character = character;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    @Override
    public String toString() {
        return "Студент Хогвартса " +
                "Имя " + name +
                ", характер " + character +
                ", магия " + magic +
                ", трансгрессия " + transgression;
    }
}
