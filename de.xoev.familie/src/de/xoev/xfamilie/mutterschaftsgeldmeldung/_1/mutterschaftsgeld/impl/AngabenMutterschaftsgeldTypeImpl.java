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
package de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl;

import de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.AngabenMutterschaftsgeldType;
import de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldPackage;

import java.math.BigDecimal;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Angaben Mutterschaftsgeld Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.AngabenMutterschaftsgeldTypeImpl#getMutterschaftsgeldzahlungAb <em>Mutterschaftsgeldzahlung Ab</em>}</li>
 *   <li>{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.AngabenMutterschaftsgeldTypeImpl#getMutterschaftsgeldzahlungBis <em>Mutterschaftsgeldzahlung Bis</em>}</li>
 *   <li>{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.AngabenMutterschaftsgeldTypeImpl#getMutterschaftsgeldzahlungHoehe <em>Mutterschaftsgeldzahlung Hoehe</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AngabenMutterschaftsgeldTypeImpl extends MinimalEObjectImpl.Container implements AngabenMutterschaftsgeldType {
	/**
	 * The default value of the '{@link #getMutterschaftsgeldzahlungAb() <em>Mutterschaftsgeldzahlung Ab</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMutterschaftsgeldzahlungAb()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar MUTTERSCHAFTSGELDZAHLUNG_AB_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMutterschaftsgeldzahlungAb() <em>Mutterschaftsgeldzahlung Ab</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMutterschaftsgeldzahlungAb()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar mutterschaftsgeldzahlungAb = MUTTERSCHAFTSGELDZAHLUNG_AB_EDEFAULT;

	/**
	 * The default value of the '{@link #getMutterschaftsgeldzahlungBis() <em>Mutterschaftsgeldzahlung Bis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMutterschaftsgeldzahlungBis()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar MUTTERSCHAFTSGELDZAHLUNG_BIS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMutterschaftsgeldzahlungBis() <em>Mutterschaftsgeldzahlung Bis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMutterschaftsgeldzahlungBis()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar mutterschaftsgeldzahlungBis = MUTTERSCHAFTSGELDZAHLUNG_BIS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMutterschaftsgeldzahlungHoehe() <em>Mutterschaftsgeldzahlung Hoehe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMutterschaftsgeldzahlungHoehe()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal MUTTERSCHAFTSGELDZAHLUNG_HOEHE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMutterschaftsgeldzahlungHoehe() <em>Mutterschaftsgeldzahlung Hoehe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMutterschaftsgeldzahlungHoehe()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal mutterschaftsgeldzahlungHoehe = MUTTERSCHAFTSGELDZAHLUNG_HOEHE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AngabenMutterschaftsgeldTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MutterschaftsgeldPackage.Literals.ANGABEN_MUTTERSCHAFTSGELD_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getMutterschaftsgeldzahlungAb() {
		return mutterschaftsgeldzahlungAb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMutterschaftsgeldzahlungAb(XMLGregorianCalendar newMutterschaftsgeldzahlungAb) {
		XMLGregorianCalendar oldMutterschaftsgeldzahlungAb = mutterschaftsgeldzahlungAb;
		mutterschaftsgeldzahlungAb = newMutterschaftsgeldzahlungAb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MutterschaftsgeldPackage.ANGABEN_MUTTERSCHAFTSGELD_TYPE__MUTTERSCHAFTSGELDZAHLUNG_AB, oldMutterschaftsgeldzahlungAb, mutterschaftsgeldzahlungAb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getMutterschaftsgeldzahlungBis() {
		return mutterschaftsgeldzahlungBis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMutterschaftsgeldzahlungBis(XMLGregorianCalendar newMutterschaftsgeldzahlungBis) {
		XMLGregorianCalendar oldMutterschaftsgeldzahlungBis = mutterschaftsgeldzahlungBis;
		mutterschaftsgeldzahlungBis = newMutterschaftsgeldzahlungBis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MutterschaftsgeldPackage.ANGABEN_MUTTERSCHAFTSGELD_TYPE__MUTTERSCHAFTSGELDZAHLUNG_BIS, oldMutterschaftsgeldzahlungBis, mutterschaftsgeldzahlungBis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getMutterschaftsgeldzahlungHoehe() {
		return mutterschaftsgeldzahlungHoehe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMutterschaftsgeldzahlungHoehe(BigDecimal newMutterschaftsgeldzahlungHoehe) {
		BigDecimal oldMutterschaftsgeldzahlungHoehe = mutterschaftsgeldzahlungHoehe;
		mutterschaftsgeldzahlungHoehe = newMutterschaftsgeldzahlungHoehe;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MutterschaftsgeldPackage.ANGABEN_MUTTERSCHAFTSGELD_TYPE__MUTTERSCHAFTSGELDZAHLUNG_HOEHE, oldMutterschaftsgeldzahlungHoehe, mutterschaftsgeldzahlungHoehe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MutterschaftsgeldPackage.ANGABEN_MUTTERSCHAFTSGELD_TYPE__MUTTERSCHAFTSGELDZAHLUNG_AB:
				return getMutterschaftsgeldzahlungAb();
			case MutterschaftsgeldPackage.ANGABEN_MUTTERSCHAFTSGELD_TYPE__MUTTERSCHAFTSGELDZAHLUNG_BIS:
				return getMutterschaftsgeldzahlungBis();
			case MutterschaftsgeldPackage.ANGABEN_MUTTERSCHAFTSGELD_TYPE__MUTTERSCHAFTSGELDZAHLUNG_HOEHE:
				return getMutterschaftsgeldzahlungHoehe();
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
			case MutterschaftsgeldPackage.ANGABEN_MUTTERSCHAFTSGELD_TYPE__MUTTERSCHAFTSGELDZAHLUNG_AB:
				setMutterschaftsgeldzahlungAb((XMLGregorianCalendar)newValue);
				return;
			case MutterschaftsgeldPackage.ANGABEN_MUTTERSCHAFTSGELD_TYPE__MUTTERSCHAFTSGELDZAHLUNG_BIS:
				setMutterschaftsgeldzahlungBis((XMLGregorianCalendar)newValue);
				return;
			case MutterschaftsgeldPackage.ANGABEN_MUTTERSCHAFTSGELD_TYPE__MUTTERSCHAFTSGELDZAHLUNG_HOEHE:
				setMutterschaftsgeldzahlungHoehe((BigDecimal)newValue);
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
			case MutterschaftsgeldPackage.ANGABEN_MUTTERSCHAFTSGELD_TYPE__MUTTERSCHAFTSGELDZAHLUNG_AB:
				setMutterschaftsgeldzahlungAb(MUTTERSCHAFTSGELDZAHLUNG_AB_EDEFAULT);
				return;
			case MutterschaftsgeldPackage.ANGABEN_MUTTERSCHAFTSGELD_TYPE__MUTTERSCHAFTSGELDZAHLUNG_BIS:
				setMutterschaftsgeldzahlungBis(MUTTERSCHAFTSGELDZAHLUNG_BIS_EDEFAULT);
				return;
			case MutterschaftsgeldPackage.ANGABEN_MUTTERSCHAFTSGELD_TYPE__MUTTERSCHAFTSGELDZAHLUNG_HOEHE:
				setMutterschaftsgeldzahlungHoehe(MUTTERSCHAFTSGELDZAHLUNG_HOEHE_EDEFAULT);
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
			case MutterschaftsgeldPackage.ANGABEN_MUTTERSCHAFTSGELD_TYPE__MUTTERSCHAFTSGELDZAHLUNG_AB:
				return MUTTERSCHAFTSGELDZAHLUNG_AB_EDEFAULT == null ? mutterschaftsgeldzahlungAb != null : !MUTTERSCHAFTSGELDZAHLUNG_AB_EDEFAULT.equals(mutterschaftsgeldzahlungAb);
			case MutterschaftsgeldPackage.ANGABEN_MUTTERSCHAFTSGELD_TYPE__MUTTERSCHAFTSGELDZAHLUNG_BIS:
				return MUTTERSCHAFTSGELDZAHLUNG_BIS_EDEFAULT == null ? mutterschaftsgeldzahlungBis != null : !MUTTERSCHAFTSGELDZAHLUNG_BIS_EDEFAULT.equals(mutterschaftsgeldzahlungBis);
			case MutterschaftsgeldPackage.ANGABEN_MUTTERSCHAFTSGELD_TYPE__MUTTERSCHAFTSGELDZAHLUNG_HOEHE:
				return MUTTERSCHAFTSGELDZAHLUNG_HOEHE_EDEFAULT == null ? mutterschaftsgeldzahlungHoehe != null : !MUTTERSCHAFTSGELDZAHLUNG_HOEHE_EDEFAULT.equals(mutterschaftsgeldzahlungHoehe);
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
		result.append(" (mutterschaftsgeldzahlungAb: ");
		result.append(mutterschaftsgeldzahlungAb);
		result.append(", mutterschaftsgeldzahlungBis: ");
		result.append(mutterschaftsgeldzahlungBis);
		result.append(", mutterschaftsgeldzahlungHoehe: ");
		result.append(mutterschaftsgeldzahlungHoehe);
		result.append(')');
		return result.toString();
	}

} //AngabenMutterschaftsgeldTypeImpl
