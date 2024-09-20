class SoftSkill extends Skill{

    //constructor
    public SoftSkill(String name, int skillLevel){
        super(name, "Soft", skillLevel);
    }

    //absract method override
    @Override
    public void identifySkill(){
        System.out.println("Soft Skill of " + getName() + " has a level of " + getSkillLevel() + ".");
    }
}