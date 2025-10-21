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
package de.xoev.xfamilie.baukasten._1.baukasten.impl;

import de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage;
import de.xoev.xfamilie.baukasten._1.baukasten.HausnummernBisType;
import de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftGebaeudeanschriftType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Postalische Inlandsanschrift Gebaeudeanschrift Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.PostalischeInlandsanschriftGebaeudeanschriftTypeImpl#getHausnummernBis <em>Hausnummern Bis</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PostalischeInlandsanschriftGebaeudeanschriftTypeImpl extends PostalischeInlandsanschriftBasisTypeImpl implements PostalischeInlandsanschriftGebaeudeanschriftType {
	/**
	 * The cached value of the '{@link #getHausnummernBis() <em>Hausnummern Bis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHausnummernBis()
	 * @generated
	 * @ordered
	 */
	protected HausnummernBisType hausnummernBis;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PostalischeInlandsanschriftGebaeudeanschriftTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BaukastenPackage.Literals.POSTALISCHE_INLANDSANSCHRIFT_GEBAEUDEANSCHRIFT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HausnummernBisType getHausnummernBis() {
		return hausnummernBis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHausnummernBis(HausnummernBisType newHausnummernBis, NotificationChain msgs) {
		HausnummernBisType oldHausnummernBis = hausnummernBis;
		hausnummernBis = newHausnummernBis;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_GEBAEUDEANSCHRIFT_TYPE__HAUSNUMMERN_BIS, oldHausnummernBis, newHausnummernBis);
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
	public void setHausnummernBis(HausnummernBisType newHausnummernBis) {
		if (newHausnummernBis != hausnummernBis) {
			NotificationChain msgs = null;
			if (hausnummernBis != null)
				msgs = ((InternalEObject)hausnummernBis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_GEBAEUDEANSCHRIFT_TYPE__HAUSNUMMERN_BIS, null, msgs);
			if (newHausnummernBis != null)
				msgs = ((InternalEObject)newHausnummernBis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_GEBAEUDEANSCHRIFT_TYPE__HAUSNUMMERN_BIS, null, msgs);
			msgs = basicSetHausnummernBis(newHausnummernBis, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_GEBAEUDEANSCHRIFT_TYPE__HAUSNUMMERN_BIS, newHausnummernBis, newHausnummernBis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_GEBAEUDEANSCHRIFT_TYPE__HAUSNUMMERN_BIS:
				return basicSetHausnummernBis(null, msgs);
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
			case BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_GEBAEUDEANSCHRIFT_TYPE__HAUSNUMMERN_BIS:
				return getHausnummernBis();
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
			case BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_GEBAEUDEANSCHRIFT_TYPE__HAUSNUMMERN_BIS:
				setHausnummernBis((HausnummernBisType)newValue);
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
			case BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_GEBAEUDEANSCHRIFT_TYPE__HAUSNUMMERN_BIS:
				setHausnummernBis((HausnummernBisType)null);
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
			case BaukastenPackage.POSTALISCHE_INLANDSANSCHRIFT_GEBAEUDEANSCHRIFT_TYPE__HAUSNUMMERN_BIS:
				return hausnummernBis != null;
		}
		return super.eIsSet(featureID);
	}

} //PostalischeInlandsanschriftGebaeudeanschriftTypeImpl
