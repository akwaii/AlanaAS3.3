//abstract class for general skill
abstract class Skill {
    private String name, type;
    private int skillLevel;

    //constructor for skill class
    public Skill(String name, String type, int skillLevel) {
        this.name = name;
        this.type = type;
        this.skillLevel = skillLevel;
    }

    //getter for name
    public String getName(){
        return name;
    }

    //setter for name
    public void setName(String n){
        this.name = n;
    }

    //getter for type
    public String getType(){
        return type;
    }

    //setter for type
    public void setType(String t){
        this.type = t;
    }

    //getter for skill level
    public int getSkillLevel(){
        return skillLevel;
    }

    //setter for skill level
    public void setSkillLevel(int s){
        this.skillLevel = s;
    } 

    //abstract method 
    public abstract void identifySkill();
}