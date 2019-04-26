/**
 * Copyright 2009-2012 WSO2, Inc. (http://wso2.com)
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.wso2.developerstudio.eclipse.gmf.esb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Child Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.ChildEndpoint#getChildEndpointType <em>Child Endpoint Type</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.ChildEndpoint#getInlineEndpoint <em>Inline Endpoint</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.ChildEndpoint#getStaticReference <em>Static Reference</em>}</li>
 * </ul>
 *
 * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getChildEndpoint()
 * @model
 * @generated
 */
public interface ChildEndpoint extends EObject {
    /**
     * Returns the value of the '<em><b>Child Endpoint Type</b></em>' attribute.
     * The default value is <code>"INLINE"</code>.
     * The literals are from the enumeration {@link org.wso2.developerstudio.eclipse.gmf.esb.ChildEndpointType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Child Endpoint Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Child Endpoint Type</em>' attribute.
     * @see org.wso2.developerstudio.eclipse.gmf.esb.ChildEndpointType
     * @see #setChildEndpointType(ChildEndpointType)
     * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getChildEndpoint_ChildEndpointType()
     * @model default="INLINE"
     * @generated
     */
    ChildEndpointType getChildEndpointType();

    /**
     * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.ChildEndpoint#getChildEndpointType <em>Child Endpoint Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Child Endpoint Type</em>' attribute.
     * @see org.wso2.developerstudio.eclipse.gmf.esb.ChildEndpointType
     * @see #getChildEndpointType()
     * @generated
     */
    void setChildEndpointType(ChildEndpointType value);

    /**
     * Returns the value of the '<em><b>Inline Endpoint</b></em>' attribute.
     * The default value is <code>""</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Inline Endpoint</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Inline Endpoint</em>' attribute.
     * @see #setInlineEndpoint(String)
     * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getChildEndpoint_InlineEndpoint()
     * @model default=""
     * @generated
     */
    String getInlineEndpoint();

    /**
     * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.ChildEndpoint#getInlineEndpoint <em>Inline Endpoint</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Inline Endpoint</em>' attribute.
     * @see #getInlineEndpoint()
     * @generated
     */
    void setInlineEndpoint(String value);

    /**
     * Returns the value of the '<em><b>Static Reference</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Static Reference</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Static Reference</em>' reference.
     * @see #setStaticReference(RegistryKeyProperty)
     * @see org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage#getChildEndpoint_StaticReference()
     * @model
     * @generated
     */
    RegistryKeyProperty getStaticReference();

    /**
     * Sets the value of the '{@link org.wso2.developerstudio.eclipse.gmf.esb.ChildEndpoint#getStaticReference <em>Static Reference</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Static Reference</em>' reference.
     * @see #getStaticReference()
     * @generated
     */
    void setStaticReference(RegistryKeyProperty value);

} // ChildEndpoint
