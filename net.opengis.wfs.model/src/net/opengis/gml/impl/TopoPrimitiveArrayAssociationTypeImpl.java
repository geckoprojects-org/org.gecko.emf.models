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

import net.opengis.gml.AbstractTopoPrimitiveType;
import net.opengis.gml.GMLPackage;
import net.opengis.gml.TopoPrimitiveArrayAssociationType;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Topo Primitive Array Association Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.impl.TopoPrimitiveArrayAssociationTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link net.opengis.gml.impl.TopoPrimitiveArrayAssociationTypeImpl#getTopoPrimitiveGroup <em>Topo Primitive Group</em>}</li>
 *   <li>{@link net.opengis.gml.impl.TopoPrimitiveArrayAssociationTypeImpl#getTopoPrimitive <em>Topo Primitive</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TopoPrimitiveArrayAssociationTypeImpl extends MinimalEObjectImpl.Container implements TopoPrimitiveArrayAssociationType {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TopoPrimitiveArrayAssociationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getTopoPrimitiveArrayAssociationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, GMLPackage.TOPO_PRIMITIVE_ARRAY_ASSOCIATION_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getTopoPrimitiveGroup() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(GMLPackage.eINSTANCE.getTopoPrimitiveArrayAssociationType_TopoPrimitiveGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractTopoPrimitiveType> getTopoPrimitive() {
		return getTopoPrimitiveGroup().list(GMLPackage.eINSTANCE.getTopoPrimitiveArrayAssociationType_TopoPrimitive());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.TOPO_PRIMITIVE_ARRAY_ASSOCIATION_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case GMLPackage.TOPO_PRIMITIVE_ARRAY_ASSOCIATION_TYPE__TOPO_PRIMITIVE_GROUP:
				return ((InternalEList<?>)getTopoPrimitiveGroup()).basicRemove(otherEnd, msgs);
			case GMLPackage.TOPO_PRIMITIVE_ARRAY_ASSOCIATION_TYPE__TOPO_PRIMITIVE:
				return ((InternalEList<?>)getTopoPrimitive()).basicRemove(otherEnd, msgs);
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
			case GMLPackage.TOPO_PRIMITIVE_ARRAY_ASSOCIATION_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case GMLPackage.TOPO_PRIMITIVE_ARRAY_ASSOCIATION_TYPE__TOPO_PRIMITIVE_GROUP:
				if (coreType) return getTopoPrimitiveGroup();
				return ((FeatureMap.Internal)getTopoPrimitiveGroup()).getWrapper();
			case GMLPackage.TOPO_PRIMITIVE_ARRAY_ASSOCIATION_TYPE__TOPO_PRIMITIVE:
				return getTopoPrimitive();
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
			case GMLPackage.TOPO_PRIMITIVE_ARRAY_ASSOCIATION_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case GMLPackage.TOPO_PRIMITIVE_ARRAY_ASSOCIATION_TYPE__TOPO_PRIMITIVE_GROUP:
				((FeatureMap.Internal)getTopoPrimitiveGroup()).set(newValue);
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
			case GMLPackage.TOPO_PRIMITIVE_ARRAY_ASSOCIATION_TYPE__GROUP:
				getGroup().clear();
				return;
			case GMLPackage.TOPO_PRIMITIVE_ARRAY_ASSOCIATION_TYPE__TOPO_PRIMITIVE_GROUP:
				getTopoPrimitiveGroup().clear();
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
			case GMLPackage.TOPO_PRIMITIVE_ARRAY_ASSOCIATION_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case GMLPackage.TOPO_PRIMITIVE_ARRAY_ASSOCIATION_TYPE__TOPO_PRIMITIVE_GROUP:
				return !getTopoPrimitiveGroup().isEmpty();
			case GMLPackage.TOPO_PRIMITIVE_ARRAY_ASSOCIATION_TYPE__TOPO_PRIMITIVE:
				return !getTopoPrimitive().isEmpty();
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
		result.append(" (group: ");
		result.append(group);
		result.append(')');
		return result.toString();
	}

} //TopoPrimitiveArrayAssociationTypeImpl
