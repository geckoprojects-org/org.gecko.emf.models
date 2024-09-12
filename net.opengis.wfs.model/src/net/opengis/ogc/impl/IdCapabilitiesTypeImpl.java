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
package net.opengis.ogc.impl;

import java.util.Collection;

import net.opengis.ogc.EIDType;
import net.opengis.ogc.FIDType;
import net.opengis.ogc.IdCapabilitiesType;
import net.opengis.ogc.OGCPackage;

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
 * An implementation of the model object '<em><b>Id Capabilities Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.ogc.impl.IdCapabilitiesTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.IdCapabilitiesTypeImpl#getEID <em>EID</em>}</li>
 *   <li>{@link net.opengis.ogc.impl.IdCapabilitiesTypeImpl#getFID <em>FID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IdCapabilitiesTypeImpl extends MinimalEObjectImpl.Container implements IdCapabilitiesType {
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
	protected IdCapabilitiesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OGCPackage.Literals.ID_CAPABILITIES_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, OGCPackage.ID_CAPABILITIES_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EIDType> getEID() {
		return getGroup().list(OGCPackage.Literals.ID_CAPABILITIES_TYPE__EID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FIDType> getFID() {
		return getGroup().list(OGCPackage.Literals.ID_CAPABILITIES_TYPE__FID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OGCPackage.ID_CAPABILITIES_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case OGCPackage.ID_CAPABILITIES_TYPE__EID:
				return ((InternalEList<?>)getEID()).basicRemove(otherEnd, msgs);
			case OGCPackage.ID_CAPABILITIES_TYPE__FID:
				return ((InternalEList<?>)getFID()).basicRemove(otherEnd, msgs);
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
			case OGCPackage.ID_CAPABILITIES_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case OGCPackage.ID_CAPABILITIES_TYPE__EID:
				return getEID();
			case OGCPackage.ID_CAPABILITIES_TYPE__FID:
				return getFID();
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
			case OGCPackage.ID_CAPABILITIES_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case OGCPackage.ID_CAPABILITIES_TYPE__EID:
				getEID().clear();
				getEID().addAll((Collection<? extends EIDType>)newValue);
				return;
			case OGCPackage.ID_CAPABILITIES_TYPE__FID:
				getFID().clear();
				getFID().addAll((Collection<? extends FIDType>)newValue);
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
			case OGCPackage.ID_CAPABILITIES_TYPE__GROUP:
				getGroup().clear();
				return;
			case OGCPackage.ID_CAPABILITIES_TYPE__EID:
				getEID().clear();
				return;
			case OGCPackage.ID_CAPABILITIES_TYPE__FID:
				getFID().clear();
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
			case OGCPackage.ID_CAPABILITIES_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case OGCPackage.ID_CAPABILITIES_TYPE__EID:
				return !getEID().isEmpty();
			case OGCPackage.ID_CAPABILITIES_TYPE__FID:
				return !getFID().isEmpty();
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

} //IdCapabilitiesTypeImpl
