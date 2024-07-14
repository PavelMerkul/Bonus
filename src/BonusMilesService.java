public class BonusMilesService {

    public int calculate(int ticketPrice) {
        int milesCoefficient = 20; // Коэффициент для расчета количества миль
        int miles = ticketPrice / milesCoefficient; // Расчет количества миль
        return miles;
    }

}
