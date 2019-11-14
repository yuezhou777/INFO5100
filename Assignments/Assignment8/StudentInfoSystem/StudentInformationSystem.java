package StudentInfoSystem;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;


public class StudentInformationSystem extends JFrame{
    private JLabel rollLabel, nameLabel;
	private JTextField rollText, nameText;
	private JButton add, modify, delete, find;
	private JTable studentsTable;
	private StudentInformationSystem stuInfo;
	private StudentsManagerFileImpl studentManager;

    public StudentInformationSystem() {
        this.create();
        Container con = getContentPane();
        this.add(con);
        makeItVisible();
    }

    public void create() {
		rollLabel = new JLabel("Enter Roll Number : ");
		nameLabel = new JLabel("Enter Student Name : ");

        rollText = new JTextField();
        nameText = new JTextField();

        add = new JButton("Add");
		modify = new JButton("Modify");
		delete = new JButton("Delete");
		find = new JButton("Find");

        
        try {
            stuInfo = new StudentInfo(new StudentManagerFileImpl());
        } catch (Exception e) {
            e.printStackTrace();
        }

        studentTable = new JTable(stuInfo);
    }

    public void add(Container con) {
		BorderLayout b = new BorderLayout();
		con.setLayout(b);
		con.add(new JScrollPane(studentsTable), "South");
		addComponent(con);
    }

    public void addComponent(Container con) {
		JPanel p = new JPanel(new GridLayout(5,2));
		p.add(rollLabel);
		p.add(nameLabel);
		p.add(rollText);
		p.add(nameText);
		p.add(add);
		p.add(modify);
		p.add(find);
		p.add(delete);
		con.add(p, BorderLayout.NORTH);
    }

    public Student getText(Student s) {
		if ( !rollText.getText().isEmpty()) {
			try {
				int a = Integer.parseInt(rollText.getText());
			} catch (RuntimeException e) {
				JOptionPane.showMessageDialog(this, "Please input numbers instead of letters");
				throw e;
			}
		}
		
		s.setId(rollText.getText());
		s.setName(nameText.getText());
		return s;
	}
	
	public void addStudent() { 
		Student s = new Student();
		s = getText(s);
		studentManager.addStudent(s);
		studentsTable.updateUI();
		JOptionPane.showMessageDialog(this, "Student "+ s.getId() + " added");
	}
	
	public void findStudent() {
		Student s = new Student();
		s = getText(s);
		String name = s.getName();
		s = studentManager.findStudent(s.getName());
		if ( s != null) {
			JOptionPane.showMessageDialog(this, "ID: "+ s.getId() + ", Name: "+ s.getName() + " is found");
		}else {
			JOptionPane.showMessageDialog(this, "Student not found");
		}
	}
	
	public void modifyStudent() {
		Student s = new Student();
		s = getText(s);
        String name = s.getName();
		s = studentManager.findStudent(s.getName());
		if (s != null) {
			JOptionPane.showMessageDialog(this, "Student"+ s.getId() + "modified");
		}else {
			JOptionPane.showMessageDialog(this, "Student not found");
		}
		studentsTable.updateUI();
	}
	
	public void deleteStudent() {
		Student s = new Student();
		s = getText(s);
		studentManager.deleteStudent(s.getId());
		studentsTable.updateUI();
		JOptionPane.showMessageDialog(this, "Student "+ s.getName() + " is removed");
	}

	public void addListeners() {
		add.addActionListener((e) -> addStudent()); 
		find.addActionListener((e) -> findStudent()); 
		delete.addActionListener((e) -> deleteStudent());
		modify.addActionListener((e) -> modifyStudent());
	}

    public void makeItVisible() {
        setSize(600, 600);
        setVisible(true);
    }

    public static void main(String[] args) {
        new StudentInformationSystem();
    }
}

class StudentInfo implements TableModel {

	private StudentsManagerFileImpl manager;

	public StudentInformationSystem(StudentsManagerFileImpl manager) {
		this.manager = manager;
	}

	public int getRowCount() {
		return manager.getStudentCount();
	}

	public int getColumnCount() {
		return 2;
	}

	public String getColumnName(int columnIndex) {
		if (columnIndex == 0) {
			return "Roll Number";
		} else {
			return "Name";
		}
	}

	public Class<?> getColumnClass(int columnIndex) {
		return String.class;
	}

	public boolean isCellEditable(int rowIndex, int columnIndex) {

		return false;
	}

	public Object getValueAt(int rowIndex, int columnIndex) {
		Student s = manager.getStudents().get(rowIndex);
		if (columnIndex == 0) {
			return s.getId();
		} else {
			return s.getName();
		}

	}

	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

	}

	public void addTableModelListener(TableModelListener l) {
	}

	public void removeTableModelListener(TableModelListener l) {

	}
}
