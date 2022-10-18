public class BonusMilesService {
    public int calculate(int cost) {
        int costPerMile = 20;
        int miles = cost / costPerMile;
        return miles;
    }
}