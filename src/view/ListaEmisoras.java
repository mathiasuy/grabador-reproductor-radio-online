package view;

import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import controller.Factory;
import datatypes.DtGrabable;
import java.awt.BorderLayout;

public class ListaEmisoras extends JPanel {
	JList<DtGrabable> lstGrabables = new JList<DtGrabable>();
	JScrollPane scrollPane = new JScrollPane();
	/**
	 * Create the panel.
	 */
	public ListaEmisoras(Factory fac) {
		setLayout(new BorderLayout(0, 0));
		scrollPane.setBounds(25, 85, 223, 286);
		add(scrollPane);
		
		scrollPane.setViewportView(lstGrabables);		
		
		ArrayList<DtGrabable> grabables = fac.getIGrabables().getGrabables();
		DefaultListModel<DtGrabable> dflm = new DefaultListModel<>();
		grabables.forEach(grab->{
			dflm.addElement(grab);
		});
		lstGrabables.setModel(dflm);
		lstGrabables.setSelectedIndex(0);
	}
	
	public DtGrabable getSeleccion() {
		return this.lstGrabables.getSelectedValue();
	}
	
	public int getIdSeleccion() {
		return this.lstGrabables.getSelectedValue().getId();
	}

}
