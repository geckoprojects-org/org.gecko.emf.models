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

import net.opengis.gml.gml.GMLPackage;
import net.opengis.gml.gml.TimeEdgeType;
import net.opengis.gml.gml.TimeNodePropertyType;
import net.opengis.gml.gml.TimePeriodPropertyType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Edge Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.impl.TimeEdgeTypeImpl#getStart <em>Start</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.TimeEdgeTypeImpl#getEnd <em>End</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.TimeEdgeTypeImpl#getExtent <em>Extent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeEdgeTypeImpl extends AbstractTimeTopologyPrimitiveTypeImpl implements TimeEdgeType {
	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected TimeNodePropertyType start;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected TimeNodePropertyType end;

	/**
	 * The cached value of the '{@link #getExtent() <em>Extent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtent()
	 * @generated
	 * @ordered
	 */
	protected TimePeriodPropertyType extent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeEdgeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getTimeEdgeType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeNodePropertyType getStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStart(TimeNodePropertyType newStart, NotificationChain msgs) {
		TimeNodePropertyType oldStart = start;
		start = newStart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.TIME_EDGE_TYPE__START, oldStart, newStart);
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
	public void setStart(TimeNodePropertyType newStart) {
		if (newStart != start) {
			NotificationChain msgs = null;
			if (start != null)
				msgs = ((InternalEObject)start).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.TIME_EDGE_TYPE__START, null, msgs);
			if (newStart != null)
				msgs = ((InternalEObject)newStart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.TIME_EDGE_TYPE__START, null, msgs);
			msgs = basicSetStart(newStart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.TIME_EDGE_TYPE__START, newStart, newStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeNodePropertyType getEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnd(TimeNodePropertyType newEnd, NotificationChain msgs) {
		TimeNodePropertyType oldEnd = end;
		end = newEnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.TIME_EDGE_TYPE__END, oldEnd, newEnd);
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
	public void setEnd(TimeNodePropertyType newEnd) {
		if (newEnd != end) {
			NotificationChain msgs = null;
			if (end != null)
				msgs = ((InternalEObject)end).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.TIME_EDGE_TYPE__END, null, msgs);
			if (newEnd != null)
				msgs = ((InternalEObject)newEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.TIME_EDGE_TYPE__END, null, msgs);
			msgs = basicSetEnd(newEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.TIME_EDGE_TYPE__END, newEnd, newEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimePeriodPropertyType getExtent() {
		return extent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtent(TimePeriodPropertyType newExtent, NotificationChain msgs) {
		TimePeriodPropertyType oldExtent = extent;
		extent = newExtent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.TIME_EDGE_TYPE__EXTENT, oldExtent, newExtent);
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
	public void setExtent(TimePeriodPropertyType newExtent) {
		if (newExtent != extent) {
			NotificationChain msgs = null;
			if (extent != null)
				msgs = ((InternalEObject)extent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.TIME_EDGE_TYPE__EXTENT, null, msgs);
			if (newExtent != null)
				msgs = ((InternalEObject)newExtent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.TIME_EDGE_TYPE__EXTENT, null, msgs);
			msgs = basicSetExtent(newExtent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.TIME_EDGE_TYPE__EXTENT, newExtent, newExtent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.TIME_EDGE_TYPE__START:
				return basicSetStart(null, msgs);
			case GMLPackage.TIME_EDGE_TYPE__END:
				return basicSetEnd(null, msgs);
			case GMLPackage.TIME_EDGE_TYPE__EXTENT:
				return basicSetExtent(null, msgs);
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
			case GMLPackage.TIME_EDGE_TYPE__START:
				return getStart();
			case GMLPackage.TIME_EDGE_TYPE__END:
				return getEnd();
			case GMLPackage.TIME_EDGE_TYPE__EXTENT:
				return getExtent();
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
			case GMLPackage.TIME_EDGE_TYPE__START:
				setStart((TimeNodePropertyType)newValue);
				return;
			case GMLPackage.TIME_EDGE_TYPE__END:
				setEnd((TimeNodePropertyType)newValue);
				return;
			case GMLPackage.TIME_EDGE_TYPE__EXTENT:
				setExtent((TimePeriodPropertyType)newValue);
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
			case GMLPackage.TIME_EDGE_TYPE__START:
				setStart((TimeNodePropertyType)null);
				return;
			case GMLPackage.TIME_EDGE_TYPE__END:
				setEnd((TimeNodePropertyType)null);
				return;
			case GMLPackage.TIME_EDGE_TYPE__EXTENT:
				setExtent((TimePeriodPropertyType)null);
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
			case GMLPackage.TIME_EDGE_TYPE__START:
				return start != null;
			case GMLPackage.TIME_EDGE_TYPE__END:
				return end != null;
			case GMLPackage.TIME_EDGE_TYPE__EXTENT:
				return extent != null;
		}
		return super.eIsSet(featureID);
	}

} //TimeEdgeTypeImpl
