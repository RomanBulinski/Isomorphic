public class Main {


    public static void main(String[] args) {

        Isomo isomo = new Isomo();
        String word1 = "abayw";
        String word2 = "xtxer";

        System.out.println( isomo.isIsomorphic( word1, word2) );
        System.out.println( isomo.isIsomorphic( word2, word1) );

        System.out.println( isomo.allBoolean( word1, word2) );

    }
}
