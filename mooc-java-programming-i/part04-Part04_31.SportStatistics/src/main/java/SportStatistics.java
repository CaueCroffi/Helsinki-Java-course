
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("File: ");
        String file = scanner.nextLine();
        
        System.out.println("Team: ");
        String team = scanner.nextLine();
        
        int[] teamStats = statistics(file, team);
        
        System.out.println("Games: " + teamStats[0]);
        System.out.println("Wins: " + teamStats[1]);
        System.out.println("Losses: " + teamStats[2]);
        

    }
    
    public static int[] statistics(String file, String team){
        int games = 0;
        int wins = 0;
        int loses = 0;
        
        try(Scanner fileReader = new Scanner (Paths.get(file))){
            while (fileReader.hasNextLine()){
                String currentLine = fileReader.nextLine();
                
                if (currentLine.isEmpty()) {
                    continue;
                }
                
                String[] stats = currentLine.split(",");
                
                String homeTeam = stats[0];
                String opposingTeam = stats[1];
                int homeScore = Integer.valueOf(stats[2]);
                int opposingScore = Integer.valueOf(stats[3]);
                
                if (team.equals(homeTeam)) {
                    games++;
                    if (homeScore >= opposingScore) {
                        wins++;
                    }else{
                        loses++;
                    }
                }else if(team.equals(opposingTeam)){
                    games++;
                    if (opposingScore >= homeScore) {
                        wins++;
                    }else{
                        loses++;
                    }
                }
            }
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        return new int[]{games,wins,loses};
    }

}
