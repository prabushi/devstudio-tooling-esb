/**
 *
 * $Id$
 */
package org.wso2.developerstudio.eclipse.gmf.esb.validation;

import org.eclipse.emf.common.util.EList;

import org.wso2.developerstudio.eclipse.gmf.esb.CallTemplateParameter;
import org.wso2.developerstudio.eclipse.gmf.esb.CloudConnectorInputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.CloudConnectorOutputConnector;

/**
 * A sample validator interface for {@link org.wso2.developerstudio.eclipse.gmf.esb.CloudConnector}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface CloudConnectorValidator {
	boolean validate();

	boolean validateInputConnector(CloudConnectorInputConnector value);
	boolean validateOutputConnector(CloudConnectorOutputConnector value);
	boolean validateConnectorParameters(EList<CallTemplateParameter> value);
}