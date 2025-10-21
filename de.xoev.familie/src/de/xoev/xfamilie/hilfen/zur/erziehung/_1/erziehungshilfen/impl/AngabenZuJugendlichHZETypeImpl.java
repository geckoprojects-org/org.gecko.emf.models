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

import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenZuJugendlichHZEType;
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
 * An implementation of the model object '<em><b>Angaben Zu Jugendlich HZE Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.AngabenZuJugendlichHZETypeImpl#getNameDerDesJugendlichen <em>Name Der Des Jugendlichen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.AngabenZuJugendlichHZETypeImpl#getGeburtsdatum <em>Geburtsdatum</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.AngabenZuJugendlichHZETypeImpl#getAktuelleAnschrift <em>Aktuelle Anschrift</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.AngabenZuJugendlichHZETypeImpl#isAnschriftsaenderung <em>Anschriftsaenderung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.AngabenZuJugendlichHZETypeImpl#getAbweichendeAnschrift <em>Abweichende Anschrift</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AngabenZuJugendlichHZETypeImpl extends MinimalEObjectImpl.Container implements AngabenZuJugendlichHZEType {
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
	 * The cached value of the '{@link #getAktuelleAnschrift() <em>Aktuelle Anschrift</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAktuelleAnschrift()
	 * @generated
	 * @ordered
	 */
	protected PostalischeInlandsanschriftBasisType aktuelleAnschrift;

	/**
	 * The default value of the '{@link #isAnschriftsaenderung() <em>Anschriftsaenderung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAnschriftsaenderung()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ANSCHRIFTSAENDERUNG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAnschriftsaenderung() <em>Anschriftsaenderung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAnschriftsaenderung()
	 * @generated
	 * @ordered
	 */
	protected boolean anschriftsaenderung = ANSCHRIFTSAENDERUNG_EDEFAULT;

	/**
	 * This is true if the Anschriftsaenderung attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean anschriftsaenderungESet;

	/**
	 * The cached value of the '{@link #getAbweichendeAnschrift() <em>Abweichende Anschrift</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbweichendeAnschrift()
	 * @generated
	 * @ordered
	 */
	protected PostalischeInlandsanschriftBasisType abweichendeAnschrift;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AngabenZuJugendlichHZETypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ErziehungshilfePackage.Literals.ANGABEN_ZU_JUGENDLICH_HZE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NameNatuerlichePersonVornameVerpflichtendType> getNameDerDesJugendlichen() {
		if (nameDerDesJugendlichen == null) {
			nameDerDesJugendlichen = new EObjectContainmentEList<NameNatuerlichePersonVornameVerpflichtendType>(NameNatuerlichePersonVornameVerpflichtendType.class, this, ErziehungshilfePackage.ANGABEN_ZU_JUGENDLICH_HZE_TYPE__NAME_DER_DES_JUGENDLICHEN);
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
			eNotify(new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.ANGABEN_ZU_JUGENDLICH_HZE_TYPE__GEBURTSDATUM, oldGeburtsdatum, geburtsdatum));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.ANGABEN_ZU_JUGENDLICH_HZE_TYPE__AKTUELLE_ANSCHRIFT, oldAktuelleAnschrift, newAktuelleAnschrift);
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
				msgs = ((InternalEObject)aktuelleAnschrift).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ErziehungshilfePackage.ANGABEN_ZU_JUGENDLICH_HZE_TYPE__AKTUELLE_ANSCHRIFT, null, msgs);
			if (newAktuelleAnschrift != null)
				msgs = ((InternalEObject)newAktuelleAnschrift).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ErziehungshilfePackage.ANGABEN_ZU_JUGENDLICH_HZE_TYPE__AKTUELLE_ANSCHRIFT, null, msgs);
			msgs = basicSetAktuelleAnschrift(newAktuelleAnschrift, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.ANGABEN_ZU_JUGENDLICH_HZE_TYPE__AKTUELLE_ANSCHRIFT, newAktuelleAnschrift, newAktuelleAnschrift));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAnschriftsaenderung() {
		return anschriftsaenderung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnschriftsaenderung(boolean newAnschriftsaenderung) {
		boolean oldAnschriftsaenderung = anschriftsaenderung;
		anschriftsaenderung = newAnschriftsaenderung;
		boolean oldAnschriftsaenderungESet = anschriftsaenderungESet;
		anschriftsaenderungESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.ANGABEN_ZU_JUGENDLICH_HZE_TYPE__ANSCHRIFTSAENDERUNG, oldAnschriftsaenderung, anschriftsaenderung, !oldAnschriftsaenderungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetAnschriftsaenderung() {
		boolean oldAnschriftsaenderung = anschriftsaenderung;
		boolean oldAnschriftsaenderungESet = anschriftsaenderungESet;
		anschriftsaenderung = ANSCHRIFTSAENDERUNG_EDEFAULT;
		anschriftsaenderungESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ErziehungshilfePackage.ANGABEN_ZU_JUGENDLICH_HZE_TYPE__ANSCHRIFTSAENDERUNG, oldAnschriftsaenderung, ANSCHRIFTSAENDERUNG_EDEFAULT, oldAnschriftsaenderungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetAnschriftsaenderung() {
		return anschriftsaenderungESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostalischeInlandsanschriftBasisType getAbweichendeAnschrift() {
		return abweichendeAnschrift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbweichendeAnschrift(PostalischeInlandsanschriftBasisType newAbweichendeAnschrift, NotificationChain msgs) {
		PostalischeInlandsanschriftBasisType oldAbweichendeAnschrift = abweichendeAnschrift;
		abweichendeAnschrift = newAbweichendeAnschrift;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.ANGABEN_ZU_JUGENDLICH_HZE_TYPE__ABWEICHENDE_ANSCHRIFT, oldAbweichendeAnschrift, newAbweichendeAnschrift);
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
	public void setAbweichendeAnschrift(PostalischeInlandsanschriftBasisType newAbweichendeAnschrift) {
		if (newAbweichendeAnschrift != abweichendeAnschrift) {
			NotificationChain msgs = null;
			if (abweichendeAnschrift != null)
				msgs = ((InternalEObject)abweichendeAnschrift).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ErziehungshilfePackage.ANGABEN_ZU_JUGENDLICH_HZE_TYPE__ABWEICHENDE_ANSCHRIFT, null, msgs);
			if (newAbweichendeAnschrift != null)
				msgs = ((InternalEObject)newAbweichendeAnschrift).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ErziehungshilfePackage.ANGABEN_ZU_JUGENDLICH_HZE_TYPE__ABWEICHENDE_ANSCHRIFT, null, msgs);
			msgs = basicSetAbweichendeAnschrift(newAbweichendeAnschrift, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.ANGABEN_ZU_JUGENDLICH_HZE_TYPE__ABWEICHENDE_ANSCHRIFT, newAbweichendeAnschrift, newAbweichendeAnschrift));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ErziehungshilfePackage.ANGABEN_ZU_JUGENDLICH_HZE_TYPE__NAME_DER_DES_JUGENDLICHEN:
				return ((InternalEList<?>)getNameDerDesJugendlichen()).basicRemove(otherEnd, msgs);
			case ErziehungshilfePackage.ANGABEN_ZU_JUGENDLICH_HZE_TYPE__AKTUELLE_ANSCHRIFT:
				return basicSetAktuelleAnschrift(null, msgs);
			case ErziehungshilfePackage.ANGABEN_ZU_JUGENDLICH_HZE_TYPE__ABWEICHENDE_ANSCHRIFT:
				return basicSetAbweichendeAnschrift(null, msgs);
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
			case ErziehungshilfePackage.ANGABEN_ZU_JUGENDLICH_HZE_TYPE__NAME_DER_DES_JUGENDLICHEN:
				return getNameDerDesJugendlichen();
			case ErziehungshilfePackage.ANGABEN_ZU_JUGENDLICH_HZE_TYPE__GEBURTSDATUM:
				return getGeburtsdatum();
			case ErziehungshilfePackage.ANGABEN_ZU_JUGENDLICH_HZE_TYPE__AKTUELLE_ANSCHRIFT:
				return getAktuelleAnschrift();
			case ErziehungshilfePackage.ANGABEN_ZU_JUGENDLICH_HZE_TYPE__ANSCHRIFTSAENDERUNG:
				return isAnschriftsaenderung();
			case ErziehungshilfePackage.ANGABEN_ZU_JUGENDLICH_HZE_TYPE__ABWEICHENDE_ANSCHRIFT:
				return getAbweichendeAnschrift();
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
			case ErziehungshilfePackage.ANGABEN_ZU_JUGENDLICH_HZE_TYPE__NAME_DER_DES_JUGENDLICHEN:
				getNameDerDesJugendlichen().clear();
				getNameDerDesJugendlichen().addAll((Collection<? extends NameNatuerlichePersonVornameVerpflichtendType>)newValue);
				return;
			case ErziehungshilfePackage.ANGABEN_ZU_JUGENDLICH_HZE_TYPE__GEBURTSDATUM:
				setGeburtsdatum((XMLGregorianCalendar)newValue);
				return;
			case ErziehungshilfePackage.ANGABEN_ZU_JUGENDLICH_HZE_TYPE__AKTUELLE_ANSCHRIFT:
				setAktuelleAnschrift((PostalischeInlandsanschriftBasisType)newValue);
				return;
			case ErziehungshilfePackage.ANGABEN_ZU_JUGENDLICH_HZE_TYPE__ANSCHRIFTSAENDERUNG:
				setAnschriftsaenderung((Boolean)newValue);
				return;
			case ErziehungshilfePackage.ANGABEN_ZU_JUGENDLICH_HZE_TYPE__ABWEICHENDE_ANSCHRIFT:
				setAbweichendeAnschrift((PostalischeInlandsanschriftBasisType)newValue);
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
			case ErziehungshilfePackage.ANGABEN_ZU_JUGENDLICH_HZE_TYPE__NAME_DER_DES_JUGENDLICHEN:
				getNameDerDesJugendlichen().clear();
				return;
			case ErziehungshilfePackage.ANGABEN_ZU_JUGENDLICH_HZE_TYPE__GEBURTSDATUM:
				setGeburtsdatum(GEBURTSDATUM_EDEFAULT);
				return;
			case ErziehungshilfePackage.ANGABEN_ZU_JUGENDLICH_HZE_TYPE__AKTUELLE_ANSCHRIFT:
				setAktuelleAnschrift((PostalischeInlandsanschriftBasisType)null);
				return;
			case ErziehungshilfePackage.ANGABEN_ZU_JUGENDLICH_HZE_TYPE__ANSCHRIFTSAENDERUNG:
				unsetAnschriftsaenderung();
				return;
			case ErziehungshilfePackage.ANGABEN_ZU_JUGENDLICH_HZE_TYPE__ABWEICHENDE_ANSCHRIFT:
				setAbweichendeAnschrift((PostalischeInlandsanschriftBasisType)null);
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
			case ErziehungshilfePackage.ANGABEN_ZU_JUGENDLICH_HZE_TYPE__NAME_DER_DES_JUGENDLICHEN:
				return nameDerDesJugendlichen != null && !nameDerDesJugendlichen.isEmpty();
			case ErziehungshilfePackage.ANGABEN_ZU_JUGENDLICH_HZE_TYPE__GEBURTSDATUM:
				return GEBURTSDATUM_EDEFAULT == null ? geburtsdatum != null : !GEBURTSDATUM_EDEFAULT.equals(geburtsdatum);
			case ErziehungshilfePackage.ANGABEN_ZU_JUGENDLICH_HZE_TYPE__AKTUELLE_ANSCHRIFT:
				return aktuelleAnschrift != null;
			case ErziehungshilfePackage.ANGABEN_ZU_JUGENDLICH_HZE_TYPE__ANSCHRIFTSAENDERUNG:
				return isSetAnschriftsaenderung();
			case ErziehungshilfePackage.ANGABEN_ZU_JUGENDLICH_HZE_TYPE__ABWEICHENDE_ANSCHRIFT:
				return abweichendeAnschrift != null;
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
		result.append(", anschriftsaenderung: ");
		if (anschriftsaenderungESet) result.append(anschriftsaenderung); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //AngabenZuJugendlichHZETypeImpl
