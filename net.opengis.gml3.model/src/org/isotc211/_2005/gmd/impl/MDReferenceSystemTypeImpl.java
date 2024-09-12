/*
 * Copyright (c) 2012 - 2024 Data In Motion and others.
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
package org.isotc211._2005.gmd.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.isotc211._2005.gco.impl.AbstractObjectTypeImpl;

import org.isotc211._2005.gmd.GMDPackage;
import org.isotc211._2005.gmd.MDReferenceSystemType;
import org.isotc211._2005.gmd.RSIdentifierPropertyType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MD Reference System Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDReferenceSystemTypeImpl#getReferenceSystemIdentifier <em>Reference System Identifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MDReferenceSystemTypeImpl extends AbstractObjectTypeImpl implements MDReferenceSystemType {
	/**
	 * The cached value of the '{@link #getReferenceSystemIdentifier() <em>Reference System Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceSystemIdentifier()
	 * @generated
	 * @ordered
	 */
	protected RSIdentifierPropertyType referenceSystemIdentifier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MDReferenceSystemTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMDPackage.eINSTANCE.getMDReferenceSystemType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RSIdentifierPropertyType getReferenceSystemIdentifier() {
		return referenceSystemIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferenceSystemIdentifier(RSIdentifierPropertyType newReferenceSystemIdentifier, NotificationChain msgs) {
		RSIdentifierPropertyType oldReferenceSystemIdentifier = referenceSystemIdentifier;
		referenceSystemIdentifier = newReferenceSystemIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_REFERENCE_SYSTEM_TYPE__REFERENCE_SYSTEM_IDENTIFIER, oldReferenceSystemIdentifier, newReferenceSystemIdentifier);
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
	public void setReferenceSystemIdentifier(RSIdentifierPropertyType newReferenceSystemIdentifier) {
		if (newReferenceSystemIdentifier != referenceSystemIdentifier) {
			NotificationChain msgs = null;
			if (referenceSystemIdentifier != null)
				msgs = ((InternalEObject)referenceSystemIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_REFERENCE_SYSTEM_TYPE__REFERENCE_SYSTEM_IDENTIFIER, null, msgs);
			if (newReferenceSystemIdentifier != null)
				msgs = ((InternalEObject)newReferenceSystemIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_REFERENCE_SYSTEM_TYPE__REFERENCE_SYSTEM_IDENTIFIER, null, msgs);
			msgs = basicSetReferenceSystemIdentifier(newReferenceSystemIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_REFERENCE_SYSTEM_TYPE__REFERENCE_SYSTEM_IDENTIFIER, newReferenceSystemIdentifier, newReferenceSystemIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMDPackage.MD_REFERENCE_SYSTEM_TYPE__REFERENCE_SYSTEM_IDENTIFIER:
				return basicSetReferenceSystemIdentifier(null, msgs);
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
			case GMDPackage.MD_REFERENCE_SYSTEM_TYPE__REFERENCE_SYSTEM_IDENTIFIER:
				return getReferenceSystemIdentifier();
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
			case GMDPackage.MD_REFERENCE_SYSTEM_TYPE__REFERENCE_SYSTEM_IDENTIFIER:
				setReferenceSystemIdentifier((RSIdentifierPropertyType)newValue);
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
			case GMDPackage.MD_REFERENCE_SYSTEM_TYPE__REFERENCE_SYSTEM_IDENTIFIER:
				setReferenceSystemIdentifier((RSIdentifierPropertyType)null);
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
			case GMDPackage.MD_REFERENCE_SYSTEM_TYPE__REFERENCE_SYSTEM_IDENTIFIER:
				return referenceSystemIdentifier != null;
		}
		return super.eIsSet(featureID);
	}

} //MDReferenceSystemTypeImpl
