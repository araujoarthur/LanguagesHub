import java.util.Scanner;

public class Atividade1{
    /* Podem ocorrer casos onde a partida comece em um dia e acabe no outro (22h-01h por exemplo).
        Nesse caso particular, a verificação por timestamp falharia pois o timestamp final é menor do que o inicial.
        Essa constante é utilizada para verificar que este caso _PODE_ estar ocorrendo. 
    */
    static final int START_TIME_CHECK_TRIGGER = 20 * 60;

    /*
        Como uma aula prática ou uma partida amistosa amadora não deve durar mais do que 5 horas, é estabelecido um limite de tempo
        para a verificação de que não houve erro na entrada dos horários.
     */
    static final int END_TIME_PANIC_TRIGGER = 5 * 60;

    static final double PRICE_PER_HOUR = 90.0;

    public static void main(String[] args) {    
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("Insira o horário de inicio da partida (hh:mm)");
            
            String[] inicio = scanner.nextLine().split(":");

            System.out.println("Insira o horário de término da partida (hh:mm)");
            String[] fim = scanner.nextLine().split(":");

            DiscountPolicy discount = new DiscountPolicy(3, 10, PRICE_PER_HOUR);

            int start_timestamp = Integer.parseInt(inicio[0]) * 60 + Integer.parseInt(inicio[1]);
            int end_timestamp = Integer.parseInt(fim[0]) * 60 + Integer.parseInt(fim[1]);

            if (start_timestamp >= START_TIME_CHECK_TRIGGER && 
                end_timestamp < start_timestamp && 
                end_timestamp < END_TIME_PANIC_TRIGGER)
            {
                end_timestamp += 24 * 60;
            } else if (end_timestamp < start_timestamp) {
                System.out.println("Horário de término inválido");
                return; 
            }

            double to_pay = calculateFinalPrice(calculateDurationHours(start_timestamp, end_timestamp), discount);

            System.out.println("O valor a pagar é: R$" + to_pay);
        }
    }

    static int calculateDurationHours(int start_timestamp, int end_timestamp) {
        return Math.ceilDiv(end_timestamp - start_timestamp, 60);
    }

    static double calculateFinalPrice(int duration, DiscountPolicy discount_policy) {
        return duration * discount_policy.applyPolicy(duration);
    }

    static double calculateFinalPrice(int duration) {
        return duration * PRICE_PER_HOUR;
    }
}


class DiscountPolicy {
    int duration;
    double discount;
    private double price_per_hour_under_policy;
    private double INNER_PRICE_PER_HOUR;
    public DiscountPolicy(int duration, double given_discount, double price_per_hour) {
        this.duration = duration;
        this.discount = given_discount/100;
        this.price_per_hour_under_policy = 1 - this.discount;
        this.INNER_PRICE_PER_HOUR = price_per_hour;
    }

    public double applyPolicy(int match_duration) {
        // Se a partida durar MAIS que 3 horas, vai aplicar o desconto, se durar 2:59, nao.
        if (this.duration < match_duration) {
            return this.INNER_PRICE_PER_HOUR * this.price_per_hour_under_policy;
        }

        return this.INNER_PRICE_PER_HOUR;
    }
}