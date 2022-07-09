public class PizzaFactory {
    public static Pizza createFactory(String type){

        Pizza p = null;

        if(type.equalsIgnoreCase("cheese")){
            p = new CheesePizza();
        } else if (type.equalsIgnoreCase("Veggie")) {
            p = new VeggiePizza();
        } else if (type.equalsIgnoreCase("Chicken")) {
            p = new ChickenPizza();
        }

        return p;
    }
}
