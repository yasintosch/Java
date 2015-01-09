/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controler;

import dao.CustomerDao;
import entity.Customer;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped ;
import javax.faces.context.FacesContext;
import org.primefaces.event.CellEditEvent;
import org.primefaces.event.RowEditEvent;
import org.primefaces.event.SelectEvent;
import org.primefaces.event.UnselectEvent;

/**
 *
 * @author yasin
 */
@ManagedBean
@RequestScoped 
public class CustomerControler implements Serializable{
    private String msg, selectedname;
    private Customer customer;
    private CustomerDao dao;
    
    private List<Customer>customers;
    private List<Column> columns;
    private String columnName;
    private List<Customer>selectedcustomers;
    private List<Customer> filteredcustomers;
    private Customer selectedcustomer;
    
    
    
    
    /**
     * Creates a new instance of CustomerControler
     */
    public CustomerControler() {
        notifyCustomers();
        createDynamicColumns();
    }
    
    @PostConstruct
    public void init(){
        customer = new Customer();
        
    }

//getterlar ve settterlar
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getSelectedname() {
        return selectedname;
    }

    public void setSelectedname(String selectedname) {
        this.selectedname = selectedname;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer cust) {
        this.customer = cust;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public List<Column> getColumns() {
        return columns;
    }

    public void setColumns(List<Column> columns) {
        this.columns = columns;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public List<Customer> getSelectedcustomers() {
        return selectedcustomers;
    }

    public void setSelectedcustomers(List<Customer> selectedcustomers) {
        this.selectedcustomers = selectedcustomers;
    }

    public Customer getSelectedcustomer() {
        return selectedcustomer;
    }

    public void setSelectedcustomer(Customer selectedcustomer) {
        this.selectedcustomer = selectedcustomer;
    }

    public List<Customer> getFilteredcustomers() {
        return filteredcustomers;
    }

    public void setFilteredcustomers(List<Customer> filteredcustomers) {
        this.filteredcustomers = filteredcustomers;
    }

  


    
    
    
    //getter ve setterlar
      
    private void notifyCustomers()
    {

        customers = new ArrayList<Customer>();
//        selectedcustomers=new ArrayList<Customer>();
//        filteredcustomers= new ArrayList<Customer>();
        
//        CustomerDao dao = new CustomerDao();
        dao=new CustomerDao();
        customers = dao.getAllCustomers();




    }
    
    
    //crud fonksiyonları
    public void saveCustomer() {
     
//        CustomerDao dao = new CustomerDao();
        dao.addCustomer(customer);
        customer=new Customer();
        FacesMessage msg = new FacesMessage("Customer created.");
        FacesContext.getCurrentInstance().addMessage(null, msg);
        clearAll();
    }
    public void updateCustomer() {

//        CustomerDao dao = new CustomerDao();
        dao.updateCustomer(selectedcustomer);

        clearAll();
    }
    public void deleteCustomer() {
//        CustomerDao dao = new CustomerDao();
        dao.deleteCustomer(selectedcustomer);
        FacesMessage msg = new FacesMessage("Customer deleted.");
        FacesContext.getCurrentInstance().addMessage(null, msg);
       // customer =new Customer();
        
        clearAll();
    }
 

 
    public void fullInfo() {
//        CustomerDao dao = new CustomerDao();
        List<Customer> lc = dao.getCustomerById(selectedname);
        System.out.println(lc.get(0).getFirstName());
        customer =new Customer();
        
        customer.setCustId(lc.get(0).getCustId());
        customer.setFirstName(lc.get(0).getFirstName());
        customer.setLastName(lc.get(0).getLastName());
        customer.setEmail(lc.get(0).getEmail());
        customer.setDob(lc.get(0).getDob());

    }
 
    private void clearAll() {
        notifyCustomers();
        customer.setCustId(0);
        customer.setFirstName("");
        customer.setLastName("");
        customer.setEmail("");
        

    }
     public void onRowSelect(SelectEvent event) {
        FacesMessage msg;
        msg = new FacesMessage("Customer Selected",  "((Customer) event.getObject().getCustId())");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
 
    public void onRowUnselect(UnselectEvent event) {
        FacesMessage msg = new FacesMessage("Customer Unselected", "((Customer) event.getObject()).getCustId()");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
    
  public void onRowEdit(RowEditEvent event) {
        updateCustomer();
        FacesMessage msg = new FacesMessage("Customer Edited");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
     
    public void onRowCancel(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Edit Cancelled");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
     
    public void onCellEdit(CellEditEvent event) {
        Object oldValue = event.getOldValue();
        Object newValue = event.getNewValue();
         
        if(newValue != null && !newValue.equals(oldValue)) {
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Cell Changed", "Old: " + oldValue + ", New:" + newValue);
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }
    }
    
    private void createDynamicColumns() 
    {
        columns = new ArrayList<Column>();
        columns.add(new Column("Customer ID", "custId"));
        columns.add(new Column("First Name", "firstName"));
        columns.add(new Column("Last Name", "lastName"));
        columns.add(new Column("Email", "email"));
        columns.add(new Column("Date of Birth", "dob"));
    }
    
     //crud fonksiyonlar
    
    
 static public class Column implements Serializable {

 

    private String header;

    private String property;



    public Column(String header, String property) {

    this.header = header;

    this.property = property;

    }



    public String getHeader() {

    return header;

    }



    public String getProperty() {

    return property;

    }

  }
}
