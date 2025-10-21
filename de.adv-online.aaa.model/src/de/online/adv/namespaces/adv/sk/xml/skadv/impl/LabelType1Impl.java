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
import de.online.adv.namespaces.adv.sk.xml.skadv.LabelType1;
import de.online.adv.namespaces.adv.sk.xml.skadv.LineLabelType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Label Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.LabelType1Impl#getLineLabel <em>Line Label</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LabelType1Impl extends MinimalEObjectImpl.Container implements LabelType1 {
	/**
	 * The cached value of the '{@link #getLineLabel() <em>Line Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineLabel()
	 * @generated
	 * @ordered
	 */
	protected LineLabelType lineLabel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LabelType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AAAPackage.eINSTANCE.getLabelType1();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LineLabelType getLineLabel() {
		return lineLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLineLabel(LineLabelType newLineLabel, NotificationChain msgs) {
		LineLabelType oldLineLabel = lineLabel;
		lineLabel = newLineLabel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AAAPackage.LABEL_TYPE1__LINE_LABEL, oldLineLabel, newLineLabel);
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
	public void setLineLabel(LineLabelType newLineLabel) {
		if (newLineLabel != lineLabel) {
			NotificationChain msgs = null;
			if (lineLabel != null)
				msgs = ((InternalEObject)lineLabel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AAAPackage.LABEL_TYPE1__LINE_LABEL, null, msgs);
			if (newLineLabel != null)
				msgs = ((InternalEObject)newLineLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AAAPackage.LABEL_TYPE1__LINE_LABEL, null, msgs);
			msgs = basicSetLineLabel(newLineLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.LABEL_TYPE1__LINE_LABEL, newLineLabel, newLineLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AAAPackage.LABEL_TYPE1__LINE_LABEL:
				return basicSetLineLabel(null, msgs);
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
			case AAAPackage.LABEL_TYPE1__LINE_LABEL:
				return getLineLabel();
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
			case AAAPackage.LABEL_TYPE1__LINE_LABEL:
				setLineLabel((LineLabelType)newValue);
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
			case AAAPackage.LABEL_TYPE1__LINE_LABEL:
				setLineLabel((LineLabelType)null);
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
			case AAAPackage.LABEL_TYPE1__LINE_LABEL:
				return lineLabel != null;
		}
		return super.eIsSet(featureID);
	}

} //LabelType1Impl
