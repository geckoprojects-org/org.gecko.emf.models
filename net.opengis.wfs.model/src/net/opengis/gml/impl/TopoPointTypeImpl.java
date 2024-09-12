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

import net.opengis.gml.DirectedNodePropertyType;
import net.opengis.gml.GMLPackage;
import net.opengis.gml.TopoPointType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Topo Point Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.impl.TopoPointTypeImpl#getDirectedNode <em>Directed Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TopoPointTypeImpl extends AbstractTopologyTypeImpl implements TopoPointType {
	/**
	 * The cached value of the '{@link #getDirectedNode() <em>Directed Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectedNode()
	 * @generated
	 * @ordered
	 */
	protected DirectedNodePropertyType directedNode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TopoPointTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getTopoPointType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DirectedNodePropertyType getDirectedNode() {
		return directedNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDirectedNode(DirectedNodePropertyType newDirectedNode, NotificationChain msgs) {
		DirectedNodePropertyType oldDirectedNode = directedNode;
		directedNode = newDirectedNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.TOPO_POINT_TYPE__DIRECTED_NODE, oldDirectedNode, newDirectedNode);
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
	public void setDirectedNode(DirectedNodePropertyType newDirectedNode) {
		if (newDirectedNode != directedNode) {
			NotificationChain msgs = null;
			if (directedNode != null)
				msgs = ((InternalEObject)directedNode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.TOPO_POINT_TYPE__DIRECTED_NODE, null, msgs);
			if (newDirectedNode != null)
				msgs = ((InternalEObject)newDirectedNode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.TOPO_POINT_TYPE__DIRECTED_NODE, null, msgs);
			msgs = basicSetDirectedNode(newDirectedNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.TOPO_POINT_TYPE__DIRECTED_NODE, newDirectedNode, newDirectedNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.TOPO_POINT_TYPE__DIRECTED_NODE:
				return basicSetDirectedNode(null, msgs);
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
			case GMLPackage.TOPO_POINT_TYPE__DIRECTED_NODE:
				return getDirectedNode();
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
			case GMLPackage.TOPO_POINT_TYPE__DIRECTED_NODE:
				setDirectedNode((DirectedNodePropertyType)newValue);
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
			case GMLPackage.TOPO_POINT_TYPE__DIRECTED_NODE:
				setDirectedNode((DirectedNodePropertyType)null);
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
			case GMLPackage.TOPO_POINT_TYPE__DIRECTED_NODE:
				return directedNode != null;
		}
		return super.eIsSet(featureID);
	}

} //TopoPointTypeImpl
