public class Main {
    public static void main(String[] args) {
        // Создание продуктов
        Product chocolate = new Product("Chocolate", 2.5, 250);
        Product soda = new Product("Soda", 1.5, 150);

        // Создание вендинговой машины
        VendingMachine vendingMachine = new VendingMachine();

        // Добавление продуктов в вендинговую машину
        vendingMachine.addProduct(chocolate);
        vendingMachine.addProduct(soda);

        // Отображение доступных продуктов
        vendingMachine.displayProducts();
    }
}