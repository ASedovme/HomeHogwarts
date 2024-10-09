public class Ravenclaw extends Hogwarts {
    private int mind;
    private int wisdom;
    private int wit;
    private int creation;

    public Ravenclaw(String name, int character, int magic, int transgression, int mind, int wisdom, int wit, int creation) {
        super(name, character, magic, transgression);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    void compare(Ravenclaw first) {
        int sum1 = first.getCreation() + first.getMind() + first.getWisdom() + first.getWit();
        int sum2 = creation + mind + wisdom + wit;
        if (sum1 > sum2) {
            System.out.println(first.getName() + " лучший когтевранец");
        } else {
            System.out.println(getName() + " лучший когтевранец");
        }
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", факультет Когтевран" +
                ", ум " + mind +
                ", мудрость " + wisdom +
                ", остроумие " + wit +
                ", творчество " + creation;
    }
}
