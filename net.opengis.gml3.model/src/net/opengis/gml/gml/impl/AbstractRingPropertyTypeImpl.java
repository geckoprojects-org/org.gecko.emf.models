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

import net.opengis.gml.gml.AbstractRingPropertyType;
import net.opengis.gml.gml.AbstractRingType;
import net.opengis.gml.gml.GMLPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Ring Property Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.impl.AbstractRingPropertyTypeImpl#getAbstractRingGroup <em>Abstract Ring Group</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.AbstractRingPropertyTypeImpl#getAbstractRing <em>Abstract Ring</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbstractRingPropertyTypeImpl extends MinimalEObjectImpl.Container implements AbstractRingPropertyType {
	/**
	 * The cached value of the '{@link #getAbstractRingGroup() <em>Abstract Ring Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractRingGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap abstractRingGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractRingPropertyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getAbstractRingPropertyType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAbstractRingGroup() {
		if (abstractRingGroup == null) {
			abstractRingGroup = new BasicFeatureMap(this, GMLPackage.ABSTRACT_RING_PROPERTY_TYPE__ABSTRACT_RING_GROUP);
		}
		return abstractRingGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractRingType getAbstractRing() {
		return (AbstractRingType)getAbstractRingGroup().get(GMLPackage.eINSTANCE.getAbstractRingPropertyType_AbstractRing(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractRing(AbstractRingType newAbstractRing, NotificationChain msgs) {
		return ((FeatureMap.Internal)getAbstractRingGroup()).basicAdd(GMLPackage.eINSTANCE.getAbstractRingPropertyType_AbstractRing(), newAbstractRing, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.ABSTRACT_RING_PROPERTY_TYPE__ABSTRACT_RING_GROUP:
				return ((InternalEList<?>)getAbstractRingGroup()).basicRemove(otherEnd, msgs);
			case GMLPackage.ABSTRACT_RING_PROPERTY_TYPE__ABSTRACT_RING:
				return basicSetAbstractRing(null, msgs);
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
			case GMLPackage.ABSTRACT_RING_PROPERTY_TYPE__ABSTRACT_RING_GROUP:
				if (coreType) return getAbstractRingGroup();
				return ((FeatureMap.Internal)getAbstractRingGroup()).getWrapper();
			case GMLPackage.ABSTRACT_RING_PROPERTY_TYPE__ABSTRACT_RING:
				return getAbstractRing();
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
			case GMLPackage.ABSTRACT_RING_PROPERTY_TYPE__ABSTRACT_RING_GROUP:
				((FeatureMap.Internal)getAbstractRingGroup()).set(newValue);
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
			case GMLPackage.ABSTRACT_RING_PROPERTY_TYPE__ABSTRACT_RING_GROUP:
				getAbstractRingGroup().clear();
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
			case GMLPackage.ABSTRACT_RING_PROPERTY_TYPE__ABSTRACT_RING_GROUP:
				return abstractRingGroup != null && !abstractRingGroup.isEmpty();
			case GMLPackage.ABSTRACT_RING_PROPERTY_TYPE__ABSTRACT_RING:
				return getAbstractRing() != null;
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
		result.append(" (abstractRingGroup: ");
		result.append(abstractRingGroup);
		result.append(')');
		return result.toString();
	}

} //AbstractRingPropertyTypeImpl
