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
package org.wso2.developerstudio.eclipse.gmf.esb.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.wso2.developerstudio.eclipse.gmf.esb.ChildEndpoint;
import org.wso2.developerstudio.eclipse.gmf.esb.ChildEndpointType;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage;
import org.wso2.developerstudio.eclipse.gmf.esb.RegistryKeyProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Child Endpoint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ChildEndpointImpl#getChildEndpointType <em>Child Endpoint Type</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ChildEndpointImpl#getInlineEndpoint <em>Inline Endpoint</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.ChildEndpointImpl#getStaticReference <em>Static Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChildEndpointImpl extends EObjectImpl implements ChildEndpoint {
    /**
     * The default value of the '{@link #getChildEndpointType() <em>Child Endpoint Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getChildEndpointType()
     * @generated
     * @ordered
     */
    protected static final ChildEndpointType CHILD_ENDPOINT_TYPE_EDEFAULT = ChildEndpointType.INLINE;

    /**
     * The cached value of the '{@link #getChildEndpointType() <em>Child Endpoint Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getChildEndpointType()
     * @generated
     * @ordered
     */
    protected ChildEndpointType childEndpointType = CHILD_ENDPOINT_TYPE_EDEFAULT;

    /**
     * The default value of the '{@link #getInlineEndpoint() <em>Inline Endpoint</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInlineEndpoint()
     * @generated
     * @ordered
     */
    protected static final String INLINE_ENDPOINT_EDEFAULT = "";

    /**
     * The cached value of the '{@link #getInlineEndpoint() <em>Inline Endpoint</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInlineEndpoint()
     * @generated
     * @ordered
     */
    protected String inlineEndpoint = INLINE_ENDPOINT_EDEFAULT;

    /**
     * The cached value of the '{@link #getStaticReference() <em>Static Reference</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStaticReference()
     * @generated
     * @ordered
     */
    protected RegistryKeyProperty staticReference;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ChildEndpointImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EsbPackage.Literals.CHILD_ENDPOINT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ChildEndpointType getChildEndpointType() {
        return childEndpointType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setChildEndpointType(ChildEndpointType newChildEndpointType) {
        ChildEndpointType oldChildEndpointType = childEndpointType;
        childEndpointType = newChildEndpointType == null ? CHILD_ENDPOINT_TYPE_EDEFAULT : newChildEndpointType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.CHILD_ENDPOINT__CHILD_ENDPOINT_TYPE, oldChildEndpointType, childEndpointType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getInlineEndpoint() {
        return inlineEndpoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInlineEndpoint(String newInlineEndpoint) {
        String oldInlineEndpoint = inlineEndpoint;
        inlineEndpoint = newInlineEndpoint;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.CHILD_ENDPOINT__INLINE_ENDPOINT, oldInlineEndpoint, inlineEndpoint));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RegistryKeyProperty getStaticReference() {
        if (staticReference != null && staticReference.eIsProxy()) {
            InternalEObject oldStaticReference = (InternalEObject)staticReference;
            staticReference = (RegistryKeyProperty)eResolveProxy(oldStaticReference);
            if (staticReference != oldStaticReference) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, EsbPackage.CHILD_ENDPOINT__STATIC_REFERENCE, oldStaticReference, staticReference));
            }
        }
        return staticReference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RegistryKeyProperty basicGetStaticReference() {
        return staticReference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setStaticReference(RegistryKeyProperty newStaticReference) {
        RegistryKeyProperty oldStaticReference = staticReference;
        staticReference = newStaticReference;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.CHILD_ENDPOINT__STATIC_REFERENCE, oldStaticReference, staticReference));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case EsbPackage.CHILD_ENDPOINT__CHILD_ENDPOINT_TYPE:
                return getChildEndpointType();
            case EsbPackage.CHILD_ENDPOINT__INLINE_ENDPOINT:
                return getInlineEndpoint();
            case EsbPackage.CHILD_ENDPOINT__STATIC_REFERENCE:
                if (resolve) return getStaticReference();
                return basicGetStaticReference();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case EsbPackage.CHILD_ENDPOINT__CHILD_ENDPOINT_TYPE:
                setChildEndpointType((ChildEndpointType)newValue);
                return;
            case EsbPackage.CHILD_ENDPOINT__INLINE_ENDPOINT:
                setInlineEndpoint((String)newValue);
                return;
            case EsbPackage.CHILD_ENDPOINT__STATIC_REFERENCE:
                setStaticReference((RegistryKeyProperty)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case EsbPackage.CHILD_ENDPOINT__CHILD_ENDPOINT_TYPE:
                setChildEndpointType(CHILD_ENDPOINT_TYPE_EDEFAULT);
                return;
            case EsbPackage.CHILD_ENDPOINT__INLINE_ENDPOINT:
                setInlineEndpoint(INLINE_ENDPOINT_EDEFAULT);
                return;
            case EsbPackage.CHILD_ENDPOINT__STATIC_REFERENCE:
                setStaticReference((RegistryKeyProperty)null);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case EsbPackage.CHILD_ENDPOINT__CHILD_ENDPOINT_TYPE:
                return childEndpointType != CHILD_ENDPOINT_TYPE_EDEFAULT;
            case EsbPackage.CHILD_ENDPOINT__INLINE_ENDPOINT:
                return INLINE_ENDPOINT_EDEFAULT == null ? inlineEndpoint != null : !INLINE_ENDPOINT_EDEFAULT.equals(inlineEndpoint);
            case EsbPackage.CHILD_ENDPOINT__STATIC_REFERENCE:
                return staticReference != null;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (childEndpointType: ");
        result.append(childEndpointType);
        result.append(", inlineEndpoint: ");
        result.append(inlineEndpoint);
        result.append(')');
        return result.toString();
    }

} //ChildEndpointImpl
