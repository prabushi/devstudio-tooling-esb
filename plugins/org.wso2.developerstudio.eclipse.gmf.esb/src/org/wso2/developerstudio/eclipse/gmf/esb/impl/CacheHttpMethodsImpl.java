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

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.wso2.developerstudio.eclipse.gmf.esb.CacheHttpMethods;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cache Http Methods</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.CacheHttpMethodsImpl#isGET <em>GET</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.CacheHttpMethodsImpl#isPOST <em>POST</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.CacheHttpMethodsImpl#isPUT <em>PUT</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.CacheHttpMethodsImpl#isDELETE <em>DELETE</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.CacheHttpMethodsImpl#isHEAD <em>HEAD</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.CacheHttpMethodsImpl#isCONNECT <em>CONNECT</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.CacheHttpMethodsImpl#isOPTIONS <em>OPTIONS</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.CacheHttpMethodsImpl#isTRACE <em>TRACE</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.gmf.esb.impl.CacheHttpMethodsImpl#isPATCH <em>PATCH</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CacheHttpMethodsImpl extends EObjectImpl implements CacheHttpMethods {
	/**
	 * The default value of the '{@link #isGET() <em>GET</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGET()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GET_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGET() <em>GET</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGET()
	 * @generated
	 * @ordered
	 */
	protected boolean get = GET_EDEFAULT;

	/**
	 * The default value of the '{@link #isPOST() <em>POST</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPOST()
	 * @generated
	 * @ordered
	 */
	protected static final boolean POST_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPOST() <em>POST</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPOST()
	 * @generated
	 * @ordered
	 */
	protected boolean post = POST_EDEFAULT;

	/**
	 * The default value of the '{@link #isPUT() <em>PUT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPUT()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PUT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPUT() <em>PUT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPUT()
	 * @generated
	 * @ordered
	 */
	protected boolean put = PUT_EDEFAULT;

	/**
	 * The default value of the '{@link #isDELETE() <em>DELETE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDELETE()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DELETE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDELETE() <em>DELETE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDELETE()
	 * @generated
	 * @ordered
	 */
	protected boolean delete = DELETE_EDEFAULT;

	/**
	 * The default value of the '{@link #isHEAD() <em>HEAD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHEAD()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HEAD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHEAD() <em>HEAD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHEAD()
	 * @generated
	 * @ordered
	 */
	protected boolean head = HEAD_EDEFAULT;

	/**
	 * The default value of the '{@link #isCONNECT() <em>CONNECT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCONNECT()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONNECT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCONNECT() <em>CONNECT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCONNECT()
	 * @generated
	 * @ordered
	 */
	protected boolean connect = CONNECT_EDEFAULT;

	/**
	 * The default value of the '{@link #isOPTIONS() <em>OPTIONS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOPTIONS()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OPTIONS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOPTIONS() <em>OPTIONS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOPTIONS()
	 * @generated
	 * @ordered
	 */
	protected boolean options = OPTIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #isTRACE() <em>TRACE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTRACE()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRACE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTRACE() <em>TRACE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTRACE()
	 * @generated
	 * @ordered
	 */
	protected boolean trace = TRACE_EDEFAULT;

	/**
	 * The default value of the '{@link #isPATCH() <em>PATCH</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPATCH()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PATCH_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPATCH() <em>PATCH</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPATCH()
	 * @generated
	 * @ordered
	 */
	protected boolean patch = PATCH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CacheHttpMethodsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EsbPackage.Literals.CACHE_HTTP_METHODS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGET() {
		return get;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGET(boolean newGET) {
		boolean oldGET = get;
		get = newGET;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.CACHE_HTTP_METHODS__GET, oldGET, get));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPOST() {
		return post;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPOST(boolean newPOST) {
		boolean oldPOST = post;
		post = newPOST;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.CACHE_HTTP_METHODS__POST, oldPOST, post));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPUT() {
		return put;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPUT(boolean newPUT) {
		boolean oldPUT = put;
		put = newPUT;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.CACHE_HTTP_METHODS__PUT, oldPUT, put));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDELETE() {
		return delete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDELETE(boolean newDELETE) {
		boolean oldDELETE = delete;
		delete = newDELETE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.CACHE_HTTP_METHODS__DELETE, oldDELETE, delete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHEAD() {
		return head;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHEAD(boolean newHEAD) {
		boolean oldHEAD = head;
		head = newHEAD;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.CACHE_HTTP_METHODS__HEAD, oldHEAD, head));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCONNECT() {
		return connect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCONNECT(boolean newCONNECT) {
		boolean oldCONNECT = connect;
		connect = newCONNECT;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.CACHE_HTTP_METHODS__CONNECT, oldCONNECT, connect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOPTIONS() {
		return options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOPTIONS(boolean newOPTIONS) {
		boolean oldOPTIONS = options;
		options = newOPTIONS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.CACHE_HTTP_METHODS__OPTIONS, oldOPTIONS, options));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTRACE() {
		return trace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTRACE(boolean newTRACE) {
		boolean oldTRACE = trace;
		trace = newTRACE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.CACHE_HTTP_METHODS__TRACE, oldTRACE, trace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPATCH() {
		return patch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPATCH(boolean newPATCH) {
		boolean oldPATCH = patch;
		patch = newPATCH;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.CACHE_HTTP_METHODS__PATCH, oldPATCH, patch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EsbPackage.CACHE_HTTP_METHODS__GET:
				return isGET();
			case EsbPackage.CACHE_HTTP_METHODS__POST:
				return isPOST();
			case EsbPackage.CACHE_HTTP_METHODS__PUT:
				return isPUT();
			case EsbPackage.CACHE_HTTP_METHODS__DELETE:
				return isDELETE();
			case EsbPackage.CACHE_HTTP_METHODS__HEAD:
				return isHEAD();
			case EsbPackage.CACHE_HTTP_METHODS__CONNECT:
				return isCONNECT();
			case EsbPackage.CACHE_HTTP_METHODS__OPTIONS:
				return isOPTIONS();
			case EsbPackage.CACHE_HTTP_METHODS__TRACE:
				return isTRACE();
			case EsbPackage.CACHE_HTTP_METHODS__PATCH:
				return isPATCH();
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
			case EsbPackage.CACHE_HTTP_METHODS__GET:
				setGET((Boolean)newValue);
				return;
			case EsbPackage.CACHE_HTTP_METHODS__POST:
				setPOST((Boolean)newValue);
				return;
			case EsbPackage.CACHE_HTTP_METHODS__PUT:
				setPUT((Boolean)newValue);
				return;
			case EsbPackage.CACHE_HTTP_METHODS__DELETE:
				setDELETE((Boolean)newValue);
				return;
			case EsbPackage.CACHE_HTTP_METHODS__HEAD:
				setHEAD((Boolean)newValue);
				return;
			case EsbPackage.CACHE_HTTP_METHODS__CONNECT:
				setCONNECT((Boolean)newValue);
				return;
			case EsbPackage.CACHE_HTTP_METHODS__OPTIONS:
				setOPTIONS((Boolean)newValue);
				return;
			case EsbPackage.CACHE_HTTP_METHODS__TRACE:
				setTRACE((Boolean)newValue);
				return;
			case EsbPackage.CACHE_HTTP_METHODS__PATCH:
				setPATCH((Boolean)newValue);
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
			case EsbPackage.CACHE_HTTP_METHODS__GET:
				setGET(GET_EDEFAULT);
				return;
			case EsbPackage.CACHE_HTTP_METHODS__POST:
				setPOST(POST_EDEFAULT);
				return;
			case EsbPackage.CACHE_HTTP_METHODS__PUT:
				setPUT(PUT_EDEFAULT);
				return;
			case EsbPackage.CACHE_HTTP_METHODS__DELETE:
				setDELETE(DELETE_EDEFAULT);
				return;
			case EsbPackage.CACHE_HTTP_METHODS__HEAD:
				setHEAD(HEAD_EDEFAULT);
				return;
			case EsbPackage.CACHE_HTTP_METHODS__CONNECT:
				setCONNECT(CONNECT_EDEFAULT);
				return;
			case EsbPackage.CACHE_HTTP_METHODS__OPTIONS:
				setOPTIONS(OPTIONS_EDEFAULT);
				return;
			case EsbPackage.CACHE_HTTP_METHODS__TRACE:
				setTRACE(TRACE_EDEFAULT);
				return;
			case EsbPackage.CACHE_HTTP_METHODS__PATCH:
				setPATCH(PATCH_EDEFAULT);
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
			case EsbPackage.CACHE_HTTP_METHODS__GET:
				return get != GET_EDEFAULT;
			case EsbPackage.CACHE_HTTP_METHODS__POST:
				return post != POST_EDEFAULT;
			case EsbPackage.CACHE_HTTP_METHODS__PUT:
				return put != PUT_EDEFAULT;
			case EsbPackage.CACHE_HTTP_METHODS__DELETE:
				return delete != DELETE_EDEFAULT;
			case EsbPackage.CACHE_HTTP_METHODS__HEAD:
				return head != HEAD_EDEFAULT;
			case EsbPackage.CACHE_HTTP_METHODS__CONNECT:
				return connect != CONNECT_EDEFAULT;
			case EsbPackage.CACHE_HTTP_METHODS__OPTIONS:
				return options != OPTIONS_EDEFAULT;
			case EsbPackage.CACHE_HTTP_METHODS__TRACE:
				return trace != TRACE_EDEFAULT;
			case EsbPackage.CACHE_HTTP_METHODS__PATCH:
				return patch != PATCH_EDEFAULT;
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
		result.append(" (GET: ");
		result.append(get);
		result.append(", POST: ");
		result.append(post);
		result.append(", PUT: ");
		result.append(put);
		result.append(", DELETE: ");
		result.append(delete);
		result.append(", HEAD: ");
		result.append(head);
		result.append(", CONNECT: ");
		result.append(connect);
		result.append(", OPTIONS: ");
		result.append(options);
		result.append(", TRACE: ");
		result.append(trace);
		result.append(", PATCH: ");
		result.append(patch);
		result.append(')');
		return result.toString();
	}

} //CacheHttpMethodsImpl
