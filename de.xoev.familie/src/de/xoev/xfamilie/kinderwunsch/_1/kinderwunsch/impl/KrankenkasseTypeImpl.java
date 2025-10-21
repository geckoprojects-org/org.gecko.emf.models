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
package de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl;

import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.CodeVersicherungsartType;

import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage;
import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KrankenkasseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Krankenkasse Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KrankenkasseTypeImpl#getArtKrankenkasse <em>Art Krankenkasse</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KrankenkasseTypeImpl#getNameKrankenkasse <em>Name Krankenkasse</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KrankenkasseTypeImpl#getNameBeihilfestelle <em>Name Beihilfestelle</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KrankenkasseTypeImpl#getNameHeilfuersorge <em>Name Heilfuersorge</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KrankenkasseTypeImpl extends MinimalEObjectImpl.Container implements KrankenkasseType {
	/**
	 * The cached value of the '{@link #getArtKrankenkasse() <em>Art Krankenkasse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtKrankenkasse()
	 * @generated
	 * @ordered
	 */
	protected CodeVersicherungsartType artKrankenkasse;

	/**
	 * The default value of the '{@link #getNameKrankenkasse() <em>Name Krankenkasse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameKrankenkasse()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_KRANKENKASSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameKrankenkasse() <em>Name Krankenkasse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameKrankenkasse()
	 * @generated
	 * @ordered
	 */
	protected String nameKrankenkasse = NAME_KRANKENKASSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNameBeihilfestelle() <em>Name Beihilfestelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameBeihilfestelle()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_BEIHILFESTELLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameBeihilfestelle() <em>Name Beihilfestelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameBeihilfestelle()
	 * @generated
	 * @ordered
	 */
	protected String nameBeihilfestelle = NAME_BEIHILFESTELLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNameHeilfuersorge() <em>Name Heilfuersorge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameHeilfuersorge()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_HEILFUERSORGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameHeilfuersorge() <em>Name Heilfuersorge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameHeilfuersorge()
	 * @generated
	 * @ordered
	 */
	protected String nameHeilfuersorge = NAME_HEILFUERSORGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KrankenkasseTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KinderwunschPackage.Literals.KRANKENKASSE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeVersicherungsartType getArtKrankenkasse() {
		return artKrankenkasse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArtKrankenkasse(CodeVersicherungsartType newArtKrankenkasse, NotificationChain msgs) {
		CodeVersicherungsartType oldArtKrankenkasse = artKrankenkasse;
		artKrankenkasse = newArtKrankenkasse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KinderwunschPackage.KRANKENKASSE_TYPE__ART_KRANKENKASSE, oldArtKrankenkasse, newArtKrankenkasse);
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
	public void setArtKrankenkasse(CodeVersicherungsartType newArtKrankenkasse) {
		if (newArtKrankenkasse != artKrankenkasse) {
			NotificationChain msgs = null;
			if (artKrankenkasse != null)
				msgs = ((InternalEObject)artKrankenkasse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.KRANKENKASSE_TYPE__ART_KRANKENKASSE, null, msgs);
			if (newArtKrankenkasse != null)
				msgs = ((InternalEObject)newArtKrankenkasse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.KRANKENKASSE_TYPE__ART_KRANKENKASSE, null, msgs);
			msgs = basicSetArtKrankenkasse(newArtKrankenkasse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.KRANKENKASSE_TYPE__ART_KRANKENKASSE, newArtKrankenkasse, newArtKrankenkasse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNameKrankenkasse() {
		return nameKrankenkasse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNameKrankenkasse(String newNameKrankenkasse) {
		String oldNameKrankenkasse = nameKrankenkasse;
		nameKrankenkasse = newNameKrankenkasse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.KRANKENKASSE_TYPE__NAME_KRANKENKASSE, oldNameKrankenkasse, nameKrankenkasse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNameBeihilfestelle() {
		return nameBeihilfestelle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNameBeihilfestelle(String newNameBeihilfestelle) {
		String oldNameBeihilfestelle = nameBeihilfestelle;
		nameBeihilfestelle = newNameBeihilfestelle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.KRANKENKASSE_TYPE__NAME_BEIHILFESTELLE, oldNameBeihilfestelle, nameBeihilfestelle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNameHeilfuersorge() {
		return nameHeilfuersorge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNameHeilfuersorge(String newNameHeilfuersorge) {
		String oldNameHeilfuersorge = nameHeilfuersorge;
		nameHeilfuersorge = newNameHeilfuersorge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.KRANKENKASSE_TYPE__NAME_HEILFUERSORGE, oldNameHeilfuersorge, nameHeilfuersorge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KinderwunschPackage.KRANKENKASSE_TYPE__ART_KRANKENKASSE:
				return basicSetArtKrankenkasse(null, msgs);
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
			case KinderwunschPackage.KRANKENKASSE_TYPE__ART_KRANKENKASSE:
				return getArtKrankenkasse();
			case KinderwunschPackage.KRANKENKASSE_TYPE__NAME_KRANKENKASSE:
				return getNameKrankenkasse();
			case KinderwunschPackage.KRANKENKASSE_TYPE__NAME_BEIHILFESTELLE:
				return getNameBeihilfestelle();
			case KinderwunschPackage.KRANKENKASSE_TYPE__NAME_HEILFUERSORGE:
				return getNameHeilfuersorge();
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
			case KinderwunschPackage.KRANKENKASSE_TYPE__ART_KRANKENKASSE:
				setArtKrankenkasse((CodeVersicherungsartType)newValue);
				return;
			case KinderwunschPackage.KRANKENKASSE_TYPE__NAME_KRANKENKASSE:
				setNameKrankenkasse((String)newValue);
				return;
			case KinderwunschPackage.KRANKENKASSE_TYPE__NAME_BEIHILFESTELLE:
				setNameBeihilfestelle((String)newValue);
				return;
			case KinderwunschPackage.KRANKENKASSE_TYPE__NAME_HEILFUERSORGE:
				setNameHeilfuersorge((String)newValue);
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
			case KinderwunschPackage.KRANKENKASSE_TYPE__ART_KRANKENKASSE:
				setArtKrankenkasse((CodeVersicherungsartType)null);
				return;
			case KinderwunschPackage.KRANKENKASSE_TYPE__NAME_KRANKENKASSE:
				setNameKrankenkasse(NAME_KRANKENKASSE_EDEFAULT);
				return;
			case KinderwunschPackage.KRANKENKASSE_TYPE__NAME_BEIHILFESTELLE:
				setNameBeihilfestelle(NAME_BEIHILFESTELLE_EDEFAULT);
				return;
			case KinderwunschPackage.KRANKENKASSE_TYPE__NAME_HEILFUERSORGE:
				setNameHeilfuersorge(NAME_HEILFUERSORGE_EDEFAULT);
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
			case KinderwunschPackage.KRANKENKASSE_TYPE__ART_KRANKENKASSE:
				return artKrankenkasse != null;
			case KinderwunschPackage.KRANKENKASSE_TYPE__NAME_KRANKENKASSE:
				return NAME_KRANKENKASSE_EDEFAULT == null ? nameKrankenkasse != null : !NAME_KRANKENKASSE_EDEFAULT.equals(nameKrankenkasse);
			case KinderwunschPackage.KRANKENKASSE_TYPE__NAME_BEIHILFESTELLE:
				return NAME_BEIHILFESTELLE_EDEFAULT == null ? nameBeihilfestelle != null : !NAME_BEIHILFESTELLE_EDEFAULT.equals(nameBeihilfestelle);
			case KinderwunschPackage.KRANKENKASSE_TYPE__NAME_HEILFUERSORGE:
				return NAME_HEILFUERSORGE_EDEFAULT == null ? nameHeilfuersorge != null : !NAME_HEILFUERSORGE_EDEFAULT.equals(nameHeilfuersorge);
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
		result.append(" (nameKrankenkasse: ");
		result.append(nameKrankenkasse);
		result.append(", nameBeihilfestelle: ");
		result.append(nameBeihilfestelle);
		result.append(", nameHeilfuersorge: ");
		result.append(nameHeilfuersorge);
		result.append(')');
		return result.toString();
	}

} //KrankenkasseTypeImpl
