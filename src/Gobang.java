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
	private char playerClr = '��';
	private char aiClr = '��';
	
	/**
	 * Description:
	 *
	 */
	public Gobang() {
		// TODO �Զ����ɵĹ��캯�����
		this.nBoard = new char[BRD_WID][BRD_WID];
		initBoard();
		printBoard();
	}

	/**
	 * to initial a board for the first time.
	 */
	private void initBoard() {
		// TODO �Զ����ɵķ������
		//�������̡�
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
		// TODO �Զ����ɵķ������
		//�������̡�
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
	 * @return ��������playerʤ������������AIʤ����0������Ϸ������
	 */
	private int judge(int posX, int posY) {
		//��������playerʤ������������AIʤ����0������Ϸ������
		int judgement = 0;
		//������������ĳ�������ж��ٸ����ӡ�
		int contiuneNum = 0;
		//�ж�3�㷽���9�㷽��
		for(int i=0; (posX+i>0 && posX+i<BRD_WID); --i)
		{
			if (nBoard[posX][posY]!=nBoard[posX+i][posY])
				break;
			else
				++contiuneNum;
		}
		for(int i=0; (posX+i>0 && posX+i<BRD_WID); ++i)
		{
			if (nBoard[posX][posY]!=nBoard[posX+i][posY])
				break;
			else
				++contiuneNum;
		}
		if (contiuneNum >=5)
			judgement = 1;
				
		//�ж�0�㷽���6�㷽��
		for(int j=0; (posX+j>0 && posX+j<BRD_WID); --j)
		{
			if (nBoard[posX][posY]!=nBoard[posX][posY+j])
				break;
			else
				++contiuneNum;
		}
		for(int j=0; (posX+j>0 && posX+j<BRD_WID); ++j)
		{
			if (nBoard[posX][posY]!=nBoard[posX][posY+j])
				break;
			else
				++contiuneNum;
		}
		if (contiuneNum >=5)
			judgement = 1;
		
		//�ж����Ϻ�����45�Ƚ�
		for(int i=0, j=0; (posX+i>0 && posX+i<BRD_WID)&&(posY+j>0 && posY+j<BRD_WID); --i,++j)
		{
			if (nBoard[posX][posY]!=nBoard[posX+i][posY+j])
				break;
			else
				++contiuneNum;
		}
		for(int i=0, j=0; (posX+i>0 && posX+i<BRD_WID)&&(posY+j>0 && posY+j<BRD_WID); ++i,--j)
		{
			if (nBoard[posX][posY]!=nBoard[posX+i][posY+j])
				break;
			else
				++contiuneNum;
		}
		if (contiuneNum >=5)
			judgement = 1;
		
		//�ж����º�����45�Ƚ�
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
		if (contiuneNum >=5)
			judgement = 1;
		
		return judgement;
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
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
	 * AI��������
	 * @return 0��ʾ��Ϸ������������ʾ��Ϸ�Ѷ�ʤ����
	 */
	private int aiTurn() {
		return 0;
		// TODO �Զ����ɵķ������
		
	}

	/**
	 * �����������
	 * @return 0��ʾ��Ϸ������������ʾ��Ϸ�Ѷ�ʤ����
	 */
	private int playerTurn() {
		
		return 0;
		// TODO �Զ����ɵķ������
		
	}

}
