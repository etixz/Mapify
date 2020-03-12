package eb.egonb.mapify.model;

import com.google.android.gms.maps.model.LatLng;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CapitalDAO {

    private ArrayList<Capital> capitals;

    private static final CapitalDAO INSTANCE = new CapitalDAO();

    private CapitalDAO(){

    }

    public ArrayList<Capital> getCapitals(){
        if(capitals == null){
            capitals = new ArrayList<>();
            capitals.add(new Capital(new LatLng(51.528308, -0.381789), "Londen", "Cheers!"));
            capitals.add(new Capital(new LatLng(60.1098678, 24.738504), "Helsinki", "Sköll!"));
            capitals.add(new Capital(new LatLng(69.1098678, 24.738504), "Sydney", "Shrimp on the barby!"));
        }
        return capitals;
    }

    public static CapitalDAO getINSTANCE() {
        return INSTANCE;
    }
}
