package statki;

public enum ShipType {
    CARRIER(1),
    CRUISER(2),
    SUBMARINE(3),
    DESTROYER(4),
    BATTLESHIP(5);

    final int size;

    ShipType(int size) {
        this.size = size;
    }
}
