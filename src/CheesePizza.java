public class CheesePizza implements Pizza{
    @Override
    public void prepare() {
        System.out.println("Cheese Pizza prepared");
    }

    @Override
    public void bake() {
        System.out.println("Cheese Pizza baked");
    }

    @Override
    public void cut() {
        System.out.println("Cheese Pizza cut");
    }
}
