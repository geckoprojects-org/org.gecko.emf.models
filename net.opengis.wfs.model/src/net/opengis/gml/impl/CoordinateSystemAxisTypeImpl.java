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

import net.opengis.gml.CodeType;
import net.opengis.gml.CoordinateSystemAxisType;
import net.opengis.gml.GMLPackage;
import net.opengis.gml.IdentifierType;
import net.opengis.gml.StringOrRefType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coordinate System Axis Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.impl.CoordinateSystemAxisTypeImpl#getAxisID <em>Axis ID</em>}</li>
 *   <li>{@link net.opengis.gml.impl.CoordinateSystemAxisTypeImpl#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link net.opengis.gml.impl.CoordinateSystemAxisTypeImpl#getAxisAbbrev <em>Axis Abbrev</em>}</li>
 *   <li>{@link net.opengis.gml.impl.CoordinateSystemAxisTypeImpl#getAxisDirection <em>Axis Direction</em>}</li>
 *   <li>{@link net.opengis.gml.impl.CoordinateSystemAxisTypeImpl#getUom <em>Uom</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoordinateSystemAxisTypeImpl extends CoordinateSystemAxisBaseTypeImpl implements CoordinateSystemAxisType {
	/**
	 * The cached value of the '{@link #getAxisID() <em>Axis ID</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxisID()
	 * @generated
	 * @ordered
	 */
	protected EList<IdentifierType> axisID;

	/**
	 * The cached value of the '{@link #getRemarks() <em>Remarks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemarks()
	 * @generated
	 * @ordered
	 */
	protected StringOrRefType remarks;

	/**
	 * The cached value of the '{@link #getAxisAbbrev() <em>Axis Abbrev</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxisAbbrev()
	 * @generated
	 * @ordered
	 */
	protected CodeType axisAbbrev;

	/**
	 * The cached value of the '{@link #getAxisDirection() <em>Axis Direction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxisDirection()
	 * @generated
	 * @ordered
	 */
	protected CodeType axisDirection;

	/**
	 * The default value of the '{@link #getUom() <em>Uom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUom()
	 * @generated
	 * @ordered
	 */
	protected static final String UOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUom() <em>Uom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUom()
	 * @generated
	 * @ordered
	 */
	protected String uom = UOM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoordinateSystemAxisTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getCoordinateSystemAxisType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IdentifierType> getAxisID() {
		if (axisID == null) {
			axisID = new EObjectContainmentEList<IdentifierType>(IdentifierType.class, this, GMLPackage.COORDINATE_SYSTEM_AXIS_TYPE__AXIS_ID);
		}
		return axisID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringOrRefType getRemarks() {
		return remarks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRemarks(StringOrRefType newRemarks, NotificationChain msgs) {
		StringOrRefType oldRemarks = remarks;
		remarks = newRemarks;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.COORDINATE_SYSTEM_AXIS_TYPE__REMARKS, oldRemarks, newRemarks);
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
	public void setRemarks(StringOrRefType newRemarks) {
		if (newRemarks != remarks) {
			NotificationChain msgs = null;
			if (remarks != null)
				msgs = ((InternalEObject)remarks).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.COORDINATE_SYSTEM_AXIS_TYPE__REMARKS, null, msgs);
			if (newRemarks != null)
				msgs = ((InternalEObject)newRemarks).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.COORDINATE_SYSTEM_AXIS_TYPE__REMARKS, null, msgs);
			msgs = basicSetRemarks(newRemarks, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.COORDINATE_SYSTEM_AXIS_TYPE__REMARKS, newRemarks, newRemarks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeType getAxisAbbrev() {
		return axisAbbrev;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAxisAbbrev(CodeType newAxisAbbrev, NotificationChain msgs) {
		CodeType oldAxisAbbrev = axisAbbrev;
		axisAbbrev = newAxisAbbrev;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.COORDINATE_SYSTEM_AXIS_TYPE__AXIS_ABBREV, oldAxisAbbrev, newAxisAbbrev);
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
	public void setAxisAbbrev(CodeType newAxisAbbrev) {
		if (newAxisAbbrev != axisAbbrev) {
			NotificationChain msgs = null;
			if (axisAbbrev != null)
				msgs = ((InternalEObject)axisAbbrev).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.COORDINATE_SYSTEM_AXIS_TYPE__AXIS_ABBREV, null, msgs);
			if (newAxisAbbrev != null)
				msgs = ((InternalEObject)newAxisAbbrev).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.COORDINATE_SYSTEM_AXIS_TYPE__AXIS_ABBREV, null, msgs);
			msgs = basicSetAxisAbbrev(newAxisAbbrev, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.COORDINATE_SYSTEM_AXIS_TYPE__AXIS_ABBREV, newAxisAbbrev, newAxisAbbrev));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeType getAxisDirection() {
		return axisDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAxisDirection(CodeType newAxisDirection, NotificationChain msgs) {
		CodeType oldAxisDirection = axisDirection;
		axisDirection = newAxisDirection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.COORDINATE_SYSTEM_AXIS_TYPE__AXIS_DIRECTION, oldAxisDirection, newAxisDirection);
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
	public void setAxisDirection(CodeType newAxisDirection) {
		if (newAxisDirection != axisDirection) {
			NotificationChain msgs = null;
			if (axisDirection != null)
				msgs = ((InternalEObject)axisDirection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.COORDINATE_SYSTEM_AXIS_TYPE__AXIS_DIRECTION, null, msgs);
			if (newAxisDirection != null)
				msgs = ((InternalEObject)newAxisDirection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.COORDINATE_SYSTEM_AXIS_TYPE__AXIS_DIRECTION, null, msgs);
			msgs = basicSetAxisDirection(newAxisDirection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.COORDINATE_SYSTEM_AXIS_TYPE__AXIS_DIRECTION, newAxisDirection, newAxisDirection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUom() {
		return uom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUom(String newUom) {
		String oldUom = uom;
		uom = newUom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.COORDINATE_SYSTEM_AXIS_TYPE__UOM, oldUom, uom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.COORDINATE_SYSTEM_AXIS_TYPE__AXIS_ID:
				return ((InternalEList<?>)getAxisID()).basicRemove(otherEnd, msgs);
			case GMLPackage.COORDINATE_SYSTEM_AXIS_TYPE__REMARKS:
				return basicSetRemarks(null, msgs);
			case GMLPackage.COORDINATE_SYSTEM_AXIS_TYPE__AXIS_ABBREV:
				return basicSetAxisAbbrev(null, msgs);
			case GMLPackage.COORDINATE_SYSTEM_AXIS_TYPE__AXIS_DIRECTION:
				return basicSetAxisDirection(null, msgs);
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
			case GMLPackage.COORDINATE_SYSTEM_AXIS_TYPE__AXIS_ID:
				return getAxisID();
			case GMLPackage.COORDINATE_SYSTEM_AXIS_TYPE__REMARKS:
				return getRemarks();
			case GMLPackage.COORDINATE_SYSTEM_AXIS_TYPE__AXIS_ABBREV:
				return getAxisAbbrev();
			case GMLPackage.COORDINATE_SYSTEM_AXIS_TYPE__AXIS_DIRECTION:
				return getAxisDirection();
			case GMLPackage.COORDINATE_SYSTEM_AXIS_TYPE__UOM:
				return getUom();
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
			case GMLPackage.COORDINATE_SYSTEM_AXIS_TYPE__AXIS_ID:
				getAxisID().clear();
				getAxisID().addAll((Collection<? extends IdentifierType>)newValue);
				return;
			case GMLPackage.COORDINATE_SYSTEM_AXIS_TYPE__REMARKS:
				setRemarks((StringOrRefType)newValue);
				return;
			case GMLPackage.COORDINATE_SYSTEM_AXIS_TYPE__AXIS_ABBREV:
				setAxisAbbrev((CodeType)newValue);
				return;
			case GMLPackage.COORDINATE_SYSTEM_AXIS_TYPE__AXIS_DIRECTION:
				setAxisDirection((CodeType)newValue);
				return;
			case GMLPackage.COORDINATE_SYSTEM_AXIS_TYPE__UOM:
				setUom((String)newValue);
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
			case GMLPackage.COORDINATE_SYSTEM_AXIS_TYPE__AXIS_ID:
				getAxisID().clear();
				return;
			case GMLPackage.COORDINATE_SYSTEM_AXIS_TYPE__REMARKS:
				setRemarks((StringOrRefType)null);
				return;
			case GMLPackage.COORDINATE_SYSTEM_AXIS_TYPE__AXIS_ABBREV:
				setAxisAbbrev((CodeType)null);
				return;
			case GMLPackage.COORDINATE_SYSTEM_AXIS_TYPE__AXIS_DIRECTION:
				setAxisDirection((CodeType)null);
				return;
			case GMLPackage.COORDINATE_SYSTEM_AXIS_TYPE__UOM:
				setUom(UOM_EDEFAULT);
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
			case GMLPackage.COORDINATE_SYSTEM_AXIS_TYPE__AXIS_ID:
				return axisID != null && !axisID.isEmpty();
			case GMLPackage.COORDINATE_SYSTEM_AXIS_TYPE__REMARKS:
				return remarks != null;
			case GMLPackage.COORDINATE_SYSTEM_AXIS_TYPE__AXIS_ABBREV:
				return axisAbbrev != null;
			case GMLPackage.COORDINATE_SYSTEM_AXIS_TYPE__AXIS_DIRECTION:
				return axisDirection != null;
			case GMLPackage.COORDINATE_SYSTEM_AXIS_TYPE__UOM:
				return UOM_EDEFAULT == null ? uom != null : !UOM_EDEFAULT.equals(uom);
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
		result.append(" (uom: ");
		result.append(uom);
		result.append(')');
		return result.toString();
	}

} //CoordinateSystemAxisTypeImpl
