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

import java.math.BigInteger;

import net.opengis.gml.gml.AbstractGriddedSurfaceType;
import net.opengis.gml.gml.GMLPackage;
import net.opengis.gml.gml.RowsType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Gridded Surface Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.impl.AbstractGriddedSurfaceTypeImpl#getRows <em>Rows</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.AbstractGriddedSurfaceTypeImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.AbstractGriddedSurfaceTypeImpl#getRows1 <em>Rows1</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractGriddedSurfaceTypeImpl extends AbstractParametricCurveSurfaceTypeImpl implements AbstractGriddedSurfaceType {
	/**
	 * The cached value of the '{@link #getRows() <em>Rows</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRows()
	 * @generated
	 * @ordered
	 */
	protected RowsType rows;

	/**
	 * The default value of the '{@link #getColumns() <em>Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger COLUMNS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColumns() <em>Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected BigInteger columns = COLUMNS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRows1() <em>Rows1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRows1()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger ROWS1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRows1() <em>Rows1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRows1()
	 * @generated
	 * @ordered
	 */
	protected BigInteger rows1 = ROWS1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractGriddedSurfaceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getAbstractGriddedSurfaceType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RowsType getRows() {
		return rows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRows(RowsType newRows, NotificationChain msgs) {
		RowsType oldRows = rows;
		rows = newRows;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.ABSTRACT_GRIDDED_SURFACE_TYPE__ROWS, oldRows, newRows);
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
	public void setRows(RowsType newRows) {
		if (newRows != rows) {
			NotificationChain msgs = null;
			if (rows != null)
				msgs = ((InternalEObject)rows).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.ABSTRACT_GRIDDED_SURFACE_TYPE__ROWS, null, msgs);
			if (newRows != null)
				msgs = ((InternalEObject)newRows).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.ABSTRACT_GRIDDED_SURFACE_TYPE__ROWS, null, msgs);
			msgs = basicSetRows(newRows, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.ABSTRACT_GRIDDED_SURFACE_TYPE__ROWS, newRows, newRows));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getColumns() {
		return columns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColumns(BigInteger newColumns) {
		BigInteger oldColumns = columns;
		columns = newColumns;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.ABSTRACT_GRIDDED_SURFACE_TYPE__COLUMNS, oldColumns, columns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getRows1() {
		return rows1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRows1(BigInteger newRows1) {
		BigInteger oldRows1 = rows1;
		rows1 = newRows1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.ABSTRACT_GRIDDED_SURFACE_TYPE__ROWS1, oldRows1, rows1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.ABSTRACT_GRIDDED_SURFACE_TYPE__ROWS:
				return basicSetRows(null, msgs);
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
			case GMLPackage.ABSTRACT_GRIDDED_SURFACE_TYPE__ROWS:
				return getRows();
			case GMLPackage.ABSTRACT_GRIDDED_SURFACE_TYPE__COLUMNS:
				return getColumns();
			case GMLPackage.ABSTRACT_GRIDDED_SURFACE_TYPE__ROWS1:
				return getRows1();
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
			case GMLPackage.ABSTRACT_GRIDDED_SURFACE_TYPE__ROWS:
				setRows((RowsType)newValue);
				return;
			case GMLPackage.ABSTRACT_GRIDDED_SURFACE_TYPE__COLUMNS:
				setColumns((BigInteger)newValue);
				return;
			case GMLPackage.ABSTRACT_GRIDDED_SURFACE_TYPE__ROWS1:
				setRows1((BigInteger)newValue);
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
			case GMLPackage.ABSTRACT_GRIDDED_SURFACE_TYPE__ROWS:
				setRows((RowsType)null);
				return;
			case GMLPackage.ABSTRACT_GRIDDED_SURFACE_TYPE__COLUMNS:
				setColumns(COLUMNS_EDEFAULT);
				return;
			case GMLPackage.ABSTRACT_GRIDDED_SURFACE_TYPE__ROWS1:
				setRows1(ROWS1_EDEFAULT);
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
			case GMLPackage.ABSTRACT_GRIDDED_SURFACE_TYPE__ROWS:
				return rows != null;
			case GMLPackage.ABSTRACT_GRIDDED_SURFACE_TYPE__COLUMNS:
				return COLUMNS_EDEFAULT == null ? columns != null : !COLUMNS_EDEFAULT.equals(columns);
			case GMLPackage.ABSTRACT_GRIDDED_SURFACE_TYPE__ROWS1:
				return ROWS1_EDEFAULT == null ? rows1 != null : !ROWS1_EDEFAULT.equals(rows1);
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
		result.append(" (columns: ");
		result.append(columns);
		result.append(", rows1: ");
		result.append(rows1);
		result.append(')');
		return result.toString();
	}

} //AbstractGriddedSurfaceTypeImpl
