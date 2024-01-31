import java.util.Scanner;

class Room {
    float length;
    float width;

    float getArea(float x, float y) {
        float area = x * y;
        return area;
    }
}

public class Area {
    public static void main(String[] args) {
        Room room1 = new Room();
        float area = room1.getArea(10, 20);
        System.out.println("The area of room: " + area);
    }
}
