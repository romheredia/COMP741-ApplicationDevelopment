/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Model.Book;
import Model.Borrow;
import Model.Catalogue;
import Model.Member;
import Model.Person;
import Utility.GUIUtility;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rom
 */
public class BorrowManagementIFrame extends javax.swing.JInternalFrame {

    List<Catalogue> listCatalogue = new ArrayList();
    List<Person> listPerson = new ArrayList();
    ArrayList<String> memberList = new ArrayList();

    /**
     * Creates new form BorrowManagementIFrame
     */
    public BorrowManagementIFrame() {
        initComponents();

        LoadTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        borrowTable = new javax.swing.JTable();
        borrowPanel = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        borrowButton = new javax.swing.JButton();
        returnButton = new javax.swing.JButton();
        dueDatePicker = new org.jdesktop.swingx.JXDatePicker();
        jLabel12 = new javax.swing.JLabel();
        titleTextField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        IdTextField = new javax.swing.JTextField();
        addBookButton = new javax.swing.JButton();
        removeBookButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        addDvdButton = new javax.swing.JButton();
        memberButton = new javax.swing.JButton();
        memberTextField = new javax.swing.JTextField();

        setClosable(true);
        setTitle("Borrow Management");
        setMaximumSize(new java.awt.Dimension(1176, 420));
        setMinimumSize(new java.awt.Dimension(1176, 420));

        borrowTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title", "Description", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        borrowTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                borrowTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(borrowTable);

        borrowPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Borrow Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18))); // NOI18N
        borrowPanel.setMaximumSize(new java.awt.Dimension(430, 310));
        borrowPanel.setMinimumSize(new java.awt.Dimension(430, 310));
        borrowPanel.setName(""); // NOI18N
        borrowPanel.setPreferredSize(new java.awt.Dimension(430, 310));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setText("Due Date");

        jPanel3.setMaximumSize(new java.awt.Dimension(380, 80));
        jPanel3.setMinimumSize(new java.awt.Dimension(380, 80));
        jPanel3.setPreferredSize(new java.awt.Dimension(380, 80));
        jPanel3.setLayout(new java.awt.GridLayout(1, 2));

        borrowButton.setText("Borrow Item");
        borrowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrowButtonActionPerformed(evt);
            }
        });
        jPanel3.add(borrowButton);

        returnButton.setText("Return Item");
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });
        jPanel3.add(returnButton);

        dueDatePicker.setName("dueDate"); // NOI18N

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setText("Title");

        titleTextField.setEnabled(false);

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel13.setText("Id");

        IdTextField.setEditable(false);

        javax.swing.GroupLayout borrowPanelLayout = new javax.swing.GroupLayout(borrowPanel);
        borrowPanel.setLayout(borrowPanelLayout);
        borrowPanelLayout.setHorizontalGroup(
            borrowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(borrowPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(borrowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(borrowPanelLayout.createSequentialGroup()
                        .addGroup(borrowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addGap(38, 38, 38)
                        .addGroup(borrowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dueDatePicker, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(titleTextField)
                            .addComponent(IdTextField))))
                .addGap(20, 20, 20))
        );
        borrowPanelLayout.setVerticalGroup(
            borrowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(borrowPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(borrowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(IdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(borrowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addComponent(titleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(borrowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(dueDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        addBookButton.setText("Add Book");
        addBookButton.setPreferredSize(new java.awt.Dimension(100, 40));
        addBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBookButtonActionPerformed(evt);
            }
        });

        removeBookButton.setText("Remove");
        removeBookButton.setPreferredSize(new java.awt.Dimension(100, 40));
        removeBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBookButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Library Member");

        addDvdButton.setText("Add DVD");
        addDvdButton.setPreferredSize(new java.awt.Dimension(100, 40));
        addDvdButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDvdButtonActionPerformed(evt);
            }
        });

        memberButton.setText("Choose member");
        memberButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memberButtonActionPerformed(evt);
            }
        });

        memberTextField.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(addDvdButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(addBookButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(removeBookButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(memberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(memberButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addComponent(borrowPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(memberButton)
                            .addComponent(memberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(borrowPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addBookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addDvdButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeBookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void borrowButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrowButtonActionPerformed
        try {
            //Message with the field validation
            String msg = GUIUtility.validateInput(borrowPanel);

            if (msg.length() == 0) {
                if (borrowTable.getSelectedRow() >= 0) {
                    //Initialize new object
                    Borrow borrow = new Borrow();

                    //Get the member id
                    int memberId = borrow.searchMemberId(memberTextField.getText());

                    //Get the id of the item
                    int catalogueId = Integer.parseInt(IdTextField.getText());

                    //Find the selected item
                    Catalogue selectedItem = listCatalogue.stream().filter(p -> p.getId() == catalogueId).findFirst().get();

                    if (selectedItem.getStatus().equals("Available")) {
                        //Add items from the list
                        borrow.setBorrowDate(GUIUtility.convertDateToString(new Date()));
                        borrow.setDueDate(GUIUtility.convertDateToString(dueDatePicker.getDate()));
                        borrow.setMemberId(memberId);
                        borrow.setCatalogueId(selectedItem.getId());
                        borrow.addBorrow(borrow);

                        //Display message
                        JOptionPane.showMessageDialog(this, "Item borrowed successfully");

                        //Update the status
                        listCatalogue.stream().filter(p -> p.getId() == catalogueId).findFirst().get().setStatus("Borrowed");

                        //Clean components
                        GUIUtility.cleanComponents(borrowPanel);

                        //Update table data
                        updateTable();
                    } else {
                        JOptionPane.showMessageDialog(this, "The selected item is not available");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Please select an item");
                }
            } else {
                JOptionPane.showMessageDialog(this, msg);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_borrowButtonActionPerformed

    private void addBookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBookButtonActionPerformed
        BookSearchFrame frame = new BookSearchFrame(this);
        frame.setVisible(true);
    }//GEN-LAST:event_addBookButtonActionPerformed

    private void removeBookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBookButtonActionPerformed
        try {
            //Get the current selected table row
            int i = borrowTable.getSelectedRow();

            //Get the selected item
            Catalogue selectedCatalogue = listCatalogue.get(i);

            //remove selected item from collection
            listCatalogue.remove(selectedCatalogue);

            //Update the table content
            updateTable();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_removeBookButtonActionPerformed

    private void addDvdButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDvdButtonActionPerformed
        DvdSearchFrame frame = new DvdSearchFrame(this);
        frame.setVisible(true);
    }//GEN-LAST:event_addDvdButtonActionPerformed

    private void borrowTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borrowTableMouseClicked
        try {
            //Get the current selected table row
            int i = borrowTable.getSelectedRow();

            //Get the selected book item
            Catalogue c = listCatalogue.get(i);

            //Add data to the panel controls
            setDataToComponent(c);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_borrowTableMouseClicked

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
        try {
            //No items is selected
            if (borrowTable.getSelectedRow() >= 0) {
                //Initialize new object
                Borrow borrow = new Borrow();

                //Get the member id
                int memberId = borrow.searchMemberId(memberTextField.getText());

                //Get the id of the item
                int catalogueId = Integer.parseInt(IdTextField.getText());

                //Find the selected item
                Catalogue selectedItem = listCatalogue.stream().filter(p -> p.getId() == catalogueId).findFirst().get();

                if (selectedItem.getStatus().equals("Borrowed")) {
                    //Add items from the list
                    borrow.setBorrowDate(GUIUtility.convertDateToString(new Date()));
                    borrow.setMemberId(memberId);
                    borrow.setCatalogueId(selectedItem.getId());
                    borrow.returnItem(borrow);

                    //Display message
                    JOptionPane.showMessageDialog(this, "Item returned successfully");

                    //Update the status
                    listCatalogue.stream().filter(p -> p.getId() == catalogueId).findFirst().get().setStatus("Available");

                    //Clean components
                    GUIUtility.cleanComponents(borrowPanel);

                    //Update table data
                    updateTable();
                } else {
                    JOptionPane.showMessageDialog(this, "The item is available to borrow");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Please select an item");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_returnButtonActionPerformed

    private void memberButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memberButtonActionPerformed
        MemberSearchFrame frame = new MemberSearchFrame(this);
        frame.setVisible(true);
    }//GEN-LAST:event_memberButtonActionPerformed

    /**
     * Load data to the components of the panel
     *
     * @param c
     */
    private void setDataToComponent(Catalogue c) {
        IdTextField.setText(String.valueOf(c.getId()));
        titleTextField.setText(c.getTitle());
    }

    /**
     * Update table with the catalogue items
     */
    private void updateTable() {
        //Get the model of the table
        DefaultTableModel model = (DefaultTableModel) borrowTable.getModel();

        //Clean the table content
        model.setRowCount(0);

        //Initialize rows
        Object[] rows = new Object[3];

        //Add book data to the table
        for (Catalogue c : listCatalogue) {
            rows[0] = c.getTitle();
            rows[1] = c.getDescription();
            rows[2] = c.getStatus();
            model.addRow(rows);
        }
    }

    /**
     * Add item to the list and update the table
     *
     * @param cat
     */
    public void addItem(Catalogue cat) {
        try {
            //Add new book to the catalogue list
            if (!listCatalogue.contains(cat)) {
                listCatalogue.add(cat);
            }

            //Update table content
            updateTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    /**
     * Add member to the text field
     *
     * @param p
     */
    public void addMember(Person p) {
        try {
            //Set the component with the name of the member
            memberTextField.setText(p.getFirstName() + " " + p.getLastName());

            //Load the table with the items of the member
            LoadTable();

            //update the items of the table
            updateTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    /**
     * Load the table with items of the member
     */
    public void LoadTable() {
        try {
            //Initialize object
            Borrow borrow = new Borrow();

            //Search the transaction book of the user
            listCatalogue = borrow.searchBorrowedItem(memberTextField.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IdTextField;
    private javax.swing.JButton addBookButton;
    private javax.swing.JButton addDvdButton;
    private javax.swing.JButton borrowButton;
    private javax.swing.JPanel borrowPanel;
    private javax.swing.JTable borrowTable;
    private org.jdesktop.swingx.JXDatePicker dueDatePicker;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton memberButton;
    private javax.swing.JTextField memberTextField;
    private javax.swing.JButton removeBookButton;
    private javax.swing.JButton returnButton;
    private javax.swing.JTextField titleTextField;
    // End of variables declaration//GEN-END:variables
}
