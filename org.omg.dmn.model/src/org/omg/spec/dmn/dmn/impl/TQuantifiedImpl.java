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
package org.omg.spec.dmn.dmn.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.omg.spec.dmn.dmn.DMNPackage;
import org.omg.spec.dmn.dmn.TChildExpression;
import org.omg.spec.dmn.dmn.TQuantified;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TQuantified</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.TQuantifiedImpl#getSatisfies <em>Satisfies</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TQuantifiedImpl extends TIteratorImpl implements TQuantified {
	/**
	 * The cached value of the '{@link #getSatisfies() <em>Satisfies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSatisfies()
	 * @generated
	 * @ordered
	 */
	protected TChildExpression satisfies;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TQuantifiedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DMNPackage.Literals.TQUANTIFIED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TChildExpression getSatisfies() {
		return satisfies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSatisfies(TChildExpression newSatisfies, NotificationChain msgs) {
		TChildExpression oldSatisfies = satisfies;
		satisfies = newSatisfies;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DMNPackage.TQUANTIFIED__SATISFIES, oldSatisfies, newSatisfies);
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
	public void setSatisfies(TChildExpression newSatisfies) {
		if (newSatisfies != satisfies) {
			NotificationChain msgs = null;
			if (satisfies != null)
				msgs = ((InternalEObject)satisfies).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DMNPackage.TQUANTIFIED__SATISFIES, null, msgs);
			if (newSatisfies != null)
				msgs = ((InternalEObject)newSatisfies).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DMNPackage.TQUANTIFIED__SATISFIES, null, msgs);
			msgs = basicSetSatisfies(newSatisfies, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DMNPackage.TQUANTIFIED__SATISFIES, newSatisfies, newSatisfies));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DMNPackage.TQUANTIFIED__SATISFIES:
				return basicSetSatisfies(null, msgs);
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
			case DMNPackage.TQUANTIFIED__SATISFIES:
				return getSatisfies();
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
			case DMNPackage.TQUANTIFIED__SATISFIES:
				setSatisfies((TChildExpression)newValue);
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
			case DMNPackage.TQUANTIFIED__SATISFIES:
				setSatisfies((TChildExpression)null);
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
			case DMNPackage.TQUANTIFIED__SATISFIES:
				return satisfies != null;
		}
		return super.eIsSet(featureID);
	}

} //TQuantifiedImpl
