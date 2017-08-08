/**
 *
 * $Id$
 */
package org.wso2.developerstudio.eclipse.gmf.esb.validation;

import org.wso2.developerstudio.eclipse.gmf.esb.NamespacedProperty;
import org.wso2.developerstudio.eclipse.gmf.esb.PropertyAction;
import org.wso2.developerstudio.eclipse.gmf.esb.PropertyDataType;
import org.wso2.developerstudio.eclipse.gmf.esb.PropertyMediatorInputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.PropertyMediatorOutputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.PropertyName;
import org.wso2.developerstudio.eclipse.gmf.esb.PropertyScope;
import org.wso2.developerstudio.eclipse.gmf.esb.PropertyValueType;

/**
 * A sample validator interface for {@link org.wso2.developerstudio.eclipse.gmf.esb.PropertyMediator}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface PropertyMediatorValidator {
	boolean validate();

	boolean validateInputConnector(PropertyMediatorInputConnector value);
	boolean validateOutputConnector(PropertyMediatorOutputConnector value);
	boolean validatePropertyName(PropertyName value);
	boolean validatePropertyDataType(PropertyDataType value);
	boolean validatePropertyAction(PropertyAction value);
	boolean validatePropertyScope(PropertyScope value);
	boolean validateValueType(PropertyValueType value);
	boolean validateValue(String value);
	boolean validateExpression(String value);
	boolean validateNamespacePrefix(String value);
	boolean validateNamespace(String value);
	boolean validateValueExpression(NamespacedProperty value);
	boolean validateBoolean(boolean value);
	boolean validateOM(String value);
	boolean validateValueStringPattern(String value);
	boolean validateValueStringCapturingGroup(int value);
	boolean validateNewPropertyName(String value);
}