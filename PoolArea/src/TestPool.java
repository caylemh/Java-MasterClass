public class TestPool {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(12, 30);
        System.out.println("Rect.width = " + rect.getWidth());
        System.out.println("Rect.length = " + rect.getLength());
        System.out.println("Rect.area = " + rect.getArea());
        Cuboid cube = new Cuboid(12, 45,10);
        System.out.println("Cuboid.width = " + cube.getWidth());
        System.out.println("Cuboid.length = " + cube.getLength());
        System.out.println("Cuboid.height = " + cube.getHeight());
        System.out.println("Cuboid.area = " + cube.getArea());
        System.out.println("Cuboid.volume = " + cube.getVolume());
    }
}
