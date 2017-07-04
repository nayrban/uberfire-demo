package org.uberfire.client.dtable;

import com.google.gwt.user.client.ui.IsWidget;
import jsinterop.annotations.JsType;
import org.uberfire.backend.vfs.Path;
import org.uberfire.client.workbench.type.ClientResourceType;

import javax.enterprise.context.ApplicationScoped;

/**
 * Created by Bryan on 03/07/2017.
 */
@ApplicationScoped
@JsType
public class TextResourceType implements ClientResourceType {

    @Override
    public String getShortName() {
        return "text";
    }

    @Override
    public String getDescription() {
        return "";
    }

    @Override
    public String getPrefix() {
        return "";
    }

    @Override
    public String getSuffix() {
        return "txt";
    }

    @Override
    public int getPriority() {
        return 0;
    }

    @Override
    public String getSimpleWildcardPattern() {
        return "*." + getSuffix();
    }

    @Override
    public boolean accept(final Path path) {
        return path.getFileName().endsWith("." + getSuffix());
    }

    @Override
    public IsWidget getIcon() {
        return null;
    }
}
