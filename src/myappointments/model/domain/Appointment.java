/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


package myappointments.model.domain;

import java.util.Date;

import myappointments.util.DateUtils;
import myappointments.util.StringUtils;
import myappointments.view.AbstractAppointmentView;
import myappointments.view.AgendaView;
import myappointments.view.AppointmentView;
import myappointments.view.View;
import myappointments.controller.AddAppointmentController;
import myappointments.controller.AppointmentController;
import myappointments.model.AgendaDAO;

/**
 *
 * @author leonardo
 */
public class Appointment  { 
	
	public Appointment() throws Exception{
		
		javax.swing.JOptionPane dialog = new javax.swing.JOptionPane("Hello");
		
		Date date = new java.sql.Date(2015, 04, 19);

		myappointments.controller.AgendaController ac = new myappointments.controller.AgendaController();
		
	}

    public Date getDate() {
        return date;
    }

    public String getNote() {
        return note;
    }
    
    public String getTitle() {
        return title ;
    }

    public void setDate(Date date) {        
        if (date == null)
            throw new IllegalArgumentException("Date field cannot be empty!") ;                
        
        this.date = date;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setTitle(String title) {
        if (StringUtils.isEmpty(title))
            throw new IllegalArgumentException("Title field cannot be empty!") ;
        
        this.title = title;
    }

    @Override
    public int hashCode() {
        return (title.hashCode() + note.hashCode() + date.hashCode()) % Integer.MAX_VALUE ;
    }

    
    
    @Override
    public boolean equals(Object o) {
        if (! (o instanceof Appointment))
            return false ;
        
        Appointment app = (Appointment) o ;
        if (app.date.equals(date) && app.note.equals(note) && app.title.equals(title))
            return true ;
            
        return false ;
    }

    private String title ;
    private String note ;
    private Date date;   
}
