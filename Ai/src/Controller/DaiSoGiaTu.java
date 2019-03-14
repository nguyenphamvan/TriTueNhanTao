package Controller;

import java.util.HashMap;

public class DaiSoGiaTu {
    public HashMap<String,Double> hashMap1 = new HashMap<String, Double>();
    public HashMap<String,Double> hashMap2 = new HashMap<String, Double>();

    public DaiSoGiaTu() {
        hashMap1.put("khong", 0.0);
        hashMap1.put("rat thap", 0.125);
        hashMap1.put("thap", 0.25);
        hashMap1.put("hoi thap", 0.375);
        hashMap1.put("trung binh", 0.5);
        hashMap1.put("hoi cao", 0.625);
        hashMap1.put("cao", 0.75);
        hashMap1.put("rat cao", 0.875);
        hashMap1.put("hoan toan", 1.0);
        
        hashMap2.put("none", 0.0);
        hashMap2.put("very low", 0.125);
        hashMap2.put("low", 0.25);
        hashMap2.put("little low", 0.375);
        hashMap2.put("medium", 0.5);
        hashMap2.put("little high", 0.625);
        hashMap2.put("high", 0.75);
        hashMap2.put("very high", 0.875);
        hashMap2.put("completely", 1.0);
    }

    public HashMap<String, Double> getHashMap() {
        return hashMap1;
    }

    public HashMap<String, Double> getHashMap2() {
        return hashMap2;
    }
    
    public double getValue(String input){
        for(String key : hashMap1.keySet()){
            if(input.equals(key)){
                return hashMap1.get(key);
            }
        }
        return 0.0;
    }
    
      public double getValue2(String input){
        for(String key : hashMap2.keySet()){
            if(input.equals(key)){
                return hashMap2.get(key);
            }
        }
        return 0.0;
    }
}