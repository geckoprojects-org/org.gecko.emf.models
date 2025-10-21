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
import de.online.adv.namespaces.adv.sk.xml.skadv.SolidStrokeType;
import de.online.adv.namespaces.adv.sk.xml.skadv.StrokeType4;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stroke Type4</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.StrokeType4Impl#getSolidStroke <em>Solid Stroke</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StrokeType4Impl extends MinimalEObjectImpl.Container implements StrokeType4 {
	/**
	 * The cached value of the '{@link #getSolidStroke() <em>Solid Stroke</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolidStroke()
	 * @generated
	 * @ordered
	 */
	protected SolidStrokeType solidStroke;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StrokeType4Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AAAPackage.eINSTANCE.getStrokeType4();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SolidStrokeType getSolidStroke() {
		return solidStroke;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSolidStroke(SolidStrokeType newSolidStroke, NotificationChain msgs) {
		SolidStrokeType oldSolidStroke = solidStroke;
		solidStroke = newSolidStroke;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AAAPackage.STROKE_TYPE4__SOLID_STROKE, oldSolidStroke, newSolidStroke);
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
	public void setSolidStroke(SolidStrokeType newSolidStroke) {
		if (newSolidStroke != solidStroke) {
			NotificationChain msgs = null;
			if (solidStroke != null)
				msgs = ((InternalEObject)solidStroke).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AAAPackage.STROKE_TYPE4__SOLID_STROKE, null, msgs);
			if (newSolidStroke != null)
				msgs = ((InternalEObject)newSolidStroke).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AAAPackage.STROKE_TYPE4__SOLID_STROKE, null, msgs);
			msgs = basicSetSolidStroke(newSolidStroke, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.STROKE_TYPE4__SOLID_STROKE, newSolidStroke, newSolidStroke));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AAAPackage.STROKE_TYPE4__SOLID_STROKE:
				return basicSetSolidStroke(null, msgs);
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
			case AAAPackage.STROKE_TYPE4__SOLID_STROKE:
				return getSolidStroke();
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
			case AAAPackage.STROKE_TYPE4__SOLID_STROKE:
				setSolidStroke((SolidStrokeType)newValue);
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
			case AAAPackage.STROKE_TYPE4__SOLID_STROKE:
				setSolidStroke((SolidStrokeType)null);
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
			case AAAPackage.STROKE_TYPE4__SOLID_STROKE:
				return solidStroke != null;
		}
		return super.eIsSet(featureID);
	}

} //StrokeType4Impl
