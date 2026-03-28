/**
 * Represents a Caravel ship in the Battleship game.
 * <p>
 * A Caravel occupies two consecutive positions on the board.
 * Its placement depends on the specified bearing (orientation).
 * </p>
 */
package iscteiul.ista.battleship;

public class Caravel extends Ship {

    /** The size of the Caravel (number of positions it occupies). */
    private static final Integer SIZE = 2;

    /** The name of the ship. */
    private static final String NAME = "Caravela";

    /**
     * Creates a new Caravel with a given bearing and starting position.
     * <p>
     * Depending on the bearing, the ship will occupy two consecutive
     * positions either vertically (NORTH/SOUTH) or horizontally (EAST/WEST).
     * </p>
     *
     * @param bearing the orientation of the Caravel
     * @param pos the starting position (upper-left reference position) of the ship
     * @throws NullPointerException if the bearing is {@code null}
     * @throws IllegalArgumentException if the bearing is invalid
     */
    public Caravel(Compass bearing, IPosition pos) throws NullPointerException, IllegalArgumentException {
        super(Caravel.NAME, bearing, pos);

        if (bearing == null)
            throw new NullPointerException("ERROR! invalid bearing for the caravel");

        switch (bearing) {
            case NORTH:
            case SOUTH:
                for (int r = 0; r < SIZE; r++)
                    getPositions().add(new Position(pos.getRow() + r, pos.getColumn()));
                break;
            case EAST:
            case WEST:
                for (int c = 0; c < SIZE; c++)
                    getPositions().add(new Position(pos.getRow(), pos.getColumn() + c));
                break;
            default:
                throw new IllegalArgumentException("ERROR! invalid bearing for the caravel");
        }

    }

    /**
     * Returns the size of the Caravel.
     *
     * @return the size of the ship (2 positions)
     */
    @Override
    public Integer getSize() {
        return SIZE;
    }

}
