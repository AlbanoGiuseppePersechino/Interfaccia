public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo(5,3);
        Triangolo triangolo = new Triangolo(4,6);

        System.out.println("Area del rettangolo: " + rettangolo.calcoloArea());
        System.out.println("Area del triangolo: " + triangolo.calcoloArea());
    }
}
