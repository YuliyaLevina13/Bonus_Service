public class BonusMilesService {
    public int calculate(int price) {
        int milePrise = 20;
        int miles = (int) price / milePrise;

        return miles;
    }
}

