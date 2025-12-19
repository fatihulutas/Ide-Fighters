package idefigthers;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Fighters muhammedAli = new Fighters("Muhammed Ali", 10, 90, 80, 36 );
        
        Fighters mikeTyson = new Fighters("Mike Tyson", 20, 100, 95, 17 );
        
        Match match = new Match(muhammedAli, mikeTyson, 75, 120 );
        
        System.out.println("    --------------------    ");
        System.out.println("       <IDE FIGTHERS>"       );
        System.out.println("    --------------------    ");
        
        try {
            Thread.sleep(350); 
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); 
        }
        
        System.out.println();
        System.out.print("Press ENTER to continue");
        input.nextLine();
        
        try {
            Thread.sleep(350); 
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); 
        }
        
        String mainMenu;
        mainMenu = """
                   1- GAME START
                   2- CHARACTERS
                   """;
        
        System.out.println();
        System.out.print(mainMenu);
        System.out.println();
        
        
        System.out.print("Type your selection :");
        String mainMenuSelect = input.nextLine();
        System.out.println();
        
        try {
            Thread.sleep(350); 
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); 
        }
        
        if ("1".equals(mainMenuSelect) || "Game Start".equals(mainMenuSelect) || "GAME START".equals(mainMenuSelect) || "game start".equals(mainMenuSelect)){
            // KARAKTER SEÇÝM MENÜSÜ BURAYA GELECEK
            String characterList;
            characterList = """
                            1- Muhammed Ali
                            2- Mike Tyson
                            3- Khabip
                            4- Khamzat
                            """;
            System.out.println(characterList);
            
            System.out.println("-Choose Character-");
            System.out.print("FIGHTER ONE :");
            String fighterOne = input.nextLine();
            System.out.print("FIGHTER TWO :");
            String fighterTwo = input.nextLine();
            
            if (("1".equals(fighterOne) && "2".equals(fighterTwo)) || ("Muhammed Ali".equals(fighterOne) && "Mike Tyson".equals(fighterTwo))){
                match.run();
            }
            
        }else if ("2".equals(mainMenuSelect) || "Characters".equals(mainMenuSelect) || "CHARACTERS".equals(mainMenuSelect) || "characters".equals(mainMenuSelect)){
            String characterMenu;
            characterMenu = """
                            1- ADD CHARACTER
                            2- DELETE CHARACTER
                            3- CHARACTER LIST
                            """;
            System.out.println(characterMenu);
        }
        
        
        
        
    }
    
}
