/**
 *
 * $Id$
 */
package org.wso2.developerstudio.eclipse.gmf.esb.validation;

import org.wso2.developerstudio.eclipse.gmf.esb.FilterContainer;
import org.wso2.developerstudio.eclipse.gmf.esb.FilterMediatorConditionType;
import org.wso2.developerstudio.eclipse.gmf.esb.FilterMediatorFailOutputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.FilterMediatorInputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.FilterMediatorOutputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.FilterMediatorPassOutputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.NamespacedProperty;

/**
 * A sample validator interface for {@link org.wso2.developerstudio.eclipse.gmf.esb.FilterMediator}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface FilterMediatorValidator {
	boolean validate();

	boolean validateConditionType(FilterMediatorConditionType value);
	boolean validateRegex(String value);
	boolean validateInputConnector(FilterMediatorInputConnector value);
	boolean validateOutputConnector(FilterMediatorOutputConnector value);
	boolean validatePassOutputConnector(FilterMediatorPassOutputConnector value);
	boolean validateFailOutputConnector(FilterMediatorFailOutputConnector value);
	boolean validateXpath(NamespacedProperty value);
	boolean validateSource(NamespacedProperty value);
	boolean validateFilterContainer(FilterContainer value);
}