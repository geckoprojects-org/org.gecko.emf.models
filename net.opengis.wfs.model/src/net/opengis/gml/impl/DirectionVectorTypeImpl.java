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
package net.opengis.gml.impl;

import net.opengis.gml.AngleType;
import net.opengis.gml.DirectionVectorType;
import net.opengis.gml.GMLPackage;
import net.opengis.gml.VectorType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Direction Vector Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.impl.DirectionVectorTypeImpl#getVector <em>Vector</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DirectionVectorTypeImpl#getHorizontalAngle <em>Horizontal Angle</em>}</li>
 *   <li>{@link net.opengis.gml.impl.DirectionVectorTypeImpl#getVerticalAngle <em>Vertical Angle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DirectionVectorTypeImpl extends MinimalEObjectImpl.Container implements DirectionVectorType {
	/**
	 * The cached value of the '{@link #getVector() <em>Vector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVector()
	 * @generated
	 * @ordered
	 */
	protected VectorType vector;

	/**
	 * The cached value of the '{@link #getHorizontalAngle() <em>Horizontal Angle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalAngle()
	 * @generated
	 * @ordered
	 */
	protected AngleType horizontalAngle;

	/**
	 * The cached value of the '{@link #getVerticalAngle() <em>Vertical Angle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalAngle()
	 * @generated
	 * @ordered
	 */
	protected AngleType verticalAngle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DirectionVectorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getDirectionVectorType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VectorType getVector() {
		return vector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVector(VectorType newVector, NotificationChain msgs) {
		VectorType oldVector = vector;
		vector = newVector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.DIRECTION_VECTOR_TYPE__VECTOR, oldVector, newVector);
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
	public void setVector(VectorType newVector) {
		if (newVector != vector) {
			NotificationChain msgs = null;
			if (vector != null)
				msgs = ((InternalEObject)vector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.DIRECTION_VECTOR_TYPE__VECTOR, null, msgs);
			if (newVector != null)
				msgs = ((InternalEObject)newVector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.DIRECTION_VECTOR_TYPE__VECTOR, null, msgs);
			msgs = basicSetVector(newVector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.DIRECTION_VECTOR_TYPE__VECTOR, newVector, newVector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AngleType getHorizontalAngle() {
		return horizontalAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHorizontalAngle(AngleType newHorizontalAngle, NotificationChain msgs) {
		AngleType oldHorizontalAngle = horizontalAngle;
		horizontalAngle = newHorizontalAngle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.DIRECTION_VECTOR_TYPE__HORIZONTAL_ANGLE, oldHorizontalAngle, newHorizontalAngle);
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
	public void setHorizontalAngle(AngleType newHorizontalAngle) {
		if (newHorizontalAngle != horizontalAngle) {
			NotificationChain msgs = null;
			if (horizontalAngle != null)
				msgs = ((InternalEObject)horizontalAngle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.DIRECTION_VECTOR_TYPE__HORIZONTAL_ANGLE, null, msgs);
			if (newHorizontalAngle != null)
				msgs = ((InternalEObject)newHorizontalAngle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.DIRECTION_VECTOR_TYPE__HORIZONTAL_ANGLE, null, msgs);
			msgs = basicSetHorizontalAngle(newHorizontalAngle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.DIRECTION_VECTOR_TYPE__HORIZONTAL_ANGLE, newHorizontalAngle, newHorizontalAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AngleType getVerticalAngle() {
		return verticalAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVerticalAngle(AngleType newVerticalAngle, NotificationChain msgs) {
		AngleType oldVerticalAngle = verticalAngle;
		verticalAngle = newVerticalAngle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.DIRECTION_VECTOR_TYPE__VERTICAL_ANGLE, oldVerticalAngle, newVerticalAngle);
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
	public void setVerticalAngle(AngleType newVerticalAngle) {
		if (newVerticalAngle != verticalAngle) {
			NotificationChain msgs = null;
			if (verticalAngle != null)
				msgs = ((InternalEObject)verticalAngle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.DIRECTION_VECTOR_TYPE__VERTICAL_ANGLE, null, msgs);
			if (newVerticalAngle != null)
				msgs = ((InternalEObject)newVerticalAngle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.DIRECTION_VECTOR_TYPE__VERTICAL_ANGLE, null, msgs);
			msgs = basicSetVerticalAngle(newVerticalAngle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.DIRECTION_VECTOR_TYPE__VERTICAL_ANGLE, newVerticalAngle, newVerticalAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.DIRECTION_VECTOR_TYPE__VECTOR:
				return basicSetVector(null, msgs);
			case GMLPackage.DIRECTION_VECTOR_TYPE__HORIZONTAL_ANGLE:
				return basicSetHorizontalAngle(null, msgs);
			case GMLPackage.DIRECTION_VECTOR_TYPE__VERTICAL_ANGLE:
				return basicSetVerticalAngle(null, msgs);
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
			case GMLPackage.DIRECTION_VECTOR_TYPE__VECTOR:
				return getVector();
			case GMLPackage.DIRECTION_VECTOR_TYPE__HORIZONTAL_ANGLE:
				return getHorizontalAngle();
			case GMLPackage.DIRECTION_VECTOR_TYPE__VERTICAL_ANGLE:
				return getVerticalAngle();
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
			case GMLPackage.DIRECTION_VECTOR_TYPE__VECTOR:
				setVector((VectorType)newValue);
				return;
			case GMLPackage.DIRECTION_VECTOR_TYPE__HORIZONTAL_ANGLE:
				setHorizontalAngle((AngleType)newValue);
				return;
			case GMLPackage.DIRECTION_VECTOR_TYPE__VERTICAL_ANGLE:
				setVerticalAngle((AngleType)newValue);
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
			case GMLPackage.DIRECTION_VECTOR_TYPE__VECTOR:
				setVector((VectorType)null);
				return;
			case GMLPackage.DIRECTION_VECTOR_TYPE__HORIZONTAL_ANGLE:
				setHorizontalAngle((AngleType)null);
				return;
			case GMLPackage.DIRECTION_VECTOR_TYPE__VERTICAL_ANGLE:
				setVerticalAngle((AngleType)null);
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
			case GMLPackage.DIRECTION_VECTOR_TYPE__VECTOR:
				return vector != null;
			case GMLPackage.DIRECTION_VECTOR_TYPE__HORIZONTAL_ANGLE:
				return horizontalAngle != null;
			case GMLPackage.DIRECTION_VECTOR_TYPE__VERTICAL_ANGLE:
				return verticalAngle != null;
		}
		return super.eIsSet(featureID);
	}

} //DirectionVectorTypeImpl
