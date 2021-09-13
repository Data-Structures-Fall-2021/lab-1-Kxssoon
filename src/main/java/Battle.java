public class Battle {
    
    // YOUR CODE GOES HERE
    // instance variables

    public int round_num = 1; // always going to start on round 1
    public String monster1Name;
    public float monster1Attack;
    public float monster1Defense;
    public float monster1HP;
    public String monster2Name;
    public float monster2Attack;
    public float monster2Defense;
    public float monster2HP;
    public static float damage1;
    public static float damage2;

    // Constructors
    public Battle(String monster1_name, float monster1_attack, float monster1_defense, float monster1_health,
                  String monster2_name, float monster2_attack, float monster2_defense, float monster2_health){
        this.monster1Name = monster1_name;
        this.monster1Attack = monster1_attack;
        this.monster1Defense = monster1_defense;
        this.monster1HP = monster1_health;
        this.monster2Name = monster2_name;
        this.monster2Attack = monster2_attack;
        this.monster2Defense = monster2_defense;
        this.monster2HP = monster2_health;
        damage1 = monster1_attack - monster2_defense;
        damage2 = monster2_attack - monster1_defense;

    }
    // methods to get the monsters names
    public String getMonster1Name(){
        return monster1Name;
    }
    public String getMonster2Name(){
        return monster2Name;
    }

    // methods to see whether any of the monsters have fainted
    public boolean isMonster1Dead(){
        return monster1HP <= 0.0f;
    }
    public boolean isMonster2Dead(){
        return monster2HP <= 0.0f;
    }
    public void simulateRound(){
        System.out.printf("Round %d \n", round_num);
        System.out.printf("%s does %.1f points of damage to %s \n", monster1Name, damage1, monster2Name);
        monster2HP = monster2HP - damage1;
        System.out.printf("%s does %.1f points of damage to %s \n", monster2Name, damage2, monster1Name);
        monster1HP = monster1HP - damage2;
        System.out.printf("%s: %.1f \n", monster1Name, monster1HP);
        System.out.printf("%s: %.1f \n", monster2Name, monster2HP);
        round_num++;
        System.out.print("\n");

    }
    public float getMonster1HP(){
        return monster1HP;
    }
    public float getMonster2HP(){
        return monster2HP;
    }



}
