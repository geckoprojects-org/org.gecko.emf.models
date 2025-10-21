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
import de.online.adv.namespaces.adv.sk.xml.skadv.AdditionalSymbolizersType;
import de.online.adv.namespaces.adv.sk.xml.skadv.AdditionalSymbolizersType1;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Additional Symbolizers Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.AdditionalSymbolizersTypeImpl#getAdditionalSymbolizers <em>Additional Symbolizers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdditionalSymbolizersTypeImpl extends MinimalEObjectImpl.Container implements AdditionalSymbolizersType {
	/**
	 * The cached value of the '{@link #getAdditionalSymbolizers() <em>Additional Symbolizers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalSymbolizers()
	 * @generated
	 * @ordered
	 */
	protected AdditionalSymbolizersType1 additionalSymbolizers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdditionalSymbolizersTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AAAPackage.eINSTANCE.getAdditionalSymbolizersType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdditionalSymbolizersType1 getAdditionalSymbolizers() {
		return additionalSymbolizers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdditionalSymbolizers(AdditionalSymbolizersType1 newAdditionalSymbolizers, NotificationChain msgs) {
		AdditionalSymbolizersType1 oldAdditionalSymbolizers = additionalSymbolizers;
		additionalSymbolizers = newAdditionalSymbolizers;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AAAPackage.ADDITIONAL_SYMBOLIZERS_TYPE__ADDITIONAL_SYMBOLIZERS, oldAdditionalSymbolizers, newAdditionalSymbolizers);
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
	public void setAdditionalSymbolizers(AdditionalSymbolizersType1 newAdditionalSymbolizers) {
		if (newAdditionalSymbolizers != additionalSymbolizers) {
			NotificationChain msgs = null;
			if (additionalSymbolizers != null)
				msgs = ((InternalEObject)additionalSymbolizers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AAAPackage.ADDITIONAL_SYMBOLIZERS_TYPE__ADDITIONAL_SYMBOLIZERS, null, msgs);
			if (newAdditionalSymbolizers != null)
				msgs = ((InternalEObject)newAdditionalSymbolizers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AAAPackage.ADDITIONAL_SYMBOLIZERS_TYPE__ADDITIONAL_SYMBOLIZERS, null, msgs);
			msgs = basicSetAdditionalSymbolizers(newAdditionalSymbolizers, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.ADDITIONAL_SYMBOLIZERS_TYPE__ADDITIONAL_SYMBOLIZERS, newAdditionalSymbolizers, newAdditionalSymbolizers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AAAPackage.ADDITIONAL_SYMBOLIZERS_TYPE__ADDITIONAL_SYMBOLIZERS:
				return basicSetAdditionalSymbolizers(null, msgs);
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
			case AAAPackage.ADDITIONAL_SYMBOLIZERS_TYPE__ADDITIONAL_SYMBOLIZERS:
				return getAdditionalSymbolizers();
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
			case AAAPackage.ADDITIONAL_SYMBOLIZERS_TYPE__ADDITIONAL_SYMBOLIZERS:
				setAdditionalSymbolizers((AdditionalSymbolizersType1)newValue);
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
			case AAAPackage.ADDITIONAL_SYMBOLIZERS_TYPE__ADDITIONAL_SYMBOLIZERS:
				setAdditionalSymbolizers((AdditionalSymbolizersType1)null);
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
			case AAAPackage.ADDITIONAL_SYMBOLIZERS_TYPE__ADDITIONAL_SYMBOLIZERS:
				return additionalSymbolizers != null;
		}
		return super.eIsSet(featureID);
	}

} //AdditionalSymbolizersTypeImpl
