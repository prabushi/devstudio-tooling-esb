/**
 *
 * $Id$
 */
package org.wso2.developerstudio.eclipse.gmf.esb.validation;

import org.eclipse.emf.common.util.EList;

import org.wso2.developerstudio.eclipse.gmf.esb.MediatorFlow;
import org.wso2.developerstudio.eclipse.gmf.esb.RegistryKeyProperty;
import org.wso2.developerstudio.eclipse.gmf.esb.SequencesInputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.SequencesOutputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.TemplateParameter;

/**
 * A sample validator interface for {@link org.wso2.developerstudio.eclipse.gmf.esb.Sequences}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface SequencesValidator {
	boolean validate();

	boolean validateOutputConnector(SequencesOutputConnector value);
	boolean validateInputConnector(SequencesInputConnector value);
	boolean validateMediatorFlow(MediatorFlow value);
	boolean validateName(String value);
	boolean validateRecieveSequence(boolean value);
	boolean validateAssociatedProxy(EList<String> value);
	boolean validateOnError(RegistryKeyProperty value);
	boolean validateTemplateParameters(EList<TemplateParameter> value);
	boolean validateTraceEnabled(boolean value);
	boolean validateStatisticsEnabled(boolean value);
}