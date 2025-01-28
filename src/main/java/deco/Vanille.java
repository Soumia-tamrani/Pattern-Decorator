package deco;

import boissons.Boisson;

public class Vanille extends DecoratorBoisson{
    public Vanille(Boisson boisson) {
        super(boisson);
    }
    @Override
    public String getDescription() {
        return boisson.getDescription()+" Au Vanille";
    }

    @Override
    public double cout() {
        return 2.4 + boisson.cout();
    }
}
