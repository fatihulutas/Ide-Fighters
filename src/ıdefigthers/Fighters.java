package ýdefigthers;

public class Fighters {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;
    
    public Fighters(String name, int damage, int health, int weight, int dodge){
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }
    
    public int hit(Fighters foe){
        System.out.println(this.name + " hit " + "'" + this.damage + "'" + " damage to " + foe.name);
        
        if (foe.dodge()){
            System.out.println(foe.name + " DODGED !");
            return foe.health;
        }
        if (foe.health - this.damage < 0){
            return 0;
        }
        return foe.health - this.damage;
    }
    
    public boolean dodge(){
        double randomNumber = Math.random() * 100;
        return randomNumber <= this.dodge;
    }
    
}
