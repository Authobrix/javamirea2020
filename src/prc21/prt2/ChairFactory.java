package prc21.prt2;

public class ChairFactory implements AbstractChairFactory{
    @Override
    public FunctionalChair createFunctionalChair() {
        return (new FunctionalChair());
    }

    @Override
    public MagicChair createMagicChair() {
        return (new MagicChair());
    }

    @Override
    public VictorianChair createVictorianChair() {
        return (new VictorianChair(1));
    }
}