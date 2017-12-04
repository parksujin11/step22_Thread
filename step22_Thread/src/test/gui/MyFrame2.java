package test.gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MyFrame2 extends JFrame implements ActionListener{

	//������
	public MyFrame2() {
		 initUI();
		
	}
	//�ʱ�ȭ �޼ҵ�
	public void initUI() {
		//���̾ƿ� ����
		setLayout(new BorderLayout());
		//�г� ��ü ����
		JPanel panel=new JPanel();
		//��ư ��ü ����
		JButton button=new JButton("�˸�����");
		JButton downBtn=new JButton("�ٿ�ε�"); 
		//��ư�� ActionListener ����ϱ�
		button.addActionListener(this);
		button.setActionCommand("alert");
		downBtn.addActionListener(this);
		downBtn.setActionCommand("downLoad");
		//��ư�� �гο� �߰�
		panel.add(button);
		panel.add(downBtn);
		//�г��� �������� ���� �� ��ġ
		add(panel, BorderLayout.NORTH);
		
		//setBounds(x, y, width, height)
		setBounds(200, 200, 500, 500);
		//x �� ������ â�� ������ ���μ����� ���� �ǵ���
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// ������ ��ü�� ȭ�鿡 ���̵��� 
		setVisible(true);
		
	}
	//���� �޼ҵ� 
	public static void main(String[] args) {
		new MyFrame2();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//������ ��ư�� action command �� �о�´�.
		String command=e.getActionCommand();
		if(command.equals("alert")) {
			JOptionPane.showMessageDialog(this, "�˸�!");
		}else if(command.equals("downLoad")) {
			//�ð��� ���� �ɸ��ų� ��Ȯ���� �۾��� �Ҷ� ���ο� �����忡�� �۾��Ѵ�.
			new Thread() {
				@Override
				public void run() {
					System.out.println("�ٿ�ε���///");
			try {
				//�ٿ�ε� �ϴµ� 10�� �ɸ��ٰ� ����...
				Thread.sleep(10000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			System.out.println("�ٿ�ε� �Ϸ�...");
				}
			}.start();
			
		}
		
	}
}
