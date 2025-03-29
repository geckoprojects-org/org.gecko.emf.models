/*
 * Copyright (c) 2012 - 2025 Data In Motion and others.
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
package org.omg.spec.cmmn.casemodel.impl;

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

import org.omg.spec.cmmn.casemodel.CaseModelPackage;
import org.omg.spec.cmmn.casemodel.TCmmnElementWithMixedContent;
import org.omg.spec.cmmn.casemodel.TDocumentation;
import org.omg.spec.cmmn.casemodel.TExtensionElements;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TCmmn Element With Mixed Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.TCmmnElementWithMixedContentImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.TCmmnElementWithMixedContentImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.TCmmnElementWithMixedContentImpl#getExtensionElements <em>Extension Elements</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.TCmmnElementWithMixedContentImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.TCmmnElementWithMixedContentImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TCmmnElementWithMixedContentImpl extends MinimalEObjectImpl.Container implements TCmmnElementWithMixedContent {
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
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

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
	protected TCmmnElementWithMixedContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CaseModelPackage.Literals.TCMMN_ELEMENT_WITH_MIXED_CONTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, CaseModelPackage.TCMMN_ELEMENT_WITH_MIXED_CONTENT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TDocumentation> getDocumentation() {
		return getMixed().list(CaseModelPackage.Literals.TCMMN_ELEMENT_WITH_MIXED_CONTENT__DOCUMENTATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TExtensionElements getExtensionElements() {
		return (TExtensionElements)getMixed().get(CaseModelPackage.Literals.TCMMN_ELEMENT_WITH_MIXED_CONTENT__EXTENSION_ELEMENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtensionElements(TExtensionElements newExtensionElements, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CaseModelPackage.Literals.TCMMN_ELEMENT_WITH_MIXED_CONTENT__EXTENSION_ELEMENTS, newExtensionElements, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExtensionElements(TExtensionElements newExtensionElements) {
		((FeatureMap.Internal)getMixed()).set(CaseModelPackage.Literals.TCMMN_ELEMENT_WITH_MIXED_CONTENT__EXTENSION_ELEMENTS, newExtensionElements);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CaseModelPackage.TCMMN_ELEMENT_WITH_MIXED_CONTENT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, CaseModelPackage.TCMMN_ELEMENT_WITH_MIXED_CONTENT__ANY_ATTRIBUTE);
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
			case CaseModelPackage.TCMMN_ELEMENT_WITH_MIXED_CONTENT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case CaseModelPackage.TCMMN_ELEMENT_WITH_MIXED_CONTENT__DOCUMENTATION:
				return ((InternalEList<?>)getDocumentation()).basicRemove(otherEnd, msgs);
			case CaseModelPackage.TCMMN_ELEMENT_WITH_MIXED_CONTENT__EXTENSION_ELEMENTS:
				return basicSetExtensionElements(null, msgs);
			case CaseModelPackage.TCMMN_ELEMENT_WITH_MIXED_CONTENT__ANY_ATTRIBUTE:
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
			case CaseModelPackage.TCMMN_ELEMENT_WITH_MIXED_CONTENT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case CaseModelPackage.TCMMN_ELEMENT_WITH_MIXED_CONTENT__DOCUMENTATION:
				return getDocumentation();
			case CaseModelPackage.TCMMN_ELEMENT_WITH_MIXED_CONTENT__EXTENSION_ELEMENTS:
				return getExtensionElements();
			case CaseModelPackage.TCMMN_ELEMENT_WITH_MIXED_CONTENT__ID:
				return getId();
			case CaseModelPackage.TCMMN_ELEMENT_WITH_MIXED_CONTENT__ANY_ATTRIBUTE:
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
			case CaseModelPackage.TCMMN_ELEMENT_WITH_MIXED_CONTENT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case CaseModelPackage.TCMMN_ELEMENT_WITH_MIXED_CONTENT__DOCUMENTATION:
				getDocumentation().clear();
				getDocumentation().addAll((Collection<? extends TDocumentation>)newValue);
				return;
			case CaseModelPackage.TCMMN_ELEMENT_WITH_MIXED_CONTENT__EXTENSION_ELEMENTS:
				setExtensionElements((TExtensionElements)newValue);
				return;
			case CaseModelPackage.TCMMN_ELEMENT_WITH_MIXED_CONTENT__ID:
				setId((String)newValue);
				return;
			case CaseModelPackage.TCMMN_ELEMENT_WITH_MIXED_CONTENT__ANY_ATTRIBUTE:
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
			case CaseModelPackage.TCMMN_ELEMENT_WITH_MIXED_CONTENT__MIXED:
				getMixed().clear();
				return;
			case CaseModelPackage.TCMMN_ELEMENT_WITH_MIXED_CONTENT__DOCUMENTATION:
				getDocumentation().clear();
				return;
			case CaseModelPackage.TCMMN_ELEMENT_WITH_MIXED_CONTENT__EXTENSION_ELEMENTS:
				setExtensionElements((TExtensionElements)null);
				return;
			case CaseModelPackage.TCMMN_ELEMENT_WITH_MIXED_CONTENT__ID:
				setId(ID_EDEFAULT);
				return;
			case CaseModelPackage.TCMMN_ELEMENT_WITH_MIXED_CONTENT__ANY_ATTRIBUTE:
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
			case CaseModelPackage.TCMMN_ELEMENT_WITH_MIXED_CONTENT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case CaseModelPackage.TCMMN_ELEMENT_WITH_MIXED_CONTENT__DOCUMENTATION:
				return !getDocumentation().isEmpty();
			case CaseModelPackage.TCMMN_ELEMENT_WITH_MIXED_CONTENT__EXTENSION_ELEMENTS:
				return getExtensionElements() != null;
			case CaseModelPackage.TCMMN_ELEMENT_WITH_MIXED_CONTENT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CaseModelPackage.TCMMN_ELEMENT_WITH_MIXED_CONTENT__ANY_ATTRIBUTE:
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
		result.append(", id: ");
		result.append(id);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //TCmmnElementWithMixedContentImpl
