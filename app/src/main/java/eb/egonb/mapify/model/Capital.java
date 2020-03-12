package eb.egonb.mapify.model;

import com.google.android.gms.maps.model.LatLng;

public class Capital {

    private LatLng coordinate;
    private String name, sante;

    public Capital(LatLng coordinate, String name, String sante) {
        this.coordinate = coordinate;
        this.name = name;
        this.sante = sante;
    }

    public LatLng getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(LatLng coordinate) {
        this.coordinate = coordinate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSante() {
        return sante;
    }

    public void setSante(String sante) {
        this.sante = sante;
    }
}
