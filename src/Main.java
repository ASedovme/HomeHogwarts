public class Main {
    public static void main(String[] args) {
        System.out.println("Hogwarts");


        Griffindor haPo = new Griffindor("Harry Potter", 34, 56, 78, 90, 87, 67);
        Griffindor heGr = new Griffindor("Hermiona Granger", 85, 90, 87, 42, 85, 75);
        Griffindor roWe = new Griffindor("Ronald Weasley", 75, 65, 45, 69, 75, 74);

        Huffenpuff zaSm = new Huffenpuff("Zacharias Smith", 75, 85, 38, 75, 46, 74);
        Huffenpuff ceDi = new Huffenpuff("Cedrik Diggory", 74, 76, 77, 75, 72, 64);
        Huffenpuff juFi = new Huffenpuff("Justin Finch-Flethley", 68, 69, 70, 71, 72, 73);

        Ravenclaw chCh = new Ravenclaw("Cho Chang", 76, 76, 75, 74, 73, 72, 71);
        Ravenclaw paPa = new Ravenclaw("Padma Patill", 74, 73, 75, 72, 83, 74, 66);
        Ravenclaw maBa = new Ravenclaw("Marcus Balbi", 64, 66, 65, 74, 72, 83, 64);

        Slitherin drMa = new Slitherin("Draco Malfoy", 95, 78, 79, 85, 69, 72, 78, 95);
        Slitherin grMo = new Slitherin("Grahem Montegy", 78, 64, 82, 65, 42, 36, 45, 66);
        Slitherin grGo = new Slitherin("Gregory Goyle", 64, 65, 48, 35, 65, 28, 44, 55);

        compareGriffindor(haPo,heGr);

    }
    public static void compareGriffindor (Griffindor first, Griffindor second){

    }



}
