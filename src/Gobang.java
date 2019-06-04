/**
 * Created in 2019-06-05
 */

/**
 * @author bigheadhejim
 *
 */
public class Gobang {
	private static int BRD_WID = 15;
	private static int WIN_CON = 5;
	private char[][] nBoard;
	private char playerClr = '●';
	private char aiClr = '○';
	
	/**
	 * Description:
	 *
	 */
	public Gobang() {
		// TODO 自动生成的构造函数存根
		this.nBoard = new char[BRD_WID][BRD_WID];
		initBoard();
		printBoard();
	}

	/**
	 * to initial a board for the first time.
	 */
	private void initBoard() {
		// TODO 自动生成的方法存根
		//遍历棋盘。
		for (int i = 0; i<BRD_WID; ++i) {
			for (int j=0; j<BRD_WID; ++j) {
				this.nBoard[i][j] = '+';
			}
		}
	}

	/**
	 * to print the current board.
	 */
	private void printBoard() {
		// TODO 自动生成的方法存根
		//遍历棋盘。
		for (int i = 0; i<BRD_WID; ++i) {
			for (int j=0; j<BRD_WID; ++j) {
				System.out.print(this.nBoard[i][j]);
			}
			System.out.print('\n');
		}
	}
	
	/**
	 * 
	 * @param pos the position of player or AI make just now.
	 * @return 正数代表player胜利，负数代表AI胜利，0代表游戏继续。
	 */
	private int judge(int[][] pos) {
		//正数代表player胜利，负数代表AI胜利，0代表游戏继续。
		int judgement = 0;
		return judgement;
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Gobang game = new Gobang();
		for (;;) {
			if (0 != game.playerTurn()) {
				break;
			}
			if (0 != game.aiTurn()) {
				break;
			}
			
		}
		
	}

	/**
	 * AI正在下棋
	 * @return 0表示游戏继续，其他表示游戏已定胜负。
	 */
	private int aiTurn() {
		return 0;
		// TODO 自动生成的方法存根
		
	}

	/**
	 * 玩家正在下棋
	 * @return 0表示游戏继续，其他表示游戏已定胜负。
	 */
	private int playerTurn() {
		return 0;
		// TODO 自动生成的方法存根
		
	}

}
