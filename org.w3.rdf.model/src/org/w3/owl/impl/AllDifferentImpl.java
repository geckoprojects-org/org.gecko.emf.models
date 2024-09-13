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

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.w3.owl.AllDifferent;
import org.w3.owl.OwlPackage;
import org.w3.owl.Thing;

import org.w3.rdfs.impl.RDFResourceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>All Different</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3.owl.impl.AllDifferentImpl#getDistinctMembers <em>Distinct Members</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AllDifferentImpl extends RDFResourceImpl implements AllDifferent {
	/**
	 * The cached value of the '{@link #getDistinctMembers() <em>Distinct Members</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistinctMembers()
	 * @generated
	 * @ordered
	 */
	protected EList<Thing> distinctMembers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllDifferentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OwlPackage.Literals.ALL_DIFFERENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Thing> getDistinctMembers() {
		if (distinctMembers == null) {
			distinctMembers = new EObjectResolvingEList<Thing>(Thing.class, this, OwlPackage.ALL_DIFFERENT__DISTINCT_MEMBERS);
		}
		return distinctMembers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OwlPackage.ALL_DIFFERENT__DISTINCT_MEMBERS:
				return getDistinctMembers();
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
			case OwlPackage.ALL_DIFFERENT__DISTINCT_MEMBERS:
				getDistinctMembers().clear();
				getDistinctMembers().addAll((Collection<? extends Thing>)newValue);
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
			case OwlPackage.ALL_DIFFERENT__DISTINCT_MEMBERS:
				getDistinctMembers().clear();
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
			case OwlPackage.ALL_DIFFERENT__DISTINCT_MEMBERS:
				return distinctMembers != null && !distinctMembers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AllDifferentImpl
