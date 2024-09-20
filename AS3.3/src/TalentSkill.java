//talent skill class that extends skill
class TalentSkill extends Skill{

    //constructor
    public TalentSkill(String name, int skillLevel){
        super(name, "Talent", skillLevel);
    }

    //abstract method override
    @Override
    public void identifySkill(){
        System.out.println("Talent Skill of " + getName() + " has a level of " + getSkillLevel() + ".");
    }
}