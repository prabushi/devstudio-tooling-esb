/**
 *
 * $Id$
 */
package org.wso2.developerstudio.eclipse.gmf.esb.validation;

import org.wso2.developerstudio.eclipse.gmf.esb.ForEachMediatorInputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.ForEachMediatorOutputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.ForEachMediatorTargetOutputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.ForEachTarget;
import org.wso2.developerstudio.eclipse.gmf.esb.MediatorFlow;
import org.wso2.developerstudio.eclipse.gmf.esb.NamespacedProperty;
import org.wso2.developerstudio.eclipse.gmf.esb.RegistryKeyProperty;
import org.wso2.developerstudio.eclipse.gmf.esb.SequenceType;

/**
 * A sample validator interface for {@link org.wso2.developerstudio.eclipse.gmf.esb.ForEachMediator}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ForEachMediatorValidator {
	boolean validate();

	boolean validateForEachID(String value);
	boolean validateForEachExpression(NamespacedProperty value);
	boolean validateAttachPath(NamespacedProperty value);
	boolean validateTarget(ForEachTarget value);
	boolean validateInputConnector(ForEachMediatorInputConnector value);
	boolean validateOutputConnector(ForEachMediatorOutputConnector value);
	boolean validateTargetOutputConnector(ForEachMediatorTargetOutputConnector value);
	boolean validateMediatorFlow(MediatorFlow value);
	boolean validateSequenceType(SequenceType value);
	boolean validateSequenceKey(RegistryKeyProperty value);
	boolean validateSequenceName(String value);
}
