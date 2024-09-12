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
package net.opengis.ows.impl;

import net.opengis.ows.AbstractReferenceBaseType;
import net.opengis.ows.OWSPackage;
import net.opengis.ows.ReferenceGroupType;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference Group Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.ows.impl.ReferenceGroupTypeImpl#getAbstractReferenceBaseGroup <em>Abstract Reference Base Group</em>}</li>
 *   <li>{@link net.opengis.ows.impl.ReferenceGroupTypeImpl#getAbstractReferenceBase <em>Abstract Reference Base</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferenceGroupTypeImpl extends BasicIdentificationTypeImpl implements ReferenceGroupType {
	/**
	 * The cached value of the '{@link #getAbstractReferenceBaseGroup() <em>Abstract Reference Base Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractReferenceBaseGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap abstractReferenceBaseGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceGroupTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OWSPackage.Literals.REFERENCE_GROUP_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAbstractReferenceBaseGroup() {
		if (abstractReferenceBaseGroup == null) {
			abstractReferenceBaseGroup = new BasicFeatureMap(this, OWSPackage.REFERENCE_GROUP_TYPE__ABSTRACT_REFERENCE_BASE_GROUP);
		}
		return abstractReferenceBaseGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractReferenceBaseType> getAbstractReferenceBase() {
		return getAbstractReferenceBaseGroup().list(OWSPackage.Literals.REFERENCE_GROUP_TYPE__ABSTRACT_REFERENCE_BASE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OWSPackage.REFERENCE_GROUP_TYPE__ABSTRACT_REFERENCE_BASE_GROUP:
				return ((InternalEList<?>)getAbstractReferenceBaseGroup()).basicRemove(otherEnd, msgs);
			case OWSPackage.REFERENCE_GROUP_TYPE__ABSTRACT_REFERENCE_BASE:
				return ((InternalEList<?>)getAbstractReferenceBase()).basicRemove(otherEnd, msgs);
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
			case OWSPackage.REFERENCE_GROUP_TYPE__ABSTRACT_REFERENCE_BASE_GROUP:
				if (coreType) return getAbstractReferenceBaseGroup();
				return ((FeatureMap.Internal)getAbstractReferenceBaseGroup()).getWrapper();
			case OWSPackage.REFERENCE_GROUP_TYPE__ABSTRACT_REFERENCE_BASE:
				return getAbstractReferenceBase();
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
			case OWSPackage.REFERENCE_GROUP_TYPE__ABSTRACT_REFERENCE_BASE_GROUP:
				((FeatureMap.Internal)getAbstractReferenceBaseGroup()).set(newValue);
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
			case OWSPackage.REFERENCE_GROUP_TYPE__ABSTRACT_REFERENCE_BASE_GROUP:
				getAbstractReferenceBaseGroup().clear();
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
			case OWSPackage.REFERENCE_GROUP_TYPE__ABSTRACT_REFERENCE_BASE_GROUP:
				return abstractReferenceBaseGroup != null && !abstractReferenceBaseGroup.isEmpty();
			case OWSPackage.REFERENCE_GROUP_TYPE__ABSTRACT_REFERENCE_BASE:
				return !getAbstractReferenceBase().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (abstractReferenceBaseGroup: ");
		result.append(abstractReferenceBaseGroup);
		result.append(')');
		return result.toString();
	}

} //ReferenceGroupTypeImpl
