/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Vehiculo {

    private String kstmPlaca;
    private String kstmMarca;
    private int kstmAnio;
    private boolean kstmMulta;
    private String kstmFecha;
    private String kstmProvincia;
    private String kstmColor;
    private String kstmTipo;

    public Vehiculo() {
    }

    public Vehiculo(String kstmPlaca, String kstmMarca, int kstmAnio, boolean kstmMulta, String kstmFecha,
            String kstmProvincia, String kstmColor, String kstmTipo) {
        this.kstmPlaca = kstmPlaca;
        this.kstmMarca = kstmMarca;
        this.kstmAnio = kstmAnio;
        this.kstmMulta = kstmMulta;
        this.kstmFecha = kstmFecha;
        this.kstmProvincia = kstmProvincia;
        this.kstmColor = kstmColor;
        this.kstmTipo = kstmTipo;
    }

    public String getPlaca() {
        return kstmPlaca;
    }

    public void setPlaca(String kstmPlaca) {
        this.kstmPlaca = kstmPlaca;
    }

    public String getMarca() {
        return kstmMarca;
    }

    public void setMarca(String kstmMarca) {
        this.kstmMarca = kstmMarca;
    }

    public int getAnio() {
        return kstmAnio;
    }

    public void setAnio(int kstmAnio) {
        this.kstmAnio = kstmAnio;
    }

    public boolean getMulta() {
        return kstmMulta;
    }

    public void setMulta(boolean kstmMulta) {
        this.kstmMulta = kstmMulta;
    }

    public String getFecha() {
        return kstmFecha;
    }

    public void setFecha(String kstmFecha) {
        this.kstmFecha = kstmFecha;
    }

    public String getProvincia() {
        return kstmProvincia;
    }

    public void setProvincia(String kstmProvincia) {
        this.kstmProvincia = kstmProvincia;
    }

    public String getColor() {
        return kstmColor;
    }

    public void setColor(String kstmColor) {
        this.kstmColor = kstmColor;
    }

    public String getTipo() {
        return kstmTipo;
    }

    public void setTipo(String kstmTipo) {
        this.kstmTipo = kstmTipo;
    }

    public void imprimir() {
        System.out.println("----------REVISIÓN VEHICULAR----------");
        System.out.println("Placa: " + getPlaca() + "\n"
                + "Marca: " + getMarca() + "\n"
                + "Tipo: " + getTipo() + "\n"
                + "Año: " + getAnio() + "\n"
                + "Multas: " + getMulta() + "\n"
                + "Fecha: " + getFecha() + "\n"
                + "Color: " + getColor() + "\n"
                + "Provincia: " + getProvincia());

    }

    public double revicionVehicular(String kstmRevision) {
        if (kstmRevision.equals("Carro") == true) {
            return 245.00;
        } else if (kstmRevision.equals("Moto") == true) {
            return 185.00;
        }
        return 0.00;

    }

    public double multaContaminacion() {
        double resp = 0.00;
        if (getAnio() < 2010) {
            resp = (2010 - getAnio()) * 48.5;

        } else {
            resp = 0.00;
        }
        return resp;

    }

    public double multaCant(int kstmCantidadM) {
        double multa1 = 0.00;
        if (getMulta() == true) {
            if (kstmCantidadM > 0) {
                multa1 = 615 * (kstmCantidadM * 0.05);
            } else {
                multa1 = 0.00;

            }
        }
        return multa1;
    }

    public double Descuento() {
        double descuento = 0.00;
        double revision = this.revicionVehicular(getTipo());
        if (kstmProvincia.equals("Imbabura") || kstmProvincia.equals("Pichincha")
                || kstmProvincia.equals("Guayas") || kstmProvincia.equals("Esmeraldas")) {
            descuento = revision * 0.03;
        }
        return descuento;

    }

    public double valorPagar(double descuento, double multa1, double resp) {
        double kstmTotal;
        kstmTotal = this.revicionVehicular(getTipo()) - descuento + multa1 + resp;
        return kstmTotal;
    }
}
