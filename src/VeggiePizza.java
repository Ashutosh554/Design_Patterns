public class VeggiePizza implements Pizza{

    @Override
    public void prepare() {
        System.out.println("Veggie pizza prepared");
    }

    @Override
    public void bake() {
        System.out.println("Veggie pizza baked");
    }

    @Override
    public void cut() {
        System.out.println("Cutting Veggie pizza");
    }
}
