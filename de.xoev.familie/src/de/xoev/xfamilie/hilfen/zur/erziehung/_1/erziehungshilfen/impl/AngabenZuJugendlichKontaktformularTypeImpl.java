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
package de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl;

import de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonVornameVerpflichtendType;
import de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftBasisType;

import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenZuJugendlichKontaktformularType;
import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage;

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
 * An implementation of the model object '<em><b>Angaben Zu Jugendlich Kontaktformular Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.AngabenZuJugendlichKontaktformularTypeImpl#getNameDerDesJugendlichen <em>Name Der Des Jugendlichen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.AngabenZuJugendlichKontaktformularTypeImpl#getGeburtsdatum <em>Geburtsdatum</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.AngabenZuJugendlichKontaktformularTypeImpl#isAnschriftStimmtUeberein <em>Anschrift Stimmt Ueberein</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.AngabenZuJugendlichKontaktformularTypeImpl#getAktuelleAnschrift <em>Aktuelle Anschrift</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AngabenZuJugendlichKontaktformularTypeImpl extends MinimalEObjectImpl.Container implements AngabenZuJugendlichKontaktformularType {
	/**
	 * The cached value of the '{@link #getNameDerDesJugendlichen() <em>Name Der Des Jugendlichen</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameDerDesJugendlichen()
	 * @generated
	 * @ordered
	 */
	protected EList<NameNatuerlichePersonVornameVerpflichtendType> nameDerDesJugendlichen;

	/**
	 * The default value of the '{@link #getGeburtsdatum() <em>Geburtsdatum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeburtsdatum()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar GEBURTSDATUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGeburtsdatum() <em>Geburtsdatum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeburtsdatum()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar geburtsdatum = GEBURTSDATUM_EDEFAULT;

	/**
	 * The default value of the '{@link #isAnschriftStimmtUeberein() <em>Anschrift Stimmt Ueberein</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAnschriftStimmtUeberein()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ANSCHRIFT_STIMMT_UEBEREIN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAnschriftStimmtUeberein() <em>Anschrift Stimmt Ueberein</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAnschriftStimmtUeberein()
	 * @generated
	 * @ordered
	 */
	protected boolean anschriftStimmtUeberein = ANSCHRIFT_STIMMT_UEBEREIN_EDEFAULT;

	/**
	 * This is true if the Anschrift Stimmt Ueberein attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean anschriftStimmtUebereinESet;

	/**
	 * The cached value of the '{@link #getAktuelleAnschrift() <em>Aktuelle Anschrift</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAktuelleAnschrift()
	 * @generated
	 * @ordered
	 */
	protected PostalischeInlandsanschriftBasisType aktuelleAnschrift;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AngabenZuJugendlichKontaktformularTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ErziehungshilfePackage.Literals.ANGABEN_ZU_JUGENDLICH_KONTAKTFORMULAR_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NameNatuerlichePersonVornameVerpflichtendType> getNameDerDesJugendlichen() {
		if (nameDerDesJugendlichen == null) {
			nameDerDesJugendlichen = new EObjectContainmentEList<NameNatuerlichePersonVornameVerpflichtendType>(NameNatuerlichePersonVornameVerpflichtendType.class, this, ErziehungshilfePackage.ANGABEN_ZU_JUGENDLICH_KONTAKTFORMULAR_TYPE__NAME_DER_DES_JUGENDLICHEN);
		}
		return nameDerDesJugendlichen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getGeburtsdatum() {
		return geburtsdatum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeburtsdatum(XMLGregorianCalendar newGeburtsdatum) {
		XMLGregorianCalendar oldGeburtsdatum = geburtsdatum;
		geburtsdatum = newGeburtsdatum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.ANGABEN_ZU_JUGENDLICH_KONTAKTFORMULAR_TYPE__GEBURTSDATUM, oldGeburtsdatum, geburtsdatum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAnschriftStimmtUeberein() {
		return anschriftStimmtUeberein;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnschriftStimmtUeberein(boolean newAnschriftStimmtUeberein) {
		boolean oldAnschriftStimmtUeberein = anschriftStimmtUeberein;
		anschriftStimmtUeberein = newAnschriftStimmtUeberein;
		boolean oldAnschriftStimmtUebereinESet = anschriftStimmtUebereinESet;
		anschriftStimmtUebereinESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.ANGABEN_ZU_JUGENDLICH_KONTAKTFORMULAR_TYPE__ANSCHRIFT_STIMMT_UEBEREIN, oldAnschriftStimmtUeberein, anschriftStimmtUeberein, !oldAnschriftStimmtUebereinESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetAnschriftStimmtUeberein() {
		boolean oldAnschriftStimmtUeberein = anschriftStimmtUeberein;
		boolean oldAnschriftStimmtUebereinESet = anschriftStimmtUebereinESet;
		anschriftStimmtUeberein = ANSCHRIFT_STIMMT_UEBEREIN_EDEFAULT;
		anschriftStimmtUebereinESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ErziehungshilfePackage.ANGABEN_ZU_JUGENDLICH_KONTAKTFORMULAR_TYPE__ANSCHRIFT_STIMMT_UEBEREIN, oldAnschriftStimmtUeberein, ANSCHRIFT_STIMMT_UEBEREIN_EDEFAULT, oldAnschriftStimmtUebereinESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetAnschriftStimmtUeberein() {
		return anschriftStimmtUebereinESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostalischeInlandsanschriftBasisType getAktuelleAnschrift() {
		return aktuelleAnschrift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAktuelleAnschrift(PostalischeInlandsanschriftBasisType newAktuelleAnschrift, NotificationChain msgs) {
		PostalischeInlandsanschriftBasisType oldAktuelleAnschrift = aktuelleAnschrift;
		aktuelleAnschrift = newAktuelleAnschrift;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.ANGABEN_ZU_JUGENDLICH_KONTAKTFORMULAR_TYPE__AKTUELLE_ANSCHRIFT, oldAktuelleAnschrift, newAktuelleAnschrift);
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
	public void setAktuelleAnschrift(PostalischeInlandsanschriftBasisType newAktuelleAnschrift) {
		if (newAktuelleAnschrift != aktuelleAnschrift) {
			NotificationChain msgs = null;
			if (aktuelleAnschrift != null)
				msgs = ((InternalEObject)aktuelleAnschrift).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ErziehungshilfePackage.ANGABEN_ZU_JUGENDLICH_KONTAKTFORMULAR_TYPE__AKTUELLE_ANSCHRIFT, null, msgs);
			if (newAktuelleAnschrift != null)
				msgs = ((InternalEObject)newAktuelleAnschrift).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ErziehungshilfePackage.ANGABEN_ZU_JUGENDLICH_KONTAKTFORMULAR_TYPE__AKTUELLE_ANSCHRIFT, null, msgs);
			msgs = basicSetAktuelleAnschrift(newAktuelleAnschrift, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.ANGABEN_ZU_JUGENDLICH_KONTAKTFORMULAR_TYPE__AKTUELLE_ANSCHRIFT, newAktuelleAnschrift, newAktuelleAnschrift));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ErziehungshilfePackage.ANGABEN_ZU_JUGENDLICH_KONTAKTFORMULAR_TYPE__NAME_DER_DES_JUGENDLICHEN:
				return ((InternalEList<?>)getNameDerDesJugendlichen()).basicRemove(otherEnd, msgs);
			case ErziehungshilfePackage.ANGABEN_ZU_JUGENDLICH_KONTAKTFORMULAR_TYPE__AKTUELLE_ANSCHRIFT:
				return basicSetAktuelleAnschrift(null, msgs);
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
			case ErziehungshilfePackage.ANGABEN_ZU_JUGENDLICH_KONTAKTFORMULAR_TYPE__NAME_DER_DES_JUGENDLICHEN:
				return getNameDerDesJugendlichen();
			case ErziehungshilfePackage.ANGABEN_ZU_JUGENDLICH_KONTAKTFORMULAR_TYPE__GEBURTSDATUM:
				return getGeburtsdatum();
			case ErziehungshilfePackage.ANGABEN_ZU_JUGENDLICH_KONTAKTFORMULAR_TYPE__ANSCHRIFT_STIMMT_UEBEREIN:
				return isAnschriftStimmtUeberein();
			case ErziehungshilfePackage.ANGABEN_ZU_JUGENDLICH_KONTAKTFORMULAR_TYPE__AKTUELLE_ANSCHRIFT:
				return getAktuelleAnschrift();
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
			case ErziehungshilfePackage.ANGABEN_ZU_JUGENDLICH_KONTAKTFORMULAR_TYPE__NAME_DER_DES_JUGENDLICHEN:
				getNameDerDesJugendlichen().clear();
				getNameDerDesJugendlichen().addAll((Collection<? extends NameNatuerlichePersonVornameVerpflichtendType>)newValue);
				return;
			case ErziehungshilfePackage.ANGABEN_ZU_JUGENDLICH_KONTAKTFORMULAR_TYPE__GEBURTSDATUM:
				setGeburtsdatum((XMLGregorianCalendar)newValue);
				return;
			case ErziehungshilfePackage.ANGABEN_ZU_JUGENDLICH_KONTAKTFORMULAR_TYPE__ANSCHRIFT_STIMMT_UEBEREIN:
				setAnschriftStimmtUeberein((Boolean)newValue);
				return;
			case ErziehungshilfePackage.ANGABEN_ZU_JUGENDLICH_KONTAKTFORMULAR_TYPE__AKTUELLE_ANSCHRIFT:
				setAktuelleAnschrift((PostalischeInlandsanschriftBasisType)newValue);
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
			case ErziehungshilfePackage.ANGABEN_ZU_JUGENDLICH_KONTAKTFORMULAR_TYPE__NAME_DER_DES_JUGENDLICHEN:
				getNameDerDesJugendlichen().clear();
				return;
			case ErziehungshilfePackage.ANGABEN_ZU_JUGENDLICH_KONTAKTFORMULAR_TYPE__GEBURTSDATUM:
				setGeburtsdatum(GEBURTSDATUM_EDEFAULT);
				return;
			case ErziehungshilfePackage.ANGABEN_ZU_JUGENDLICH_KONTAKTFORMULAR_TYPE__ANSCHRIFT_STIMMT_UEBEREIN:
				unsetAnschriftStimmtUeberein();
				return;
			case ErziehungshilfePackage.ANGABEN_ZU_JUGENDLICH_KONTAKTFORMULAR_TYPE__AKTUELLE_ANSCHRIFT:
				setAktuelleAnschrift((PostalischeInlandsanschriftBasisType)null);
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
			case ErziehungshilfePackage.ANGABEN_ZU_JUGENDLICH_KONTAKTFORMULAR_TYPE__NAME_DER_DES_JUGENDLICHEN:
				return nameDerDesJugendlichen != null && !nameDerDesJugendlichen.isEmpty();
			case ErziehungshilfePackage.ANGABEN_ZU_JUGENDLICH_KONTAKTFORMULAR_TYPE__GEBURTSDATUM:
				return GEBURTSDATUM_EDEFAULT == null ? geburtsdatum != null : !GEBURTSDATUM_EDEFAULT.equals(geburtsdatum);
			case ErziehungshilfePackage.ANGABEN_ZU_JUGENDLICH_KONTAKTFORMULAR_TYPE__ANSCHRIFT_STIMMT_UEBEREIN:
				return isSetAnschriftStimmtUeberein();
			case ErziehungshilfePackage.ANGABEN_ZU_JUGENDLICH_KONTAKTFORMULAR_TYPE__AKTUELLE_ANSCHRIFT:
				return aktuelleAnschrift != null;
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
		result.append(" (geburtsdatum: ");
		result.append(geburtsdatum);
		result.append(", anschriftStimmtUeberein: ");
		if (anschriftStimmtUebereinESet) result.append(anschriftStimmtUeberein); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //AngabenZuJugendlichKontaktformularTypeImpl
