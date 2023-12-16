/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Main {

    public static void main(String[] args) {

        Vehiculo kstmRevision = new Vehiculo("AAC-0123", "Chevrolet", 2009,
                true, "14/06/2023",
                "Imbabura", "Rojo", "Carro");
        kstmRevision.imprimir();
        System.out.println("Multa por Contaminacion Ambiental: " + kstmRevision.multaContaminacion()
                + "\n" + "Valor de las Multas: " + kstmRevision.multaCant(4)
                + "\n" + "Descuento por la Zona: " + kstmRevision.Descuento()
                + "\n" + "Valor a pagar: " + kstmRevision.valorPagar(kstmRevision.Descuento(),
                        kstmRevision.multaCant(4), kstmRevision.multaContaminacion()));

        Vehiculo kstmMotos = new Vehiculo();
        kstmMotos.getPlaca();
    }

}
