package com.example.info;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
//import com.vaadin.ui.Panel;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
@Theme("info")
public class InfoUI extends UI {

	@WebServlet(value = "/*", asyncSupported = true)
	@VaadinServletConfiguration(productionMode = false, ui = InfoUI.class)
	public static class Servlet extends VaadinServlet {
	}

	@Override
	protected void init(VaadinRequest request) {
		final VerticalLayout layout = new VerticalLayout();
		// layout.setMargin(true);
		layout.setSpacing(true);
		setContent(layout);
		
//Panel to contain all of the below (ToBeFixed)
		//Panel panel = new Panel();
		//panel.setWidth("400px");
		
		
//Configure Label Elements
		@SuppressWarnings("deprecation")
		//Welcome text with HTML modifications (align CSS)
		Label label1 = new Label("<h2>Welcome To Employee Info</h2>", Label.CONTENT_XHTML);
		label1.setWidth("300px");
		label1.addStyleName("welcome");
		@SuppressWarnings("deprecation")
		//Horizontal line with HTML and CSS
		Label labelhr = new Label("<hr/>", Label.CONTENT_XHTML);
		labelhr.setWidth("300px");
		labelhr.addStyleName("welcome");
		
//Configure Text Fields
		TextField field1 = new TextField("First Name");
		TextField field2 = new TextField("Last Name");
		TextField field3 = new TextField("Social Sec. No");
		TextField field4 = new TextField("Date of Birth");
		
//Mark fields as required information
		field1.setRequired(true);
		field2.setRequired(true);
		field3.setRequired(true);
		field4.setRequired(true);
		field1.setRequiredError("The Field may not be empty.");
		field2.setRequiredError("The Field may not be empty.");
		field3.setRequiredError("The Field may not be empty.");
		field4.setRequiredError("The Field may not be empty.");
		
//Configure Buttons
		Button button_1 = new Button("First");
		Button button_2 = new Button("Prev");
		Button button_3 = new Button("Next");
		Button button_4 = new Button("Last");
		Button button_5 = new Button("New");
		Button button_6 = new Button("Save");
		Button button_7 = new Button("Edit");
		Button button_8 = new Button("Exit");
		
//Layouts begin
		
		FormLayout horiz_1 = new FormLayout();
		horiz_1.addComponent(field1);
		//Set TextBox Width
		field1.setWidth("185px");

		FormLayout horiz_2 = new FormLayout();
		horiz_2.addComponent(field2);
		//Set TextBox Width
		field2.setWidth("185px");

		FormLayout horiz_3 = new FormLayout();
		horiz_3.addComponent(field3);
		//Set TextBox Width
		field3.setWidth("185px");

		FormLayout horiz_4 = new FormLayout();
		horiz_4.addComponent(field4);
		//Set TextBox Width
		field4.setWidth("185px");
		
//horiz_5 = button row #1
		HorizontalLayout horiz_5 = new HorizontalLayout();
		//Set Width for the Row
		horiz_5.setWidth("220px");
		//Add button components
		horiz_5.addComponent(button_1);
		horiz_5.addComponent(button_2);
		horiz_5.addComponent(button_3);
		horiz_5.addComponent(button_4);
		//Set width percentage
		button_1.setWidth("100%");
		button_2.setWidth("100%");
		button_3.setWidth("100%");
		button_4.setWidth("100%");
		//Set ExpandRatio to "Uniform"
		horiz_5.setExpandRatio(button_1, 1.0f);
		horiz_5.setExpandRatio(button_2, 1.0f);
		horiz_5.setExpandRatio(button_3, 1.0f);
		horiz_5.setExpandRatio(button_4, 1.0f);
		//Set Spacing between buttons
		horiz_5.setSpacing(true);
		
//horiz_6 = button row #2
		HorizontalLayout horiz_6 = new HorizontalLayout();
		//Set Width for the Row
		horiz_6.setWidth("220px");
		//Add button components
		horiz_6.addComponent(button_5);
		horiz_6.addComponent(button_6);
		horiz_6.addComponent(button_7);
		horiz_6.addComponent(button_8);
		//Set width percentage
		button_5.setWidth("100%");
		button_6.setWidth("100%");
		button_7.setWidth("100%");
		button_8.setWidth("100%");
		//Set ExpandRatio to "Uniform"
		horiz_6.setExpandRatio(button_5, 1.0f);
		horiz_6.setExpandRatio(button_6, 1.0f);
		horiz_6.setExpandRatio(button_7, 1.0f);
		horiz_6.setExpandRatio(button_8, 1.0f);
		//Set Spacing between buttons
		horiz_6.setSpacing(true);

		//layout.addComponent(panel);
		layout.addComponent(label1);
		layout.addComponent(labelhr);
		layout.addComponent(horiz_1);
		layout.addComponent(horiz_2);
		layout.addComponent(horiz_3);
		layout.addComponent(horiz_4);
		layout.addComponent(horiz_5);
		layout.addComponent(horiz_6);
		//panel.setContent();//Tobefixed
	}
}