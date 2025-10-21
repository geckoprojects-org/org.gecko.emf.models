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
package de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl;

import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ArbeitszeitType;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arbeitszeit Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ArbeitszeitTypeImpl#getArbeitszeitWochenstunden <em>Arbeitszeit Wochenstunden</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ArbeitszeitTypeImpl#getAbweichendeBezugsgroesse <em>Abweichende Bezugsgroesse</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArbeitszeitTypeImpl extends MinimalEObjectImpl.Container implements ArbeitszeitType {
	/**
	 * The default value of the '{@link #getArbeitszeitWochenstunden() <em>Arbeitszeit Wochenstunden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArbeitszeitWochenstunden()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger ARBEITSZEIT_WOCHENSTUNDEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArbeitszeitWochenstunden() <em>Arbeitszeit Wochenstunden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArbeitszeitWochenstunden()
	 * @generated
	 * @ordered
	 */
	protected BigInteger arbeitszeitWochenstunden = ARBEITSZEIT_WOCHENSTUNDEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getAbweichendeBezugsgroesse() <em>Abweichende Bezugsgroesse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbweichendeBezugsgroesse()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger ABWEICHENDE_BEZUGSGROESSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAbweichendeBezugsgroesse() <em>Abweichende Bezugsgroesse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbweichendeBezugsgroesse()
	 * @generated
	 * @ordered
	 */
	protected BigInteger abweichendeBezugsgroesse = ABWEICHENDE_BEZUGSGROESSE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArbeitszeitTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ElterngeldPackage.eINSTANCE.getArbeitszeitType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getArbeitszeitWochenstunden() {
		return arbeitszeitWochenstunden;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArbeitszeitWochenstunden(BigInteger newArbeitszeitWochenstunden) {
		BigInteger oldArbeitszeitWochenstunden = arbeitszeitWochenstunden;
		arbeitszeitWochenstunden = newArbeitszeitWochenstunden;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ARBEITSZEIT_TYPE__ARBEITSZEIT_WOCHENSTUNDEN, oldArbeitszeitWochenstunden, arbeitszeitWochenstunden));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getAbweichendeBezugsgroesse() {
		return abweichendeBezugsgroesse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAbweichendeBezugsgroesse(BigInteger newAbweichendeBezugsgroesse) {
		BigInteger oldAbweichendeBezugsgroesse = abweichendeBezugsgroesse;
		abweichendeBezugsgroesse = newAbweichendeBezugsgroesse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ARBEITSZEIT_TYPE__ABWEICHENDE_BEZUGSGROESSE, oldAbweichendeBezugsgroesse, abweichendeBezugsgroesse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ElterngeldPackage.ARBEITSZEIT_TYPE__ARBEITSZEIT_WOCHENSTUNDEN:
				return getArbeitszeitWochenstunden();
			case ElterngeldPackage.ARBEITSZEIT_TYPE__ABWEICHENDE_BEZUGSGROESSE:
				return getAbweichendeBezugsgroesse();
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
			case ElterngeldPackage.ARBEITSZEIT_TYPE__ARBEITSZEIT_WOCHENSTUNDEN:
				setArbeitszeitWochenstunden((BigInteger)newValue);
				return;
			case ElterngeldPackage.ARBEITSZEIT_TYPE__ABWEICHENDE_BEZUGSGROESSE:
				setAbweichendeBezugsgroesse((BigInteger)newValue);
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
			case ElterngeldPackage.ARBEITSZEIT_TYPE__ARBEITSZEIT_WOCHENSTUNDEN:
				setArbeitszeitWochenstunden(ARBEITSZEIT_WOCHENSTUNDEN_EDEFAULT);
				return;
			case ElterngeldPackage.ARBEITSZEIT_TYPE__ABWEICHENDE_BEZUGSGROESSE:
				setAbweichendeBezugsgroesse(ABWEICHENDE_BEZUGSGROESSE_EDEFAULT);
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
			case ElterngeldPackage.ARBEITSZEIT_TYPE__ARBEITSZEIT_WOCHENSTUNDEN:
				return ARBEITSZEIT_WOCHENSTUNDEN_EDEFAULT == null ? arbeitszeitWochenstunden != null : !ARBEITSZEIT_WOCHENSTUNDEN_EDEFAULT.equals(arbeitszeitWochenstunden);
			case ElterngeldPackage.ARBEITSZEIT_TYPE__ABWEICHENDE_BEZUGSGROESSE:
				return ABWEICHENDE_BEZUGSGROESSE_EDEFAULT == null ? abweichendeBezugsgroesse != null : !ABWEICHENDE_BEZUGSGROESSE_EDEFAULT.equals(abweichendeBezugsgroesse);
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
		result.append(" (arbeitszeitWochenstunden: ");
		result.append(arbeitszeitWochenstunden);
		result.append(", abweichendeBezugsgroesse: ");
		result.append(abweichendeBezugsgroesse);
		result.append(')');
		return result.toString();
	}

} //ArbeitszeitTypeImpl
