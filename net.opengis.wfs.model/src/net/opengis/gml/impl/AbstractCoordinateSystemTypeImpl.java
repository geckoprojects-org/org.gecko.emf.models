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

import net.opengis.gml.AbstractCoordinateSystemType;
import net.opengis.gml.CoordinateSystemAxisRefType;
import net.opengis.gml.GMLPackage;
import net.opengis.gml.IdentifierType;
import net.opengis.gml.StringOrRefType;

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
 * An implementation of the model object '<em><b>Abstract Coordinate System Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.impl.AbstractCoordinateSystemTypeImpl#getCsID <em>Cs ID</em>}</li>
 *   <li>{@link net.opengis.gml.impl.AbstractCoordinateSystemTypeImpl#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link net.opengis.gml.impl.AbstractCoordinateSystemTypeImpl#getUsesAxis <em>Uses Axis</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractCoordinateSystemTypeImpl extends AbstractCoordinateSystemBaseTypeImpl implements AbstractCoordinateSystemType {
	/**
	 * The cached value of the '{@link #getCsID() <em>Cs ID</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsID()
	 * @generated
	 * @ordered
	 */
	protected EList<IdentifierType> csID;

	/**
	 * The cached value of the '{@link #getRemarks() <em>Remarks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemarks()
	 * @generated
	 * @ordered
	 */
	protected StringOrRefType remarks;

	/**
	 * The cached value of the '{@link #getUsesAxis() <em>Uses Axis</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsesAxis()
	 * @generated
	 * @ordered
	 */
	protected EList<CoordinateSystemAxisRefType> usesAxis;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractCoordinateSystemTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getAbstractCoordinateSystemType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IdentifierType> getCsID() {
		if (csID == null) {
			csID = new EObjectContainmentEList<IdentifierType>(IdentifierType.class, this, GMLPackage.ABSTRACT_COORDINATE_SYSTEM_TYPE__CS_ID);
		}
		return csID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringOrRefType getRemarks() {
		return remarks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRemarks(StringOrRefType newRemarks, NotificationChain msgs) {
		StringOrRefType oldRemarks = remarks;
		remarks = newRemarks;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.ABSTRACT_COORDINATE_SYSTEM_TYPE__REMARKS, oldRemarks, newRemarks);
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
	public void setRemarks(StringOrRefType newRemarks) {
		if (newRemarks != remarks) {
			NotificationChain msgs = null;
			if (remarks != null)
				msgs = ((InternalEObject)remarks).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.ABSTRACT_COORDINATE_SYSTEM_TYPE__REMARKS, null, msgs);
			if (newRemarks != null)
				msgs = ((InternalEObject)newRemarks).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.ABSTRACT_COORDINATE_SYSTEM_TYPE__REMARKS, null, msgs);
			msgs = basicSetRemarks(newRemarks, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.ABSTRACT_COORDINATE_SYSTEM_TYPE__REMARKS, newRemarks, newRemarks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CoordinateSystemAxisRefType> getUsesAxis() {
		if (usesAxis == null) {
			usesAxis = new EObjectContainmentEList<CoordinateSystemAxisRefType>(CoordinateSystemAxisRefType.class, this, GMLPackage.ABSTRACT_COORDINATE_SYSTEM_TYPE__USES_AXIS);
		}
		return usesAxis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.ABSTRACT_COORDINATE_SYSTEM_TYPE__CS_ID:
				return ((InternalEList<?>)getCsID()).basicRemove(otherEnd, msgs);
			case GMLPackage.ABSTRACT_COORDINATE_SYSTEM_TYPE__REMARKS:
				return basicSetRemarks(null, msgs);
			case GMLPackage.ABSTRACT_COORDINATE_SYSTEM_TYPE__USES_AXIS:
				return ((InternalEList<?>)getUsesAxis()).basicRemove(otherEnd, msgs);
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
			case GMLPackage.ABSTRACT_COORDINATE_SYSTEM_TYPE__CS_ID:
				return getCsID();
			case GMLPackage.ABSTRACT_COORDINATE_SYSTEM_TYPE__REMARKS:
				return getRemarks();
			case GMLPackage.ABSTRACT_COORDINATE_SYSTEM_TYPE__USES_AXIS:
				return getUsesAxis();
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
			case GMLPackage.ABSTRACT_COORDINATE_SYSTEM_TYPE__CS_ID:
				getCsID().clear();
				getCsID().addAll((Collection<? extends IdentifierType>)newValue);
				return;
			case GMLPackage.ABSTRACT_COORDINATE_SYSTEM_TYPE__REMARKS:
				setRemarks((StringOrRefType)newValue);
				return;
			case GMLPackage.ABSTRACT_COORDINATE_SYSTEM_TYPE__USES_AXIS:
				getUsesAxis().clear();
				getUsesAxis().addAll((Collection<? extends CoordinateSystemAxisRefType>)newValue);
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
			case GMLPackage.ABSTRACT_COORDINATE_SYSTEM_TYPE__CS_ID:
				getCsID().clear();
				return;
			case GMLPackage.ABSTRACT_COORDINATE_SYSTEM_TYPE__REMARKS:
				setRemarks((StringOrRefType)null);
				return;
			case GMLPackage.ABSTRACT_COORDINATE_SYSTEM_TYPE__USES_AXIS:
				getUsesAxis().clear();
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
			case GMLPackage.ABSTRACT_COORDINATE_SYSTEM_TYPE__CS_ID:
				return csID != null && !csID.isEmpty();
			case GMLPackage.ABSTRACT_COORDINATE_SYSTEM_TYPE__REMARKS:
				return remarks != null;
			case GMLPackage.ABSTRACT_COORDINATE_SYSTEM_TYPE__USES_AXIS:
				return usesAxis != null && !usesAxis.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AbstractCoordinateSystemTypeImpl
