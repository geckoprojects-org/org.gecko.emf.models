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
package de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl;

import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZuKindernDerFamilieType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PersonendatenType;

import de.xoev.xfamilie.baukasten._1.baukasten.GeburtOptionalType;
import de.xoev.xfamilie.baukasten._1.baukasten.TeilbekanntesDatumType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Angaben Zu Kindern Der Familie Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AngabenZuKindernDerFamilieTypeImpl#getPersonendaten <em>Personendaten</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AngabenZuKindernDerFamilieTypeImpl#getGeburt <em>Geburt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AngabenZuKindernDerFamilieTypeImpl#getVerhaeltnisKind <em>Verhaeltnis Kind</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AngabenZuKindernDerFamilieTypeImpl#getElternteilDesKindes <em>Elternteil Des Kindes</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AngabenZuKindernDerFamilieTypeImpl#isKindWohnhaftHaushalt <em>Kind Wohnhaft Haushalt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AngabenZuKindernDerFamilieTypeImpl#getKindWohnhaftAlterntive <em>Kind Wohnhaft Alterntive</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AngabenZuKindernDerFamilieTypeImpl#getKindVerstorben <em>Kind Verstorben</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AngabenZuKindernDerFamilieTypeImpl extends MinimalEObjectImpl.Container implements AngabenZuKindernDerFamilieType {
	/**
	 * The cached value of the '{@link #getPersonendaten() <em>Personendaten</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonendaten()
	 * @generated
	 * @ordered
	 */
	protected PersonendatenType personendaten;

	/**
	 * The cached value of the '{@link #getGeburt() <em>Geburt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeburt()
	 * @generated
	 * @ordered
	 */
	protected GeburtOptionalType geburt;

	/**
	 * The default value of the '{@link #getVerhaeltnisKind() <em>Verhaeltnis Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerhaeltnisKind()
	 * @generated
	 * @ordered
	 */
	protected static final String VERHAELTNIS_KIND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVerhaeltnisKind() <em>Verhaeltnis Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerhaeltnisKind()
	 * @generated
	 * @ordered
	 */
	protected String verhaeltnisKind = VERHAELTNIS_KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getElternteilDesKindes() <em>Elternteil Des Kindes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElternteilDesKindes()
	 * @generated
	 * @ordered
	 */
	protected static final String ELTERNTEIL_DES_KINDES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElternteilDesKindes() <em>Elternteil Des Kindes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElternteilDesKindes()
	 * @generated
	 * @ordered
	 */
	protected String elternteilDesKindes = ELTERNTEIL_DES_KINDES_EDEFAULT;

	/**
	 * The default value of the '{@link #isKindWohnhaftHaushalt() <em>Kind Wohnhaft Haushalt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isKindWohnhaftHaushalt()
	 * @generated
	 * @ordered
	 */
	protected static final boolean KIND_WOHNHAFT_HAUSHALT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isKindWohnhaftHaushalt() <em>Kind Wohnhaft Haushalt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isKindWohnhaftHaushalt()
	 * @generated
	 * @ordered
	 */
	protected boolean kindWohnhaftHaushalt = KIND_WOHNHAFT_HAUSHALT_EDEFAULT;

	/**
	 * This is true if the Kind Wohnhaft Haushalt attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean kindWohnhaftHaushaltESet;

	/**
	 * The default value of the '{@link #getKindWohnhaftAlterntive() <em>Kind Wohnhaft Alterntive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKindWohnhaftAlterntive()
	 * @generated
	 * @ordered
	 */
	protected static final String KIND_WOHNHAFT_ALTERNTIVE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKindWohnhaftAlterntive() <em>Kind Wohnhaft Alterntive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKindWohnhaftAlterntive()
	 * @generated
	 * @ordered
	 */
	protected String kindWohnhaftAlterntive = KIND_WOHNHAFT_ALTERNTIVE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getKindVerstorben() <em>Kind Verstorben</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKindVerstorben()
	 * @generated
	 * @ordered
	 */
	protected TeilbekanntesDatumType kindVerstorben;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AngabenZuKindernDerFamilieTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdoptionPackage.Literals.ANGABEN_ZU_KINDERN_DER_FAMILIE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PersonendatenType getPersonendaten() {
		return personendaten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPersonendaten(PersonendatenType newPersonendaten, NotificationChain msgs) {
		PersonendatenType oldPersonendaten = personendaten;
		personendaten = newPersonendaten;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdoptionPackage.ANGABEN_ZU_KINDERN_DER_FAMILIE_TYPE__PERSONENDATEN, oldPersonendaten, newPersonendaten);
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
	public void setPersonendaten(PersonendatenType newPersonendaten) {
		if (newPersonendaten != personendaten) {
			NotificationChain msgs = null;
			if (personendaten != null)
				msgs = ((InternalEObject)personendaten).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ANGABEN_ZU_KINDERN_DER_FAMILIE_TYPE__PERSONENDATEN, null, msgs);
			if (newPersonendaten != null)
				msgs = ((InternalEObject)newPersonendaten).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ANGABEN_ZU_KINDERN_DER_FAMILIE_TYPE__PERSONENDATEN, null, msgs);
			msgs = basicSetPersonendaten(newPersonendaten, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ANGABEN_ZU_KINDERN_DER_FAMILIE_TYPE__PERSONENDATEN, newPersonendaten, newPersonendaten));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeburtOptionalType getGeburt() {
		return geburt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeburt(GeburtOptionalType newGeburt, NotificationChain msgs) {
		GeburtOptionalType oldGeburt = geburt;
		geburt = newGeburt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdoptionPackage.ANGABEN_ZU_KINDERN_DER_FAMILIE_TYPE__GEBURT, oldGeburt, newGeburt);
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
	public void setGeburt(GeburtOptionalType newGeburt) {
		if (newGeburt != geburt) {
			NotificationChain msgs = null;
			if (geburt != null)
				msgs = ((InternalEObject)geburt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ANGABEN_ZU_KINDERN_DER_FAMILIE_TYPE__GEBURT, null, msgs);
			if (newGeburt != null)
				msgs = ((InternalEObject)newGeburt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ANGABEN_ZU_KINDERN_DER_FAMILIE_TYPE__GEBURT, null, msgs);
			msgs = basicSetGeburt(newGeburt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ANGABEN_ZU_KINDERN_DER_FAMILIE_TYPE__GEBURT, newGeburt, newGeburt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVerhaeltnisKind() {
		return verhaeltnisKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVerhaeltnisKind(String newVerhaeltnisKind) {
		String oldVerhaeltnisKind = verhaeltnisKind;
		verhaeltnisKind = newVerhaeltnisKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ANGABEN_ZU_KINDERN_DER_FAMILIE_TYPE__VERHAELTNIS_KIND, oldVerhaeltnisKind, verhaeltnisKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getElternteilDesKindes() {
		return elternteilDesKindes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElternteilDesKindes(String newElternteilDesKindes) {
		String oldElternteilDesKindes = elternteilDesKindes;
		elternteilDesKindes = newElternteilDesKindes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ANGABEN_ZU_KINDERN_DER_FAMILIE_TYPE__ELTERNTEIL_DES_KINDES, oldElternteilDesKindes, elternteilDesKindes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isKindWohnhaftHaushalt() {
		return kindWohnhaftHaushalt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKindWohnhaftHaushalt(boolean newKindWohnhaftHaushalt) {
		boolean oldKindWohnhaftHaushalt = kindWohnhaftHaushalt;
		kindWohnhaftHaushalt = newKindWohnhaftHaushalt;
		boolean oldKindWohnhaftHaushaltESet = kindWohnhaftHaushaltESet;
		kindWohnhaftHaushaltESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ANGABEN_ZU_KINDERN_DER_FAMILIE_TYPE__KIND_WOHNHAFT_HAUSHALT, oldKindWohnhaftHaushalt, kindWohnhaftHaushalt, !oldKindWohnhaftHaushaltESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetKindWohnhaftHaushalt() {
		boolean oldKindWohnhaftHaushalt = kindWohnhaftHaushalt;
		boolean oldKindWohnhaftHaushaltESet = kindWohnhaftHaushaltESet;
		kindWohnhaftHaushalt = KIND_WOHNHAFT_HAUSHALT_EDEFAULT;
		kindWohnhaftHaushaltESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AdoptionPackage.ANGABEN_ZU_KINDERN_DER_FAMILIE_TYPE__KIND_WOHNHAFT_HAUSHALT, oldKindWohnhaftHaushalt, KIND_WOHNHAFT_HAUSHALT_EDEFAULT, oldKindWohnhaftHaushaltESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetKindWohnhaftHaushalt() {
		return kindWohnhaftHaushaltESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKindWohnhaftAlterntive() {
		return kindWohnhaftAlterntive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKindWohnhaftAlterntive(String newKindWohnhaftAlterntive) {
		String oldKindWohnhaftAlterntive = kindWohnhaftAlterntive;
		kindWohnhaftAlterntive = newKindWohnhaftAlterntive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ANGABEN_ZU_KINDERN_DER_FAMILIE_TYPE__KIND_WOHNHAFT_ALTERNTIVE, oldKindWohnhaftAlterntive, kindWohnhaftAlterntive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TeilbekanntesDatumType getKindVerstorben() {
		return kindVerstorben;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKindVerstorben(TeilbekanntesDatumType newKindVerstorben, NotificationChain msgs) {
		TeilbekanntesDatumType oldKindVerstorben = kindVerstorben;
		kindVerstorben = newKindVerstorben;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdoptionPackage.ANGABEN_ZU_KINDERN_DER_FAMILIE_TYPE__KIND_VERSTORBEN, oldKindVerstorben, newKindVerstorben);
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
	public void setKindVerstorben(TeilbekanntesDatumType newKindVerstorben) {
		if (newKindVerstorben != kindVerstorben) {
			NotificationChain msgs = null;
			if (kindVerstorben != null)
				msgs = ((InternalEObject)kindVerstorben).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ANGABEN_ZU_KINDERN_DER_FAMILIE_TYPE__KIND_VERSTORBEN, null, msgs);
			if (newKindVerstorben != null)
				msgs = ((InternalEObject)newKindVerstorben).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ANGABEN_ZU_KINDERN_DER_FAMILIE_TYPE__KIND_VERSTORBEN, null, msgs);
			msgs = basicSetKindVerstorben(newKindVerstorben, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ANGABEN_ZU_KINDERN_DER_FAMILIE_TYPE__KIND_VERSTORBEN, newKindVerstorben, newKindVerstorben));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdoptionPackage.ANGABEN_ZU_KINDERN_DER_FAMILIE_TYPE__PERSONENDATEN:
				return basicSetPersonendaten(null, msgs);
			case AdoptionPackage.ANGABEN_ZU_KINDERN_DER_FAMILIE_TYPE__GEBURT:
				return basicSetGeburt(null, msgs);
			case AdoptionPackage.ANGABEN_ZU_KINDERN_DER_FAMILIE_TYPE__KIND_VERSTORBEN:
				return basicSetKindVerstorben(null, msgs);
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
			case AdoptionPackage.ANGABEN_ZU_KINDERN_DER_FAMILIE_TYPE__PERSONENDATEN:
				return getPersonendaten();
			case AdoptionPackage.ANGABEN_ZU_KINDERN_DER_FAMILIE_TYPE__GEBURT:
				return getGeburt();
			case AdoptionPackage.ANGABEN_ZU_KINDERN_DER_FAMILIE_TYPE__VERHAELTNIS_KIND:
				return getVerhaeltnisKind();
			case AdoptionPackage.ANGABEN_ZU_KINDERN_DER_FAMILIE_TYPE__ELTERNTEIL_DES_KINDES:
				return getElternteilDesKindes();
			case AdoptionPackage.ANGABEN_ZU_KINDERN_DER_FAMILIE_TYPE__KIND_WOHNHAFT_HAUSHALT:
				return isKindWohnhaftHaushalt();
			case AdoptionPackage.ANGABEN_ZU_KINDERN_DER_FAMILIE_TYPE__KIND_WOHNHAFT_ALTERNTIVE:
				return getKindWohnhaftAlterntive();
			case AdoptionPackage.ANGABEN_ZU_KINDERN_DER_FAMILIE_TYPE__KIND_VERSTORBEN:
				return getKindVerstorben();
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
			case AdoptionPackage.ANGABEN_ZU_KINDERN_DER_FAMILIE_TYPE__PERSONENDATEN:
				setPersonendaten((PersonendatenType)newValue);
				return;
			case AdoptionPackage.ANGABEN_ZU_KINDERN_DER_FAMILIE_TYPE__GEBURT:
				setGeburt((GeburtOptionalType)newValue);
				return;
			case AdoptionPackage.ANGABEN_ZU_KINDERN_DER_FAMILIE_TYPE__VERHAELTNIS_KIND:
				setVerhaeltnisKind((String)newValue);
				return;
			case AdoptionPackage.ANGABEN_ZU_KINDERN_DER_FAMILIE_TYPE__ELTERNTEIL_DES_KINDES:
				setElternteilDesKindes((String)newValue);
				return;
			case AdoptionPackage.ANGABEN_ZU_KINDERN_DER_FAMILIE_TYPE__KIND_WOHNHAFT_HAUSHALT:
				setKindWohnhaftHaushalt((Boolean)newValue);
				return;
			case AdoptionPackage.ANGABEN_ZU_KINDERN_DER_FAMILIE_TYPE__KIND_WOHNHAFT_ALTERNTIVE:
				setKindWohnhaftAlterntive((String)newValue);
				return;
			case AdoptionPackage.ANGABEN_ZU_KINDERN_DER_FAMILIE_TYPE__KIND_VERSTORBEN:
				setKindVerstorben((TeilbekanntesDatumType)newValue);
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
			case AdoptionPackage.ANGABEN_ZU_KINDERN_DER_FAMILIE_TYPE__PERSONENDATEN:
				setPersonendaten((PersonendatenType)null);
				return;
			case AdoptionPackage.ANGABEN_ZU_KINDERN_DER_FAMILIE_TYPE__GEBURT:
				setGeburt((GeburtOptionalType)null);
				return;
			case AdoptionPackage.ANGABEN_ZU_KINDERN_DER_FAMILIE_TYPE__VERHAELTNIS_KIND:
				setVerhaeltnisKind(VERHAELTNIS_KIND_EDEFAULT);
				return;
			case AdoptionPackage.ANGABEN_ZU_KINDERN_DER_FAMILIE_TYPE__ELTERNTEIL_DES_KINDES:
				setElternteilDesKindes(ELTERNTEIL_DES_KINDES_EDEFAULT);
				return;
			case AdoptionPackage.ANGABEN_ZU_KINDERN_DER_FAMILIE_TYPE__KIND_WOHNHAFT_HAUSHALT:
				unsetKindWohnhaftHaushalt();
				return;
			case AdoptionPackage.ANGABEN_ZU_KINDERN_DER_FAMILIE_TYPE__KIND_WOHNHAFT_ALTERNTIVE:
				setKindWohnhaftAlterntive(KIND_WOHNHAFT_ALTERNTIVE_EDEFAULT);
				return;
			case AdoptionPackage.ANGABEN_ZU_KINDERN_DER_FAMILIE_TYPE__KIND_VERSTORBEN:
				setKindVerstorben((TeilbekanntesDatumType)null);
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
			case AdoptionPackage.ANGABEN_ZU_KINDERN_DER_FAMILIE_TYPE__PERSONENDATEN:
				return personendaten != null;
			case AdoptionPackage.ANGABEN_ZU_KINDERN_DER_FAMILIE_TYPE__GEBURT:
				return geburt != null;
			case AdoptionPackage.ANGABEN_ZU_KINDERN_DER_FAMILIE_TYPE__VERHAELTNIS_KIND:
				return VERHAELTNIS_KIND_EDEFAULT == null ? verhaeltnisKind != null : !VERHAELTNIS_KIND_EDEFAULT.equals(verhaeltnisKind);
			case AdoptionPackage.ANGABEN_ZU_KINDERN_DER_FAMILIE_TYPE__ELTERNTEIL_DES_KINDES:
				return ELTERNTEIL_DES_KINDES_EDEFAULT == null ? elternteilDesKindes != null : !ELTERNTEIL_DES_KINDES_EDEFAULT.equals(elternteilDesKindes);
			case AdoptionPackage.ANGABEN_ZU_KINDERN_DER_FAMILIE_TYPE__KIND_WOHNHAFT_HAUSHALT:
				return isSetKindWohnhaftHaushalt();
			case AdoptionPackage.ANGABEN_ZU_KINDERN_DER_FAMILIE_TYPE__KIND_WOHNHAFT_ALTERNTIVE:
				return KIND_WOHNHAFT_ALTERNTIVE_EDEFAULT == null ? kindWohnhaftAlterntive != null : !KIND_WOHNHAFT_ALTERNTIVE_EDEFAULT.equals(kindWohnhaftAlterntive);
			case AdoptionPackage.ANGABEN_ZU_KINDERN_DER_FAMILIE_TYPE__KIND_VERSTORBEN:
				return kindVerstorben != null;
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
		result.append(" (verhaeltnisKind: ");
		result.append(verhaeltnisKind);
		result.append(", elternteilDesKindes: ");
		result.append(elternteilDesKindes);
		result.append(", kindWohnhaftHaushalt: ");
		if (kindWohnhaftHaushaltESet) result.append(kindWohnhaftHaushalt); else result.append("<unset>");
		result.append(", kindWohnhaftAlterntive: ");
		result.append(kindWohnhaftAlterntive);
		result.append(')');
		return result.toString();
	}

} //AngabenZuKindernDerFamilieTypeImpl
