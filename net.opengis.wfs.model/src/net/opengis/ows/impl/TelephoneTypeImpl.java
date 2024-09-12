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
package net.opengis.ows.impl;

import java.util.Collection;

import net.opengis.ows.OWSPackage;
import net.opengis.ows.TelephoneType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Telephone Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.ows.impl.TelephoneTypeImpl#getVoice <em>Voice</em>}</li>
 *   <li>{@link net.opengis.ows.impl.TelephoneTypeImpl#getFacsimile <em>Facsimile</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TelephoneTypeImpl extends MinimalEObjectImpl.Container implements TelephoneType {
	/**
	 * The cached value of the '{@link #getVoice() <em>Voice</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoice()
	 * @generated
	 * @ordered
	 */
	protected EList<String> voice;

	/**
	 * The cached value of the '{@link #getFacsimile() <em>Facsimile</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacsimile()
	 * @generated
	 * @ordered
	 */
	protected EList<String> facsimile;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TelephoneTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OWSPackage.Literals.TELEPHONE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getVoice() {
		if (voice == null) {
			voice = new EDataTypeEList<String>(String.class, this, OWSPackage.TELEPHONE_TYPE__VOICE);
		}
		return voice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getFacsimile() {
		if (facsimile == null) {
			facsimile = new EDataTypeEList<String>(String.class, this, OWSPackage.TELEPHONE_TYPE__FACSIMILE);
		}
		return facsimile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OWSPackage.TELEPHONE_TYPE__VOICE:
				return getVoice();
			case OWSPackage.TELEPHONE_TYPE__FACSIMILE:
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
			case OWSPackage.TELEPHONE_TYPE__VOICE:
				getVoice().clear();
				getVoice().addAll((Collection<? extends String>)newValue);
				return;
			case OWSPackage.TELEPHONE_TYPE__FACSIMILE:
				getFacsimile().clear();
				getFacsimile().addAll((Collection<? extends String>)newValue);
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
			case OWSPackage.TELEPHONE_TYPE__VOICE:
				getVoice().clear();
				return;
			case OWSPackage.TELEPHONE_TYPE__FACSIMILE:
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
			case OWSPackage.TELEPHONE_TYPE__VOICE:
				return voice != null && !voice.isEmpty();
			case OWSPackage.TELEPHONE_TYPE__FACSIMILE:
				return facsimile != null && !facsimile.isEmpty();
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
		result.append(" (voice: ");
		result.append(voice);
		result.append(", facsimile: ");
		result.append(facsimile);
		result.append(')');
		return result.toString();
	}

} //TelephoneTypeImpl
