import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class PListAll extends JPanel {
	private static final long serialVersionUID = 1L;
	JScrollPane listAllScrollPane;
	JTextArea listAllTextArea;

	public PListAll() {
		setLayout(null);

		listAllTextArea = new JTextArea();
		listAllTextArea.setBackground(Color.GREEN);
		if (People.sortedList.isEmpty()) {

		} else {
			listAllTextArea.append(People.makeString(People.sortedList));
		}
		listAllScrollPane = new JScrollPane(listAllTextArea);
		add(listAllScrollPane);
		listAllScrollPane.setBounds(20, 20, 420, 248);

	}

}
