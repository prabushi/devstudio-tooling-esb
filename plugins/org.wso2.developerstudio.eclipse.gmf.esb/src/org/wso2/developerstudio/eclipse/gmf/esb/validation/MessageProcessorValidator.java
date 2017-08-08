/**
 *
 * $Id$
 */
package org.wso2.developerstudio.eclipse.gmf.esb.validation;

import org.eclipse.emf.common.util.EList;

import org.wso2.developerstudio.eclipse.gmf.esb.EnableDisableState;
import org.wso2.developerstudio.eclipse.gmf.esb.MessageProcessorParameter;
import org.wso2.developerstudio.eclipse.gmf.esb.MessageProcessorType;
import org.wso2.developerstudio.eclipse.gmf.esb.ProcessorState;
import org.wso2.developerstudio.eclipse.gmf.esb.RegistryKeyProperty;

/**
 * A sample validator interface for {@link org.wso2.developerstudio.eclipse.gmf.esb.MessageProcessor}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface MessageProcessorValidator {
	boolean validate();

	boolean validateProcessorName(String value);
	boolean validateProcessorType(MessageProcessorType value);
	boolean validateMessageProcessorProvider(String value);
	boolean validateMessageStore(String value);
	boolean validateSourceMessageStore(String value);
	boolean validateTargetMessageStore(String value);
	boolean validateProcessorState(ProcessorState value);
	boolean validateEndpointName(RegistryKeyProperty value);
	boolean validateSequence(RegistryKeyProperty value);
	boolean validateRetryInterval(long value);
	boolean validateForwardingInterval(long value);
	boolean validateSamplingInterval(long value);
	boolean validateSamplingConcurrency(int value);
	boolean validateMaxDeliveryAttempts(int value);
	boolean validateDropMessageAfterMaximumDeliveryAttempts(EnableDisableState value);
	boolean validateAxis2ClientRepository(String value);
	boolean validateAxis2Configuration(String value);
	boolean validateReplySequenceName(RegistryKeyProperty value);
	boolean validateFaultSequenceName(RegistryKeyProperty value);
	boolean validateDeactivateSequenceName(RegistryKeyProperty value);
	boolean validateQuartzConfigFilePath(String value);
	boolean validateCronExpression(String value);
	boolean validateNonRetryHttpStatusCodes(String value);
	boolean validateParameters(EList<MessageProcessorParameter> value);
	boolean validateTaskCount(String value);
}
