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

import java.util.Collection;

import net.opengis.gml.GMLPackage;
import net.opengis.gml.MultiPointType;
import net.opengis.gml.PointArrayPropertyType;
import net.opengis.gml.PointPropertyType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multi Point Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.impl.MultiPointTypeImpl#getPointMember <em>Point Member</em>}</li>
 *   <li>{@link net.opengis.gml.impl.MultiPointTypeImpl#getPointMembers <em>Point Members</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MultiPointTypeImpl extends AbstractGeometricAggregateTypeImpl implements MultiPointType {
	/**
	 * The cached value of the '{@link #getPointMember() <em>Point Member</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointMember()
	 * @generated
	 * @ordered
	 */
	protected EList<PointPropertyType> pointMember;

	/**
	 * The cached value of the '{@link #getPointMembers() <em>Point Members</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointMembers()
	 * @generated
	 * @ordered
	 */
	protected PointArrayPropertyType pointMembers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiPointTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getMultiPointType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PointPropertyType> getPointMember() {
		if (pointMember == null) {
			pointMember = new EObjectContainmentEList<PointPropertyType>(PointPropertyType.class, this, GMLPackage.MULTI_POINT_TYPE__POINT_MEMBER);
		}
		return pointMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointArrayPropertyType getPointMembers() {
		return pointMembers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPointMembers(PointArrayPropertyType newPointMembers, NotificationChain msgs) {
		PointArrayPropertyType oldPointMembers = pointMembers;
		pointMembers = newPointMembers;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.MULTI_POINT_TYPE__POINT_MEMBERS, oldPointMembers, newPointMembers);
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
	public void setPointMembers(PointArrayPropertyType newPointMembers) {
		if (newPointMembers != pointMembers) {
			NotificationChain msgs = null;
			if (pointMembers != null)
				msgs = ((InternalEObject)pointMembers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.MULTI_POINT_TYPE__POINT_MEMBERS, null, msgs);
			if (newPointMembers != null)
				msgs = ((InternalEObject)newPointMembers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.MULTI_POINT_TYPE__POINT_MEMBERS, null, msgs);
			msgs = basicSetPointMembers(newPointMembers, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.MULTI_POINT_TYPE__POINT_MEMBERS, newPointMembers, newPointMembers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.MULTI_POINT_TYPE__POINT_MEMBER:
				return ((InternalEList<?>)getPointMember()).basicRemove(otherEnd, msgs);
			case GMLPackage.MULTI_POINT_TYPE__POINT_MEMBERS:
				return basicSetPointMembers(null, msgs);
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
			case GMLPackage.MULTI_POINT_TYPE__POINT_MEMBER:
				return getPointMember();
			case GMLPackage.MULTI_POINT_TYPE__POINT_MEMBERS:
				return getPointMembers();
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
			case GMLPackage.MULTI_POINT_TYPE__POINT_MEMBER:
				getPointMember().clear();
				getPointMember().addAll((Collection<? extends PointPropertyType>)newValue);
				return;
			case GMLPackage.MULTI_POINT_TYPE__POINT_MEMBERS:
				setPointMembers((PointArrayPropertyType)newValue);
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
			case GMLPackage.MULTI_POINT_TYPE__POINT_MEMBER:
				getPointMember().clear();
				return;
			case GMLPackage.MULTI_POINT_TYPE__POINT_MEMBERS:
				setPointMembers((PointArrayPropertyType)null);
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
			case GMLPackage.MULTI_POINT_TYPE__POINT_MEMBER:
				return pointMember != null && !pointMember.isEmpty();
			case GMLPackage.MULTI_POINT_TYPE__POINT_MEMBERS:
				return pointMembers != null;
		}
		return super.eIsSet(featureID);
	}

} //MultiPointTypeImpl
