package facade;

public class FoodOrderService {

    public void orderFood(Food food) {
        CartManager cartManager = new CartManager();
        cartManager.addFoodToCart(food);

        CostCalculator costCalculator = new CostCalculator();
        costCalculator.calculateCost(food);

        MoneyManager moneyManager = new MoneyManager();
        moneyManager.debitMoney(food);

        KitchenManager kitchenManager = new KitchenManager();
        kitchenManager.makeFood(food);

        DeliveryManager deliveryManager = new DeliveryManager();
        deliveryManager.deliverFood(food);
    }
}
