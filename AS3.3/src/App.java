public class App {
    public static void main(String[] args) throws Exception {

        //instances + calling identifyskill() method
        HardSkill programming = new HardSkill("Programming", 4);
        programming.identifySkill();

        SoftSkill communication = new SoftSkill("Communication", 8);
        communication.identifySkill();

        GiftSkill mercy = new GiftSkill("Mercy", 7);
        mercy.identifySkill();

        TalentSkill organization = new TalentSkill("Organization", 6);
        organization.identifySkill();
    }
}