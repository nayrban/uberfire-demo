package org.uberfire.client.screens;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import org.uberfire.client.annotations.WorkbenchPartTitle;
import org.uberfire.client.annotations.WorkbenchScreen;

import javax.annotation.PostConstruct;
import javax.enterprise.context.Dependent;

@Dependent
@WorkbenchScreen(identifier = "GpsDemoScreen")
public class GpsDemoScreen extends Composite {
    interface Binder
            extends
            UiBinder<Widget, GpsDemoScreen> {

    }


    private static GpsDemoScreen.Binder uiBinder = GWT.create(GpsDemoScreen.Binder.class);

    @PostConstruct
    public void init() {
        initWidget(uiBinder.createAndBindUi(this));
    }

    @WorkbenchPartTitle
    public String getTitle() {
        return "Gps Demo";
    }
}
