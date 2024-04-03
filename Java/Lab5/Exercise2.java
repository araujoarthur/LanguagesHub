import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Exercise2 {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            String[] months = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
            Map<String, Map<String, String>> seasons = new HashMap<>();

            Map<String, String> northSeasons = new HashMap<>();
            northSeasons.put("Janeiro", "Inverno");
            northSeasons.put("Fevereiro", "Inverno");
            northSeasons.put("Março", "Primavera");
            northSeasons.put("Abril", "Primavera");
            northSeasons.put("Maio", "Primavera");
            northSeasons.put("Junho", "Verão");
            northSeasons.put("Julho", "Verão");
            northSeasons.put("Agosto", "Verão");
            northSeasons.put("Setembro", "Outono");
            northSeasons.put("Outubro", "Outono");
            northSeasons.put("Novembro", "Outono");
            northSeasons.put("Dezembro", "Inverno");

            seasons.put("NORTE", northSeasons);
            
            Map<String, String> southSeasons = new HashMap<>();

            southSeasons.put("Janeiro", "Verão");
            southSeasons.put("Fevereiro", "Verão");
            southSeasons.put("Março", "Outono");
            southSeasons.put("Abril", "Outono");
            southSeasons.put("Maio", "Outono");
            southSeasons.put("Junho", "Inverno");
            southSeasons.put("Julho", "Inverno");
            southSeasons.put("Agosto", "Inverno");
            southSeasons.put("Setembro", "Primavera");
            southSeasons.put("Outubro", "Primavera");
            southSeasons.put("Novembro", "Primavera");
            southSeasons.put("Dezembro", "Verão");

            seasons.put("SUL", southSeasons);

            String[] hemispheres = {"NORTE", "SUL"};

            System.out.println("Que mês é? Digite o número do mês (1-12): ");
            int month = scanner.nextInt();

            while (month < 1 || month > 12) {
                System.out.println("Mês inválido. Digite o número do mês (1-12): ");
                month = scanner.nextInt();
            }

            System.out.println("Qual hemisfério você está?");
            String hemisphere = scanner.nextLine();

            while (!hemisphere.toUpperCase().equals("NORTE") && !hemisphere.toUpperCase().equals("SUL")) {
                System.out.println("Hemisfério inválido. Digite NORTE ou SUL: ");
                hemisphere = scanner.nextLine();
            }

            System.out.println("Estação: " + seasons.get(hemisphere.toUpperCase()).get(months[month - 1]));
        }
    }
}