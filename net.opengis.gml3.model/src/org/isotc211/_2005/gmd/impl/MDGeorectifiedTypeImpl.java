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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.isotc211._2005.gco.BooleanPropertyType;
import org.isotc211._2005.gco.CharacterStringPropertyType;

import org.isotc211._2005.gmd.GMDPackage;
import org.isotc211._2005.gmd.MDGeorectifiedType;
import org.isotc211._2005.gmd.MDPixelOrientationCodePropertyType;

import org.isotc211._2005.gss.GMPointPropertyType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MD Georectified Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDGeorectifiedTypeImpl#getCheckPointAvailability <em>Check Point Availability</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDGeorectifiedTypeImpl#getCheckPointDescription <em>Check Point Description</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDGeorectifiedTypeImpl#getCornerPoints <em>Corner Points</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDGeorectifiedTypeImpl#getCenterPoint <em>Center Point</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDGeorectifiedTypeImpl#getPointInPixel <em>Point In Pixel</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDGeorectifiedTypeImpl#getTransformationDimensionDescription <em>Transformation Dimension Description</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDGeorectifiedTypeImpl#getTransformationDimensionMapping <em>Transformation Dimension Mapping</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MDGeorectifiedTypeImpl extends MDGridSpatialRepresentationTypeImpl implements MDGeorectifiedType {
	/**
	 * The cached value of the '{@link #getCheckPointAvailability() <em>Check Point Availability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckPointAvailability()
	 * @generated
	 * @ordered
	 */
	protected BooleanPropertyType checkPointAvailability;

	/**
	 * The cached value of the '{@link #getCheckPointDescription() <em>Check Point Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckPointDescription()
	 * @generated
	 * @ordered
	 */
	protected CharacterStringPropertyType checkPointDescription;

	/**
	 * The cached value of the '{@link #getCornerPoints() <em>Corner Points</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCornerPoints()
	 * @generated
	 * @ordered
	 */
	protected EList<GMPointPropertyType> cornerPoints;

	/**
	 * The cached value of the '{@link #getCenterPoint() <em>Center Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCenterPoint()
	 * @generated
	 * @ordered
	 */
	protected GMPointPropertyType centerPoint;

	/**
	 * The cached value of the '{@link #getPointInPixel() <em>Point In Pixel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointInPixel()
	 * @generated
	 * @ordered
	 */
	protected MDPixelOrientationCodePropertyType pointInPixel;

	/**
	 * The cached value of the '{@link #getTransformationDimensionDescription() <em>Transformation Dimension Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformationDimensionDescription()
	 * @generated
	 * @ordered
	 */
	protected CharacterStringPropertyType transformationDimensionDescription;

	/**
	 * The cached value of the '{@link #getTransformationDimensionMapping() <em>Transformation Dimension Mapping</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformationDimensionMapping()
	 * @generated
	 * @ordered
	 */
	protected EList<CharacterStringPropertyType> transformationDimensionMapping;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MDGeorectifiedTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMDPackage.eINSTANCE.getMDGeorectifiedType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanPropertyType getCheckPointAvailability() {
		return checkPointAvailability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCheckPointAvailability(BooleanPropertyType newCheckPointAvailability, NotificationChain msgs) {
		BooleanPropertyType oldCheckPointAvailability = checkPointAvailability;
		checkPointAvailability = newCheckPointAvailability;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_GEORECTIFIED_TYPE__CHECK_POINT_AVAILABILITY, oldCheckPointAvailability, newCheckPointAvailability);
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
	public void setCheckPointAvailability(BooleanPropertyType newCheckPointAvailability) {
		if (newCheckPointAvailability != checkPointAvailability) {
			NotificationChain msgs = null;
			if (checkPointAvailability != null)
				msgs = ((InternalEObject)checkPointAvailability).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_GEORECTIFIED_TYPE__CHECK_POINT_AVAILABILITY, null, msgs);
			if (newCheckPointAvailability != null)
				msgs = ((InternalEObject)newCheckPointAvailability).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_GEORECTIFIED_TYPE__CHECK_POINT_AVAILABILITY, null, msgs);
			msgs = basicSetCheckPointAvailability(newCheckPointAvailability, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_GEORECTIFIED_TYPE__CHECK_POINT_AVAILABILITY, newCheckPointAvailability, newCheckPointAvailability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacterStringPropertyType getCheckPointDescription() {
		return checkPointDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCheckPointDescription(CharacterStringPropertyType newCheckPointDescription, NotificationChain msgs) {
		CharacterStringPropertyType oldCheckPointDescription = checkPointDescription;
		checkPointDescription = newCheckPointDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_GEORECTIFIED_TYPE__CHECK_POINT_DESCRIPTION, oldCheckPointDescription, newCheckPointDescription);
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
	public void setCheckPointDescription(CharacterStringPropertyType newCheckPointDescription) {
		if (newCheckPointDescription != checkPointDescription) {
			NotificationChain msgs = null;
			if (checkPointDescription != null)
				msgs = ((InternalEObject)checkPointDescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_GEORECTIFIED_TYPE__CHECK_POINT_DESCRIPTION, null, msgs);
			if (newCheckPointDescription != null)
				msgs = ((InternalEObject)newCheckPointDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_GEORECTIFIED_TYPE__CHECK_POINT_DESCRIPTION, null, msgs);
			msgs = basicSetCheckPointDescription(newCheckPointDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_GEORECTIFIED_TYPE__CHECK_POINT_DESCRIPTION, newCheckPointDescription, newCheckPointDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GMPointPropertyType> getCornerPoints() {
		if (cornerPoints == null) {
			cornerPoints = new EObjectContainmentEList<GMPointPropertyType>(GMPointPropertyType.class, this, GMDPackage.MD_GEORECTIFIED_TYPE__CORNER_POINTS);
		}
		return cornerPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GMPointPropertyType getCenterPoint() {
		return centerPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCenterPoint(GMPointPropertyType newCenterPoint, NotificationChain msgs) {
		GMPointPropertyType oldCenterPoint = centerPoint;
		centerPoint = newCenterPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_GEORECTIFIED_TYPE__CENTER_POINT, oldCenterPoint, newCenterPoint);
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
	public void setCenterPoint(GMPointPropertyType newCenterPoint) {
		if (newCenterPoint != centerPoint) {
			NotificationChain msgs = null;
			if (centerPoint != null)
				msgs = ((InternalEObject)centerPoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_GEORECTIFIED_TYPE__CENTER_POINT, null, msgs);
			if (newCenterPoint != null)
				msgs = ((InternalEObject)newCenterPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_GEORECTIFIED_TYPE__CENTER_POINT, null, msgs);
			msgs = basicSetCenterPoint(newCenterPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_GEORECTIFIED_TYPE__CENTER_POINT, newCenterPoint, newCenterPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDPixelOrientationCodePropertyType getPointInPixel() {
		return pointInPixel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPointInPixel(MDPixelOrientationCodePropertyType newPointInPixel, NotificationChain msgs) {
		MDPixelOrientationCodePropertyType oldPointInPixel = pointInPixel;
		pointInPixel = newPointInPixel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_GEORECTIFIED_TYPE__POINT_IN_PIXEL, oldPointInPixel, newPointInPixel);
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
	public void setPointInPixel(MDPixelOrientationCodePropertyType newPointInPixel) {
		if (newPointInPixel != pointInPixel) {
			NotificationChain msgs = null;
			if (pointInPixel != null)
				msgs = ((InternalEObject)pointInPixel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_GEORECTIFIED_TYPE__POINT_IN_PIXEL, null, msgs);
			if (newPointInPixel != null)
				msgs = ((InternalEObject)newPointInPixel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_GEORECTIFIED_TYPE__POINT_IN_PIXEL, null, msgs);
			msgs = basicSetPointInPixel(newPointInPixel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_GEORECTIFIED_TYPE__POINT_IN_PIXEL, newPointInPixel, newPointInPixel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacterStringPropertyType getTransformationDimensionDescription() {
		return transformationDimensionDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformationDimensionDescription(CharacterStringPropertyType newTransformationDimensionDescription, NotificationChain msgs) {
		CharacterStringPropertyType oldTransformationDimensionDescription = transformationDimensionDescription;
		transformationDimensionDescription = newTransformationDimensionDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_GEORECTIFIED_TYPE__TRANSFORMATION_DIMENSION_DESCRIPTION, oldTransformationDimensionDescription, newTransformationDimensionDescription);
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
	public void setTransformationDimensionDescription(CharacterStringPropertyType newTransformationDimensionDescription) {
		if (newTransformationDimensionDescription != transformationDimensionDescription) {
			NotificationChain msgs = null;
			if (transformationDimensionDescription != null)
				msgs = ((InternalEObject)transformationDimensionDescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_GEORECTIFIED_TYPE__TRANSFORMATION_DIMENSION_DESCRIPTION, null, msgs);
			if (newTransformationDimensionDescription != null)
				msgs = ((InternalEObject)newTransformationDimensionDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_GEORECTIFIED_TYPE__TRANSFORMATION_DIMENSION_DESCRIPTION, null, msgs);
			msgs = basicSetTransformationDimensionDescription(newTransformationDimensionDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_GEORECTIFIED_TYPE__TRANSFORMATION_DIMENSION_DESCRIPTION, newTransformationDimensionDescription, newTransformationDimensionDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CharacterStringPropertyType> getTransformationDimensionMapping() {
		if (transformationDimensionMapping == null) {
			transformationDimensionMapping = new EObjectContainmentEList<CharacterStringPropertyType>(CharacterStringPropertyType.class, this, GMDPackage.MD_GEORECTIFIED_TYPE__TRANSFORMATION_DIMENSION_MAPPING);
		}
		return transformationDimensionMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMDPackage.MD_GEORECTIFIED_TYPE__CHECK_POINT_AVAILABILITY:
				return basicSetCheckPointAvailability(null, msgs);
			case GMDPackage.MD_GEORECTIFIED_TYPE__CHECK_POINT_DESCRIPTION:
				return basicSetCheckPointDescription(null, msgs);
			case GMDPackage.MD_GEORECTIFIED_TYPE__CORNER_POINTS:
				return ((InternalEList<?>)getCornerPoints()).basicRemove(otherEnd, msgs);
			case GMDPackage.MD_GEORECTIFIED_TYPE__CENTER_POINT:
				return basicSetCenterPoint(null, msgs);
			case GMDPackage.MD_GEORECTIFIED_TYPE__POINT_IN_PIXEL:
				return basicSetPointInPixel(null, msgs);
			case GMDPackage.MD_GEORECTIFIED_TYPE__TRANSFORMATION_DIMENSION_DESCRIPTION:
				return basicSetTransformationDimensionDescription(null, msgs);
			case GMDPackage.MD_GEORECTIFIED_TYPE__TRANSFORMATION_DIMENSION_MAPPING:
				return ((InternalEList<?>)getTransformationDimensionMapping()).basicRemove(otherEnd, msgs);
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
			case GMDPackage.MD_GEORECTIFIED_TYPE__CHECK_POINT_AVAILABILITY:
				return getCheckPointAvailability();
			case GMDPackage.MD_GEORECTIFIED_TYPE__CHECK_POINT_DESCRIPTION:
				return getCheckPointDescription();
			case GMDPackage.MD_GEORECTIFIED_TYPE__CORNER_POINTS:
				return getCornerPoints();
			case GMDPackage.MD_GEORECTIFIED_TYPE__CENTER_POINT:
				return getCenterPoint();
			case GMDPackage.MD_GEORECTIFIED_TYPE__POINT_IN_PIXEL:
				return getPointInPixel();
			case GMDPackage.MD_GEORECTIFIED_TYPE__TRANSFORMATION_DIMENSION_DESCRIPTION:
				return getTransformationDimensionDescription();
			case GMDPackage.MD_GEORECTIFIED_TYPE__TRANSFORMATION_DIMENSION_MAPPING:
				return getTransformationDimensionMapping();
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
			case GMDPackage.MD_GEORECTIFIED_TYPE__CHECK_POINT_AVAILABILITY:
				setCheckPointAvailability((BooleanPropertyType)newValue);
				return;
			case GMDPackage.MD_GEORECTIFIED_TYPE__CHECK_POINT_DESCRIPTION:
				setCheckPointDescription((CharacterStringPropertyType)newValue);
				return;
			case GMDPackage.MD_GEORECTIFIED_TYPE__CORNER_POINTS:
				getCornerPoints().clear();
				getCornerPoints().addAll((Collection<? extends GMPointPropertyType>)newValue);
				return;
			case GMDPackage.MD_GEORECTIFIED_TYPE__CENTER_POINT:
				setCenterPoint((GMPointPropertyType)newValue);
				return;
			case GMDPackage.MD_GEORECTIFIED_TYPE__POINT_IN_PIXEL:
				setPointInPixel((MDPixelOrientationCodePropertyType)newValue);
				return;
			case GMDPackage.MD_GEORECTIFIED_TYPE__TRANSFORMATION_DIMENSION_DESCRIPTION:
				setTransformationDimensionDescription((CharacterStringPropertyType)newValue);
				return;
			case GMDPackage.MD_GEORECTIFIED_TYPE__TRANSFORMATION_DIMENSION_MAPPING:
				getTransformationDimensionMapping().clear();
				getTransformationDimensionMapping().addAll((Collection<? extends CharacterStringPropertyType>)newValue);
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
			case GMDPackage.MD_GEORECTIFIED_TYPE__CHECK_POINT_AVAILABILITY:
				setCheckPointAvailability((BooleanPropertyType)null);
				return;
			case GMDPackage.MD_GEORECTIFIED_TYPE__CHECK_POINT_DESCRIPTION:
				setCheckPointDescription((CharacterStringPropertyType)null);
				return;
			case GMDPackage.MD_GEORECTIFIED_TYPE__CORNER_POINTS:
				getCornerPoints().clear();
				return;
			case GMDPackage.MD_GEORECTIFIED_TYPE__CENTER_POINT:
				setCenterPoint((GMPointPropertyType)null);
				return;
			case GMDPackage.MD_GEORECTIFIED_TYPE__POINT_IN_PIXEL:
				setPointInPixel((MDPixelOrientationCodePropertyType)null);
				return;
			case GMDPackage.MD_GEORECTIFIED_TYPE__TRANSFORMATION_DIMENSION_DESCRIPTION:
				setTransformationDimensionDescription((CharacterStringPropertyType)null);
				return;
			case GMDPackage.MD_GEORECTIFIED_TYPE__TRANSFORMATION_DIMENSION_MAPPING:
				getTransformationDimensionMapping().clear();
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
			case GMDPackage.MD_GEORECTIFIED_TYPE__CHECK_POINT_AVAILABILITY:
				return checkPointAvailability != null;
			case GMDPackage.MD_GEORECTIFIED_TYPE__CHECK_POINT_DESCRIPTION:
				return checkPointDescription != null;
			case GMDPackage.MD_GEORECTIFIED_TYPE__CORNER_POINTS:
				return cornerPoints != null && !cornerPoints.isEmpty();
			case GMDPackage.MD_GEORECTIFIED_TYPE__CENTER_POINT:
				return centerPoint != null;
			case GMDPackage.MD_GEORECTIFIED_TYPE__POINT_IN_PIXEL:
				return pointInPixel != null;
			case GMDPackage.MD_GEORECTIFIED_TYPE__TRANSFORMATION_DIMENSION_DESCRIPTION:
				return transformationDimensionDescription != null;
			case GMDPackage.MD_GEORECTIFIED_TYPE__TRANSFORMATION_DIMENSION_MAPPING:
				return transformationDimensionMapping != null && !transformationDimensionMapping.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MDGeorectifiedTypeImpl
