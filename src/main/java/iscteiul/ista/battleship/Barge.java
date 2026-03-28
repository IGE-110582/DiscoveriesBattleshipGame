/**
 * Represents a Barge ship in the Battleship game.
 * <p>
 * A Barge is the smallest type of ship and occupies only one position
 * on the game board.
 * </p>
 */
package iscteiul.ista.battleship;

public class Barge extends Ship {

    /** The size of the Barge (number of positions it occupies). */
    private static final Integer SIZE = 1;

    /** The name of the ship. */
    private static final String NAME = "Barca";

    /**
     * Creates a new Barge with the given bearing and starting position.
     * Since the Barge has size 1, it occupies only the provided position.
     *
     * @param bearing the orientation of the barge
     * @param pos the position where the barge is placed on the board
     */
    public Barge(Compass bearing, IPosition pos) {
        super(Barge.NAME, bearing, pos);
        getPositions().add(new Position(pos.getRow(), pos.getColumn()));
    }

    /**
     * Returns the size of the Barge.
     *
     * @return the size of the ship (always 1)
     */
    @Override
    public Integer getSize() {
        return SIZE;
    }

}
