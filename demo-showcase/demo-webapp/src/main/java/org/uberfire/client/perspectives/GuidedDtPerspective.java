package org.uberfire.client.perspectives;

import org.uberfire.client.annotations.Perspective;
import org.uberfire.client.annotations.WorkbenchPerspective;
import org.uberfire.client.workbench.panels.impl.MultiListWorkbenchPanelPresenter;
import org.uberfire.mvp.impl.DefaultPlaceRequest;
import org.uberfire.workbench.model.PerspectiveDefinition;
import org.uberfire.workbench.model.impl.PartDefinitionImpl;
import org.uberfire.workbench.model.impl.PerspectiveDefinitionImpl;

import javax.enterprise.context.ApplicationScoped;


@ApplicationScoped
@WorkbenchPerspective(identifier = "GuidedDtPerspective")
public class GuidedDtPerspective {
    @Perspective
    public PerspectiveDefinition buildPerspective() {
        final PerspectiveDefinition p = new PerspectiveDefinitionImpl( MultiListWorkbenchPanelPresenter.class.getName() );
        p.setName( "GuidedDtPerspective" );
        p.getRoot().addPart( new PartDefinitionImpl( new DefaultPlaceRequest( "SampleWorkbenchEditor" ) ) );

        return p;
    }
}
