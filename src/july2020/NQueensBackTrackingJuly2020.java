package july2020;

import java.util.ArrayList;
import java.util.List;

public class NQueensBackTrackingJuly2020 {

	// Queen[][] board = new Queen[4][4];
	List<Queen> queenList = new ArrayList<Queen>();

	public static void main(String[] args) {

		NQueensBackTrackingJuly2020 mainClass = new NQueensBackTrackingJuly2020();
		mainClass.nqueen(0);
		for (Queen queen : mainClass.queenList)
			System.out.println("(" + queen.i + "," + queen.j + ")");

	}

	boolean nqueen(int row) {
		if (row > 3)return true;
		
		for (int j = 0; j < 4; j++) {
			Queen queen = new Queen(row, j);
			boolean positionOk = queen.correctPositionFound(queenList);
			if (positionOk) {
				queenList.add(row, queen);
				if (nqueen(row + 1))
					return true;
				else
					queenList.remove(row);
			}

		}

		return false;
	}

}

class Queen {
	int i;
	int j;

	Queen(int i, int j) {
		this.i = i;
		this.j = j;
	}

	public boolean correctPositionFound(List<Queen> qList) {
		for (Queen q1 : qList) {

			// if(q1 == null) return true; // If the queue is not populated bcoz it is 4th
			// row queen but am still at first row only.

			if (q1.i == i || q1.j == j) {
				return false;
			}
			if (q1.i - q1.j == i - j) {
				return false;
			}

			if (q1.i + q1.j == i + j) {
				return false;
			}
		}
		return true;

	}

}
