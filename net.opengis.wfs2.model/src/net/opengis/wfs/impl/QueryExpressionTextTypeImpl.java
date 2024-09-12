/*
 * Copyright (c) 2012 - 2024 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *      Mark Hoffmann - initial API and implementation
 */
package net.opengis.wfs.impl;

import java.util.List;

import javax.xml.namespace.QName;

import net.opengis.wfs.QueryExpressionTextType;
import net.opengis.wfs.WFSPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Query Expression Text Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.wfs.impl.QueryExpressionTextTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.QueryExpressionTextTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.QueryExpressionTextTypeImpl#getAny1 <em>Any1</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.QueryExpressionTextTypeImpl#isIsPrivate <em>Is Private</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.QueryExpressionTextTypeImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.QueryExpressionTextTypeImpl#getReturnFeatureTypes <em>Return Feature Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QueryExpressionTextTypeImpl extends MinimalEObjectImpl.Container implements QueryExpressionTextType {
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
	 * The default value of the '{@link #isIsPrivate() <em>Is Private</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPrivate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PRIVATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsPrivate() <em>Is Private</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPrivate()
	 * @generated
	 * @ordered
	 */
	protected boolean isPrivate = IS_PRIVATE_EDEFAULT;

	/**
	 * This is true if the Is Private attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isPrivateESet;

	/**
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected String language = LANGUAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getReturnFeatureTypes() <em>Return Feature Types</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnFeatureTypes()
	 * @generated
	 * @ordered
	 */
	protected static final List<QName> RETURN_FEATURE_TYPES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReturnFeatureTypes() <em>Return Feature Types</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnFeatureTypes()
	 * @generated
	 * @ordered
	 */
	protected List<QName> returnFeatureTypes = RETURN_FEATURE_TYPES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueryExpressionTextTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WFSPackage.Literals.QUERY_EXPRESSION_TEXT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, WFSPackage.QUERY_EXPRESSION_TEXT_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAny() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(WFSPackage.Literals.QUERY_EXPRESSION_TEXT_TYPE__ANY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAny1() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(WFSPackage.Literals.QUERY_EXPRESSION_TEXT_TYPE__ANY1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsPrivate() {
		return isPrivate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsPrivate(boolean newIsPrivate) {
		boolean oldIsPrivate = isPrivate;
		isPrivate = newIsPrivate;
		boolean oldIsPrivateESet = isPrivateESet;
		isPrivateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WFSPackage.QUERY_EXPRESSION_TEXT_TYPE__IS_PRIVATE, oldIsPrivate, isPrivate, !oldIsPrivateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIsPrivate() {
		boolean oldIsPrivate = isPrivate;
		boolean oldIsPrivateESet = isPrivateESet;
		isPrivate = IS_PRIVATE_EDEFAULT;
		isPrivateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, WFSPackage.QUERY_EXPRESSION_TEXT_TYPE__IS_PRIVATE, oldIsPrivate, IS_PRIVATE_EDEFAULT, oldIsPrivateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIsPrivate() {
		return isPrivateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLanguage(String newLanguage) {
		String oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WFSPackage.QUERY_EXPRESSION_TEXT_TYPE__LANGUAGE, oldLanguage, language));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<QName> getReturnFeatureTypes() {
		return returnFeatureTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnFeatureTypes(List<QName> newReturnFeatureTypes) {
		List<QName> oldReturnFeatureTypes = returnFeatureTypes;
		returnFeatureTypes = newReturnFeatureTypes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WFSPackage.QUERY_EXPRESSION_TEXT_TYPE__RETURN_FEATURE_TYPES, oldReturnFeatureTypes, returnFeatureTypes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WFSPackage.QUERY_EXPRESSION_TEXT_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case WFSPackage.QUERY_EXPRESSION_TEXT_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case WFSPackage.QUERY_EXPRESSION_TEXT_TYPE__ANY1:
				return ((InternalEList<?>)getAny1()).basicRemove(otherEnd, msgs);
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
			case WFSPackage.QUERY_EXPRESSION_TEXT_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case WFSPackage.QUERY_EXPRESSION_TEXT_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case WFSPackage.QUERY_EXPRESSION_TEXT_TYPE__ANY1:
				if (coreType) return getAny1();
				return ((FeatureMap.Internal)getAny1()).getWrapper();
			case WFSPackage.QUERY_EXPRESSION_TEXT_TYPE__IS_PRIVATE:
				return isIsPrivate();
			case WFSPackage.QUERY_EXPRESSION_TEXT_TYPE__LANGUAGE:
				return getLanguage();
			case WFSPackage.QUERY_EXPRESSION_TEXT_TYPE__RETURN_FEATURE_TYPES:
				return getReturnFeatureTypes();
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
			case WFSPackage.QUERY_EXPRESSION_TEXT_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case WFSPackage.QUERY_EXPRESSION_TEXT_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case WFSPackage.QUERY_EXPRESSION_TEXT_TYPE__ANY1:
				((FeatureMap.Internal)getAny1()).set(newValue);
				return;
			case WFSPackage.QUERY_EXPRESSION_TEXT_TYPE__IS_PRIVATE:
				setIsPrivate((Boolean)newValue);
				return;
			case WFSPackage.QUERY_EXPRESSION_TEXT_TYPE__LANGUAGE:
				setLanguage((String)newValue);
				return;
			case WFSPackage.QUERY_EXPRESSION_TEXT_TYPE__RETURN_FEATURE_TYPES:
				setReturnFeatureTypes((List<QName>)newValue);
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
			case WFSPackage.QUERY_EXPRESSION_TEXT_TYPE__MIXED:
				getMixed().clear();
				return;
			case WFSPackage.QUERY_EXPRESSION_TEXT_TYPE__ANY:
				getAny().clear();
				return;
			case WFSPackage.QUERY_EXPRESSION_TEXT_TYPE__ANY1:
				getAny1().clear();
				return;
			case WFSPackage.QUERY_EXPRESSION_TEXT_TYPE__IS_PRIVATE:
				unsetIsPrivate();
				return;
			case WFSPackage.QUERY_EXPRESSION_TEXT_TYPE__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case WFSPackage.QUERY_EXPRESSION_TEXT_TYPE__RETURN_FEATURE_TYPES:
				setReturnFeatureTypes(RETURN_FEATURE_TYPES_EDEFAULT);
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
			case WFSPackage.QUERY_EXPRESSION_TEXT_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case WFSPackage.QUERY_EXPRESSION_TEXT_TYPE__ANY:
				return !getAny().isEmpty();
			case WFSPackage.QUERY_EXPRESSION_TEXT_TYPE__ANY1:
				return !getAny1().isEmpty();
			case WFSPackage.QUERY_EXPRESSION_TEXT_TYPE__IS_PRIVATE:
				return isSetIsPrivate();
			case WFSPackage.QUERY_EXPRESSION_TEXT_TYPE__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
			case WFSPackage.QUERY_EXPRESSION_TEXT_TYPE__RETURN_FEATURE_TYPES:
				return RETURN_FEATURE_TYPES_EDEFAULT == null ? returnFeatureTypes != null : !RETURN_FEATURE_TYPES_EDEFAULT.equals(returnFeatureTypes);
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
		result.append(", isPrivate: ");
		if (isPrivateESet) result.append(isPrivate); else result.append("<unset>");
		result.append(", language: ");
		result.append(language);
		result.append(", returnFeatureTypes: ");
		result.append(returnFeatureTypes);
		result.append(')');
		return result.toString();
	}

} //QueryExpressionTextTypeImpl
