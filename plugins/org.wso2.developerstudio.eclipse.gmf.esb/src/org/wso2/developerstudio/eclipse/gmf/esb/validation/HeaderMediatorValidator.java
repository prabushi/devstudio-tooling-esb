/**
 *
 * $Id$
 */
package org.wso2.developerstudio.eclipse.gmf.esb.validation;

import org.wso2.developerstudio.eclipse.gmf.esb.HeaderAction;
import org.wso2.developerstudio.eclipse.gmf.esb.HeaderMediatorInputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.HeaderMediatorOutputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.HeaderValueType;
import org.wso2.developerstudio.eclipse.gmf.esb.NamespacedProperty;
import org.wso2.developerstudio.eclipse.gmf.esb.ScopeType;

/**
 * A sample validator interface for {@link org.wso2.developerstudio.eclipse.gmf.esb.HeaderMediator}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface HeaderMediatorValidator {
	boolean validate();

	boolean validateHeaderName(NamespacedProperty value);
	boolean validateHeaderAction(HeaderAction value);
	boolean validateValueType(HeaderValueType value);
	boolean validateScope(ScopeType value);
	boolean validateValueLiteral(String value);
	boolean validateValueExpression(NamespacedProperty value);
	boolean validateInputConnector(HeaderMediatorInputConnector value);
	boolean validateOutputConnector(HeaderMediatorOutputConnector value);
	boolean validateValueInline(String value);
}
