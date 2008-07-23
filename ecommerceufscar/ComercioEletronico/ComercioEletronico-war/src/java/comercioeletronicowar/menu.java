/*
 * menu.java
 *
 * Created on 03/02/2008, 14:37:15
 */
 
package comercioeletronicowar;

import com.sun.rave.web.ui.appbase.AbstractFragmentBean;
import com.sun.webui.jsf.component.Hyperlink;
import com.sun.webui.jsf.component.ImageComponent;
import com.sun.webui.jsf.component.ImageHyperlink;
import com.sun.webui.jsf.component.Label;
import javax.faces.FacesException;

/**
 * <p>Fragment bean that corresponds to a similarly named JSP page
 * fragment.  This class contains component definitions (and initialization
 * code) for all components that you have defined on this fragment, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 *
 * @author Cliente
 */
public class menu extends AbstractFragmentBean {
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    /**
     * <p>Automatically managed component initialization. <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
    }
    private Hyperlink hyperlink1 = new Hyperlink();

    public Hyperlink getHyperlink1() {
        return hyperlink1;
    }

    public void setHyperlink1(Hyperlink h) {
        this.hyperlink1 = h;
    }
    
    private Hyperlink hyperlink2 = new Hyperlink();

    public Hyperlink getHyperlink2() {
        return hyperlink2;
    }

    public void setHyperlink2(Hyperlink h) {
        this.hyperlink2 = h;
    }
    private ImageHyperlink imageHyperlink1 = new ImageHyperlink();

    public ImageHyperlink getImageHyperlink1() {
        return imageHyperlink1;
    }

    public void setImageHyperlink1(ImageHyperlink ih) {
        this.imageHyperlink1 = ih;
    }
    private ImageHyperlink imageHyperlink2 = new ImageHyperlink();

    public ImageHyperlink getImageHyperlink2() {
        return imageHyperlink2;
    }

    public void setImageHyperlink2(ImageHyperlink ih) {
        this.imageHyperlink2 = ih;
    }
    private Hyperlink hyperlink3 = new Hyperlink();

    public Hyperlink getHyperlink3() {
        return hyperlink3;
    }

    public void setHyperlink3(Hyperlink h) {
        this.hyperlink3 = h;
    }
    private ImageHyperlink imageHyperlink3 = new ImageHyperlink();

    public ImageHyperlink getImageHyperlink3() {
        return imageHyperlink3;
    }

    public void setImageHyperlink3(ImageHyperlink ih) {
        this.imageHyperlink3 = ih;
    }
    private ImageHyperlink imageHyperlink4 = new ImageHyperlink();

    public ImageHyperlink getImageHyperlink4() {
        return imageHyperlink4;
    }

    public void setImageHyperlink4(ImageHyperlink ih) {
        this.imageHyperlink4 = ih;
    }
    private ImageHyperlink imageHyperlink5 = new ImageHyperlink();

    public ImageHyperlink getImageHyperlink5() {
        return imageHyperlink5;
    }

    public void setImageHyperlink5(ImageHyperlink ih) {
        this.imageHyperlink5 = ih;
    }
    private Hyperlink hyperlink4 = new Hyperlink();

    public Hyperlink getHyperlink4() {
        return hyperlink4;
    }

    public void setHyperlink4(Hyperlink h) {
        this.hyperlink4 = h;
    }
    // </editor-fold>

    public menu() {
    }

    /**
     * <p>Callback method that is called whenever a page containing
     * this page fragment is navigated to, either directly via a URL,
     * or indirectly via page navigation.  Override this method to acquire
     * resources that will be needed for event handlers and lifecycle methods.</p>
     * 
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void init() {
        // Perform initializations inherited from our superclass
        super.init();
        // Perform application initialization that must complete
        // *before* managed components are initialized
        // TODO - add your own initialiation code here
        
        
        // <editor-fold defaultstate="collapsed" desc="Visual-Web-managed Component Initialization">
        // Initialize automatically managed components
        // *Note* - this logic should NOT be modified
        try {
            _init();
        } catch (Exception e) {
            log("Page1 Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e: new FacesException(e);
        }
        
        // </editor-fold>
        // Perform application initialization that must complete
        // *after* managed components are initialized
        // TODO - add your own initialization code here
    }

    /**
     * <p>Callback method that is called after rendering is completed for
     * this request, if <code>init()</code> was called.  Override this
     * method to release resources acquired in the <code>init()</code>
     * resources that will be needed for event handlers and lifecycle methods.</p>
     * 
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void destroy() {
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected SessionBean1 getSessionBean1() {
        return (SessionBean1) getBean("SessionBean1");
    }

    public String hyperlink1_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return null;
    }

    public String hyperlink3_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return null;
    }

    public String imageHyperlink1_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return null;
    }

}
