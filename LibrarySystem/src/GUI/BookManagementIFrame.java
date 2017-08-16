/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Model.Book;
import Model.Catalogue;
import Utility.GUIUtility;
import java.lang.reflect.Field;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Rom
 */
public class BookManagementIFrame extends javax.swing.JInternalFrame {

    List<Catalogue> listCatalogue = new ArrayList();
    Book selectedBook = new Book();

    /**
     * Creates new form BooKInternalFrame
     */
    public BookManagementIFrame() {
        initComponents();
        //updateButton.setEnabled(false);
        //deleteButton.setEnabled(false);
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
        bookTable = new javax.swing.JTable();
        bookTextField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        bookPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        titleTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        descriptionTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        languageTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        authorTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        genreTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        isbnTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        noteTextField = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        addButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        statusComboBox = new javax.swing.JComboBox<>();
        releaseDatePicker = new org.jdesktop.swingx.JXDatePicker();

        setClosable(true);
        setTitle("Book Management");
        setMaximumSize(new java.awt.Dimension(1180, 580));
        setMinimumSize(new java.awt.Dimension(1180, 580));
        setPreferredSize(new java.awt.Dimension(1180, 580));

        bookTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title", "Author", "Description", "ISBN"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        bookTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(bookTable);

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        bookPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Book Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18))); // NOI18N
        bookPanel.setName(""); // NOI18N
        bookPanel.setPreferredSize(new java.awt.Dimension(520, 540));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Title");

        titleTextField.setName("title"); // NOI18N

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Description");

        descriptionTextField.setName("description"); // NOI18N

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Release Date");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Language");

        languageTextField.setName("language"); // NOI18N

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Author");

        authorTextField.setName("author"); // NOI18N

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Genre");

        genreTextField.setName("genre"); // NOI18N

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("ISBN");

        isbnTextField.setName("isbn"); // NOI18N

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("Status");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText("Note");

        noteTextField.setName(""); // NOI18N

        jPanel3.setMinimumSize(new java.awt.Dimension(160, 80));
        jPanel3.setPreferredSize(new java.awt.Dimension(264, 80));
        jPanel3.setLayout(new java.awt.GridLayout(2, 2));

        addButton.setText("Add New");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        jPanel3.add(addButton);

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        jPanel3.add(updateButton);

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        jPanel3.add(deleteButton);

        statusComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Available", "Borrowed", "Under Maintenance", "Not in Stock" }));
        statusComboBox.setName("status"); // NOI18N

        releaseDatePicker.setName("releaseDate"); // NOI18N

        javax.swing.GroupLayout bookPanelLayout = new javax.swing.GroupLayout(bookPanel);
        bookPanel.setLayout(bookPanelLayout);
        bookPanelLayout.setHorizontalGroup(
            bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bookPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bookPanelLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(78, 78, 78)
                        .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(languageTextField)
                            .addComponent(isbnTextField)))
                    .addGroup(bookPanelLayout.createSequentialGroup()
                        .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(42, 42, 42)
                        .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(authorTextField)
                            .addComponent(genreTextField)))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                    .addGroup(bookPanelLayout.createSequentialGroup()
                        .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(67, 67, 67)
                        .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(noteTextField)
                            .addComponent(statusComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(bookPanelLayout.createSequentialGroup()
                        .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titleTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(descriptionTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(releaseDatePicker, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(20, 20, 20))
        );
        bookPanelLayout.setVerticalGroup(
            bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(titleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(descriptionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(releaseDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(statusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(noteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(languageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bookPanelLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(authorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(7, 7, 7)
                .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(isbnTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(bookTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(searchButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(bookPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bookPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bookTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bookTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookTableMouseClicked
        try {
            //Get the current selected table row
            int i = bookTable.getSelectedRow();

            //Get the selected book item
            selectedBook = (Book) listCatalogue.get(i);

            //Add data to the panel controls
            setDataToComponent(selectedBook);

            //Set control availability
            updateButton.setEnabled(true);
            deleteButton.setEnabled(true);
            addButton.setEnabled(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_bookTableMouseClicked

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        try {
            //Get the model of the table
            DefaultTableModel model = (DefaultTableModel) bookTable.getModel();

            //Clean the table content
            model.setRowCount(0);

            //Initialize rows
            Object[] rows = new Object[4];

            //Initialize Book object
            Catalogue catalogue = new Book();
            
            //Search the requested book
            listCatalogue = bookTextField.getText().equals("") ? catalogue.Search() : catalogue.SearchByTitle(bookTextField.getText());

            //Add book data to the table
            for (Catalogue c : listCatalogue) {
                Book b = (Book) c;

                rows[0] = b.getTitle();
                rows[1] = b.getAuthor();
                rows[2] = b.getDescription();
                rows[3] = b.getIsbn();
                model.addRow(rows);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        try {
            //Check if input data is correct
            String msg = GUIUtility.validateInput(bookPanel);

            if (msg.length() == 0) {
                //Load book object with the panel data
                Catalogue catalogue = getComponentData(new Book());

                //Insert book into the database
                catalogue.Add();

                //Displays message
                JOptionPane.showMessageDialog(this, "Book registered successfully");

                //Clean data in controls
                GUIUtility.cleanComponents(bookPanel);

                //Reset the table`s content
                GUIUtility.cleanTable(bookTable);
            } else {
                JOptionPane.showMessageDialog(this, msg);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        try {
            //Message with the field validation
            String msg = GUIUtility.validateInput(bookPanel);

            if (msg.length() == 0) {
                //Get the selected row in the table
                int i = bookTable.getSelectedRow();

                //Get the title of the selected item
                String title = bookTable.getModel().getValueAt(i, 0).toString();

                //Get the selected book
                Book book = (Book) listCatalogue.stream().filter(p -> p.getTitle().equals(title)).findFirst().get();

                //Get components data 
                Catalogue catalogue = getComponentData(book);

                //Update book data
                catalogue.Update();

                //Display message
                JOptionPane.showMessageDialog(this, "Book updated successfully");

                //Clean data in controls
                GUIUtility.cleanComponents(bookPanel);

                //Reset the table`s content
                GUIUtility.cleanTable(bookTable);

                //Enable buttons
                addButton.setEnabled(true);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        try {
            //Message with the field validation
            String msg = GUIUtility.validateInput(bookPanel);

            if (msg.length() == 0) {
                //Get the selected row in the table
                int i = bookTable.getSelectedRow();

                //Get the current table data
                TableModel model = bookTable.getModel();

                //Get the title of the selected item
                String title = model.getValueAt(i, 0).toString();

                //Initialize objects
                Catalogue catalogue = new Book();

                //Filter book based on title
                int id = ((Book) (listCatalogue.stream().filter(p -> p.getTitle().equals(title)).findFirst().get())).getId();

                //Update book data
                catalogue.Delete(id);

                //Display message
                JOptionPane.showMessageDialog(this, "Book deleted successfully");

                //Clean data in controls
                GUIUtility.cleanComponents(bookPanel);

                //Enable buttons
                addButton.setEnabled(true);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    /**
     * Get the data from the components
     *
     * @param book object to be filled
     * @return filled object
     * @throws Exception
     */
    private Book getComponentData(Book book) throws Exception {
        book.setAuthor(authorTextField.getText());
        book.setGenre(genreTextField.getText());
        book.setIsbn(isbnTextField.getText());
        book.setTitle(titleTextField.getText());
        book.setDescription(descriptionTextField.getText());
        book.setReleaseDate(GUIUtility.convertDateToString(releaseDatePicker.getDate()));
        book.setStatus(statusComboBox.getSelectedItem().toString());
        book.setNote(noteTextField.getText());
        book.setLanguage(languageTextField.getText());

        return book;
    }

    /**
     * Set data from the object to the components of the GUI
     *
     * @param book get data from
     * @throws Exception
     */
    private void setDataToComponent(Book book) throws Exception {
        titleTextField.setText(book.getTitle());
        authorTextField.setText(book.getAuthor());
        descriptionTextField.setText(book.getDescription());
        isbnTextField.setText(book.getIsbn());
        genreTextField.setText(book.getGenre());
        noteTextField.setText(book.getNote());
        languageTextField.setText(book.getLanguage());
        releaseDatePicker.setDate(GUIUtility.convertToDate(book.getReleaseDate()));
        statusComboBox.setSelectedItem(book.getStatus());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JTextField authorTextField;
    private javax.swing.JPanel bookPanel;
    private javax.swing.JTable bookTable;
    private javax.swing.JTextField bookTextField;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField descriptionTextField;
    private javax.swing.JTextField genreTextField;
    private javax.swing.JTextField isbnTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField languageTextField;
    private javax.swing.JTextField noteTextField;
    private org.jdesktop.swingx.JXDatePicker releaseDatePicker;
    private javax.swing.JButton searchButton;
    private javax.swing.JComboBox<String> statusComboBox;
    private javax.swing.JTextField titleTextField;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
