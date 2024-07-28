// Abstract class defining the template method
 abstract class Beverage {
    // Template method
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    protected abstract void brew();
    protected abstract void addCondiments();
}

// Concrete class for Tea
class Tea extends Beverage {
    @Override
    protected void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding lemon");
    }
}

// Concrete class for Coffee
class Coffee extends Beverage {
    @Override
    protected void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
}

// Usage
 public class TemplateMethodPatternDemo {
    public static void main(String[] args) {
        Beverage tea = new Tea();
        System.out.println("Making tea...");
        tea.prepareRecipe();

        System.out.println("\nMaking coffee...");
        Beverage coffee = new Coffee();
        coffee.prepareRecipe();
    }
}
