import java.util.HashMap;
import java.util.Map;

public class capitalMap {
    public static void main(String[] args) {
        Map<String, String> capitalMap = new HashMap<>();
        capitalMap.put("USA","Washington");
        capitalMap.put("Japan","Tokyo");
        capitalMap.put("Thailand","Bangkok");
        capitalMap.put("UK","London");
        capitalMap.put("Australia","Canberra");
        capitalMap.put("Denmark","Copenhagen");
        capitalMap.put("Egypt","Cairo");
        capitalMap.put("Vietnam","Hanoi");
        capitalMap.put("Italy","Rome");
        capitalMap.put("Brazil","Brazilia");

        capitalMap.forEach((k, v)->{
            System.out.println(k + " :  " + v);
        });
    }
}
