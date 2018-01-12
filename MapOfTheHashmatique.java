import java.util.HashMap;

public class MapOfTheHashmatique {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<>();
        trackList.put("Scare Easy",
                "My love's an ocean, You better not cross it, Yeah I've been the distance, And I need some rest");
        trackList.put("Mr. Tambourine Man",
                "Hey! Mr. Tambourine Man, play a song for me, I'm not sleepy and there is no place I'm going to");
        trackList.put("Magic",
                "I got a coin in my palm, I can make it disappear, I got a card up my sleeve");
        trackList.put("Round Here", 
                "Step out the front door like a ghost into the fog where no one notices the contrast of white on white.");

        String name = trackList.get("Scare Easy");
        System.out.println(name);
        for (HashMap.Entry<String, String> entry : trackList.entrySet()) {
            System.out.format("%s: %s", entry.getKey(), entry.getValue());
            System.out.println();
        }
    }
}