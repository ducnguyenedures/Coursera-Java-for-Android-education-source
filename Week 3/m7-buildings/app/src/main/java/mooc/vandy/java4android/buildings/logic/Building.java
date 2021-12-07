package mooc.vandy.java4android.buildings.logic;

/**
 * This is the Building class file.
 */
public class Building {

    // TODO - Put your code here.
    private int mLength;
    private int mWidth;
    private int mLotLength;
    private int mLotWidth;

    //constructor
    public Building(int length, int width, int lotLength, int lotWidth) {
        this.mLength = length;
        this.mWidth = width;
        this.mLotLength = lotLength;
        this.mLotWidth = lotWidth;
    }

    //getters

    public int getLength() {
        return mLength;
    }

    public void setLength(int length) {
        this.mLength = length;
    }

    public int getWidth() {
        return mWidth;
    }

    public void setWidth(int width) {
        this.mWidth = width;
    }

    //setters

    public int getLotLength() {
        return mLotLength;
    }

    public void setLotLength(int lotLength) {
        this.mLotLength = lotLength;
    }

    public int getLotWidth() {
        return mLotWidth;
    }

    public void setLotWidth(int lotWidth) {
        this.mLotWidth = lotWidth;
    }

    //calculate the building area
    public int calcBuildingArea() {
        return mLength * mWidth;
    }

    //calculate the lot Area
    public int calcLotArea() {
        return mLotLength * mLotWidth;
    }

    public String toString() {
        return "Owner:n/a";
    }

}
