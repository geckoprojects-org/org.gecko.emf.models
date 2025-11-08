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
package org.cyclonedx.schema.bom.impl;

import org.cyclonedx.schema.bom.BOMPackage;
import org.cyclonedx.schema.bom.TechnicalLimitationsType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Technical Limitations Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.impl.TechnicalLimitationsTypeImpl#getTechnicalLimitation <em>Technical Limitation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TechnicalLimitationsTypeImpl extends MinimalEObjectImpl.Container implements TechnicalLimitationsType {
	/**
	 * The default value of the '{@link #getTechnicalLimitation() <em>Technical Limitation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnicalLimitation()
	 * @generated
	 * @ordered
	 */
	protected static final String TECHNICAL_LIMITATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTechnicalLimitation() <em>Technical Limitation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnicalLimitation()
	 * @generated
	 * @ordered
	 */
	protected String technicalLimitation = TECHNICAL_LIMITATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TechnicalLimitationsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BOMPackage.eINSTANCE.getTechnicalLimitationsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTechnicalLimitation() {
		return technicalLimitation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTechnicalLimitation(String newTechnicalLimitation) {
		String oldTechnicalLimitation = technicalLimitation;
		technicalLimitation = newTechnicalLimitation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.TECHNICAL_LIMITATIONS_TYPE__TECHNICAL_LIMITATION, oldTechnicalLimitation, technicalLimitation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BOMPackage.TECHNICAL_LIMITATIONS_TYPE__TECHNICAL_LIMITATION:
				return getTechnicalLimitation();
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
			case BOMPackage.TECHNICAL_LIMITATIONS_TYPE__TECHNICAL_LIMITATION:
				setTechnicalLimitation((String)newValue);
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
			case BOMPackage.TECHNICAL_LIMITATIONS_TYPE__TECHNICAL_LIMITATION:
				setTechnicalLimitation(TECHNICAL_LIMITATION_EDEFAULT);
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
			case BOMPackage.TECHNICAL_LIMITATIONS_TYPE__TECHNICAL_LIMITATION:
				return TECHNICAL_LIMITATION_EDEFAULT == null ? technicalLimitation != null : !TECHNICAL_LIMITATION_EDEFAULT.equals(technicalLimitation);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (technicalLimitation: ");
		result.append(technicalLimitation);
		result.append(')');
		return result.toString();
	}

} //TechnicalLimitationsTypeImpl
