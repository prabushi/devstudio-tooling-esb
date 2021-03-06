package org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.AbstractMediatorCompartmentEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.AbstractMediatorFlowCompartmentEditPart.Complexity;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.editpolicy.FeedbackIndicateDragDropEditPolicy;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.policies.MediatorFlowMediatorFlowCompartment9CanonicalEditPolicy;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.policies.MediatorFlowMediatorFlowCompartment9ItemSemanticEditPolicy;

/**
 * @generated NOT
 */
public class MediatorFlowMediatorFlowCompartment9EditPart extends AbstractMediatorCompartmentEditPart {

    /**
     * @generated
     */
    public static final int VISUAL_ID = 7030;

    /**
     * @generated NOT
     */
    public MediatorFlowMediatorFlowCompartment9EditPart(View view) {
        super(view);
        complexity = Complexity.DOUBLE;
    }

    /**
     * @generated NOT
     */
    public String getCompartmentName() {
        // return Messages.MediatorFlowMediatorFlowCompartment9EditPart_title;
        return null; // "OnAccept";
    }

    public IFigure createFigure() {
        ResizableCompartmentFigure result = (ResizableCompartmentFigure) super.createFigure();
        result.setTitle("OnAccept");
        result.setTitleVisibility(true);
        /*
         * Override default border.
         * Fixing TOOLS-1864.
         */
        LineBorder border = new LineBorder(new Color(null, 183, 183, 183), 1, SWT.BORDER_DASH);
        result.setBorder(border);
        result.setToolTip("OnAccept");
        ConstrainedToolbarLayout layoutManager = new ConstrainedToolbarLayout(false);
        layoutManager.setSpacing(-15);
        result.setLayoutManager(layoutManager);
        return result;
    }

    /**
     * @generated NOT
     */
    protected void createDefaultEditPolicies() {
        super.createDefaultEditPolicies();
        installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
                new MediatorFlowMediatorFlowCompartment9ItemSemanticEditPolicy());
        installEditPolicy(EditPolicyRoles.CREATION_ROLE, new CreationEditPolicy());
        installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new DragDropEditPolicy());
        installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new FeedbackIndicateDragDropEditPolicy());
        installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
                new MediatorFlowMediatorFlowCompartment9CanonicalEditPolicy());
        removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);

    }

    /**
     * @generated
     */
    protected void setRatio(Double ratio) {
        if (getFigure().getParent().getLayoutManager() instanceof ConstrainedToolbarLayout) {
            super.setRatio(ratio);
        }
    }

    public boolean isSelectable() {
        // TODO This or using ResizableEditpolicy?
        return false;
    }

}
