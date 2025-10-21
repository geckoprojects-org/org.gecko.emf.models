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

import de.xoev.xfamilie.baukasten._1.baukasten.impl.AntragsnachrichtTypeImpl;

import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AuszahlungsantragType;
import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage;
import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschVerwendungsnachweispruefung1002Type;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Verwendungsnachweispruefung1002 Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KinderwunschVerwendungsnachweispruefung1002TypeImpl#getAuszahlungsantrag <em>Auszahlungsantrag</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KinderwunschVerwendungsnachweispruefung1002TypeImpl extends AntragsnachrichtTypeImpl implements KinderwunschVerwendungsnachweispruefung1002Type {
	/**
	 * The cached value of the '{@link #getAuszahlungsantrag() <em>Auszahlungsantrag</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuszahlungsantrag()
	 * @generated
	 * @ordered
	 */
	protected AuszahlungsantragType auszahlungsantrag;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KinderwunschVerwendungsnachweispruefung1002TypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KinderwunschPackage.Literals.KINDERWUNSCH_VERWENDUNGSNACHWEISPRUEFUNG1002_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuszahlungsantragType getAuszahlungsantrag() {
		return auszahlungsantrag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuszahlungsantrag(AuszahlungsantragType newAuszahlungsantrag, NotificationChain msgs) {
		AuszahlungsantragType oldAuszahlungsantrag = auszahlungsantrag;
		auszahlungsantrag = newAuszahlungsantrag;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KinderwunschPackage.KINDERWUNSCH_VERWENDUNGSNACHWEISPRUEFUNG1002_TYPE__AUSZAHLUNGSANTRAG, oldAuszahlungsantrag, newAuszahlungsantrag);
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
	public void setAuszahlungsantrag(AuszahlungsantragType newAuszahlungsantrag) {
		if (newAuszahlungsantrag != auszahlungsantrag) {
			NotificationChain msgs = null;
			if (auszahlungsantrag != null)
				msgs = ((InternalEObject)auszahlungsantrag).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.KINDERWUNSCH_VERWENDUNGSNACHWEISPRUEFUNG1002_TYPE__AUSZAHLUNGSANTRAG, null, msgs);
			if (newAuszahlungsantrag != null)
				msgs = ((InternalEObject)newAuszahlungsantrag).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.KINDERWUNSCH_VERWENDUNGSNACHWEISPRUEFUNG1002_TYPE__AUSZAHLUNGSANTRAG, null, msgs);
			msgs = basicSetAuszahlungsantrag(newAuszahlungsantrag, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.KINDERWUNSCH_VERWENDUNGSNACHWEISPRUEFUNG1002_TYPE__AUSZAHLUNGSANTRAG, newAuszahlungsantrag, newAuszahlungsantrag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KinderwunschPackage.KINDERWUNSCH_VERWENDUNGSNACHWEISPRUEFUNG1002_TYPE__AUSZAHLUNGSANTRAG:
				return basicSetAuszahlungsantrag(null, msgs);
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
			case KinderwunschPackage.KINDERWUNSCH_VERWENDUNGSNACHWEISPRUEFUNG1002_TYPE__AUSZAHLUNGSANTRAG:
				return getAuszahlungsantrag();
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
			case KinderwunschPackage.KINDERWUNSCH_VERWENDUNGSNACHWEISPRUEFUNG1002_TYPE__AUSZAHLUNGSANTRAG:
				setAuszahlungsantrag((AuszahlungsantragType)newValue);
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
			case KinderwunschPackage.KINDERWUNSCH_VERWENDUNGSNACHWEISPRUEFUNG1002_TYPE__AUSZAHLUNGSANTRAG:
				setAuszahlungsantrag((AuszahlungsantragType)null);
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
			case KinderwunschPackage.KINDERWUNSCH_VERWENDUNGSNACHWEISPRUEFUNG1002_TYPE__AUSZAHLUNGSANTRAG:
				return auszahlungsantrag != null;
		}
		return super.eIsSet(featureID);
	}

} //KinderwunschVerwendungsnachweispruefung1002TypeImpl
