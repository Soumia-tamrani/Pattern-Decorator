package deco;

import boissons.Boisson;

public abstract class DecoratorBoisson extends Boisson {
    protected Boisson boisson;

    @Override
    public abstract String getDescription();

    public DecoratorBoisson(Boisson boisson) {
        this.boisson = boisson;
    }

}
