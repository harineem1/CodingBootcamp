package HOME;

public class Specifications {
    private float length;
    private float width;
    private float height;

    private String paintColor;
    private String floortype;

    public Specifications() {
    }

    public float area;{
        area = ( length*width );
    }
    public float perimeter; {
        perimeter = 2*(length + width);
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String getPaintColor() {
        return paintColor;
    }

    public void setPaintColor(String paintColor) {
        this.paintColor = paintColor;
    }

    public String getFloortype() {
        return floortype;
    }

    public void setFloortype(String floortype) {
        this.floortype = floortype;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(float perimeter) {
        this.perimeter = perimeter;
    }
}
