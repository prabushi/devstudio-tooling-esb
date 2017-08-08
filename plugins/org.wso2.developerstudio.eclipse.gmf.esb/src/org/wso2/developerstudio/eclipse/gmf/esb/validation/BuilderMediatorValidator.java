/**
 *
 * $Id$
 */
package org.wso2.developerstudio.eclipse.gmf.esb.validation;

import org.eclipse.emf.common.util.EList;

import org.wso2.developerstudio.eclipse.gmf.esb.BuilderMediatorInputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.BuilderMediatorOutputConector;
import org.wso2.developerstudio.eclipse.gmf.esb.MessageBuilder;

/**
 * A sample validator interface for {@link org.wso2.developerstudio.eclipse.gmf.esb.BuilderMediator}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface BuilderMediatorValidator {
	boolean validate();

	boolean validateMessageBuilders(EList<MessageBuilder> value);
	boolean validateInputConnector(BuilderMediatorInputConnector value);
	boolean validateOutputConnector(BuilderMediatorOutputConector value);
}
