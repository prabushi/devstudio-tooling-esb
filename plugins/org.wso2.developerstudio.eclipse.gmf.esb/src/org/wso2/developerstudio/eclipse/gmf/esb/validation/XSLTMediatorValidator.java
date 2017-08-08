/**
 *
 * $Id$
 */
package org.wso2.developerstudio.eclipse.gmf.esb.validation;

import org.eclipse.emf.common.util.EList;

import org.wso2.developerstudio.eclipse.gmf.esb.KeyType;
import org.wso2.developerstudio.eclipse.gmf.esb.NamespacedProperty;
import org.wso2.developerstudio.eclipse.gmf.esb.RegistryKeyProperty;
import org.wso2.developerstudio.eclipse.gmf.esb.XSLTFeature;
import org.wso2.developerstudio.eclipse.gmf.esb.XSLTMediatorInputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.XSLTMediatorOutputConnector;
import org.wso2.developerstudio.eclipse.gmf.esb.XSLTProperty;
import org.wso2.developerstudio.eclipse.gmf.esb.XSLTResource;

/**
 * A sample validator interface for {@link org.wso2.developerstudio.eclipse.gmf.esb.XSLTMediator}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface XSLTMediatorValidator {
	boolean validate();

	boolean validateInputConnector(XSLTMediatorInputConnector value);
	boolean validateOutputConnector(XSLTMediatorOutputConnector value);
	boolean validateXsltSchemaKeyType(KeyType value);
	boolean validateXsltStaticSchemaKey(RegistryKeyProperty value);
	boolean validateXsltDynamicSchemaKey(NamespacedProperty value);
	boolean validateXsltKey(RegistryKeyProperty value);
	boolean validateSourceXPath(NamespacedProperty value);
	boolean validateProperties(EList<XSLTProperty> value);
	boolean validateFeatures(EList<XSLTFeature> value);
	boolean validateResources(EList<XSLTResource> value);
}