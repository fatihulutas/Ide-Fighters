package idefigthers;

public class Match {
    Fighters f1;
    Fighters f2;
    int minWeight;
    int maxWeight;
    
    public Match(Fighters f1, Fighters f2, int minWeight, int maxWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }
    
    public void run(){
        if (checkWeight()){
            System.out.println();
            System.out.println("<<<FIGHT>>>");
            System.out.println();
            while (f1.health > 0 && f2.health > 0){
                f2.health = f1.hit(f2);
                if (isWin()){
                    break;
                }
                f1.health = f2.hit(f1);
                if (isWin()){
                    break;
                }
                printScore();
            }
        }else {
            System.out.println("Weights does not match !");
        }
    }
    
    public boolean checkWeight(){
        return (f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight);
    }
    
    public boolean isWin(){
        if (f1.health == 0){
            System.out.println();
            System.out.println("<<<MATCH IS OVER>>>");
            System.out.println();
            System.out.println("WINNER: " + f2.name);
            return true;
        }
        if (f2.health == 0){
            System.out.println("<<<MATCH IS OVER>>>");
            System.out.println("WINNER: " + f1.name);
            return true;
        }
        return false;
    }
    
    public void printScore(){
        System.out.println("--------------------");
        System.out.println(f1.name + "'s health:\t" + f1.health);
        System.out.println(f2.name + "'s health:\t" + f2.health);
        System.out.println("--------------------");
    }
    
    
}    