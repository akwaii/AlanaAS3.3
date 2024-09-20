//gift skill class that extends skill
class GiftSkill extends Skill{

    //constructor
    public GiftSkill(String name, int skillLevel){
        super(name, "Gift", skillLevel);
    }

    //abstract method override
    @Override
    public void identifySkill(){
        System.out.println("Gift Skill of " + getName() + " has a level of " + getSkillLevel() + ".");
    }
}