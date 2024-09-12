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

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir.BodyStructureDistanceFromLandmark;
import org.hl7.fhir.CodeableReference;
import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.Quantity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Body Structure Distance From Landmark</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.BodyStructureDistanceFromLandmarkImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.BodyStructureDistanceFromLandmarkImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BodyStructureDistanceFromLandmarkImpl extends BackboneElementImpl implements BodyStructureDistanceFromLandmark {
	/**
	 * The cached value of the '{@link #getDevice() <em>Device</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevice()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableReference> device;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected EList<Quantity> value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BodyStructureDistanceFromLandmarkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getBodyStructureDistanceFromLandmark();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableReference> getDevice() {
		if (device == null) {
			device = new EObjectContainmentEList<CodeableReference>(CodeableReference.class, this, FHIRPackage.BODY_STRUCTURE_DISTANCE_FROM_LANDMARK__DEVICE);
		}
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Quantity> getValue() {
		if (value == null) {
			value = new EObjectContainmentEList<Quantity>(Quantity.class, this, FHIRPackage.BODY_STRUCTURE_DISTANCE_FROM_LANDMARK__VALUE);
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.BODY_STRUCTURE_DISTANCE_FROM_LANDMARK__DEVICE:
				return ((InternalEList<?>)getDevice()).basicRemove(otherEnd, msgs);
			case FHIRPackage.BODY_STRUCTURE_DISTANCE_FROM_LANDMARK__VALUE:
				return ((InternalEList<?>)getValue()).basicRemove(otherEnd, msgs);
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
			case FHIRPackage.BODY_STRUCTURE_DISTANCE_FROM_LANDMARK__DEVICE:
				return getDevice();
			case FHIRPackage.BODY_STRUCTURE_DISTANCE_FROM_LANDMARK__VALUE:
				return getValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FHIRPackage.BODY_STRUCTURE_DISTANCE_FROM_LANDMARK__DEVICE:
				getDevice().clear();
				getDevice().addAll((Collection<? extends CodeableReference>)newValue);
				return;
			case FHIRPackage.BODY_STRUCTURE_DISTANCE_FROM_LANDMARK__VALUE:
				getValue().clear();
				getValue().addAll((Collection<? extends Quantity>)newValue);
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
			case FHIRPackage.BODY_STRUCTURE_DISTANCE_FROM_LANDMARK__DEVICE:
				getDevice().clear();
				return;
			case FHIRPackage.BODY_STRUCTURE_DISTANCE_FROM_LANDMARK__VALUE:
				getValue().clear();
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
			case FHIRPackage.BODY_STRUCTURE_DISTANCE_FROM_LANDMARK__DEVICE:
				return device != null && !device.isEmpty();
			case FHIRPackage.BODY_STRUCTURE_DISTANCE_FROM_LANDMARK__VALUE:
				return value != null && !value.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BodyStructureDistanceFromLandmarkImpl
