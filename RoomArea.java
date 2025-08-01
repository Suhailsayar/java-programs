class RoomArea {
  float length;
  float breadth;

  void get(float l, float b){
    length = l;
    breadth = b;
  }
  public static void main(String a[]){
    RoomArea r = new RoomArea();
    r.get(10.5f, 20.0f);
    float area = r.length * r.breadth;
    System.out.println("Area of the room is: " + area);
  }
}