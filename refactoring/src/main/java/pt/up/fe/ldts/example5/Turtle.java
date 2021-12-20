package pt.up.fe.ldts.example5;

public class Turtle {
    private Position position;

    public Turtle(int row, int column, char direction) {
        position = new Position(row, column, direction);
    }

    public int getRow() {
        return position.getRow();
    }

    public int getColumn() {
        return position.getColumn();
    }

    public char getDirection() {
        return position.getDirection();
    }

    public void execute(char command) {
        if (command == 'L') { // ROTATE LEFT
            position.rotateToLeft();
        } else if (command == 'R') { // ROTATE RIGHT
            position.rotateToRight();
        } else if (command == 'F'){ // MOVE FORWARD
            position.moveForward();
        }
    }
}
