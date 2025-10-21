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
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PersonendatenType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.WeiterePersonenImHauhaltType;

import de.xoev.xfamilie.baukasten._1.baukasten.GeburtOptionalType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Weitere Personen Im Hauhalt Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.WeiterePersonenImHauhaltTypeImpl#getPersonendaten <em>Personendaten</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.WeiterePersonenImHauhaltTypeImpl#getBeziehungZurPerson <em>Beziehung Zur Person</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.WeiterePersonenImHauhaltTypeImpl#getGeburt <em>Geburt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WeiterePersonenImHauhaltTypeImpl extends MinimalEObjectImpl.Container implements WeiterePersonenImHauhaltType {
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
	 * The default value of the '{@link #getBeziehungZurPerson() <em>Beziehung Zur Person</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeziehungZurPerson()
	 * @generated
	 * @ordered
	 */
	protected static final String BEZIEHUNG_ZUR_PERSON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBeziehungZurPerson() <em>Beziehung Zur Person</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeziehungZurPerson()
	 * @generated
	 * @ordered
	 */
	protected String beziehungZurPerson = BEZIEHUNG_ZUR_PERSON_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WeiterePersonenImHauhaltTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdoptionPackage.Literals.WEITERE_PERSONEN_IM_HAUHALT_TYPE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdoptionPackage.WEITERE_PERSONEN_IM_HAUHALT_TYPE__PERSONENDATEN, oldPersonendaten, newPersonendaten);
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
				msgs = ((InternalEObject)personendaten).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.WEITERE_PERSONEN_IM_HAUHALT_TYPE__PERSONENDATEN, null, msgs);
			if (newPersonendaten != null)
				msgs = ((InternalEObject)newPersonendaten).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.WEITERE_PERSONEN_IM_HAUHALT_TYPE__PERSONENDATEN, null, msgs);
			msgs = basicSetPersonendaten(newPersonendaten, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.WEITERE_PERSONEN_IM_HAUHALT_TYPE__PERSONENDATEN, newPersonendaten, newPersonendaten));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBeziehungZurPerson() {
		return beziehungZurPerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBeziehungZurPerson(String newBeziehungZurPerson) {
		String oldBeziehungZurPerson = beziehungZurPerson;
		beziehungZurPerson = newBeziehungZurPerson;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.WEITERE_PERSONEN_IM_HAUHALT_TYPE__BEZIEHUNG_ZUR_PERSON, oldBeziehungZurPerson, beziehungZurPerson));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdoptionPackage.WEITERE_PERSONEN_IM_HAUHALT_TYPE__GEBURT, oldGeburt, newGeburt);
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
				msgs = ((InternalEObject)geburt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.WEITERE_PERSONEN_IM_HAUHALT_TYPE__GEBURT, null, msgs);
			if (newGeburt != null)
				msgs = ((InternalEObject)newGeburt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.WEITERE_PERSONEN_IM_HAUHALT_TYPE__GEBURT, null, msgs);
			msgs = basicSetGeburt(newGeburt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.WEITERE_PERSONEN_IM_HAUHALT_TYPE__GEBURT, newGeburt, newGeburt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdoptionPackage.WEITERE_PERSONEN_IM_HAUHALT_TYPE__PERSONENDATEN:
				return basicSetPersonendaten(null, msgs);
			case AdoptionPackage.WEITERE_PERSONEN_IM_HAUHALT_TYPE__GEBURT:
				return basicSetGeburt(null, msgs);
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
			case AdoptionPackage.WEITERE_PERSONEN_IM_HAUHALT_TYPE__PERSONENDATEN:
				return getPersonendaten();
			case AdoptionPackage.WEITERE_PERSONEN_IM_HAUHALT_TYPE__BEZIEHUNG_ZUR_PERSON:
				return getBeziehungZurPerson();
			case AdoptionPackage.WEITERE_PERSONEN_IM_HAUHALT_TYPE__GEBURT:
				return getGeburt();
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
			case AdoptionPackage.WEITERE_PERSONEN_IM_HAUHALT_TYPE__PERSONENDATEN:
				setPersonendaten((PersonendatenType)newValue);
				return;
			case AdoptionPackage.WEITERE_PERSONEN_IM_HAUHALT_TYPE__BEZIEHUNG_ZUR_PERSON:
				setBeziehungZurPerson((String)newValue);
				return;
			case AdoptionPackage.WEITERE_PERSONEN_IM_HAUHALT_TYPE__GEBURT:
				setGeburt((GeburtOptionalType)newValue);
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
			case AdoptionPackage.WEITERE_PERSONEN_IM_HAUHALT_TYPE__PERSONENDATEN:
				setPersonendaten((PersonendatenType)null);
				return;
			case AdoptionPackage.WEITERE_PERSONEN_IM_HAUHALT_TYPE__BEZIEHUNG_ZUR_PERSON:
				setBeziehungZurPerson(BEZIEHUNG_ZUR_PERSON_EDEFAULT);
				return;
			case AdoptionPackage.WEITERE_PERSONEN_IM_HAUHALT_TYPE__GEBURT:
				setGeburt((GeburtOptionalType)null);
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
			case AdoptionPackage.WEITERE_PERSONEN_IM_HAUHALT_TYPE__PERSONENDATEN:
				return personendaten != null;
			case AdoptionPackage.WEITERE_PERSONEN_IM_HAUHALT_TYPE__BEZIEHUNG_ZUR_PERSON:
				return BEZIEHUNG_ZUR_PERSON_EDEFAULT == null ? beziehungZurPerson != null : !BEZIEHUNG_ZUR_PERSON_EDEFAULT.equals(beziehungZurPerson);
			case AdoptionPackage.WEITERE_PERSONEN_IM_HAUHALT_TYPE__GEBURT:
				return geburt != null;
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
		result.append(" (beziehungZurPerson: ");
		result.append(beziehungZurPerson);
		result.append(')');
		return result.toString();
	}

} //WeiterePersonenImHauhaltTypeImpl
