package deco;

import boissons.Boisson;

public class Chocolat extends DecoratorBoisson{
    public Chocolat(Boisson boisson) {
        super(boisson);
    }
    @Override
    public String getDescription() {
        return boisson.getDescription()+" Au Chocolat";
    }
    @Override
    public double cout() {
        return 0.6 + boisson.cout();
    }
}
