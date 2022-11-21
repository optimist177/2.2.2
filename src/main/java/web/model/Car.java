package web.model;

public class Car {

    private String marka;
    private String color;
    private int series;

    public Car(String marka, String color, int series) {
        this.marka = marka;
        this.color = color;
        this.series = series;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }


    @Override
    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                ", color='" + color + '\'' +
                ", series=" + series +
                '}';
    }
}
