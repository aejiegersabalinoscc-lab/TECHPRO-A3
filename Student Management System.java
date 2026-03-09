import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener {

    JTextField txtID, txtName, txtCourse, txtYear;
    JButton btnAdd, btnUpdate, btnDelete, btnClear, btnVerify;
    JTable table;
    DefaultTableModel model;

    public Main() {
        // FIX: Run on Event Dispatch Thread for thread safety
        SwingUtilities.invokeLater(() -> {
            setTitle("Student Information Management System");
            setSize(800, 500);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLayout(new BorderLayout());

            // FORM PANEL
            JPanel formPanel = new JPanel();
            formPanel.setLayout(new GridLayout(4, 2, 10, 10));
            formPanel.setBorder(BorderFactory.createTitledBorder("Student Information"));

            formPanel.add(new JLabel("Student ID:"));
            txtID = new JTextField();
            formPanel.add(txtID);

            formPanel.add(new JLabel("Name:"));
            txtName = new JTextField();
            formPanel.add(txtName);

            formPanel.add(new JLabel("Course:"));
            txtCourse = new JTextField();
            formPanel.add(txtCourse);

            formPanel.add(new JLabel("Year Level:"));
            txtYear = new JTextField();
            formPanel.add(txtYear);

            add(formPanel, BorderLayout.NORTH);

            // TABLE PANEL
            model = new DefaultTableModel();
            model.addColumn("Student ID");
            model.addColumn("Name");
            model.addColumn("Course");
            model.addColumn("Year Level");

            table = new JTable(model);
            table.setPreferredScrollableViewportSize(new Dimension(500, 100));
            table.setFillsViewportHeight(true);

            JScrollPane scrollPane = new JScrollPane(table);
            add(scrollPane, BorderLayout.CENTER);

            // BUTTON PANEL
            JPanel buttonPanel = new JPanel();
            buttonPanel.setLayout(new FlowLayout());

            btnAdd = new JButton("Add");
            btnUpdate = new JButton("Update");
            btnDelete = new JButton("Delete");
            btnClear = new JButton("Clear");
            btnVerify = new JButton("Verify");  // ✅ NEW BUTTON

            buttonPanel.add(btnAdd);
            buttonPanel.add(btnUpdate);
            buttonPanel.add(btnDelete);
            buttonPanel.add(btnClear);
            buttonPanel.add(btnVerify);  // ✅ ADD TO PANEL

            add(buttonPanel, BorderLayout.SOUTH);

            // EVENTS
            btnAdd.addActionListener(this);
            btnUpdate.addActionListener(this);
            btnDelete.addActionListener(this);
            btnClear.addActionListener(this);
            btnVerify.addActionListener(this);  // ✅ ADD LISTENER

            // FIX: Added check for selectedRow != -1 to prevent crash
            table.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    int selectedRow = table.getSelectedRow();
                    if (selectedRow != -1) {
                        txtID.setText(model.getValueAt(selectedRow, 0).toString());
                        txtName.setText(model.getValueAt(selectedRow, 1).toString());
                        txtCourse.setText(model.getValueAt(selectedRow, 2).toString());
                        txtYear.setText(model.getValueAt(selectedRow, 3).toString());
                    } else {
                        clearFields();
                    }
                }
            });

            setVisible(true);
        });
    }

    public void actionPerformed(ActionEvent e) {
        String id = txtID.getText();
        String name = txtName.getText();
        String course = txtCourse.getText();
        String year = txtYear.getText();

        // INPUT VALIDATION
        if (id.isEmpty() || name.isEmpty() || course.isEmpty() || year.isEmpty()) {
            JOptionPane.showMessageDialog(this, "All fields are required!");
            return;
        }

        if (e.getSource() == btnAdd) {
            model.addRow(new Object[]{id, name, course, year});
            JOptionPane.showMessageDialog(this, "Student Added Successfully!");
            clearFields();
        }

        if (e.getSource() == btnUpdate) {
            int selectedRow = table.getSelectedRow();
            if (selectedRow >= 0) {
                model.setValueAt(id, selectedRow, 0);
                model.setValueAt(name, selectedRow, 1);
                model.setValueAt(course, selectedRow, 2);
                model.setValueAt(year, selectedRow, 3);
                JOptionPane.showMessageDialog(this, "Record Updated!");
            } else {
                JOptionPane.showMessageDialog(this, "Select a row to update.");
            }
        }

        if (e.getSource() == btnDelete) {
            int selectedRow = table.getSelectedRow();
            if (selectedRow >= 0) {
                model.removeRow(selectedRow);
                JOptionPane.showMessageDialog(this, "Record Deleted!");
            } else {
                JOptionPane.showMessageDialog(this, "Select a row to delete.");
            }
        }

        if (e.getSource() == btnClear) {
            clearFields();
        }

        if (e.getSource() == btnVerify) {  // ✅ NEW ACTION
            JOptionPane.showMessageDialog(this, "✅ Verification Successful!\n\n" +
                    "Student ID: " + id + "\n" +
                    "Name: " + name + "\n" +
                    "Course: " + course + "\n" +
                    "Year Level: " + year);
        }
    }

    // Helper method to clear fields and table selection
    private void clearFields() {
        txtID.setText("");
        txtName.setText("");
        txtCourse.setText("");
        txtYear.setText("");
        table.clearSelection();
    }

      public static void Main(String[] args) {
        new Main();
    }
}
