public class Griffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Griffindor(String name, int character, int magic, int transgression, int nobility, int honor, int bravery) {
        super(name, character, magic, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    void compare(Griffindor first) {
        int sum1 = first.getBravery() + first.getHonor() + first.getNobility();
        int sum2 = bravery + honor + nobility;
        if (sum1 > sum2) {
            System.out.println(first.getName() + " лучший гриффиндорец");
        } else {
            System.out.println(getName() + " лучший гриффиндорец");
        }
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", факультет Гриффиндор" +
                ", благородство " + nobility +
                ", храбрость " + honor +
                ", отвага " + bravery;
    }
}
