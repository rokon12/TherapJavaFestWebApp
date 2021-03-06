package net.therap.action;

import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.*;
import org.jboss.seam.faces.Renderer;
import org.jboss.seam.log.Log;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: sazzadur
 * Date: 7/22/12
 * Time: 11:46 AM
 */
@Name("emailAction")
@Scope(ScopeType.EVENT)
public class EmailAction implements Serializable {
    @Logger
    private Log log;

    @In(create = true)
    private Renderer renderer;

    public void sendMessage(String emailContentFileName) {
        log.info("inside send message");
        try {
            renderer.render("/" + emailContentFileName);
        } catch (Exception e) {
            log.error("Error Email Send ",e);
        }
    }
}
