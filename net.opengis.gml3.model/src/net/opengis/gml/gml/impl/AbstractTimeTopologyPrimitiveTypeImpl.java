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
package net.opengis.gml.gml.impl;

import net.opengis.gml.gml.AbstractTimeTopologyPrimitiveType;
import net.opengis.gml.gml.GMLPackage;
import net.opengis.gml.gml.ReferenceType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Time Topology Primitive Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.impl.AbstractTimeTopologyPrimitiveTypeImpl#getComplex <em>Complex</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractTimeTopologyPrimitiveTypeImpl extends AbstractTimePrimitiveTypeImpl implements AbstractTimeTopologyPrimitiveType {
	/**
	 * The cached value of the '{@link #getComplex() <em>Complex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplex()
	 * @generated
	 * @ordered
	 */
	protected ReferenceType complex;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractTimeTopologyPrimitiveTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getAbstractTimeTopologyPrimitiveType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferenceType getComplex() {
		return complex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComplex(ReferenceType newComplex, NotificationChain msgs) {
		ReferenceType oldComplex = complex;
		complex = newComplex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.ABSTRACT_TIME_TOPOLOGY_PRIMITIVE_TYPE__COMPLEX, oldComplex, newComplex);
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
	public void setComplex(ReferenceType newComplex) {
		if (newComplex != complex) {
			NotificationChain msgs = null;
			if (complex != null)
				msgs = ((InternalEObject)complex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.ABSTRACT_TIME_TOPOLOGY_PRIMITIVE_TYPE__COMPLEX, null, msgs);
			if (newComplex != null)
				msgs = ((InternalEObject)newComplex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.ABSTRACT_TIME_TOPOLOGY_PRIMITIVE_TYPE__COMPLEX, null, msgs);
			msgs = basicSetComplex(newComplex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.ABSTRACT_TIME_TOPOLOGY_PRIMITIVE_TYPE__COMPLEX, newComplex, newComplex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.ABSTRACT_TIME_TOPOLOGY_PRIMITIVE_TYPE__COMPLEX:
				return basicSetComplex(null, msgs);
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
			case GMLPackage.ABSTRACT_TIME_TOPOLOGY_PRIMITIVE_TYPE__COMPLEX:
				return getComplex();
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
			case GMLPackage.ABSTRACT_TIME_TOPOLOGY_PRIMITIVE_TYPE__COMPLEX:
				setComplex((ReferenceType)newValue);
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
			case GMLPackage.ABSTRACT_TIME_TOPOLOGY_PRIMITIVE_TYPE__COMPLEX:
				setComplex((ReferenceType)null);
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
			case GMLPackage.ABSTRACT_TIME_TOPOLOGY_PRIMITIVE_TYPE__COMPLEX:
				return complex != null;
		}
		return super.eIsSet(featureID);
	}

} //AbstractTimeTopologyPrimitiveTypeImpl
