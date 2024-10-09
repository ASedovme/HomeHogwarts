public class Slitherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resource;
    private int authority;

    public Slitherin(String name, int character, int magic, int transgression, int cunning, int determination, int ambition, int resource, int authority) {
        super(name, character, magic, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resource = resource;
        this.authority = authority;
    }

    void compare(Slitherin first) {
        int sum1 = first.getAmbition() + first.getAuthority() + first.getCunning() + first.getResource() + first.getDetermination();
        int sum2 = ambition + authority + cunning + resource + determination;
        if (sum1 > sum2) {
            System.out.println(first.getName() + " лучший слизеринец");
        } else {
            System.out.println(getName() + " лучший слизеринец");
        }
    }

    public int getAuthority() {
        return authority;
    }

    public void setAuthority(int authority) {
        this.authority = authority;
    }

    public int getResource() {
        return resource;
    }

    public void setResource(int resource) {
        this.resource = resource;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", факультет Слизериин" +
                ", хитрость " + cunning +
                ", решительность " + determination +
                ", амбициозность " + ambition +
                ", находчивость " + resource +
                ", жажда власти" + authority;
    }
}
