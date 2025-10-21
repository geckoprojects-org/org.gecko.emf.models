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
package de.xoev.xfamilie.baukasten._1.baukasten.impl;

import de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage;
import de.xoev.xfamilie.baukasten._1.baukasten.TerminwunschType;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Terminwunsch Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.TerminwunschTypeImpl#getWochentag <em>Wochentag</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.TerminwunschTypeImpl#getUhrzeit <em>Uhrzeit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TerminwunschTypeImpl extends MinimalEObjectImpl.Container implements TerminwunschType {
	/**
	 * The cached value of the '{@link #getWochentag() <em>Wochentag</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWochentag()
	 * @generated
	 * @ordered
	 */
	protected EList<String> wochentag;

	/**
	 * The cached value of the '{@link #getUhrzeit() <em>Uhrzeit</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUhrzeit()
	 * @generated
	 * @ordered
	 */
	protected EList<String> uhrzeit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TerminwunschTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BaukastenPackage.Literals.TERMINWUNSCH_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getWochentag() {
		if (wochentag == null) {
			wochentag = new EDataTypeEList<String>(String.class, this, BaukastenPackage.TERMINWUNSCH_TYPE__WOCHENTAG);
		}
		return wochentag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getUhrzeit() {
		if (uhrzeit == null) {
			uhrzeit = new EDataTypeEList<String>(String.class, this, BaukastenPackage.TERMINWUNSCH_TYPE__UHRZEIT);
		}
		return uhrzeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BaukastenPackage.TERMINWUNSCH_TYPE__WOCHENTAG:
				return getWochentag();
			case BaukastenPackage.TERMINWUNSCH_TYPE__UHRZEIT:
				return getUhrzeit();
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
			case BaukastenPackage.TERMINWUNSCH_TYPE__WOCHENTAG:
				getWochentag().clear();
				getWochentag().addAll((Collection<? extends String>)newValue);
				return;
			case BaukastenPackage.TERMINWUNSCH_TYPE__UHRZEIT:
				getUhrzeit().clear();
				getUhrzeit().addAll((Collection<? extends String>)newValue);
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
			case BaukastenPackage.TERMINWUNSCH_TYPE__WOCHENTAG:
				getWochentag().clear();
				return;
			case BaukastenPackage.TERMINWUNSCH_TYPE__UHRZEIT:
				getUhrzeit().clear();
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
			case BaukastenPackage.TERMINWUNSCH_TYPE__WOCHENTAG:
				return wochentag != null && !wochentag.isEmpty();
			case BaukastenPackage.TERMINWUNSCH_TYPE__UHRZEIT:
				return uhrzeit != null && !uhrzeit.isEmpty();
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
		result.append(" (wochentag: ");
		result.append(wochentag);
		result.append(", uhrzeit: ");
		result.append(uhrzeit);
		result.append(')');
		return result.toString();
	}

} //TerminwunschTypeImpl
