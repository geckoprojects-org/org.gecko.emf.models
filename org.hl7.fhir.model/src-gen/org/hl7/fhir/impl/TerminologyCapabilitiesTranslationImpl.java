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
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.TerminologyCapabilitiesTranslation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Terminology Capabilities Translation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.TerminologyCapabilitiesTranslationImpl#getNeedsMap <em>Needs Map</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TerminologyCapabilitiesTranslationImpl extends BackboneElementImpl implements TerminologyCapabilitiesTranslation {
	/**
	 * The cached value of the '{@link #getNeedsMap() <em>Needs Map</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeedsMap()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean needsMap;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TerminologyCapabilitiesTranslationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getTerminologyCapabilitiesTranslation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.Boolean getNeedsMap() {
		return needsMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNeedsMap(org.hl7.fhir.Boolean newNeedsMap, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldNeedsMap = needsMap;
		needsMap = newNeedsMap;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.TERMINOLOGY_CAPABILITIES_TRANSLATION__NEEDS_MAP, oldNeedsMap, newNeedsMap);
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
	public void setNeedsMap(org.hl7.fhir.Boolean newNeedsMap) {
		if (newNeedsMap != needsMap) {
			NotificationChain msgs = null;
			if (needsMap != null)
				msgs = ((InternalEObject)needsMap).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.TERMINOLOGY_CAPABILITIES_TRANSLATION__NEEDS_MAP, null, msgs);
			if (newNeedsMap != null)
				msgs = ((InternalEObject)newNeedsMap).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.TERMINOLOGY_CAPABILITIES_TRANSLATION__NEEDS_MAP, null, msgs);
			msgs = basicSetNeedsMap(newNeedsMap, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.TERMINOLOGY_CAPABILITIES_TRANSLATION__NEEDS_MAP, newNeedsMap, newNeedsMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.TERMINOLOGY_CAPABILITIES_TRANSLATION__NEEDS_MAP:
				return basicSetNeedsMap(null, msgs);
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
			case FHIRPackage.TERMINOLOGY_CAPABILITIES_TRANSLATION__NEEDS_MAP:
				return getNeedsMap();
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
			case FHIRPackage.TERMINOLOGY_CAPABILITIES_TRANSLATION__NEEDS_MAP:
				setNeedsMap((org.hl7.fhir.Boolean)newValue);
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
			case FHIRPackage.TERMINOLOGY_CAPABILITIES_TRANSLATION__NEEDS_MAP:
				setNeedsMap((org.hl7.fhir.Boolean)null);
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
			case FHIRPackage.TERMINOLOGY_CAPABILITIES_TRANSLATION__NEEDS_MAP:
				return needsMap != null;
		}
		return super.eIsSet(featureID);
	}

} //TerminologyCapabilitiesTranslationImpl
