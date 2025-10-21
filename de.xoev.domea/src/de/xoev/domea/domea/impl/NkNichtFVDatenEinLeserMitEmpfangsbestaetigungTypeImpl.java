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
package de.xoev.domea.domea.impl;

import de.xoev.domea.domea.DomeaPackage;
import de.xoev.domea.domea.NkNichtFVDatenEinLeserMitEmpfangsbestaetigungType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nk Nicht FV Daten Ein Leser Mit Empfangsbestaetigung Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.impl.NkNichtFVDatenEinLeserMitEmpfangsbestaetigungTypeImpl#isEmpfangsbestaetigung <em>Empfangsbestaetigung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NkNichtFVDatenEinLeserMitEmpfangsbestaetigungTypeImpl extends NachrichtTypeImpl implements NkNichtFVDatenEinLeserMitEmpfangsbestaetigungType {
	/**
	 * The default value of the '{@link #isEmpfangsbestaetigung() <em>Empfangsbestaetigung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEmpfangsbestaetigung()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EMPFANGSBESTAETIGUNG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEmpfangsbestaetigung() <em>Empfangsbestaetigung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEmpfangsbestaetigung()
	 * @generated
	 * @ordered
	 */
	protected boolean empfangsbestaetigung = EMPFANGSBESTAETIGUNG_EDEFAULT;

	/**
	 * This is true if the Empfangsbestaetigung attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean empfangsbestaetigungESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NkNichtFVDatenEinLeserMitEmpfangsbestaetigungTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomeaPackage.Literals.NK_NICHT_FV_DATEN_EIN_LESER_MIT_EMPFANGSBESTAETIGUNG_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEmpfangsbestaetigung() {
		return empfangsbestaetigung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmpfangsbestaetigung(boolean newEmpfangsbestaetigung) {
		boolean oldEmpfangsbestaetigung = empfangsbestaetigung;
		empfangsbestaetigung = newEmpfangsbestaetigung;
		boolean oldEmpfangsbestaetigungESet = empfangsbestaetigungESet;
		empfangsbestaetigungESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.NK_NICHT_FV_DATEN_EIN_LESER_MIT_EMPFANGSBESTAETIGUNG_TYPE__EMPFANGSBESTAETIGUNG, oldEmpfangsbestaetigung, empfangsbestaetigung, !oldEmpfangsbestaetigungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetEmpfangsbestaetigung() {
		boolean oldEmpfangsbestaetigung = empfangsbestaetigung;
		boolean oldEmpfangsbestaetigungESet = empfangsbestaetigungESet;
		empfangsbestaetigung = EMPFANGSBESTAETIGUNG_EDEFAULT;
		empfangsbestaetigungESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DomeaPackage.NK_NICHT_FV_DATEN_EIN_LESER_MIT_EMPFANGSBESTAETIGUNG_TYPE__EMPFANGSBESTAETIGUNG, oldEmpfangsbestaetigung, EMPFANGSBESTAETIGUNG_EDEFAULT, oldEmpfangsbestaetigungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetEmpfangsbestaetigung() {
		return empfangsbestaetigungESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DomeaPackage.NK_NICHT_FV_DATEN_EIN_LESER_MIT_EMPFANGSBESTAETIGUNG_TYPE__EMPFANGSBESTAETIGUNG:
				return isEmpfangsbestaetigung();
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
			case DomeaPackage.NK_NICHT_FV_DATEN_EIN_LESER_MIT_EMPFANGSBESTAETIGUNG_TYPE__EMPFANGSBESTAETIGUNG:
				setEmpfangsbestaetigung((Boolean)newValue);
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
			case DomeaPackage.NK_NICHT_FV_DATEN_EIN_LESER_MIT_EMPFANGSBESTAETIGUNG_TYPE__EMPFANGSBESTAETIGUNG:
				unsetEmpfangsbestaetigung();
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
			case DomeaPackage.NK_NICHT_FV_DATEN_EIN_LESER_MIT_EMPFANGSBESTAETIGUNG_TYPE__EMPFANGSBESTAETIGUNG:
				return isSetEmpfangsbestaetigung();
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
		result.append(" (empfangsbestaetigung: ");
		if (empfangsbestaetigungESet) result.append(empfangsbestaetigung); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //NkNichtFVDatenEinLeserMitEmpfangsbestaetigungTypeImpl
