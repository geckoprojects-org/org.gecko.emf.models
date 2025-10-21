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

import de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType;

import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BerufsbildungType;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Berufsbildung Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.BerufsbildungTypeImpl#isBerufsbildung <em>Berufsbildung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.BerufsbildungTypeImpl#getAusbildungEndeVoraussichtlich <em>Ausbildung Ende Voraussichtlich</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.BerufsbildungTypeImpl#getNachweis <em>Nachweis</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BerufsbildungTypeImpl extends MinimalEObjectImpl.Container implements BerufsbildungType {
	/**
	 * The default value of the '{@link #isBerufsbildung() <em>Berufsbildung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBerufsbildung()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BERUFSBILDUNG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBerufsbildung() <em>Berufsbildung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBerufsbildung()
	 * @generated
	 * @ordered
	 */
	protected boolean berufsbildung = BERUFSBILDUNG_EDEFAULT;

	/**
	 * This is true if the Berufsbildung attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean berufsbildungESet;

	/**
	 * The default value of the '{@link #getAusbildungEndeVoraussichtlich() <em>Ausbildung Ende Voraussichtlich</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAusbildungEndeVoraussichtlich()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar AUSBILDUNG_ENDE_VORAUSSICHTLICH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAusbildungEndeVoraussichtlich() <em>Ausbildung Ende Voraussichtlich</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAusbildungEndeVoraussichtlich()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar ausbildungEndeVoraussichtlich = AUSBILDUNG_ENDE_VORAUSSICHTLICH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNachweis() <em>Nachweis</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachweis()
	 * @generated
	 * @ordered
	 */
	protected EList<NachweisdokumentType> nachweis;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BerufsbildungTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ElterngeldPackage.eINSTANCE.getBerufsbildungType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isBerufsbildung() {
		return berufsbildung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBerufsbildung(boolean newBerufsbildung) {
		boolean oldBerufsbildung = berufsbildung;
		berufsbildung = newBerufsbildung;
		boolean oldBerufsbildungESet = berufsbildungESet;
		berufsbildungESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.BERUFSBILDUNG_TYPE__BERUFSBILDUNG, oldBerufsbildung, berufsbildung, !oldBerufsbildungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetBerufsbildung() {
		boolean oldBerufsbildung = berufsbildung;
		boolean oldBerufsbildungESet = berufsbildungESet;
		berufsbildung = BERUFSBILDUNG_EDEFAULT;
		berufsbildungESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.BERUFSBILDUNG_TYPE__BERUFSBILDUNG, oldBerufsbildung, BERUFSBILDUNG_EDEFAULT, oldBerufsbildungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetBerufsbildung() {
		return berufsbildungESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getAusbildungEndeVoraussichtlich() {
		return ausbildungEndeVoraussichtlich;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAusbildungEndeVoraussichtlich(XMLGregorianCalendar newAusbildungEndeVoraussichtlich) {
		XMLGregorianCalendar oldAusbildungEndeVoraussichtlich = ausbildungEndeVoraussichtlich;
		ausbildungEndeVoraussichtlich = newAusbildungEndeVoraussichtlich;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.BERUFSBILDUNG_TYPE__AUSBILDUNG_ENDE_VORAUSSICHTLICH, oldAusbildungEndeVoraussichtlich, ausbildungEndeVoraussichtlich));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NachweisdokumentType> getNachweis() {
		if (nachweis == null) {
			nachweis = new EObjectContainmentEList<NachweisdokumentType>(NachweisdokumentType.class, this, ElterngeldPackage.BERUFSBILDUNG_TYPE__NACHWEIS);
		}
		return nachweis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ElterngeldPackage.BERUFSBILDUNG_TYPE__NACHWEIS:
				return ((InternalEList<?>)getNachweis()).basicRemove(otherEnd, msgs);
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
			case ElterngeldPackage.BERUFSBILDUNG_TYPE__BERUFSBILDUNG:
				return isBerufsbildung();
			case ElterngeldPackage.BERUFSBILDUNG_TYPE__AUSBILDUNG_ENDE_VORAUSSICHTLICH:
				return getAusbildungEndeVoraussichtlich();
			case ElterngeldPackage.BERUFSBILDUNG_TYPE__NACHWEIS:
				return getNachweis();
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
			case ElterngeldPackage.BERUFSBILDUNG_TYPE__BERUFSBILDUNG:
				setBerufsbildung((Boolean)newValue);
				return;
			case ElterngeldPackage.BERUFSBILDUNG_TYPE__AUSBILDUNG_ENDE_VORAUSSICHTLICH:
				setAusbildungEndeVoraussichtlich((XMLGregorianCalendar)newValue);
				return;
			case ElterngeldPackage.BERUFSBILDUNG_TYPE__NACHWEIS:
				getNachweis().clear();
				getNachweis().addAll((Collection<? extends NachweisdokumentType>)newValue);
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
			case ElterngeldPackage.BERUFSBILDUNG_TYPE__BERUFSBILDUNG:
				unsetBerufsbildung();
				return;
			case ElterngeldPackage.BERUFSBILDUNG_TYPE__AUSBILDUNG_ENDE_VORAUSSICHTLICH:
				setAusbildungEndeVoraussichtlich(AUSBILDUNG_ENDE_VORAUSSICHTLICH_EDEFAULT);
				return;
			case ElterngeldPackage.BERUFSBILDUNG_TYPE__NACHWEIS:
				getNachweis().clear();
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
			case ElterngeldPackage.BERUFSBILDUNG_TYPE__BERUFSBILDUNG:
				return isSetBerufsbildung();
			case ElterngeldPackage.BERUFSBILDUNG_TYPE__AUSBILDUNG_ENDE_VORAUSSICHTLICH:
				return AUSBILDUNG_ENDE_VORAUSSICHTLICH_EDEFAULT == null ? ausbildungEndeVoraussichtlich != null : !AUSBILDUNG_ENDE_VORAUSSICHTLICH_EDEFAULT.equals(ausbildungEndeVoraussichtlich);
			case ElterngeldPackage.BERUFSBILDUNG_TYPE__NACHWEIS:
				return nachweis != null && !nachweis.isEmpty();
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
		result.append(" (berufsbildung: ");
		if (berufsbildungESet) result.append(berufsbildung); else result.append("<unset>");
		result.append(", ausbildungEndeVoraussichtlich: ");
		result.append(ausbildungEndeVoraussichtlich);
		result.append(')');
		return result.toString();
	}

} //BerufsbildungTypeImpl
