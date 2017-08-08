/**
 *
 * $Id$
 */
package org.wso2.developerstudio.eclipse.gmf.esb.validation;

import org.wso2.developerstudio.eclipse.gmf.esb.EnqueueMediatorInputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.EnqueueMediatorOutputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.RegistryKeyProperty;

/**
 * A sample validator interface for {@link org.wso2.developerstudio.eclipse.gmf.esb.EnqueueMediator}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface EnqueueMediatorValidator {
	boolean validate();

	boolean validateExecutor(String value);
	boolean validatePriority(int value);
	boolean validateSequenceKey(RegistryKeyProperty value);
	boolean validateInputConnector(EnqueueMediatorInputConnector value);
	boolean validateOutputConnector(EnqueueMediatorOutputConnector value);
}