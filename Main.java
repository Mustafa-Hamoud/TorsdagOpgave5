public class Main {
    // 1.a – main metode
    public static void main(String[] args) {
        // 1.g – opret 6 teams
        Team t1 = new Team("Team1");
        Team t2 = new Team("Team2");
        Team t3 = new Team("Team3");
        Team t4 = new Team("Team4");
        Team t5 = new Team("Team5");
        Team t6 = new Team("Team6");

        // 1.i – sæt rang
        t1.setRank(1);
        t2.setRank(2);
        t3.setRank(3);
        t4.setRank(4);
        t5.setRank(5);
        t6.setRank(6);

        // 1.l – tilføj spillere
        t1.addPlayer("Andreas");
        t1.addPlayer("Mikkel");

        t2.addPlayer("Sarah");
        t2.addPlayer("Jonas");

        t3.addPlayer("Amir");

        t4.addPlayer("Camilla");

        t5.addPlayer("Kasper");

        t6.addPlayer("Mads");

        // 1.k – print teams (bruger toString automatisk)
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
        System.out.println(t5);
        System.out.println(t6);
    }
}