public class Huffenpuff extends Hogwarts {
    private int hardWork;
    private int loyalty;
    private int honesty;

    public Huffenpuff(String name, int character, int magic, int transgression, int hardWork, int loyalty, int honesty) {
        super(name, character, magic, transgression);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardWork() {
        return hardWork;
    }

    public void setHardWork(int hardWork) {
        this.hardWork = hardWork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", факультет Пуффендуй" +
                ", трудолюбие " + hardWork +
                ", верность " + loyalty +
                ", честность" + honesty ;
    }
}
