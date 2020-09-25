package hu.kincstar.javasetraining.space;

public class CelestialCoordinates {
    private int corX;
    private int corY;
    private int corZ;
    private int id;

    public CelestialCoordinates(int corX, int corY, int vorZ) {
        this.corX = corX;
        this.corY = corY;
        this.corZ = vorZ;
    }

    public void setCorX(int corX) {
        this.corX = corX;
    }

    public void setCorY(int corY) {
        this.corY = corY;
    }

    public void setCorZ(int corZ) {
        this.corZ = corZ;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCorX() {
        return corX;
    }

    public int getCorY() {
        return corY;
    }

    public int getCorZ() {
        return corZ;
    }
}
