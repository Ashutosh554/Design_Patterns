public class ChickenPizza implements Pizza{
    @Override
    public void prepare() {
        System.out.println("Chicken Pizza prepared");
    }

    @Override
    public void bake() {
        System.out.println("Chicken Pizza baked");
    }

    @Override
    public void cut() {
        System.out.println("Chicken pizza cut");
    }
}
