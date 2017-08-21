/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utility;

import java.util.Hashtable;
import javax.swing.JPanel;
import java.awt.Component;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.JXDatePicker;

/**
 *
 * @author massami
 */
public class GUIUtility {

    /**
     * Check if the mandatory field was filled
     *
     * @param data Evaluate the data
     * @return message containing errors
     */
    private static String checkInput(Hashtable data) {
        String message = "";
        Set<String> keys = data.keySet();
        for (String k : keys) {
            if (data.get(k).toString().length() == 0) {
                message = message + "Please enter value for " + k + "\n";
            }
        }
        return message;
    }

    /**
     * Retrieve all controls that need to be validated
     *
     * @param panel control where the controls will be retrieved
     * @return data containing the controls
     */
    private static Hashtable<String, String> retrieveControls(JPanel panel) {
        Hashtable<String, String> data = new Hashtable<String, String>();

        for (Component c : panel.getComponents()) {
            //Check TextField controls
            if (c instanceof JTextField) {
                JTextField j = (JTextField) c;
                if (j.getName() != null && !j.getName().equals("")) {
                    data.put(j.getName(), j.getText());
                }
            } 
            //Check CheckBox controls
            else if (c instanceof JComboBox) {
                JComboBox cb = (JComboBox) c;
                if (cb.getName() != null && !cb.getName().equals("")) {
                    data.put(cb.getName(), cb.getSelectedItem().toString());
                }
            } 
            //Check Date controls
            else if (c instanceof JXDatePicker) {
                JXDatePicker dp = (JXDatePicker) c;
                if (dp.getName() != null && !dp.getName().equals("")) {
                    if (dp.getDate() != null) {
                        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
                        String date = format.format(dp.getDate());
                        data.put(dp.getName(), date);
                    } else {
                        data.put(dp.getName(), "");
                    }
                }
            }
        }
        return data;
    }
    
    /**
     * Clean the components of the selected panel
     * @param panel 
     */
    public static void cleanComponents(JPanel panel){
        Hashtable<String, String> data = new Hashtable<String, String>();

        for (Component c : panel.getComponents()) {
            //Check TextField controls
            if (c instanceof JTextField) {
                JTextField j = (JTextField) c;
                j.setText("");
            } 
            //Check CheckBox controls
            else if (c instanceof JComboBox) {
                JComboBox cb = (JComboBox) c;
                cb.setSelectedIndex(0);
            } 
            //Check Date controls
            else if (c instanceof JXDatePicker) {
                JXDatePicker dp = (JXDatePicker) c;
                dp.setDate(null);
            }
        }
    }
    
    /**
     * Convert String to Date format
     * @param date String to be converted
     * @return formated String
     * @throws Exception 
     */
    public static Date convertToDate(String date) throws Exception{
        Calendar startDate = javax.xml.bind.DatatypeConverter.parseDateTime(date);
        return startDate.getTime();
    }
    
    /**
     * Convert Date to String 
     * @param date Date to to be formated
     * @return formated String
     */
    public static String convertDateToString(Date date){
         DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
         return format.format(date);
    }
    
    /**
     * Check if the components are empty
     * @param panel return the components in the panel
     * @return message of validation
     */
    public static String validateInput(JPanel panel){
        Hashtable<String, String> data = retrieveControls(panel);
        String msg = checkInput(data);
        
        return msg;
    }
    
    /**
     * Clean the tables data
     */
    public static void cleanTable(JTable table) {
        //Get the model of the table
        DefaultTableModel model = (DefaultTableModel) table.getModel();

        //Clean the table content
        model.setRowCount(0);
    }
}
