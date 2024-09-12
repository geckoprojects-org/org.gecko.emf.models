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

import org.isotc211._2005.gmd.EXGeographicDescriptionType;
import org.isotc211._2005.gmd.GMDPackage;
import org.isotc211._2005.gmd.MDIdentifierPropertyType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EX Geographic Description Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.impl.EXGeographicDescriptionTypeImpl#getGeographicIdentifier <em>Geographic Identifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EXGeographicDescriptionTypeImpl extends AbstractEXGeographicExtentTypeImpl implements EXGeographicDescriptionType {
	/**
	 * The cached value of the '{@link #getGeographicIdentifier() <em>Geographic Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeographicIdentifier()
	 * @generated
	 * @ordered
	 */
	protected MDIdentifierPropertyType geographicIdentifier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EXGeographicDescriptionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMDPackage.eINSTANCE.getEXGeographicDescriptionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDIdentifierPropertyType getGeographicIdentifier() {
		return geographicIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeographicIdentifier(MDIdentifierPropertyType newGeographicIdentifier, NotificationChain msgs) {
		MDIdentifierPropertyType oldGeographicIdentifier = geographicIdentifier;
		geographicIdentifier = newGeographicIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.EX_GEOGRAPHIC_DESCRIPTION_TYPE__GEOGRAPHIC_IDENTIFIER, oldGeographicIdentifier, newGeographicIdentifier);
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
	public void setGeographicIdentifier(MDIdentifierPropertyType newGeographicIdentifier) {
		if (newGeographicIdentifier != geographicIdentifier) {
			NotificationChain msgs = null;
			if (geographicIdentifier != null)
				msgs = ((InternalEObject)geographicIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.EX_GEOGRAPHIC_DESCRIPTION_TYPE__GEOGRAPHIC_IDENTIFIER, null, msgs);
			if (newGeographicIdentifier != null)
				msgs = ((InternalEObject)newGeographicIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.EX_GEOGRAPHIC_DESCRIPTION_TYPE__GEOGRAPHIC_IDENTIFIER, null, msgs);
			msgs = basicSetGeographicIdentifier(newGeographicIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.EX_GEOGRAPHIC_DESCRIPTION_TYPE__GEOGRAPHIC_IDENTIFIER, newGeographicIdentifier, newGeographicIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMDPackage.EX_GEOGRAPHIC_DESCRIPTION_TYPE__GEOGRAPHIC_IDENTIFIER:
				return basicSetGeographicIdentifier(null, msgs);
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
			case GMDPackage.EX_GEOGRAPHIC_DESCRIPTION_TYPE__GEOGRAPHIC_IDENTIFIER:
				return getGeographicIdentifier();
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
			case GMDPackage.EX_GEOGRAPHIC_DESCRIPTION_TYPE__GEOGRAPHIC_IDENTIFIER:
				setGeographicIdentifier((MDIdentifierPropertyType)newValue);
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
			case GMDPackage.EX_GEOGRAPHIC_DESCRIPTION_TYPE__GEOGRAPHIC_IDENTIFIER:
				setGeographicIdentifier((MDIdentifierPropertyType)null);
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
			case GMDPackage.EX_GEOGRAPHIC_DESCRIPTION_TYPE__GEOGRAPHIC_IDENTIFIER:
				return geographicIdentifier != null;
		}
		return super.eIsSet(featureID);
	}

} //EXGeographicDescriptionTypeImpl
