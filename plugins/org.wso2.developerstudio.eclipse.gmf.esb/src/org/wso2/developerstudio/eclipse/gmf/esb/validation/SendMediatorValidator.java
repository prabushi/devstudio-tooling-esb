/**
 *
 * $Id$
 */
package org.wso2.developerstudio.eclipse.gmf.esb.validation;

import org.eclipse.emf.common.util.EList;

import org.wso2.developerstudio.eclipse.gmf.esb.EndPoint;
import org.wso2.developerstudio.eclipse.gmf.esb.MediatorFlow;
import org.wso2.developerstudio.eclipse.gmf.esb.NamespacedProperty;
import org.wso2.developerstudio.eclipse.gmf.esb.ReceivingSequenceType;
import org.wso2.developerstudio.eclipse.gmf.esb.RegistryKeyProperty;
import org.wso2.developerstudio.eclipse.gmf.esb.SendMediatorEndpointOutputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.SendMediatorInputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.SendMediatorOutputConnector;

/**
 * A sample validator interface for {@link org.wso2.developerstudio.eclipse.gmf.esb.SendMediator}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface SendMediatorValidator {
	boolean validate();

	boolean validateEndPoint(EList<EndPoint> value);
	boolean validateInputConnector(SendMediatorInputConnector value);
	boolean validateOutputConnector(SendMediatorOutputConnector value);
	boolean validateReceivingSequenceType(ReceivingSequenceType value);
	boolean validateStaticReceivingSequence(RegistryKeyProperty value);
	boolean validateDynamicReceivingSequence(NamespacedProperty value);
	boolean validateEndpointOutputConnector(SendMediatorEndpointOutputConnector value);
	boolean validateMediatorFlow(MediatorFlow value);
	boolean validateSkipSerialization(boolean value);
	boolean validateBuildMessageBeforeSending(boolean value);
}