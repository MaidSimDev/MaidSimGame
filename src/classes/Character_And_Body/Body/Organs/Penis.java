package classes.Character_And_Body.Body.Organs;

public class Penis {

    private boolean exists;
    private boolean fertile;
    private int cumCapacity;
    private int cumReCharge;
    private int length;

    public Penis(boolean exists, boolean fertile, int cumCapacity, int cumReCharge, int length) {
        this.exists = exists;
        this.fertile = fertile;
        this.cumCapacity = cumCapacity;
        this.cumReCharge = cumReCharge;
        this.length = length;
    }

    public boolean isExists() {
        return exists;
    }

    public void setExists(boolean exists) {
        this.exists = exists;
    }

    public boolean isFertile() {
        return fertile;
    }

    public void setFertile(boolean fertile) {
        this.fertile = fertile;
    }

    public int getCumCapacity() {
        return cumCapacity;
    }

    public void setCumCapacity(int cumCapacity) {
        this.cumCapacity = cumCapacity;
    }

    public int getCumReCharge() {
        return cumReCharge;
    }

    public void setCumReCharge(int cumReCharge) {
        this.cumReCharge = cumReCharge;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
