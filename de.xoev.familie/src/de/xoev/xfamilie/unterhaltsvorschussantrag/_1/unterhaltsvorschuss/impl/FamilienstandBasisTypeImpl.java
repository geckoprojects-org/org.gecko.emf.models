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
package de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl;

import de.xoev.xfamilie.baukasten._1.baukasten.FamilienstandNachweisbezugType;

import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.FamilienstandBasisType;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LebenssituationBasisType;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Familienstand Basis Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.FamilienstandBasisTypeImpl#getArt <em>Art</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.FamilienstandBasisTypeImpl#getLebenssituation <em>Lebenssituation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FamilienstandBasisTypeImpl extends MinimalEObjectImpl.Container implements FamilienstandBasisType {
	/**
	 * The cached value of the '{@link #getArt() <em>Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArt()
	 * @generated
	 * @ordered
	 */
	protected FamilienstandNachweisbezugType art;

	/**
	 * The cached value of the '{@link #getLebenssituation() <em>Lebenssituation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLebenssituation()
	 * @generated
	 * @ordered
	 */
	protected LebenssituationBasisType lebenssituation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FamilienstandBasisTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnterhaltsvorschussPackage.eINSTANCE.getFamilienstandBasisType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FamilienstandNachweisbezugType getArt() {
		return art;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArt(FamilienstandNachweisbezugType newArt, NotificationChain msgs) {
		FamilienstandNachweisbezugType oldArt = art;
		art = newArt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.FAMILIENSTAND_BASIS_TYPE__ART, oldArt, newArt);
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
	public void setArt(FamilienstandNachweisbezugType newArt) {
		if (newArt != art) {
			NotificationChain msgs = null;
			if (art != null)
				msgs = ((InternalEObject)art).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.FAMILIENSTAND_BASIS_TYPE__ART, null, msgs);
			if (newArt != null)
				msgs = ((InternalEObject)newArt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.FAMILIENSTAND_BASIS_TYPE__ART, null, msgs);
			msgs = basicSetArt(newArt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.FAMILIENSTAND_BASIS_TYPE__ART, newArt, newArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LebenssituationBasisType getLebenssituation() {
		return lebenssituation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLebenssituation(LebenssituationBasisType newLebenssituation, NotificationChain msgs) {
		LebenssituationBasisType oldLebenssituation = lebenssituation;
		lebenssituation = newLebenssituation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.FAMILIENSTAND_BASIS_TYPE__LEBENSSITUATION, oldLebenssituation, newLebenssituation);
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
	public void setLebenssituation(LebenssituationBasisType newLebenssituation) {
		if (newLebenssituation != lebenssituation) {
			NotificationChain msgs = null;
			if (lebenssituation != null)
				msgs = ((InternalEObject)lebenssituation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.FAMILIENSTAND_BASIS_TYPE__LEBENSSITUATION, null, msgs);
			if (newLebenssituation != null)
				msgs = ((InternalEObject)newLebenssituation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.FAMILIENSTAND_BASIS_TYPE__LEBENSSITUATION, null, msgs);
			msgs = basicSetLebenssituation(newLebenssituation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.FAMILIENSTAND_BASIS_TYPE__LEBENSSITUATION, newLebenssituation, newLebenssituation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UnterhaltsvorschussPackage.FAMILIENSTAND_BASIS_TYPE__ART:
				return basicSetArt(null, msgs);
			case UnterhaltsvorschussPackage.FAMILIENSTAND_BASIS_TYPE__LEBENSSITUATION:
				return basicSetLebenssituation(null, msgs);
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
			case UnterhaltsvorschussPackage.FAMILIENSTAND_BASIS_TYPE__ART:
				return getArt();
			case UnterhaltsvorschussPackage.FAMILIENSTAND_BASIS_TYPE__LEBENSSITUATION:
				return getLebenssituation();
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
			case UnterhaltsvorschussPackage.FAMILIENSTAND_BASIS_TYPE__ART:
				setArt((FamilienstandNachweisbezugType)newValue);
				return;
			case UnterhaltsvorschussPackage.FAMILIENSTAND_BASIS_TYPE__LEBENSSITUATION:
				setLebenssituation((LebenssituationBasisType)newValue);
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
			case UnterhaltsvorschussPackage.FAMILIENSTAND_BASIS_TYPE__ART:
				setArt((FamilienstandNachweisbezugType)null);
				return;
			case UnterhaltsvorschussPackage.FAMILIENSTAND_BASIS_TYPE__LEBENSSITUATION:
				setLebenssituation((LebenssituationBasisType)null);
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
			case UnterhaltsvorschussPackage.FAMILIENSTAND_BASIS_TYPE__ART:
				return art != null;
			case UnterhaltsvorschussPackage.FAMILIENSTAND_BASIS_TYPE__LEBENSSITUATION:
				return lebenssituation != null;
		}
		return super.eIsSet(featureID);
	}

} //FamilienstandBasisTypeImpl
