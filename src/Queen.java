public class Queen extends Piece{
    String name;
    Queen() {
        super();
        this.name = "queen";
    }
    boolean isValidMove (Position newPosition) {
        if (!super.isValidMove(position)) {
            return false;
        }
        if (newPosition.column == this.position.column || newPosition.row == this.position.row) {
            return true;
        } else if (Math.abs(newPosition.column) - this.position.column == Math.abs(newPosition.row) - this.position.row) {
            return true;
        } else {
            return false;
        }
    }
}
