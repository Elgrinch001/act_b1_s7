package com.example;

public class Main {
    public static void main(String[] args) {
        
        // Caso 1: Producto Electrónico
        ProductoElectronico laptop = new ProductoElectronico(
        "Laptop Gamer", 2500000, "PROD-0001", 5, "Electrónicos",
        24, "Asus", 110, true);

        System.out.println("Precio final Laptop: $" + laptop.calcularPrecioElectronico());
        laptop.vender(2);
        laptop.vender(10); // Fallo
        System.out.println("Compatibilidad voltaje 120V: " + laptop.esCompatibleVoltaje(120));

        // Caso 2: Producto Alimenticio
        ProductoAlimenticio leche = new ProductoAlimenticio(
        "Leche Entera", 4500, "PROD-0002", 20, "Alimentos",
        true, "L123", 5);

        System.out.println("Precio final Leche: $" + leche.calcularPrecioAlimenticio());
        leche.vender(5);
        leche.reabastecer(10);
        System.out.println("Estado frescura: " + leche.obtenerEstadoFrescura());
        System.out.println("Pérdida por vencimiento: $" + leche.calcularPerdidaPorVencimiento());
    }
    }
