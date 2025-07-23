public class CompanionPlant {
    public Boolean companionPlants(String plant1, String plant2) {
    //code here
    String pair1 = plant1 + "," + plant2;
    String pair2 = plant2 + "," + plant1;

    return pair1.equals("lettuce, cucumber") || pair2.equals("cucumber,lettuce") ||
            pair1.equals("lettuce, onions") || pair2.equals("onions, lettuce") || 
            pair1.equals("onions, carrots") || pair2.equals("carrots, onions") || 
            pair1.equals("onions, tomatoes") || pair2.equals("tomatoes , onions");
    }
}
