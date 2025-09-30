package main;

public class CafeConfig {
    private CafeConfig() {
    }
    private static CafeConfig Instance = null;
    private String CafeName = "default name";
    public String GetCafeName(){return CafeName;}
    public Boolean SetCafeName(String Value) //thread unsafe
    {
        if(Value == null){return false;}
        CafeName = Value;
        return true;
    }

    public static CafeConfig getInstance() //thread unsafe
    {
        if(Instance == null){
            Instance = new CafeConfig();
        }
        return Instance;
    }

}
