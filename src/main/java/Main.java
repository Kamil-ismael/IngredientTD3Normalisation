public class Main {
    public static void main(String[] args) {
        DataRetriever dataRetriever = new DataRetriever();
        Ingredient laitue = dataRetriever.findIngredientById(1);
        System.out.println(laitue);

    }
}