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
package de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.impl;

import de.xoev.schemata.code.code.Code;

import de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.AllgemeineNachrichtenPackage;
import de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.RueckweisungsgrundSpezifischType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rueckweisungsgrund Spezifisch Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.impl.RueckweisungsgrundSpezifischTypeImpl#getCode <em>Code</em>}</li>
 *   <li>{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.impl.RueckweisungsgrundSpezifischTypeImpl#getBeschreibung <em>Beschreibung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RueckweisungsgrundSpezifischTypeImpl extends MinimalEObjectImpl.Container implements RueckweisungsgrundSpezifischType {
	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected Code code;

	/**
	 * The default value of the '{@link #getBeschreibung() <em>Beschreibung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeschreibung()
	 * @generated
	 * @ordered
	 */
	protected static final String BESCHREIBUNG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBeschreibung() <em>Beschreibung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeschreibung()
	 * @generated
	 * @ordered
	 */
	protected String beschreibung = BESCHREIBUNG_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RueckweisungsgrundSpezifischTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AllgemeineNachrichtenPackage.Literals.RUECKWEISUNGSGRUND_SPEZIFISCH_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Code getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCode(Code newCode, NotificationChain msgs) {
		Code oldCode = code;
		code = newCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AllgemeineNachrichtenPackage.RUECKWEISUNGSGRUND_SPEZIFISCH_TYPE__CODE, oldCode, newCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCode(Code newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AllgemeineNachrichtenPackage.RUECKWEISUNGSGRUND_SPEZIFISCH_TYPE__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AllgemeineNachrichtenPackage.RUECKWEISUNGSGRUND_SPEZIFISCH_TYPE__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AllgemeineNachrichtenPackage.RUECKWEISUNGSGRUND_SPEZIFISCH_TYPE__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBeschreibung() {
		return beschreibung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBeschreibung(String newBeschreibung) {
		String oldBeschreibung = beschreibung;
		beschreibung = newBeschreibung;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AllgemeineNachrichtenPackage.RUECKWEISUNGSGRUND_SPEZIFISCH_TYPE__BESCHREIBUNG, oldBeschreibung, beschreibung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AllgemeineNachrichtenPackage.RUECKWEISUNGSGRUND_SPEZIFISCH_TYPE__CODE:
				return basicSetCode(null, msgs);
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
			case AllgemeineNachrichtenPackage.RUECKWEISUNGSGRUND_SPEZIFISCH_TYPE__CODE:
				return getCode();
			case AllgemeineNachrichtenPackage.RUECKWEISUNGSGRUND_SPEZIFISCH_TYPE__BESCHREIBUNG:
				return getBeschreibung();
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
			case AllgemeineNachrichtenPackage.RUECKWEISUNGSGRUND_SPEZIFISCH_TYPE__CODE:
				setCode((Code)newValue);
				return;
			case AllgemeineNachrichtenPackage.RUECKWEISUNGSGRUND_SPEZIFISCH_TYPE__BESCHREIBUNG:
				setBeschreibung((String)newValue);
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
			case AllgemeineNachrichtenPackage.RUECKWEISUNGSGRUND_SPEZIFISCH_TYPE__CODE:
				setCode((Code)null);
				return;
			case AllgemeineNachrichtenPackage.RUECKWEISUNGSGRUND_SPEZIFISCH_TYPE__BESCHREIBUNG:
				setBeschreibung(BESCHREIBUNG_EDEFAULT);
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
			case AllgemeineNachrichtenPackage.RUECKWEISUNGSGRUND_SPEZIFISCH_TYPE__CODE:
				return code != null;
			case AllgemeineNachrichtenPackage.RUECKWEISUNGSGRUND_SPEZIFISCH_TYPE__BESCHREIBUNG:
				return BESCHREIBUNG_EDEFAULT == null ? beschreibung != null : !BESCHREIBUNG_EDEFAULT.equals(beschreibung);
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
		result.append(" (beschreibung: ");
		result.append(beschreibung);
		result.append(')');
		return result.toString();
	}

} //RueckweisungsgrundSpezifischTypeImpl
