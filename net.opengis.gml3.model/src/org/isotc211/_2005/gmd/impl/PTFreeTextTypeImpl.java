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
package org.isotc211._2005.gmd.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.isotc211._2005.gco.impl.AbstractObjectTypeImpl;

import org.isotc211._2005.gmd.GMDPackage;
import org.isotc211._2005.gmd.LocalisedCharacterStringPropertyType;
import org.isotc211._2005.gmd.PTFreeTextType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PT Free Text Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.impl.PTFreeTextTypeImpl#getTextGroup <em>Text Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PTFreeTextTypeImpl extends AbstractObjectTypeImpl implements PTFreeTextType {
	/**
	 * The cached value of the '{@link #getTextGroup() <em>Text Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<LocalisedCharacterStringPropertyType> textGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PTFreeTextTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMDPackage.eINSTANCE.getPTFreeTextType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LocalisedCharacterStringPropertyType> getTextGroup() {
		if (textGroup == null) {
			textGroup = new EObjectContainmentEList<LocalisedCharacterStringPropertyType>(LocalisedCharacterStringPropertyType.class, this, GMDPackage.PT_FREE_TEXT_TYPE__TEXT_GROUP);
		}
		return textGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMDPackage.PT_FREE_TEXT_TYPE__TEXT_GROUP:
				return ((InternalEList<?>)getTextGroup()).basicRemove(otherEnd, msgs);
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
			case GMDPackage.PT_FREE_TEXT_TYPE__TEXT_GROUP:
				return getTextGroup();
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
			case GMDPackage.PT_FREE_TEXT_TYPE__TEXT_GROUP:
				getTextGroup().clear();
				getTextGroup().addAll((Collection<? extends LocalisedCharacterStringPropertyType>)newValue);
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
			case GMDPackage.PT_FREE_TEXT_TYPE__TEXT_GROUP:
				getTextGroup().clear();
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
			case GMDPackage.PT_FREE_TEXT_TYPE__TEXT_GROUP:
				return textGroup != null && !textGroup.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PTFreeTextTypeImpl
