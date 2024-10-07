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
        return "Hogwarts{" +
                "name='" + name + '\'' +
                ", character=" + character +
                ", magic=" + magic +
                ", transgression=" + transgression +
                '}';
    }
}
