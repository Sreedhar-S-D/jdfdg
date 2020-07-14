package telusko.genericsandcollections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class maps {
    public static void main(String[] args) {
        Map<String,String> values = new HashMap<>();
        values.put("Name ","Sreedhar");
        values.put("Surname ","Dhulkhed");
        values.put("Age ","19");
        values.put("College ","RVCE");
        Set<String> keys = values.keySet();
        for( String key : keys)
        {
            System.out.println(key +" : "+ values.get(key));
        }

    }
}
