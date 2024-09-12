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

import net.opengis.gml.DirectedTopoSolidPropertyType;
import net.opengis.gml.GMLPackage;
import net.opengis.gml.TopoVolumeType;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Topo Volume Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.impl.TopoVolumeTypeImpl#getDirectedTopoSolid <em>Directed Topo Solid</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TopoVolumeTypeImpl extends AbstractTopologyTypeImpl implements TopoVolumeType {
	/**
	 * The cached value of the '{@link #getDirectedTopoSolid() <em>Directed Topo Solid</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectedTopoSolid()
	 * @generated
	 * @ordered
	 */
	protected EList<DirectedTopoSolidPropertyType> directedTopoSolid;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TopoVolumeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getTopoVolumeType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DirectedTopoSolidPropertyType> getDirectedTopoSolid() {
		if (directedTopoSolid == null) {
			directedTopoSolid = new EObjectContainmentEList<DirectedTopoSolidPropertyType>(DirectedTopoSolidPropertyType.class, this, GMLPackage.TOPO_VOLUME_TYPE__DIRECTED_TOPO_SOLID);
		}
		return directedTopoSolid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.TOPO_VOLUME_TYPE__DIRECTED_TOPO_SOLID:
				return ((InternalEList<?>)getDirectedTopoSolid()).basicRemove(otherEnd, msgs);
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
			case GMLPackage.TOPO_VOLUME_TYPE__DIRECTED_TOPO_SOLID:
				return getDirectedTopoSolid();
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
			case GMLPackage.TOPO_VOLUME_TYPE__DIRECTED_TOPO_SOLID:
				getDirectedTopoSolid().clear();
				getDirectedTopoSolid().addAll((Collection<? extends DirectedTopoSolidPropertyType>)newValue);
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
			case GMLPackage.TOPO_VOLUME_TYPE__DIRECTED_TOPO_SOLID:
				getDirectedTopoSolid().clear();
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
			case GMLPackage.TOPO_VOLUME_TYPE__DIRECTED_TOPO_SOLID:
				return directedTopoSolid != null && !directedTopoSolid.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TopoVolumeTypeImpl
