class Room {
  float length;
  float breadth;

  void get(float l, float b){
    length = l;
    breadth = b;
  }

}

class RoomArea {
  public static void main(String a[]){
    Room r = new Room();
    r.get(10.5f, 20.0f);
    float area = r.length * r.breadth;
    System.out.println("Area of the room is: " + area);
  }
}