class HardSkill extends Skill{

    //constructor
    public HardSkill(String name, int skillLevel) {
        super(name,"Hard", skillLevel);
    }

    //abstract method override
    @Override
    public void identifySkill(){
        System.out.println("Hard Skill of " + getName() + " has a level of " + getSkillLevel() + ".");
    }
}