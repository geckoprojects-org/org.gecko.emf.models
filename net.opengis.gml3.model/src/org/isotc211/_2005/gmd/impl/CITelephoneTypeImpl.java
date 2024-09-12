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

import org.isotc211._2005.gco.CharacterStringPropertyType;

import org.isotc211._2005.gco.impl.AbstractObjectTypeImpl;

import org.isotc211._2005.gmd.CITelephoneType;
import org.isotc211._2005.gmd.GMDPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CI Telephone Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.impl.CITelephoneTypeImpl#getVoice <em>Voice</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.CITelephoneTypeImpl#getFacsimile <em>Facsimile</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CITelephoneTypeImpl extends AbstractObjectTypeImpl implements CITelephoneType {
	/**
	 * The cached value of the '{@link #getVoice() <em>Voice</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoice()
	 * @generated
	 * @ordered
	 */
	protected EList<CharacterStringPropertyType> voice;

	/**
	 * The cached value of the '{@link #getFacsimile() <em>Facsimile</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacsimile()
	 * @generated
	 * @ordered
	 */
	protected EList<CharacterStringPropertyType> facsimile;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CITelephoneTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMDPackage.eINSTANCE.getCITelephoneType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CharacterStringPropertyType> getVoice() {
		if (voice == null) {
			voice = new EObjectContainmentEList<CharacterStringPropertyType>(CharacterStringPropertyType.class, this, GMDPackage.CI_TELEPHONE_TYPE__VOICE);
		}
		return voice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CharacterStringPropertyType> getFacsimile() {
		if (facsimile == null) {
			facsimile = new EObjectContainmentEList<CharacterStringPropertyType>(CharacterStringPropertyType.class, this, GMDPackage.CI_TELEPHONE_TYPE__FACSIMILE);
		}
		return facsimile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMDPackage.CI_TELEPHONE_TYPE__VOICE:
				return ((InternalEList<?>)getVoice()).basicRemove(otherEnd, msgs);
			case GMDPackage.CI_TELEPHONE_TYPE__FACSIMILE:
				return ((InternalEList<?>)getFacsimile()).basicRemove(otherEnd, msgs);
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
			case GMDPackage.CI_TELEPHONE_TYPE__VOICE:
				return getVoice();
			case GMDPackage.CI_TELEPHONE_TYPE__FACSIMILE:
				return getFacsimile();
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
			case GMDPackage.CI_TELEPHONE_TYPE__VOICE:
				getVoice().clear();
				getVoice().addAll((Collection<? extends CharacterStringPropertyType>)newValue);
				return;
			case GMDPackage.CI_TELEPHONE_TYPE__FACSIMILE:
				getFacsimile().clear();
				getFacsimile().addAll((Collection<? extends CharacterStringPropertyType>)newValue);
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
			case GMDPackage.CI_TELEPHONE_TYPE__VOICE:
				getVoice().clear();
				return;
			case GMDPackage.CI_TELEPHONE_TYPE__FACSIMILE:
				getFacsimile().clear();
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
			case GMDPackage.CI_TELEPHONE_TYPE__VOICE:
				return voice != null && !voice.isEmpty();
			case GMDPackage.CI_TELEPHONE_TYPE__FACSIMILE:
				return facsimile != null && !facsimile.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CITelephoneTypeImpl
