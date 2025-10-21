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
package de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl;

import de.xoev.xfamilie.beistandschaft._1.beistandschaft.AusbildungUndEinkuenfteType;
import de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ausbildung Und Einkuenfte Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.AusbildungUndEinkuenfteTypeImpl#isKindInAusbildung <em>Kind In Ausbildung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.AusbildungUndEinkuenfteTypeImpl#getAusbildungsjahr <em>Ausbildungsjahr</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.AusbildungUndEinkuenfteTypeImpl#isEinkuenfteKind <em>Einkuenfte Kind</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.AusbildungUndEinkuenfteTypeImpl#getEinkuenfteArt <em>Einkuenfte Art</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.AusbildungUndEinkuenfteTypeImpl#isKindergeld <em>Kindergeld</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AusbildungUndEinkuenfteTypeImpl extends MinimalEObjectImpl.Container implements AusbildungUndEinkuenfteType {
	/**
	 * The default value of the '{@link #isKindInAusbildung() <em>Kind In Ausbildung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isKindInAusbildung()
	 * @generated
	 * @ordered
	 */
	protected static final boolean KIND_IN_AUSBILDUNG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isKindInAusbildung() <em>Kind In Ausbildung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isKindInAusbildung()
	 * @generated
	 * @ordered
	 */
	protected boolean kindInAusbildung = KIND_IN_AUSBILDUNG_EDEFAULT;

	/**
	 * This is true if the Kind In Ausbildung attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean kindInAusbildungESet;

	/**
	 * The default value of the '{@link #getAusbildungsjahr() <em>Ausbildungsjahr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAusbildungsjahr()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger AUSBILDUNGSJAHR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAusbildungsjahr() <em>Ausbildungsjahr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAusbildungsjahr()
	 * @generated
	 * @ordered
	 */
	protected BigInteger ausbildungsjahr = AUSBILDUNGSJAHR_EDEFAULT;

	/**
	 * The default value of the '{@link #isEinkuenfteKind() <em>Einkuenfte Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEinkuenfteKind()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EINKUENFTE_KIND_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEinkuenfteKind() <em>Einkuenfte Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEinkuenfteKind()
	 * @generated
	 * @ordered
	 */
	protected boolean einkuenfteKind = EINKUENFTE_KIND_EDEFAULT;

	/**
	 * This is true if the Einkuenfte Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean einkuenfteKindESet;

	/**
	 * The default value of the '{@link #getEinkuenfteArt() <em>Einkuenfte Art</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEinkuenfteArt()
	 * @generated
	 * @ordered
	 */
	protected static final String EINKUENFTE_ART_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEinkuenfteArt() <em>Einkuenfte Art</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEinkuenfteArt()
	 * @generated
	 * @ordered
	 */
	protected String einkuenfteArt = EINKUENFTE_ART_EDEFAULT;

	/**
	 * The default value of the '{@link #isKindergeld() <em>Kindergeld</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isKindergeld()
	 * @generated
	 * @ordered
	 */
	protected static final boolean KINDERGELD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isKindergeld() <em>Kindergeld</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isKindergeld()
	 * @generated
	 * @ordered
	 */
	protected boolean kindergeld = KINDERGELD_EDEFAULT;

	/**
	 * This is true if the Kindergeld attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean kindergeldESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AusbildungUndEinkuenfteTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BeistandschaftPackage.Literals.AUSBILDUNG_UND_EINKUENFTE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isKindInAusbildung() {
		return kindInAusbildung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKindInAusbildung(boolean newKindInAusbildung) {
		boolean oldKindInAusbildung = kindInAusbildung;
		kindInAusbildung = newKindInAusbildung;
		boolean oldKindInAusbildungESet = kindInAusbildungESet;
		kindInAusbildungESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.AUSBILDUNG_UND_EINKUENFTE_TYPE__KIND_IN_AUSBILDUNG, oldKindInAusbildung, kindInAusbildung, !oldKindInAusbildungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetKindInAusbildung() {
		boolean oldKindInAusbildung = kindInAusbildung;
		boolean oldKindInAusbildungESet = kindInAusbildungESet;
		kindInAusbildung = KIND_IN_AUSBILDUNG_EDEFAULT;
		kindInAusbildungESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BeistandschaftPackage.AUSBILDUNG_UND_EINKUENFTE_TYPE__KIND_IN_AUSBILDUNG, oldKindInAusbildung, KIND_IN_AUSBILDUNG_EDEFAULT, oldKindInAusbildungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetKindInAusbildung() {
		return kindInAusbildungESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getAusbildungsjahr() {
		return ausbildungsjahr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAusbildungsjahr(BigInteger newAusbildungsjahr) {
		BigInteger oldAusbildungsjahr = ausbildungsjahr;
		ausbildungsjahr = newAusbildungsjahr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.AUSBILDUNG_UND_EINKUENFTE_TYPE__AUSBILDUNGSJAHR, oldAusbildungsjahr, ausbildungsjahr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEinkuenfteKind() {
		return einkuenfteKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEinkuenfteKind(boolean newEinkuenfteKind) {
		boolean oldEinkuenfteKind = einkuenfteKind;
		einkuenfteKind = newEinkuenfteKind;
		boolean oldEinkuenfteKindESet = einkuenfteKindESet;
		einkuenfteKindESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.AUSBILDUNG_UND_EINKUENFTE_TYPE__EINKUENFTE_KIND, oldEinkuenfteKind, einkuenfteKind, !oldEinkuenfteKindESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetEinkuenfteKind() {
		boolean oldEinkuenfteKind = einkuenfteKind;
		boolean oldEinkuenfteKindESet = einkuenfteKindESet;
		einkuenfteKind = EINKUENFTE_KIND_EDEFAULT;
		einkuenfteKindESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BeistandschaftPackage.AUSBILDUNG_UND_EINKUENFTE_TYPE__EINKUENFTE_KIND, oldEinkuenfteKind, EINKUENFTE_KIND_EDEFAULT, oldEinkuenfteKindESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetEinkuenfteKind() {
		return einkuenfteKindESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEinkuenfteArt() {
		return einkuenfteArt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEinkuenfteArt(String newEinkuenfteArt) {
		String oldEinkuenfteArt = einkuenfteArt;
		einkuenfteArt = newEinkuenfteArt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.AUSBILDUNG_UND_EINKUENFTE_TYPE__EINKUENFTE_ART, oldEinkuenfteArt, einkuenfteArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isKindergeld() {
		return kindergeld;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKindergeld(boolean newKindergeld) {
		boolean oldKindergeld = kindergeld;
		kindergeld = newKindergeld;
		boolean oldKindergeldESet = kindergeldESet;
		kindergeldESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.AUSBILDUNG_UND_EINKUENFTE_TYPE__KINDERGELD, oldKindergeld, kindergeld, !oldKindergeldESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetKindergeld() {
		boolean oldKindergeld = kindergeld;
		boolean oldKindergeldESet = kindergeldESet;
		kindergeld = KINDERGELD_EDEFAULT;
		kindergeldESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BeistandschaftPackage.AUSBILDUNG_UND_EINKUENFTE_TYPE__KINDERGELD, oldKindergeld, KINDERGELD_EDEFAULT, oldKindergeldESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetKindergeld() {
		return kindergeldESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BeistandschaftPackage.AUSBILDUNG_UND_EINKUENFTE_TYPE__KIND_IN_AUSBILDUNG:
				return isKindInAusbildung();
			case BeistandschaftPackage.AUSBILDUNG_UND_EINKUENFTE_TYPE__AUSBILDUNGSJAHR:
				return getAusbildungsjahr();
			case BeistandschaftPackage.AUSBILDUNG_UND_EINKUENFTE_TYPE__EINKUENFTE_KIND:
				return isEinkuenfteKind();
			case BeistandschaftPackage.AUSBILDUNG_UND_EINKUENFTE_TYPE__EINKUENFTE_ART:
				return getEinkuenfteArt();
			case BeistandschaftPackage.AUSBILDUNG_UND_EINKUENFTE_TYPE__KINDERGELD:
				return isKindergeld();
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
			case BeistandschaftPackage.AUSBILDUNG_UND_EINKUENFTE_TYPE__KIND_IN_AUSBILDUNG:
				setKindInAusbildung((Boolean)newValue);
				return;
			case BeistandschaftPackage.AUSBILDUNG_UND_EINKUENFTE_TYPE__AUSBILDUNGSJAHR:
				setAusbildungsjahr((BigInteger)newValue);
				return;
			case BeistandschaftPackage.AUSBILDUNG_UND_EINKUENFTE_TYPE__EINKUENFTE_KIND:
				setEinkuenfteKind((Boolean)newValue);
				return;
			case BeistandschaftPackage.AUSBILDUNG_UND_EINKUENFTE_TYPE__EINKUENFTE_ART:
				setEinkuenfteArt((String)newValue);
				return;
			case BeistandschaftPackage.AUSBILDUNG_UND_EINKUENFTE_TYPE__KINDERGELD:
				setKindergeld((Boolean)newValue);
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
			case BeistandschaftPackage.AUSBILDUNG_UND_EINKUENFTE_TYPE__KIND_IN_AUSBILDUNG:
				unsetKindInAusbildung();
				return;
			case BeistandschaftPackage.AUSBILDUNG_UND_EINKUENFTE_TYPE__AUSBILDUNGSJAHR:
				setAusbildungsjahr(AUSBILDUNGSJAHR_EDEFAULT);
				return;
			case BeistandschaftPackage.AUSBILDUNG_UND_EINKUENFTE_TYPE__EINKUENFTE_KIND:
				unsetEinkuenfteKind();
				return;
			case BeistandschaftPackage.AUSBILDUNG_UND_EINKUENFTE_TYPE__EINKUENFTE_ART:
				setEinkuenfteArt(EINKUENFTE_ART_EDEFAULT);
				return;
			case BeistandschaftPackage.AUSBILDUNG_UND_EINKUENFTE_TYPE__KINDERGELD:
				unsetKindergeld();
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
			case BeistandschaftPackage.AUSBILDUNG_UND_EINKUENFTE_TYPE__KIND_IN_AUSBILDUNG:
				return isSetKindInAusbildung();
			case BeistandschaftPackage.AUSBILDUNG_UND_EINKUENFTE_TYPE__AUSBILDUNGSJAHR:
				return AUSBILDUNGSJAHR_EDEFAULT == null ? ausbildungsjahr != null : !AUSBILDUNGSJAHR_EDEFAULT.equals(ausbildungsjahr);
			case BeistandschaftPackage.AUSBILDUNG_UND_EINKUENFTE_TYPE__EINKUENFTE_KIND:
				return isSetEinkuenfteKind();
			case BeistandschaftPackage.AUSBILDUNG_UND_EINKUENFTE_TYPE__EINKUENFTE_ART:
				return EINKUENFTE_ART_EDEFAULT == null ? einkuenfteArt != null : !EINKUENFTE_ART_EDEFAULT.equals(einkuenfteArt);
			case BeistandschaftPackage.AUSBILDUNG_UND_EINKUENFTE_TYPE__KINDERGELD:
				return isSetKindergeld();
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
		result.append(" (kindInAusbildung: ");
		if (kindInAusbildungESet) result.append(kindInAusbildung); else result.append("<unset>");
		result.append(", ausbildungsjahr: ");
		result.append(ausbildungsjahr);
		result.append(", einkuenfteKind: ");
		if (einkuenfteKindESet) result.append(einkuenfteKind); else result.append("<unset>");
		result.append(", einkuenfteArt: ");
		result.append(einkuenfteArt);
		result.append(", kindergeld: ");
		if (kindergeldESet) result.append(kindergeld); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //AusbildungUndEinkuenfteTypeImpl
