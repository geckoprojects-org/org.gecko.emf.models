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

import de.xoev.xfamilie.baukasten._1.baukasten.ErreichbarkeitType;
import de.xoev.xfamilie.baukasten._1.baukasten.GeburtGeburtsortOptionalType;
import de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonVornameVerpflichtendType;
import de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftBasisType;

import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenElternteilEingliederungType;
import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Angaben Elternteil Eingliederung Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.AngabenElternteilEingliederungTypeImpl#getNamen <em>Namen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.AngabenElternteilEingliederungTypeImpl#getAngabenGeburtElternteil <em>Angaben Geburt Elternteil</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.AngabenElternteilEingliederungTypeImpl#getAktuelleAnschrift <em>Aktuelle Anschrift</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.AngabenElternteilEingliederungTypeImpl#getKontaktdaten <em>Kontaktdaten</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AngabenElternteilEingliederungTypeImpl extends MinimalEObjectImpl.Container implements AngabenElternteilEingliederungType {
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
	 * The cached value of the '{@link #getAngabenGeburtElternteil() <em>Angaben Geburt Elternteil</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngabenGeburtElternteil()
	 * @generated
	 * @ordered
	 */
	protected GeburtGeburtsortOptionalType angabenGeburtElternteil;

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
	 * The cached value of the '{@link #getKontaktdaten() <em>Kontaktdaten</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKontaktdaten()
	 * @generated
	 * @ordered
	 */
	protected ErreichbarkeitType kontaktdaten;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AngabenElternteilEingliederungTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ErziehungshilfePackage.Literals.ANGABEN_ELTERNTEIL_EINGLIEDERUNG_TYPE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.ANGABEN_ELTERNTEIL_EINGLIEDERUNG_TYPE__NAMEN, oldNamen, newNamen);
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
				msgs = ((InternalEObject)namen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ErziehungshilfePackage.ANGABEN_ELTERNTEIL_EINGLIEDERUNG_TYPE__NAMEN, null, msgs);
			if (newNamen != null)
				msgs = ((InternalEObject)newNamen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ErziehungshilfePackage.ANGABEN_ELTERNTEIL_EINGLIEDERUNG_TYPE__NAMEN, null, msgs);
			msgs = basicSetNamen(newNamen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.ANGABEN_ELTERNTEIL_EINGLIEDERUNG_TYPE__NAMEN, newNamen, newNamen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeburtGeburtsortOptionalType getAngabenGeburtElternteil() {
		return angabenGeburtElternteil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngabenGeburtElternteil(GeburtGeburtsortOptionalType newAngabenGeburtElternteil, NotificationChain msgs) {
		GeburtGeburtsortOptionalType oldAngabenGeburtElternteil = angabenGeburtElternteil;
		angabenGeburtElternteil = newAngabenGeburtElternteil;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.ANGABEN_ELTERNTEIL_EINGLIEDERUNG_TYPE__ANGABEN_GEBURT_ELTERNTEIL, oldAngabenGeburtElternteil, newAngabenGeburtElternteil);
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
	public void setAngabenGeburtElternteil(GeburtGeburtsortOptionalType newAngabenGeburtElternteil) {
		if (newAngabenGeburtElternteil != angabenGeburtElternteil) {
			NotificationChain msgs = null;
			if (angabenGeburtElternteil != null)
				msgs = ((InternalEObject)angabenGeburtElternteil).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ErziehungshilfePackage.ANGABEN_ELTERNTEIL_EINGLIEDERUNG_TYPE__ANGABEN_GEBURT_ELTERNTEIL, null, msgs);
			if (newAngabenGeburtElternteil != null)
				msgs = ((InternalEObject)newAngabenGeburtElternteil).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ErziehungshilfePackage.ANGABEN_ELTERNTEIL_EINGLIEDERUNG_TYPE__ANGABEN_GEBURT_ELTERNTEIL, null, msgs);
			msgs = basicSetAngabenGeburtElternteil(newAngabenGeburtElternteil, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.ANGABEN_ELTERNTEIL_EINGLIEDERUNG_TYPE__ANGABEN_GEBURT_ELTERNTEIL, newAngabenGeburtElternteil, newAngabenGeburtElternteil));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.ANGABEN_ELTERNTEIL_EINGLIEDERUNG_TYPE__AKTUELLE_ANSCHRIFT, oldAktuelleAnschrift, newAktuelleAnschrift);
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
				msgs = ((InternalEObject)aktuelleAnschrift).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ErziehungshilfePackage.ANGABEN_ELTERNTEIL_EINGLIEDERUNG_TYPE__AKTUELLE_ANSCHRIFT, null, msgs);
			if (newAktuelleAnschrift != null)
				msgs = ((InternalEObject)newAktuelleAnschrift).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ErziehungshilfePackage.ANGABEN_ELTERNTEIL_EINGLIEDERUNG_TYPE__AKTUELLE_ANSCHRIFT, null, msgs);
			msgs = basicSetAktuelleAnschrift(newAktuelleAnschrift, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.ANGABEN_ELTERNTEIL_EINGLIEDERUNG_TYPE__AKTUELLE_ANSCHRIFT, newAktuelleAnschrift, newAktuelleAnschrift));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ErreichbarkeitType getKontaktdaten() {
		return kontaktdaten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKontaktdaten(ErreichbarkeitType newKontaktdaten, NotificationChain msgs) {
		ErreichbarkeitType oldKontaktdaten = kontaktdaten;
		kontaktdaten = newKontaktdaten;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.ANGABEN_ELTERNTEIL_EINGLIEDERUNG_TYPE__KONTAKTDATEN, oldKontaktdaten, newKontaktdaten);
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
	public void setKontaktdaten(ErreichbarkeitType newKontaktdaten) {
		if (newKontaktdaten != kontaktdaten) {
			NotificationChain msgs = null;
			if (kontaktdaten != null)
				msgs = ((InternalEObject)kontaktdaten).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ErziehungshilfePackage.ANGABEN_ELTERNTEIL_EINGLIEDERUNG_TYPE__KONTAKTDATEN, null, msgs);
			if (newKontaktdaten != null)
				msgs = ((InternalEObject)newKontaktdaten).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ErziehungshilfePackage.ANGABEN_ELTERNTEIL_EINGLIEDERUNG_TYPE__KONTAKTDATEN, null, msgs);
			msgs = basicSetKontaktdaten(newKontaktdaten, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.ANGABEN_ELTERNTEIL_EINGLIEDERUNG_TYPE__KONTAKTDATEN, newKontaktdaten, newKontaktdaten));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ErziehungshilfePackage.ANGABEN_ELTERNTEIL_EINGLIEDERUNG_TYPE__NAMEN:
				return basicSetNamen(null, msgs);
			case ErziehungshilfePackage.ANGABEN_ELTERNTEIL_EINGLIEDERUNG_TYPE__ANGABEN_GEBURT_ELTERNTEIL:
				return basicSetAngabenGeburtElternteil(null, msgs);
			case ErziehungshilfePackage.ANGABEN_ELTERNTEIL_EINGLIEDERUNG_TYPE__AKTUELLE_ANSCHRIFT:
				return basicSetAktuelleAnschrift(null, msgs);
			case ErziehungshilfePackage.ANGABEN_ELTERNTEIL_EINGLIEDERUNG_TYPE__KONTAKTDATEN:
				return basicSetKontaktdaten(null, msgs);
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
			case ErziehungshilfePackage.ANGABEN_ELTERNTEIL_EINGLIEDERUNG_TYPE__NAMEN:
				return getNamen();
			case ErziehungshilfePackage.ANGABEN_ELTERNTEIL_EINGLIEDERUNG_TYPE__ANGABEN_GEBURT_ELTERNTEIL:
				return getAngabenGeburtElternteil();
			case ErziehungshilfePackage.ANGABEN_ELTERNTEIL_EINGLIEDERUNG_TYPE__AKTUELLE_ANSCHRIFT:
				return getAktuelleAnschrift();
			case ErziehungshilfePackage.ANGABEN_ELTERNTEIL_EINGLIEDERUNG_TYPE__KONTAKTDATEN:
				return getKontaktdaten();
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
			case ErziehungshilfePackage.ANGABEN_ELTERNTEIL_EINGLIEDERUNG_TYPE__NAMEN:
				setNamen((NameNatuerlichePersonVornameVerpflichtendType)newValue);
				return;
			case ErziehungshilfePackage.ANGABEN_ELTERNTEIL_EINGLIEDERUNG_TYPE__ANGABEN_GEBURT_ELTERNTEIL:
				setAngabenGeburtElternteil((GeburtGeburtsortOptionalType)newValue);
				return;
			case ErziehungshilfePackage.ANGABEN_ELTERNTEIL_EINGLIEDERUNG_TYPE__AKTUELLE_ANSCHRIFT:
				setAktuelleAnschrift((PostalischeInlandsanschriftBasisType)newValue);
				return;
			case ErziehungshilfePackage.ANGABEN_ELTERNTEIL_EINGLIEDERUNG_TYPE__KONTAKTDATEN:
				setKontaktdaten((ErreichbarkeitType)newValue);
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
			case ErziehungshilfePackage.ANGABEN_ELTERNTEIL_EINGLIEDERUNG_TYPE__NAMEN:
				setNamen((NameNatuerlichePersonVornameVerpflichtendType)null);
				return;
			case ErziehungshilfePackage.ANGABEN_ELTERNTEIL_EINGLIEDERUNG_TYPE__ANGABEN_GEBURT_ELTERNTEIL:
				setAngabenGeburtElternteil((GeburtGeburtsortOptionalType)null);
				return;
			case ErziehungshilfePackage.ANGABEN_ELTERNTEIL_EINGLIEDERUNG_TYPE__AKTUELLE_ANSCHRIFT:
				setAktuelleAnschrift((PostalischeInlandsanschriftBasisType)null);
				return;
			case ErziehungshilfePackage.ANGABEN_ELTERNTEIL_EINGLIEDERUNG_TYPE__KONTAKTDATEN:
				setKontaktdaten((ErreichbarkeitType)null);
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
			case ErziehungshilfePackage.ANGABEN_ELTERNTEIL_EINGLIEDERUNG_TYPE__NAMEN:
				return namen != null;
			case ErziehungshilfePackage.ANGABEN_ELTERNTEIL_EINGLIEDERUNG_TYPE__ANGABEN_GEBURT_ELTERNTEIL:
				return angabenGeburtElternteil != null;
			case ErziehungshilfePackage.ANGABEN_ELTERNTEIL_EINGLIEDERUNG_TYPE__AKTUELLE_ANSCHRIFT:
				return aktuelleAnschrift != null;
			case ErziehungshilfePackage.ANGABEN_ELTERNTEIL_EINGLIEDERUNG_TYPE__KONTAKTDATEN:
				return kontaktdaten != null;
		}
		return super.eIsSet(featureID);
	}

} //AngabenElternteilEingliederungTypeImpl
