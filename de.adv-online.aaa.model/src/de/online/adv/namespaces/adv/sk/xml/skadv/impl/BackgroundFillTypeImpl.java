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
package de.online.adv.namespaces.adv.sk.xml.skadv.impl;

import de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage;
import de.online.adv.namespaces.adv.sk.xml.skadv.BackgroundFillType;
import de.online.adv.namespaces.adv.sk.xml.skadv.SolidFillType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Background Fill Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.BackgroundFillTypeImpl#getSolidFill <em>Solid Fill</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BackgroundFillTypeImpl extends MinimalEObjectImpl.Container implements BackgroundFillType {
	/**
	 * The cached value of the '{@link #getSolidFill() <em>Solid Fill</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolidFill()
	 * @generated
	 * @ordered
	 */
	protected SolidFillType solidFill;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BackgroundFillTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AAAPackage.eINSTANCE.getBackgroundFillType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SolidFillType getSolidFill() {
		return solidFill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSolidFill(SolidFillType newSolidFill, NotificationChain msgs) {
		SolidFillType oldSolidFill = solidFill;
		solidFill = newSolidFill;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AAAPackage.BACKGROUND_FILL_TYPE__SOLID_FILL, oldSolidFill, newSolidFill);
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
	public void setSolidFill(SolidFillType newSolidFill) {
		if (newSolidFill != solidFill) {
			NotificationChain msgs = null;
			if (solidFill != null)
				msgs = ((InternalEObject)solidFill).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AAAPackage.BACKGROUND_FILL_TYPE__SOLID_FILL, null, msgs);
			if (newSolidFill != null)
				msgs = ((InternalEObject)newSolidFill).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AAAPackage.BACKGROUND_FILL_TYPE__SOLID_FILL, null, msgs);
			msgs = basicSetSolidFill(newSolidFill, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.BACKGROUND_FILL_TYPE__SOLID_FILL, newSolidFill, newSolidFill));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AAAPackage.BACKGROUND_FILL_TYPE__SOLID_FILL:
				return basicSetSolidFill(null, msgs);
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
			case AAAPackage.BACKGROUND_FILL_TYPE__SOLID_FILL:
				return getSolidFill();
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
			case AAAPackage.BACKGROUND_FILL_TYPE__SOLID_FILL:
				setSolidFill((SolidFillType)newValue);
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
			case AAAPackage.BACKGROUND_FILL_TYPE__SOLID_FILL:
				setSolidFill((SolidFillType)null);
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
			case AAAPackage.BACKGROUND_FILL_TYPE__SOLID_FILL:
				return solidFill != null;
		}
		return super.eIsSet(featureID);
	}

} //BackgroundFillTypeImpl
