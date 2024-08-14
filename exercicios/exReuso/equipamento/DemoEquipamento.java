package exercicios.exReuso.equipamento;

public class DemoEquipamento {
    public static void main(String[] args) {
        Equipamento equip = new Equipamento("Notebook", "Samsung");
        System.out.println(equip);

        Computador comp = new Computador("Galaxy Book2", "Samsung", "Intel Core i5", "256GB SSD, 8GB RAM");
        System.out.println(comp);
    }
}
