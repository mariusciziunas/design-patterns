package edu.ciziunas.template;

public class TestCiziunasBakery {

    /**
     * Has someone ordered one apple and one Cheery pie?
     * @param args
     */
    public static void main(String[] args) {
        Pie applePie = new ApplePie();
        applePie.makePie();

        Pie cherryPie = new CherryPie();
        cherryPie.makePie();
    }
}
