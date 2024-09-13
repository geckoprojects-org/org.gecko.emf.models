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
package org.w3.owl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.internal.impl.ClassImpl;

import org.w3.owl.OwlPackage;
import org.w3.owl.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3.owl.impl.TypeImpl#getDisjointUnionOf <em>Disjoint Union Of</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TypeImpl extends ClassImpl implements Type {
	/**
	 * The cached value of the '{@link #getDisjointUnionOf() <em>Disjoint Union Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisjointUnionOf()
	 * @generated
	 * @ordered
	 */
	protected Type disjointUnionOf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OwlPackage.Literals.TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getDisjointUnionOf() {
		if (disjointUnionOf != null && disjointUnionOf.eIsProxy()) {
			InternalEObject oldDisjointUnionOf = (InternalEObject)disjointUnionOf;
			disjointUnionOf = (Type)eResolveProxy(oldDisjointUnionOf);
			if (disjointUnionOf != oldDisjointUnionOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OwlPackage.TYPE__DISJOINT_UNION_OF, oldDisjointUnionOf, disjointUnionOf));
			}
		}
		return disjointUnionOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetDisjointUnionOf() {
		return disjointUnionOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDisjointUnionOf(Type newDisjointUnionOf) {
		Type oldDisjointUnionOf = disjointUnionOf;
		disjointUnionOf = newDisjointUnionOf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlPackage.TYPE__DISJOINT_UNION_OF, oldDisjointUnionOf, disjointUnionOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OwlPackage.TYPE__DISJOINT_UNION_OF:
				if (resolve) return getDisjointUnionOf();
				return basicGetDisjointUnionOf();
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
			case OwlPackage.TYPE__DISJOINT_UNION_OF:
				setDisjointUnionOf((Type)newValue);
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
			case OwlPackage.TYPE__DISJOINT_UNION_OF:
				setDisjointUnionOf((Type)null);
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
			case OwlPackage.TYPE__DISJOINT_UNION_OF:
				return disjointUnionOf != null;
		}
		return super.eIsSet(featureID);
	}

} //TypeImpl
