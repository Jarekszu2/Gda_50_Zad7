package packZad7;

import packZad7.packStrategies.IStrategy;

public class SilnikDoGry {
    private IStrategy iStrategy;

    public void requestGame() {
        iStrategy.playGame();
    }

    public void setStrategy(IStrategy iStrategy) {
        this.iStrategy = iStrategy;
    }
}
