/*
 * Copyright (c) 2012 - 2026 Data In Motion and others.
 * All rights reserved.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package org.w3._2001.xinclude.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.w3._2001.xinclude.FallbackType;
import org.w3._2001.xinclude.IncludePackage;
import org.w3._2001.xinclude.IncludeType;
import org.w3._2001.xinclude.ParseType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3._2001.xinclude.impl.IncludeTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.w3._2001.xinclude.impl.IncludeTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.w3._2001.xinclude.impl.IncludeTypeImpl#getFallback <em>Fallback</em>}</li>
 *   <li>{@link org.w3._2001.xinclude.impl.IncludeTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.w3._2001.xinclude.impl.IncludeTypeImpl#getAny1 <em>Any1</em>}</li>
 *   <li>{@link org.w3._2001.xinclude.impl.IncludeTypeImpl#getAccept <em>Accept</em>}</li>
 *   <li>{@link org.w3._2001.xinclude.impl.IncludeTypeImpl#getAcceptLanguage <em>Accept Language</em>}</li>
 *   <li>{@link org.w3._2001.xinclude.impl.IncludeTypeImpl#getEncoding <em>Encoding</em>}</li>
 *   <li>{@link org.w3._2001.xinclude.impl.IncludeTypeImpl#getHref <em>Href</em>}</li>
 *   <li>{@link org.w3._2001.xinclude.impl.IncludeTypeImpl#getParse <em>Parse</em>}</li>
 *   <li>{@link org.w3._2001.xinclude.impl.IncludeTypeImpl#getXpointer <em>Xpointer</em>}</li>
 *   <li>{@link org.w3._2001.xinclude.impl.IncludeTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IncludeTypeImpl extends MinimalEObjectImpl.Container implements IncludeType {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The default value of the '{@link #getAccept() <em>Accept</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccept()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCEPT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccept() <em>Accept</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccept()
	 * @generated
	 * @ordered
	 */
	protected String accept = ACCEPT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAcceptLanguage() <em>Accept Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcceptLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCEPT_LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAcceptLanguage() <em>Accept Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcceptLanguage()
	 * @generated
	 * @ordered
	 */
	protected String acceptLanguage = ACCEPT_LANGUAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEncoding() <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncoding()
	 * @generated
	 * @ordered
	 */
	protected static final String ENCODING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEncoding() <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncoding()
	 * @generated
	 * @ordered
	 */
	protected String encoding = ENCODING_EDEFAULT;

	/**
	 * The default value of the '{@link #getHref() <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHref()
	 * @generated
	 * @ordered
	 */
	protected static final String HREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHref() <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHref()
	 * @generated
	 * @ordered
	 */
	protected String href = HREF_EDEFAULT;

	/**
	 * The default value of the '{@link #getParse() <em>Parse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParse()
	 * @generated
	 * @ordered
	 */
	protected static final ParseType PARSE_EDEFAULT = ParseType.XML;

	/**
	 * The cached value of the '{@link #getParse() <em>Parse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParse()
	 * @generated
	 * @ordered
	 */
	protected ParseType parse = PARSE_EDEFAULT;

	/**
	 * This is true if the Parse attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean parseESet;

	/**
	 * The default value of the '{@link #getXpointer() <em>Xpointer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXpointer()
	 * @generated
	 * @ordered
	 */
	protected static final String XPOINTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXpointer() <em>Xpointer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXpointer()
	 * @generated
	 * @ordered
	 */
	protected String xpointer = XPOINTER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnyAttribute() <em>Any Attribute</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnyAttribute()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap anyAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IncludeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IncludePackage.Literals.INCLUDE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, IncludePackage.INCLUDE_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(IncludePackage.Literals.INCLUDE_TYPE__GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FallbackType> getFallback() {
		return getGroup().list(IncludePackage.Literals.INCLUDE_TYPE__FALLBACK);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAny() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(IncludePackage.Literals.INCLUDE_TYPE__ANY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAny1() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(IncludePackage.Literals.INCLUDE_TYPE__ANY1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAccept() {
		return accept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccept(String newAccept) {
		String oldAccept = accept;
		accept = newAccept;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IncludePackage.INCLUDE_TYPE__ACCEPT, oldAccept, accept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAcceptLanguage() {
		return acceptLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAcceptLanguage(String newAcceptLanguage) {
		String oldAcceptLanguage = acceptLanguage;
		acceptLanguage = newAcceptLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IncludePackage.INCLUDE_TYPE__ACCEPT_LANGUAGE, oldAcceptLanguage, acceptLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEncoding() {
		return encoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEncoding(String newEncoding) {
		String oldEncoding = encoding;
		encoding = newEncoding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IncludePackage.INCLUDE_TYPE__ENCODING, oldEncoding, encoding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHref() {
		return href;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHref(String newHref) {
		String oldHref = href;
		href = newHref;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IncludePackage.INCLUDE_TYPE__HREF, oldHref, href));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParseType getParse() {
		return parse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParse(ParseType newParse) {
		ParseType oldParse = parse;
		parse = newParse == null ? PARSE_EDEFAULT : newParse;
		boolean oldParseESet = parseESet;
		parseESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IncludePackage.INCLUDE_TYPE__PARSE, oldParse, parse, !oldParseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetParse() {
		ParseType oldParse = parse;
		boolean oldParseESet = parseESet;
		parse = PARSE_EDEFAULT;
		parseESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, IncludePackage.INCLUDE_TYPE__PARSE, oldParse, PARSE_EDEFAULT, oldParseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetParse() {
		return parseESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getXpointer() {
		return xpointer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setXpointer(String newXpointer) {
		String oldXpointer = xpointer;
		xpointer = newXpointer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IncludePackage.INCLUDE_TYPE__XPOINTER, oldXpointer, xpointer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, IncludePackage.INCLUDE_TYPE__ANY_ATTRIBUTE);
		}
		return anyAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IncludePackage.INCLUDE_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case IncludePackage.INCLUDE_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case IncludePackage.INCLUDE_TYPE__FALLBACK:
				return ((InternalEList<?>)getFallback()).basicRemove(otherEnd, msgs);
			case IncludePackage.INCLUDE_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case IncludePackage.INCLUDE_TYPE__ANY1:
				return ((InternalEList<?>)getAny1()).basicRemove(otherEnd, msgs);
			case IncludePackage.INCLUDE_TYPE__ANY_ATTRIBUTE:
				return ((InternalEList<?>)getAnyAttribute()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IncludePackage.INCLUDE_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case IncludePackage.INCLUDE_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case IncludePackage.INCLUDE_TYPE__FALLBACK:
				return getFallback();
			case IncludePackage.INCLUDE_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case IncludePackage.INCLUDE_TYPE__ANY1:
				if (coreType) return getAny1();
				return ((FeatureMap.Internal)getAny1()).getWrapper();
			case IncludePackage.INCLUDE_TYPE__ACCEPT:
				return getAccept();
			case IncludePackage.INCLUDE_TYPE__ACCEPT_LANGUAGE:
				return getAcceptLanguage();
			case IncludePackage.INCLUDE_TYPE__ENCODING:
				return getEncoding();
			case IncludePackage.INCLUDE_TYPE__HREF:
				return getHref();
			case IncludePackage.INCLUDE_TYPE__PARSE:
				return getParse();
			case IncludePackage.INCLUDE_TYPE__XPOINTER:
				return getXpointer();
			case IncludePackage.INCLUDE_TYPE__ANY_ATTRIBUTE:
				if (coreType) return getAnyAttribute();
				return ((FeatureMap.Internal)getAnyAttribute()).getWrapper();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IncludePackage.INCLUDE_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case IncludePackage.INCLUDE_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case IncludePackage.INCLUDE_TYPE__FALLBACK:
				getFallback().clear();
				getFallback().addAll((Collection<? extends FallbackType>)newValue);
				return;
			case IncludePackage.INCLUDE_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case IncludePackage.INCLUDE_TYPE__ANY1:
				((FeatureMap.Internal)getAny1()).set(newValue);
				return;
			case IncludePackage.INCLUDE_TYPE__ACCEPT:
				setAccept((String)newValue);
				return;
			case IncludePackage.INCLUDE_TYPE__ACCEPT_LANGUAGE:
				setAcceptLanguage((String)newValue);
				return;
			case IncludePackage.INCLUDE_TYPE__ENCODING:
				setEncoding((String)newValue);
				return;
			case IncludePackage.INCLUDE_TYPE__HREF:
				setHref((String)newValue);
				return;
			case IncludePackage.INCLUDE_TYPE__PARSE:
				setParse((ParseType)newValue);
				return;
			case IncludePackage.INCLUDE_TYPE__XPOINTER:
				setXpointer((String)newValue);
				return;
			case IncludePackage.INCLUDE_TYPE__ANY_ATTRIBUTE:
				((FeatureMap.Internal)getAnyAttribute()).set(newValue);
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
			case IncludePackage.INCLUDE_TYPE__MIXED:
				getMixed().clear();
				return;
			case IncludePackage.INCLUDE_TYPE__GROUP:
				getGroup().clear();
				return;
			case IncludePackage.INCLUDE_TYPE__FALLBACK:
				getFallback().clear();
				return;
			case IncludePackage.INCLUDE_TYPE__ANY:
				getAny().clear();
				return;
			case IncludePackage.INCLUDE_TYPE__ANY1:
				getAny1().clear();
				return;
			case IncludePackage.INCLUDE_TYPE__ACCEPT:
				setAccept(ACCEPT_EDEFAULT);
				return;
			case IncludePackage.INCLUDE_TYPE__ACCEPT_LANGUAGE:
				setAcceptLanguage(ACCEPT_LANGUAGE_EDEFAULT);
				return;
			case IncludePackage.INCLUDE_TYPE__ENCODING:
				setEncoding(ENCODING_EDEFAULT);
				return;
			case IncludePackage.INCLUDE_TYPE__HREF:
				setHref(HREF_EDEFAULT);
				return;
			case IncludePackage.INCLUDE_TYPE__PARSE:
				unsetParse();
				return;
			case IncludePackage.INCLUDE_TYPE__XPOINTER:
				setXpointer(XPOINTER_EDEFAULT);
				return;
			case IncludePackage.INCLUDE_TYPE__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
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
			case IncludePackage.INCLUDE_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case IncludePackage.INCLUDE_TYPE__GROUP:
				return !getGroup().isEmpty();
			case IncludePackage.INCLUDE_TYPE__FALLBACK:
				return !getFallback().isEmpty();
			case IncludePackage.INCLUDE_TYPE__ANY:
				return !getAny().isEmpty();
			case IncludePackage.INCLUDE_TYPE__ANY1:
				return !getAny1().isEmpty();
			case IncludePackage.INCLUDE_TYPE__ACCEPT:
				return ACCEPT_EDEFAULT == null ? accept != null : !ACCEPT_EDEFAULT.equals(accept);
			case IncludePackage.INCLUDE_TYPE__ACCEPT_LANGUAGE:
				return ACCEPT_LANGUAGE_EDEFAULT == null ? acceptLanguage != null : !ACCEPT_LANGUAGE_EDEFAULT.equals(acceptLanguage);
			case IncludePackage.INCLUDE_TYPE__ENCODING:
				return ENCODING_EDEFAULT == null ? encoding != null : !ENCODING_EDEFAULT.equals(encoding);
			case IncludePackage.INCLUDE_TYPE__HREF:
				return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT.equals(href);
			case IncludePackage.INCLUDE_TYPE__PARSE:
				return isSetParse();
			case IncludePackage.INCLUDE_TYPE__XPOINTER:
				return XPOINTER_EDEFAULT == null ? xpointer != null : !XPOINTER_EDEFAULT.equals(xpointer);
			case IncludePackage.INCLUDE_TYPE__ANY_ATTRIBUTE:
				return anyAttribute != null && !anyAttribute.isEmpty();
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(", accept: ");
		result.append(accept);
		result.append(", acceptLanguage: ");
		result.append(acceptLanguage);
		result.append(", encoding: ");
		result.append(encoding);
		result.append(", href: ");
		result.append(href);
		result.append(", parse: ");
		if (parseESet) result.append(parse); else result.append("<unset>");
		result.append(", xpointer: ");
		result.append(xpointer);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //IncludeTypeImpl
