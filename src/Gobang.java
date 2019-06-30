import java.util.Scanner;

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
	private static char playerClr = '●';
	private static char aiClr = '○';
	
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
				System.out.print(this.nBoard[i][j] + " ");
			}
			System.out.print('\n');
		}
	}
	
	/**
	 * 
	 * @param pos the position of player or AI make just now.
	 * @return 正数代表player胜利，负数代表AI胜利，0代表游戏继续。
	 */
	private int judge(int posX, int posY) {
		//正数代表player胜利，负数代表AI胜利，0代表游戏继续。
		int judgement = 0;
		//用于连续计算某个方向有多少个棋子。
		int contiuneNum = 0;
		//判断3点方向和9点方向
		for(int i=-1; (posX+i>0 && posX+i<BRD_WID); --i)
		{
			if (nBoard[posX][posY]!=nBoard[posX+i][posY])
				break;
			else
				++contiuneNum;
		}
		for(int i=1; (posX+i>0 && posX+i<BRD_WID); ++i)
		{
			if (nBoard[posX][posY]!=nBoard[posX+i][posY])
				break;
			else
				++contiuneNum;
		}
		if (contiuneNum >=WIN_CON)
			judgement = 1;
				
		//判断0点方向和6点方向
		for(int j=-1; (posY+j>0 && posY+j<BRD_WID); --j)
		{
			if (nBoard[posX][posY]!=nBoard[posX][posY+j])
				break;
			else
				++contiuneNum;
		}
		for(int j=1; (posX+j>0 && posX+j<BRD_WID); ++j)
		{
			if (nBoard[posX][posY]!=nBoard[posX][posY+j])
				break;
			else
				++contiuneNum;
		}
		if (contiuneNum >=WIN_CON)
			judgement = 1;
		
		//判断左上和右下45度角
		for(int i=-1, j=-1; (posX+i>0 && posX+i<BRD_WID)&&(posY+j>0 && posY+j<BRD_WID); --i,--j)
		{
			if (nBoard[posX][posY]!=nBoard[posX+i][posY+j])
				break;
			else
				++contiuneNum;
		}
		for(int i=1, j=1; (posX+i>0 && posX+i<BRD_WID)&&(posY+j>0 && posY+j<BRD_WID); ++i,++j)
		{
			if (nBoard[posX][posY]!=nBoard[posX+i][posY+j])
				break;
			else
				++contiuneNum;
		}
		if (contiuneNum >=WIN_CON)
			judgement = 1;
		
		//判断左下和右上45度角
		for(int i=0, j=0; (posX+i>0 && posX+i<BRD_WID)&&(posY+j>0 && posY+j<BRD_WID); --i,--j)
		{
			if (nBoard[posX][posY]!=nBoard[posX+i][posY+j])
				break;
			else
				++contiuneNum;
		}
		for(int i=0, j=0; (posX+i>0 && posX+i<BRD_WID)&&(posY+j>0 && posY+j<BRD_WID); ++i,++j)
		{
			if (nBoard[posX][posY]!=nBoard[posX+i][posY+j])
				break;
			else
				++contiuneNum;
		}
		if (contiuneNum >=WIN_CON)
			judgement = 1;
		
		return judgement;
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Gobang game = new Gobang();
		for (;;) {
			if (0 != game.playerTurn(game)) {
				break;
			}
			if (0 != game.aiTurn(game)) {
				break;
			}
		}
	}

	/**
	 * AI正在下棋
	 * @return 0表示游戏继续，其他表示游戏已定胜负。
	 */
	private int playerTurn(Gobang gobang) {
		System.out.println("Player turn!");
		int x = 0;
		int y = 0;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("locate x");
		x = scan.nextInt();
		System.out.println("locate y");
		y = scan.nextInt();
		
		gobang.nBoard[x][y] = playerClr;
		gobang.printBoard();
		
		if (0<judge(x, y)) {
			System.out.println("Player win");
			return 1;
		}
			
		return 0;
		// TODO 自动生成的方法存根
		
	}

	/**
	 * 玩家正在下棋
	 * @param game 
	 * @return 0表示游戏继续，其他表示游戏已定胜负。
	 */
	private int aiTurn(Gobang gobang) {
		System.out.println("AI turn!");
		int x = 0;
		int y = 0;
		//Scanner scan = new Scanner(System.in);
		//System.out.println("locate x");
		//x = scan.nextInt();
		//System.out.println("locate y");
		//y = scan.nextInt();
		
		x = (int) (Math.random()*BRD_WID);
		y = (int) (Math.random()*BRD_WID);
		
		gobang.nBoard[x][y] = aiClr;
		gobang.printBoard();
		
		if (0>judge(x, y)) {
			System.out.println("AI win");
			return -1;
		}
			
		return 0;
		// TODO 自动生成的方法存根
		
	}

}
