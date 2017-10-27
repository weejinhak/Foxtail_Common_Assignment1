public class Color implements Cloneable{
    private int red;
    private int green;
    private int blue;

    Color() {red=0;green=0;blue=0;}

    Color(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    int getRed() {
        return red;
    }

    int getGreen() {
        return green;
    }

    int getBlue() {
        return blue;
    }

    void setRed(int red) {
        this.red = red;
    }

    void setGreen(int green) {
        this.green = green;
    }

    void setBlue(int blue) {
        this.blue = blue;
    }

    @Override
    public Color clone() {
        try {
            return (Color) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

}
