package L2;


public class res {
    long gold;
    byte silver;
    short wood;
    long health;
    boolean hasHelper;

    public res(
            long inputGold,
            byte inputSilver,
            short inputWood,
            long inputHealth,
            boolean inputHasHelper
    ) {
        gold = inputGold;
        silver = inputSilver;
        wood = inputWood;
        health = inputHealth;
        hasHelper = inputHasHelper;
    }
}