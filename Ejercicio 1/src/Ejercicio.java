import javax.swing.JOptionPane;

public class Ejercicio {

                public static void main(String[] args) {
                    String nombre = JOptionPane.showInputDialog("Ingresa tu nombre por favor: ");
                    JOptionPane.showMessageDialog(null, "Bienvenido " + nombre);
                    System.out.println("Bienvenido "+nombre);

                    int num1 = 0;
                    int num2 = 0;

                    num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el primer numero"));
                    num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el segundo numero"));

                    int suma = num1 + num2;
                    int resta = num1 - num2;
                    int multiplicacion = num1 * num2;
                    int division = num1 / num2;
                    int seleccion = Integer.parseInt(JOptionPane.showInputDialog(null, "Opciones: " +
                            "\nSuma = 1 " +
                            "\nResta = 2 " +
                            "\nMultiplicacion = 3 " +
                            "\nDivision = 4"));
                    switch (seleccion) {
                        case 1:
                            JOptionPane.showMessageDialog(null,"Resultado "+ suma);
                            break;
                        case 2:
                            JOptionPane.showMessageDialog(null,"Resultado "+ resta);
                            break;
                        case 3:
                            JOptionPane.showMessageDialog(null,"Resultado "+ multiplicacion);
                            break;
                        case 4:
                            JOptionPane.showMessageDialog(null,"Resultado "+ division);
                            if(num2 == 0){
                                JOptionPane.showMessageDialog(null,"No se puede dividir");
                            }
                            break;
                    }
                }





}


