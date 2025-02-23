//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
                Cilindro cilindro = new Cilindro();
                cilindro.setRaio(2);
                cilindro.setAltura(6);

                Cilindro cil2=new Cilindro();
                cil2.setRaio(3);
                cil2.setAltura(5);

                System.out.println("\nVolume: " + cilindro.calcularVolume());
                System.out.println("Área: " + cilindro.calcularArea());

                System.out.println("\nVolume: " + cil2.calcularVolume());
                System.out.println("Área: " + cil2.calcularArea());


            }

        }
