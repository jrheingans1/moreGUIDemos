package tempconvgui;

public class FakeGui {
    public static void main(String[] args) {
        Service s = new Service();
        try {
            s.method();
        }catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("problem");
        }
        
    }
}
