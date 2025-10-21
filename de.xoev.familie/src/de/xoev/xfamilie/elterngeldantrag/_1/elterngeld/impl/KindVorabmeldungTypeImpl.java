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

import de.xoev.xfamilie.baukasten._1.baukasten.GeburtGeburtsortOptionalType;
import de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonType;

import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KindVorabmeldungType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Kind Vorabmeldung Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.KindVorabmeldungTypeImpl#getNameKind <em>Name Kind</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.KindVorabmeldungTypeImpl#getGeburtsdatum <em>Geburtsdatum</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KindVorabmeldungTypeImpl extends MinimalEObjectImpl.Container implements KindVorabmeldungType {
	/**
	 * The cached value of the '{@link #getNameKind() <em>Name Kind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameKind()
	 * @generated
	 * @ordered
	 */
	protected NameNatuerlichePersonType nameKind;

	/**
	 * The cached value of the '{@link #getGeburtsdatum() <em>Geburtsdatum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeburtsdatum()
	 * @generated
	 * @ordered
	 */
	protected GeburtGeburtsortOptionalType geburtsdatum;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KindVorabmeldungTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ElterngeldPackage.eINSTANCE.getKindVorabmeldungType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NameNatuerlichePersonType getNameKind() {
		return nameKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNameKind(NameNatuerlichePersonType newNameKind, NotificationChain msgs) {
		NameNatuerlichePersonType oldNameKind = nameKind;
		nameKind = newNameKind;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.KIND_VORABMELDUNG_TYPE__NAME_KIND, oldNameKind, newNameKind);
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
	public void setNameKind(NameNatuerlichePersonType newNameKind) {
		if (newNameKind != nameKind) {
			NotificationChain msgs = null;
			if (nameKind != null)
				msgs = ((InternalEObject)nameKind).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.KIND_VORABMELDUNG_TYPE__NAME_KIND, null, msgs);
			if (newNameKind != null)
				msgs = ((InternalEObject)newNameKind).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.KIND_VORABMELDUNG_TYPE__NAME_KIND, null, msgs);
			msgs = basicSetNameKind(newNameKind, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.KIND_VORABMELDUNG_TYPE__NAME_KIND, newNameKind, newNameKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeburtGeburtsortOptionalType getGeburtsdatum() {
		return geburtsdatum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeburtsdatum(GeburtGeburtsortOptionalType newGeburtsdatum, NotificationChain msgs) {
		GeburtGeburtsortOptionalType oldGeburtsdatum = geburtsdatum;
		geburtsdatum = newGeburtsdatum;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.KIND_VORABMELDUNG_TYPE__GEBURTSDATUM, oldGeburtsdatum, newGeburtsdatum);
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
	public void setGeburtsdatum(GeburtGeburtsortOptionalType newGeburtsdatum) {
		if (newGeburtsdatum != geburtsdatum) {
			NotificationChain msgs = null;
			if (geburtsdatum != null)
				msgs = ((InternalEObject)geburtsdatum).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.KIND_VORABMELDUNG_TYPE__GEBURTSDATUM, null, msgs);
			if (newGeburtsdatum != null)
				msgs = ((InternalEObject)newGeburtsdatum).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.KIND_VORABMELDUNG_TYPE__GEBURTSDATUM, null, msgs);
			msgs = basicSetGeburtsdatum(newGeburtsdatum, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.KIND_VORABMELDUNG_TYPE__GEBURTSDATUM, newGeburtsdatum, newGeburtsdatum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ElterngeldPackage.KIND_VORABMELDUNG_TYPE__NAME_KIND:
				return basicSetNameKind(null, msgs);
			case ElterngeldPackage.KIND_VORABMELDUNG_TYPE__GEBURTSDATUM:
				return basicSetGeburtsdatum(null, msgs);
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
			case ElterngeldPackage.KIND_VORABMELDUNG_TYPE__NAME_KIND:
				return getNameKind();
			case ElterngeldPackage.KIND_VORABMELDUNG_TYPE__GEBURTSDATUM:
				return getGeburtsdatum();
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
			case ElterngeldPackage.KIND_VORABMELDUNG_TYPE__NAME_KIND:
				setNameKind((NameNatuerlichePersonType)newValue);
				return;
			case ElterngeldPackage.KIND_VORABMELDUNG_TYPE__GEBURTSDATUM:
				setGeburtsdatum((GeburtGeburtsortOptionalType)newValue);
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
			case ElterngeldPackage.KIND_VORABMELDUNG_TYPE__NAME_KIND:
				setNameKind((NameNatuerlichePersonType)null);
				return;
			case ElterngeldPackage.KIND_VORABMELDUNG_TYPE__GEBURTSDATUM:
				setGeburtsdatum((GeburtGeburtsortOptionalType)null);
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
			case ElterngeldPackage.KIND_VORABMELDUNG_TYPE__NAME_KIND:
				return nameKind != null;
			case ElterngeldPackage.KIND_VORABMELDUNG_TYPE__GEBURTSDATUM:
				return geburtsdatum != null;
		}
		return super.eIsSet(featureID);
	}

} //KindVorabmeldungTypeImpl
