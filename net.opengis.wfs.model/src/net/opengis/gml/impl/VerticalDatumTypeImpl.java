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

import net.opengis.gml.GMLPackage;
import net.opengis.gml.VerticalDatumType;
import net.opengis.gml.VerticalDatumTypeType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vertical Datum Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.impl.VerticalDatumTypeImpl#getVerticalDatumType <em>Vertical Datum Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VerticalDatumTypeImpl extends AbstractDatumTypeImpl implements VerticalDatumType {
	/**
	 * The cached value of the '{@link #getVerticalDatumType() <em>Vertical Datum Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalDatumType()
	 * @generated
	 * @ordered
	 */
	protected VerticalDatumTypeType verticalDatumType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VerticalDatumTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getVerticalDatumType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VerticalDatumTypeType getVerticalDatumType() {
		return verticalDatumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVerticalDatumType(VerticalDatumTypeType newVerticalDatumType, NotificationChain msgs) {
		VerticalDatumTypeType oldVerticalDatumType = verticalDatumType;
		verticalDatumType = newVerticalDatumType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.VERTICAL_DATUM_TYPE__VERTICAL_DATUM_TYPE, oldVerticalDatumType, newVerticalDatumType);
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
	public void setVerticalDatumType(VerticalDatumTypeType newVerticalDatumType) {
		if (newVerticalDatumType != verticalDatumType) {
			NotificationChain msgs = null;
			if (verticalDatumType != null)
				msgs = ((InternalEObject)verticalDatumType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.VERTICAL_DATUM_TYPE__VERTICAL_DATUM_TYPE, null, msgs);
			if (newVerticalDatumType != null)
				msgs = ((InternalEObject)newVerticalDatumType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.VERTICAL_DATUM_TYPE__VERTICAL_DATUM_TYPE, null, msgs);
			msgs = basicSetVerticalDatumType(newVerticalDatumType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.VERTICAL_DATUM_TYPE__VERTICAL_DATUM_TYPE, newVerticalDatumType, newVerticalDatumType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.VERTICAL_DATUM_TYPE__VERTICAL_DATUM_TYPE:
				return basicSetVerticalDatumType(null, msgs);
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
			case GMLPackage.VERTICAL_DATUM_TYPE__VERTICAL_DATUM_TYPE:
				return getVerticalDatumType();
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
			case GMLPackage.VERTICAL_DATUM_TYPE__VERTICAL_DATUM_TYPE:
				setVerticalDatumType((VerticalDatumTypeType)newValue);
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
			case GMLPackage.VERTICAL_DATUM_TYPE__VERTICAL_DATUM_TYPE:
				setVerticalDatumType((VerticalDatumTypeType)null);
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
			case GMLPackage.VERTICAL_DATUM_TYPE__VERTICAL_DATUM_TYPE:
				return verticalDatumType != null;
		}
		return super.eIsSet(featureID);
	}

} //VerticalDatumTypeImpl
