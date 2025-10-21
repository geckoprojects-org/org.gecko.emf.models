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
package de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl;

import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.CodeSteuerklasseType;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LohnsteuerklasseType;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lohnsteuerklasse Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.LohnsteuerklasseTypeImpl#isLohnsteuerklasseVeranlagung <em>Lohnsteuerklasse Veranlagung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.LohnsteuerklasseTypeImpl#getLohnsteuerklasse <em>Lohnsteuerklasse</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LohnsteuerklasseTypeImpl extends MinimalEObjectImpl.Container implements LohnsteuerklasseType {
	/**
	 * The default value of the '{@link #isLohnsteuerklasseVeranlagung() <em>Lohnsteuerklasse Veranlagung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLohnsteuerklasseVeranlagung()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LOHNSTEUERKLASSE_VERANLAGUNG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLohnsteuerklasseVeranlagung() <em>Lohnsteuerklasse Veranlagung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLohnsteuerklasseVeranlagung()
	 * @generated
	 * @ordered
	 */
	protected boolean lohnsteuerklasseVeranlagung = LOHNSTEUERKLASSE_VERANLAGUNG_EDEFAULT;

	/**
	 * This is true if the Lohnsteuerklasse Veranlagung attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lohnsteuerklasseVeranlagungESet;

	/**
	 * The cached value of the '{@link #getLohnsteuerklasse() <em>Lohnsteuerklasse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLohnsteuerklasse()
	 * @generated
	 * @ordered
	 */
	protected CodeSteuerklasseType lohnsteuerklasse;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LohnsteuerklasseTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnterhaltsvorschussPackage.eINSTANCE.getLohnsteuerklasseType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isLohnsteuerklasseVeranlagung() {
		return lohnsteuerklasseVeranlagung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLohnsteuerklasseVeranlagung(boolean newLohnsteuerklasseVeranlagung) {
		boolean oldLohnsteuerklasseVeranlagung = lohnsteuerklasseVeranlagung;
		lohnsteuerklasseVeranlagung = newLohnsteuerklasseVeranlagung;
		boolean oldLohnsteuerklasseVeranlagungESet = lohnsteuerklasseVeranlagungESet;
		lohnsteuerklasseVeranlagungESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.LOHNSTEUERKLASSE_TYPE__LOHNSTEUERKLASSE_VERANLAGUNG, oldLohnsteuerklasseVeranlagung, lohnsteuerklasseVeranlagung, !oldLohnsteuerklasseVeranlagungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetLohnsteuerklasseVeranlagung() {
		boolean oldLohnsteuerklasseVeranlagung = lohnsteuerklasseVeranlagung;
		boolean oldLohnsteuerklasseVeranlagungESet = lohnsteuerklasseVeranlagungESet;
		lohnsteuerklasseVeranlagung = LOHNSTEUERKLASSE_VERANLAGUNG_EDEFAULT;
		lohnsteuerklasseVeranlagungESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, UnterhaltsvorschussPackage.LOHNSTEUERKLASSE_TYPE__LOHNSTEUERKLASSE_VERANLAGUNG, oldLohnsteuerklasseVeranlagung, LOHNSTEUERKLASSE_VERANLAGUNG_EDEFAULT, oldLohnsteuerklasseVeranlagungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetLohnsteuerklasseVeranlagung() {
		return lohnsteuerklasseVeranlagungESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeSteuerklasseType getLohnsteuerklasse() {
		return lohnsteuerklasse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLohnsteuerklasse(CodeSteuerklasseType newLohnsteuerklasse, NotificationChain msgs) {
		CodeSteuerklasseType oldLohnsteuerklasse = lohnsteuerklasse;
		lohnsteuerklasse = newLohnsteuerklasse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.LOHNSTEUERKLASSE_TYPE__LOHNSTEUERKLASSE, oldLohnsteuerklasse, newLohnsteuerklasse);
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
	public void setLohnsteuerklasse(CodeSteuerklasseType newLohnsteuerklasse) {
		if (newLohnsteuerklasse != lohnsteuerklasse) {
			NotificationChain msgs = null;
			if (lohnsteuerklasse != null)
				msgs = ((InternalEObject)lohnsteuerklasse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.LOHNSTEUERKLASSE_TYPE__LOHNSTEUERKLASSE, null, msgs);
			if (newLohnsteuerklasse != null)
				msgs = ((InternalEObject)newLohnsteuerklasse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.LOHNSTEUERKLASSE_TYPE__LOHNSTEUERKLASSE, null, msgs);
			msgs = basicSetLohnsteuerklasse(newLohnsteuerklasse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.LOHNSTEUERKLASSE_TYPE__LOHNSTEUERKLASSE, newLohnsteuerklasse, newLohnsteuerklasse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UnterhaltsvorschussPackage.LOHNSTEUERKLASSE_TYPE__LOHNSTEUERKLASSE:
				return basicSetLohnsteuerklasse(null, msgs);
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
			case UnterhaltsvorschussPackage.LOHNSTEUERKLASSE_TYPE__LOHNSTEUERKLASSE_VERANLAGUNG:
				return isLohnsteuerklasseVeranlagung();
			case UnterhaltsvorschussPackage.LOHNSTEUERKLASSE_TYPE__LOHNSTEUERKLASSE:
				return getLohnsteuerklasse();
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
			case UnterhaltsvorschussPackage.LOHNSTEUERKLASSE_TYPE__LOHNSTEUERKLASSE_VERANLAGUNG:
				setLohnsteuerklasseVeranlagung((Boolean)newValue);
				return;
			case UnterhaltsvorschussPackage.LOHNSTEUERKLASSE_TYPE__LOHNSTEUERKLASSE:
				setLohnsteuerklasse((CodeSteuerklasseType)newValue);
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
			case UnterhaltsvorschussPackage.LOHNSTEUERKLASSE_TYPE__LOHNSTEUERKLASSE_VERANLAGUNG:
				unsetLohnsteuerklasseVeranlagung();
				return;
			case UnterhaltsvorschussPackage.LOHNSTEUERKLASSE_TYPE__LOHNSTEUERKLASSE:
				setLohnsteuerklasse((CodeSteuerklasseType)null);
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
			case UnterhaltsvorschussPackage.LOHNSTEUERKLASSE_TYPE__LOHNSTEUERKLASSE_VERANLAGUNG:
				return isSetLohnsteuerklasseVeranlagung();
			case UnterhaltsvorschussPackage.LOHNSTEUERKLASSE_TYPE__LOHNSTEUERKLASSE:
				return lohnsteuerklasse != null;
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
		result.append(" (lohnsteuerklasseVeranlagung: ");
		if (lohnsteuerklasseVeranlagungESet) result.append(lohnsteuerklasseVeranlagung); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //LohnsteuerklasseTypeImpl
