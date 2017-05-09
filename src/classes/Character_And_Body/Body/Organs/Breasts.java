package classes.Character_And_Body.Body.Organs;

public class Breasts {

    private boolean exists;
    private boolean lactating;
    private int milkCapacity;
    private int milkReCharge;
    private int size;
    private int breastCount;
    private int nippleCount;
    private BreastSize breastSize;

    public Breasts(boolean lactating, int milkCapacity, int milkReCharge, int size, int breastCount, int nippleCount,BreastSize breastSize) {
        if (breastSize == BreastSize.NONE){
            this.exists = false;
        } else {
            this.exists = true;
        }
        this.lactating = lactating;
        this.milkCapacity = milkCapacity;
        this.milkReCharge = milkReCharge;
        this.size = breastSizeToSize(breastSize);
        this.breastCount = breastCount;
        this.nippleCount = nippleCount;
        this.breastSize = breastSize;
    }

    public Breasts(BreastSize breastSize) {
        if (breastSize == BreastSize.NONE){
            this.exists = false;
        } else {
            this.exists = true;
        }
        this.lactating = false;
        this.milkCapacity = 0;
        this.milkReCharge = 0;
        this.size = breastSizeToSize(breastSize);
        this.breastCount = 2;
        this.nippleCount = 1;
        this.breastSize = breastSize;
    }

    private int breastSizeToSize(BreastSize breastSize){
        switch(breastSize){
            case A:  return 10;
            case B:  return 20;
            case C:  return 30;
            case D:  return 40;
            case DD: return 55;
            case E:  return 60;
            case EE: return 65;
            case F:  return 70;
            case FF: return 75;
            case G:  return 80;
            case GG: return 85;
            case H:  return 90;
            case HH: return 95;
            default: return 0;
        }
    }
    public boolean isExists() {
        return exists;
    }

    public void setExists(boolean exists) {
        this.exists = exists;
    }

    public boolean isLactating() {
        return lactating;
    }

    public void setLactating(boolean lactating) {
        this.lactating = lactating;
    }

    public int getMilkCapacity() {
        return milkCapacity;
    }

    public void setMilkCapacity(int milkCapacity) {
        this.milkCapacity = milkCapacity;
    }

    public int getMilkReCharge() {
        return milkReCharge;
    }

    public void setMilkReCharge(int milkReCharge) {
        this.milkReCharge = milkReCharge;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getBreastCount() {
        return breastCount;
    }

    public void setBreastCount(int breastCount) {
        this.breastCount = breastCount;
    }

    public int getNippleCount() {
        return nippleCount;
    }

    public void setNippleCount(int nippleCount) {
        this.nippleCount = nippleCount;
    }

    public BreastSize getBreastSize() {
        return breastSize;
    }

    public void setBreastSize(BreastSize breastSize) {
        this.breastSize = breastSize;
    }
}
