/**
 *
 * $Id$
 */
package org.wso2.developerstudio.eclipse.gmf.esb.validation;

import org.eclipse.emf.common.util.EList;

import org.wso2.developerstudio.eclipse.gmf.esb.ConditionalRouteBranch;
import org.wso2.developerstudio.eclipse.gmf.esb.ConditionalRouterMediatorAdditionalOutputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.ConditionalRouterMediatorInputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.ConditionalRouterMediatorOutputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.MediatorFlow;

/**
 * A sample validator interface for {@link org.wso2.developerstudio.eclipse.gmf.esb.ConditionalRouterMediator}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ConditionalRouterMediatorValidator {
	boolean validate();

	boolean validateContinueAfterRoute(boolean value);
	boolean validateConditionalRouteBranches(EList<ConditionalRouteBranch> value);
	boolean validateInputConnector(ConditionalRouterMediatorInputConnector value);
	boolean validateOutputConnector(ConditionalRouterMediatorOutputConnector value);
	boolean validateAdditionalOutputConnector(ConditionalRouterMediatorAdditionalOutputConnector value);
	boolean validateMediatorFlow(MediatorFlow value);
}