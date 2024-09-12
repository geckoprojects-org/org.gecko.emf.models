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
import net.opengis.gml.RectifiedGridDomainType;
import net.opengis.gml.RectifiedGridType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rectified Grid Domain Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.impl.RectifiedGridDomainTypeImpl#getRectifiedGrid <em>Rectified Grid</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RectifiedGridDomainTypeImpl extends DomainSetTypeImpl implements RectifiedGridDomainType {
	/**
	 * The cached value of the '{@link #getRectifiedGrid() <em>Rectified Grid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRectifiedGrid()
	 * @generated
	 * @ordered
	 */
	protected RectifiedGridType rectifiedGrid;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RectifiedGridDomainTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getRectifiedGridDomainType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RectifiedGridType getRectifiedGrid() {
		return rectifiedGrid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRectifiedGrid(RectifiedGridType newRectifiedGrid, NotificationChain msgs) {
		RectifiedGridType oldRectifiedGrid = rectifiedGrid;
		rectifiedGrid = newRectifiedGrid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.RECTIFIED_GRID_DOMAIN_TYPE__RECTIFIED_GRID, oldRectifiedGrid, newRectifiedGrid);
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
	public void setRectifiedGrid(RectifiedGridType newRectifiedGrid) {
		if (newRectifiedGrid != rectifiedGrid) {
			NotificationChain msgs = null;
			if (rectifiedGrid != null)
				msgs = ((InternalEObject)rectifiedGrid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.RECTIFIED_GRID_DOMAIN_TYPE__RECTIFIED_GRID, null, msgs);
			if (newRectifiedGrid != null)
				msgs = ((InternalEObject)newRectifiedGrid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.RECTIFIED_GRID_DOMAIN_TYPE__RECTIFIED_GRID, null, msgs);
			msgs = basicSetRectifiedGrid(newRectifiedGrid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.RECTIFIED_GRID_DOMAIN_TYPE__RECTIFIED_GRID, newRectifiedGrid, newRectifiedGrid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.RECTIFIED_GRID_DOMAIN_TYPE__RECTIFIED_GRID:
				return basicSetRectifiedGrid(null, msgs);
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
			case GMLPackage.RECTIFIED_GRID_DOMAIN_TYPE__RECTIFIED_GRID:
				return getRectifiedGrid();
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
			case GMLPackage.RECTIFIED_GRID_DOMAIN_TYPE__RECTIFIED_GRID:
				setRectifiedGrid((RectifiedGridType)newValue);
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
			case GMLPackage.RECTIFIED_GRID_DOMAIN_TYPE__RECTIFIED_GRID:
				setRectifiedGrid((RectifiedGridType)null);
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
			case GMLPackage.RECTIFIED_GRID_DOMAIN_TYPE__RECTIFIED_GRID:
				return rectifiedGrid != null;
		}
		return super.eIsSet(featureID);
	}

} //RectifiedGridDomainTypeImpl
