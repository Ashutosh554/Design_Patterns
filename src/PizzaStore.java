public class PizzaStore {

    public Pizza OrderPizza(String type){

        Pizza p = PizzaFactory.createFactory(type);

        p.prepare();
        p.bake();
        p.cut();

        return p;
    }
}
