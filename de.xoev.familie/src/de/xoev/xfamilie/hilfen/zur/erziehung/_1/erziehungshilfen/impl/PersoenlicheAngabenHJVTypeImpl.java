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

import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErreichbarkeitHZEType;
import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage;
import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenHJVType;

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
 * An implementation of the model object '<em><b>Persoenliche Angaben HJV Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.PersoenlicheAngabenHJVTypeImpl#getNamen <em>Namen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.PersoenlicheAngabenHJVTypeImpl#getGeburtsdatum <em>Geburtsdatum</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.PersoenlicheAngabenHJVTypeImpl#getAktuelleAnschrift <em>Aktuelle Anschrift</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.PersoenlicheAngabenHJVTypeImpl#isAnschriftsaenderung <em>Anschriftsaenderung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.PersoenlicheAngabenHJVTypeImpl#isWeichtAnschriftAb <em>Weicht Anschrift Ab</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.PersoenlicheAngabenHJVTypeImpl#getAbweichendeAnschrift <em>Abweichende Anschrift</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.PersoenlicheAngabenHJVTypeImpl#getKontaktdaten <em>Kontaktdaten</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.PersoenlicheAngabenHJVTypeImpl#getAufenthaltsortSonstige <em>Aufenthaltsort Sonstige</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersoenlicheAngabenHJVTypeImpl extends MinimalEObjectImpl.Container implements PersoenlicheAngabenHJVType {
	/**
	 * The cached value of the '{@link #getNamen() <em>Namen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamen()
	 * @generated
	 * @ordered
	 */
	protected NameNatuerlichePersonVornameVerpflichtendType namen;

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
	 * The default value of the '{@link #isWeichtAnschriftAb() <em>Weicht Anschrift Ab</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWeichtAnschriftAb()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WEICHT_ANSCHRIFT_AB_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isWeichtAnschriftAb() <em>Weicht Anschrift Ab</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWeichtAnschriftAb()
	 * @generated
	 * @ordered
	 */
	protected boolean weichtAnschriftAb = WEICHT_ANSCHRIFT_AB_EDEFAULT;

	/**
	 * This is true if the Weicht Anschrift Ab attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean weichtAnschriftAbESet;

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
	 * The cached value of the '{@link #getKontaktdaten() <em>Kontaktdaten</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKontaktdaten()
	 * @generated
	 * @ordered
	 */
	protected EList<ErreichbarkeitHZEType> kontaktdaten;

	/**
	 * The default value of the '{@link #getAufenthaltsortSonstige() <em>Aufenthaltsort Sonstige</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAufenthaltsortSonstige()
	 * @generated
	 * @ordered
	 */
	protected static final String AUFENTHALTSORT_SONSTIGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAufenthaltsortSonstige() <em>Aufenthaltsort Sonstige</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAufenthaltsortSonstige()
	 * @generated
	 * @ordered
	 */
	protected String aufenthaltsortSonstige = AUFENTHALTSORT_SONSTIGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersoenlicheAngabenHJVTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ErziehungshilfePackage.Literals.PERSOENLICHE_ANGABEN_HJV_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NameNatuerlichePersonVornameVerpflichtendType getNamen() {
		return namen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNamen(NameNatuerlichePersonVornameVerpflichtendType newNamen, NotificationChain msgs) {
		NameNatuerlichePersonVornameVerpflichtendType oldNamen = namen;
		namen = newNamen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.PERSOENLICHE_ANGABEN_HJV_TYPE__NAMEN, oldNamen, newNamen);
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
	public void setNamen(NameNatuerlichePersonVornameVerpflichtendType newNamen) {
		if (newNamen != namen) {
			NotificationChain msgs = null;
			if (namen != null)
				msgs = ((InternalEObject)namen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ErziehungshilfePackage.PERSOENLICHE_ANGABEN_HJV_TYPE__NAMEN, null, msgs);
			if (newNamen != null)
				msgs = ((InternalEObject)newNamen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ErziehungshilfePackage.PERSOENLICHE_ANGABEN_HJV_TYPE__NAMEN, null, msgs);
			msgs = basicSetNamen(newNamen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.PERSOENLICHE_ANGABEN_HJV_TYPE__NAMEN, newNamen, newNamen));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.PERSOENLICHE_ANGABEN_HJV_TYPE__GEBURTSDATUM, oldGeburtsdatum, geburtsdatum));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.PERSOENLICHE_ANGABEN_HJV_TYPE__AKTUELLE_ANSCHRIFT, oldAktuelleAnschrift, newAktuelleAnschrift);
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
				msgs = ((InternalEObject)aktuelleAnschrift).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ErziehungshilfePackage.PERSOENLICHE_ANGABEN_HJV_TYPE__AKTUELLE_ANSCHRIFT, null, msgs);
			if (newAktuelleAnschrift != null)
				msgs = ((InternalEObject)newAktuelleAnschrift).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ErziehungshilfePackage.PERSOENLICHE_ANGABEN_HJV_TYPE__AKTUELLE_ANSCHRIFT, null, msgs);
			msgs = basicSetAktuelleAnschrift(newAktuelleAnschrift, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.PERSOENLICHE_ANGABEN_HJV_TYPE__AKTUELLE_ANSCHRIFT, newAktuelleAnschrift, newAktuelleAnschrift));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.PERSOENLICHE_ANGABEN_HJV_TYPE__ANSCHRIFTSAENDERUNG, oldAnschriftsaenderung, anschriftsaenderung, !oldAnschriftsaenderungESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, ErziehungshilfePackage.PERSOENLICHE_ANGABEN_HJV_TYPE__ANSCHRIFTSAENDERUNG, oldAnschriftsaenderung, ANSCHRIFTSAENDERUNG_EDEFAULT, oldAnschriftsaenderungESet));
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
	public boolean isWeichtAnschriftAb() {
		return weichtAnschriftAb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWeichtAnschriftAb(boolean newWeichtAnschriftAb) {
		boolean oldWeichtAnschriftAb = weichtAnschriftAb;
		weichtAnschriftAb = newWeichtAnschriftAb;
		boolean oldWeichtAnschriftAbESet = weichtAnschriftAbESet;
		weichtAnschriftAbESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.PERSOENLICHE_ANGABEN_HJV_TYPE__WEICHT_ANSCHRIFT_AB, oldWeichtAnschriftAb, weichtAnschriftAb, !oldWeichtAnschriftAbESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetWeichtAnschriftAb() {
		boolean oldWeichtAnschriftAb = weichtAnschriftAb;
		boolean oldWeichtAnschriftAbESet = weichtAnschriftAbESet;
		weichtAnschriftAb = WEICHT_ANSCHRIFT_AB_EDEFAULT;
		weichtAnschriftAbESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ErziehungshilfePackage.PERSOENLICHE_ANGABEN_HJV_TYPE__WEICHT_ANSCHRIFT_AB, oldWeichtAnschriftAb, WEICHT_ANSCHRIFT_AB_EDEFAULT, oldWeichtAnschriftAbESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetWeichtAnschriftAb() {
		return weichtAnschriftAbESet;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.PERSOENLICHE_ANGABEN_HJV_TYPE__ABWEICHENDE_ANSCHRIFT, oldAbweichendeAnschrift, newAbweichendeAnschrift);
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
				msgs = ((InternalEObject)abweichendeAnschrift).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ErziehungshilfePackage.PERSOENLICHE_ANGABEN_HJV_TYPE__ABWEICHENDE_ANSCHRIFT, null, msgs);
			if (newAbweichendeAnschrift != null)
				msgs = ((InternalEObject)newAbweichendeAnschrift).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ErziehungshilfePackage.PERSOENLICHE_ANGABEN_HJV_TYPE__ABWEICHENDE_ANSCHRIFT, null, msgs);
			msgs = basicSetAbweichendeAnschrift(newAbweichendeAnschrift, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.PERSOENLICHE_ANGABEN_HJV_TYPE__ABWEICHENDE_ANSCHRIFT, newAbweichendeAnschrift, newAbweichendeAnschrift));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ErreichbarkeitHZEType> getKontaktdaten() {
		if (kontaktdaten == null) {
			kontaktdaten = new EObjectContainmentEList<ErreichbarkeitHZEType>(ErreichbarkeitHZEType.class, this, ErziehungshilfePackage.PERSOENLICHE_ANGABEN_HJV_TYPE__KONTAKTDATEN);
		}
		return kontaktdaten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAufenthaltsortSonstige() {
		return aufenthaltsortSonstige;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAufenthaltsortSonstige(String newAufenthaltsortSonstige) {
		String oldAufenthaltsortSonstige = aufenthaltsortSonstige;
		aufenthaltsortSonstige = newAufenthaltsortSonstige;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.PERSOENLICHE_ANGABEN_HJV_TYPE__AUFENTHALTSORT_SONSTIGE, oldAufenthaltsortSonstige, aufenthaltsortSonstige));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ErziehungshilfePackage.PERSOENLICHE_ANGABEN_HJV_TYPE__NAMEN:
				return basicSetNamen(null, msgs);
			case ErziehungshilfePackage.PERSOENLICHE_ANGABEN_HJV_TYPE__AKTUELLE_ANSCHRIFT:
				return basicSetAktuelleAnschrift(null, msgs);
			case ErziehungshilfePackage.PERSOENLICHE_ANGABEN_HJV_TYPE__ABWEICHENDE_ANSCHRIFT:
				return basicSetAbweichendeAnschrift(null, msgs);
			case ErziehungshilfePackage.PERSOENLICHE_ANGABEN_HJV_TYPE__KONTAKTDATEN:
				return ((InternalEList<?>)getKontaktdaten()).basicRemove(otherEnd, msgs);
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
			case ErziehungshilfePackage.PERSOENLICHE_ANGABEN_HJV_TYPE__NAMEN:
				return getNamen();
			case ErziehungshilfePackage.PERSOENLICHE_ANGABEN_HJV_TYPE__GEBURTSDATUM:
				return getGeburtsdatum();
			case ErziehungshilfePackage.PERSOENLICHE_ANGABEN_HJV_TYPE__AKTUELLE_ANSCHRIFT:
				return getAktuelleAnschrift();
			case ErziehungshilfePackage.PERSOENLICHE_ANGABEN_HJV_TYPE__ANSCHRIFTSAENDERUNG:
				return isAnschriftsaenderung();
			case ErziehungshilfePackage.PERSOENLICHE_ANGABEN_HJV_TYPE__WEICHT_ANSCHRIFT_AB:
				return isWeichtAnschriftAb();
			case ErziehungshilfePackage.PERSOENLICHE_ANGABEN_HJV_TYPE__ABWEICHENDE_ANSCHRIFT:
				return getAbweichendeAnschrift();
			case ErziehungshilfePackage.PERSOENLICHE_ANGABEN_HJV_TYPE__KONTAKTDATEN:
				return getKontaktdaten();
			case ErziehungshilfePackage.PERSOENLICHE_ANGABEN_HJV_TYPE__AUFENTHALTSORT_SONSTIGE:
				return getAufenthaltsortSonstige();
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
			case ErziehungshilfePackage.PERSOENLICHE_ANGABEN_HJV_TYPE__NAMEN:
				setNamen((NameNatuerlichePersonVornameVerpflichtendType)newValue);
				return;
			case ErziehungshilfePackage.PERSOENLICHE_ANGABEN_HJV_TYPE__GEBURTSDATUM:
				setGeburtsdatum((XMLGregorianCalendar)newValue);
				return;
			case ErziehungshilfePackage.PERSOENLICHE_ANGABEN_HJV_TYPE__AKTUELLE_ANSCHRIFT:
				setAktuelleAnschrift((PostalischeInlandsanschriftBasisType)newValue);
				return;
			case ErziehungshilfePackage.PERSOENLICHE_ANGABEN_HJV_TYPE__ANSCHRIFTSAENDERUNG:
				setAnschriftsaenderung((Boolean)newValue);
				return;
			case ErziehungshilfePackage.PERSOENLICHE_ANGABEN_HJV_TYPE__WEICHT_ANSCHRIFT_AB:
				setWeichtAnschriftAb((Boolean)newValue);
				return;
			case ErziehungshilfePackage.PERSOENLICHE_ANGABEN_HJV_TYPE__ABWEICHENDE_ANSCHRIFT:
				setAbweichendeAnschrift((PostalischeInlandsanschriftBasisType)newValue);
				return;
			case ErziehungshilfePackage.PERSOENLICHE_ANGABEN_HJV_TYPE__KONTAKTDATEN:
				getKontaktdaten().clear();
				getKontaktdaten().addAll((Collection<? extends ErreichbarkeitHZEType>)newValue);
				return;
			case ErziehungshilfePackage.PERSOENLICHE_ANGABEN_HJV_TYPE__AUFENTHALTSORT_SONSTIGE:
				setAufenthaltsortSonstige((String)newValue);
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
			case ErziehungshilfePackage.PERSOENLICHE_ANGABEN_HJV_TYPE__NAMEN:
				setNamen((NameNatuerlichePersonVornameVerpflichtendType)null);
				return;
			case ErziehungshilfePackage.PERSOENLICHE_ANGABEN_HJV_TYPE__GEBURTSDATUM:
				setGeburtsdatum(GEBURTSDATUM_EDEFAULT);
				return;
			case ErziehungshilfePackage.PERSOENLICHE_ANGABEN_HJV_TYPE__AKTUELLE_ANSCHRIFT:
				setAktuelleAnschrift((PostalischeInlandsanschriftBasisType)null);
				return;
			case ErziehungshilfePackage.PERSOENLICHE_ANGABEN_HJV_TYPE__ANSCHRIFTSAENDERUNG:
				unsetAnschriftsaenderung();
				return;
			case ErziehungshilfePackage.PERSOENLICHE_ANGABEN_HJV_TYPE__WEICHT_ANSCHRIFT_AB:
				unsetWeichtAnschriftAb();
				return;
			case ErziehungshilfePackage.PERSOENLICHE_ANGABEN_HJV_TYPE__ABWEICHENDE_ANSCHRIFT:
				setAbweichendeAnschrift((PostalischeInlandsanschriftBasisType)null);
				return;
			case ErziehungshilfePackage.PERSOENLICHE_ANGABEN_HJV_TYPE__KONTAKTDATEN:
				getKontaktdaten().clear();
				return;
			case ErziehungshilfePackage.PERSOENLICHE_ANGABEN_HJV_TYPE__AUFENTHALTSORT_SONSTIGE:
				setAufenthaltsortSonstige(AUFENTHALTSORT_SONSTIGE_EDEFAULT);
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
			case ErziehungshilfePackage.PERSOENLICHE_ANGABEN_HJV_TYPE__NAMEN:
				return namen != null;
			case ErziehungshilfePackage.PERSOENLICHE_ANGABEN_HJV_TYPE__GEBURTSDATUM:
				return GEBURTSDATUM_EDEFAULT == null ? geburtsdatum != null : !GEBURTSDATUM_EDEFAULT.equals(geburtsdatum);
			case ErziehungshilfePackage.PERSOENLICHE_ANGABEN_HJV_TYPE__AKTUELLE_ANSCHRIFT:
				return aktuelleAnschrift != null;
			case ErziehungshilfePackage.PERSOENLICHE_ANGABEN_HJV_TYPE__ANSCHRIFTSAENDERUNG:
				return isSetAnschriftsaenderung();
			case ErziehungshilfePackage.PERSOENLICHE_ANGABEN_HJV_TYPE__WEICHT_ANSCHRIFT_AB:
				return isSetWeichtAnschriftAb();
			case ErziehungshilfePackage.PERSOENLICHE_ANGABEN_HJV_TYPE__ABWEICHENDE_ANSCHRIFT:
				return abweichendeAnschrift != null;
			case ErziehungshilfePackage.PERSOENLICHE_ANGABEN_HJV_TYPE__KONTAKTDATEN:
				return kontaktdaten != null && !kontaktdaten.isEmpty();
			case ErziehungshilfePackage.PERSOENLICHE_ANGABEN_HJV_TYPE__AUFENTHALTSORT_SONSTIGE:
				return AUFENTHALTSORT_SONSTIGE_EDEFAULT == null ? aufenthaltsortSonstige != null : !AUFENTHALTSORT_SONSTIGE_EDEFAULT.equals(aufenthaltsortSonstige);
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
		result.append(", weichtAnschriftAb: ");
		if (weichtAnschriftAbESet) result.append(weichtAnschriftAb); else result.append("<unset>");
		result.append(", aufenthaltsortSonstige: ");
		result.append(aufenthaltsortSonstige);
		result.append(')');
		return result.toString();
	}

} //PersoenlicheAngabenHJVTypeImpl
