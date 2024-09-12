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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir.Decimal;
import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.ImagingSelectionDGraphicType;
import org.hl7.fhir.ImagingSelectionImageRegion2D;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Imaging Selection Image Region2 D</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ImagingSelectionImageRegion2DImpl#getRegionType <em>Region Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingSelectionImageRegion2DImpl#getCoordinate <em>Coordinate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImagingSelectionImageRegion2DImpl extends BackboneElementImpl implements ImagingSelectionImageRegion2D {
	/**
	 * The cached value of the '{@link #getRegionType() <em>Region Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegionType()
	 * @generated
	 * @ordered
	 */
	protected ImagingSelectionDGraphicType regionType;

	/**
	 * The cached value of the '{@link #getCoordinate() <em>Coordinate</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinate()
	 * @generated
	 * @ordered
	 */
	protected EList<Decimal> coordinate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImagingSelectionImageRegion2DImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getImagingSelectionImageRegion2D();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImagingSelectionDGraphicType getRegionType() {
		return regionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegionType(ImagingSelectionDGraphicType newRegionType, NotificationChain msgs) {
		ImagingSelectionDGraphicType oldRegionType = regionType;
		regionType = newRegionType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.IMAGING_SELECTION_IMAGE_REGION2_D__REGION_TYPE, oldRegionType, newRegionType);
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
	public void setRegionType(ImagingSelectionDGraphicType newRegionType) {
		if (newRegionType != regionType) {
			NotificationChain msgs = null;
			if (regionType != null)
				msgs = ((InternalEObject)regionType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.IMAGING_SELECTION_IMAGE_REGION2_D__REGION_TYPE, null, msgs);
			if (newRegionType != null)
				msgs = ((InternalEObject)newRegionType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.IMAGING_SELECTION_IMAGE_REGION2_D__REGION_TYPE, null, msgs);
			msgs = basicSetRegionType(newRegionType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.IMAGING_SELECTION_IMAGE_REGION2_D__REGION_TYPE, newRegionType, newRegionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Decimal> getCoordinate() {
		if (coordinate == null) {
			coordinate = new EObjectContainmentEList<Decimal>(Decimal.class, this, FHIRPackage.IMAGING_SELECTION_IMAGE_REGION2_D__COORDINATE);
		}
		return coordinate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.IMAGING_SELECTION_IMAGE_REGION2_D__REGION_TYPE:
				return basicSetRegionType(null, msgs);
			case FHIRPackage.IMAGING_SELECTION_IMAGE_REGION2_D__COORDINATE:
				return ((InternalEList<?>)getCoordinate()).basicRemove(otherEnd, msgs);
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
			case FHIRPackage.IMAGING_SELECTION_IMAGE_REGION2_D__REGION_TYPE:
				return getRegionType();
			case FHIRPackage.IMAGING_SELECTION_IMAGE_REGION2_D__COORDINATE:
				return getCoordinate();
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
			case FHIRPackage.IMAGING_SELECTION_IMAGE_REGION2_D__REGION_TYPE:
				setRegionType((ImagingSelectionDGraphicType)newValue);
				return;
			case FHIRPackage.IMAGING_SELECTION_IMAGE_REGION2_D__COORDINATE:
				getCoordinate().clear();
				getCoordinate().addAll((Collection<? extends Decimal>)newValue);
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
			case FHIRPackage.IMAGING_SELECTION_IMAGE_REGION2_D__REGION_TYPE:
				setRegionType((ImagingSelectionDGraphicType)null);
				return;
			case FHIRPackage.IMAGING_SELECTION_IMAGE_REGION2_D__COORDINATE:
				getCoordinate().clear();
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
			case FHIRPackage.IMAGING_SELECTION_IMAGE_REGION2_D__REGION_TYPE:
				return regionType != null;
			case FHIRPackage.IMAGING_SELECTION_IMAGE_REGION2_D__COORDINATE:
				return coordinate != null && !coordinate.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ImagingSelectionImageRegion2DImpl
