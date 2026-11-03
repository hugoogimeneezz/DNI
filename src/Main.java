public class Main {
    public static void main(String[] args) {
        Dni dni = new Dni(18957690, 'E');
        System.out.println(dni);
        System.out.println(dni.isCorrect() ? "correcto" : "incorrecto" );

        Dni dni2= new Dni("18957690J");
        System.out.println(dni2);
    }

}
