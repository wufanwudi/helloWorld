
public class Gobang {
	//�������̵Ĵ�С
	private static int BOARD_SIZE = 15;
	//����һ����ά�������䵱����
	private String[][] board;
	public void initBoard() {
		//��ʼ����������
		 board = new String[BOARD_SIZE][BOARD_SIZE];
		 //��ÿ��Ԫ�ظ�λ+�������ڿ���̨��������
		 for(int i=0;i<BOARD_SIZE;i++) 
		 {
			 for(int j=0;j<BOARD_SIZE;j++) 
			 {
				 board[i][j] = "+";
			 }
		 }
	}
	
	//�ڿ���̨������̵ķ���
	public void printBoard() 
	{
		//��ӡÿ�����MԪ��
		for(int i=0;i<BOARD_SIZE;i++)
		{
			for (int j=0;j<BOARD_SIZE;j++) 
			{
				//
				
			}
			
		}
				
	}
}
