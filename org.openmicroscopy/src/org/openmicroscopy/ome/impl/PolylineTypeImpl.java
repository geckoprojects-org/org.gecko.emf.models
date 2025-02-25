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
package org.openmicroscopy.ome.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.openmicroscopy.ome.Marker;
import org.openmicroscopy.ome.OMEPackage;
import org.openmicroscopy.ome.PolylineType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Polyline Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.impl.PolylineTypeImpl#getMarkerEnd <em>Marker End</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.PolylineTypeImpl#getMarkerStart <em>Marker Start</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.PolylineTypeImpl#getPoints <em>Points</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PolylineTypeImpl extends ShapeImpl implements PolylineType {
	/**
	 * The default value of the '{@link #getMarkerEnd() <em>Marker End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarkerEnd()
	 * @generated
	 * @ordered
	 */
	protected static final Marker MARKER_END_EDEFAULT = Marker.ARROW;

	/**
	 * The cached value of the '{@link #getMarkerEnd() <em>Marker End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarkerEnd()
	 * @generated
	 * @ordered
	 */
	protected Marker markerEnd = MARKER_END_EDEFAULT;

	/**
	 * This is true if the Marker End attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean markerEndESet;

	/**
	 * The default value of the '{@link #getMarkerStart() <em>Marker Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarkerStart()
	 * @generated
	 * @ordered
	 */
	protected static final Marker MARKER_START_EDEFAULT = Marker.ARROW;

	/**
	 * The cached value of the '{@link #getMarkerStart() <em>Marker Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarkerStart()
	 * @generated
	 * @ordered
	 */
	protected Marker markerStart = MARKER_START_EDEFAULT;

	/**
	 * This is true if the Marker Start attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean markerStartESet;

	/**
	 * The default value of the '{@link #getPoints() <em>Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoints()
	 * @generated
	 * @ordered
	 */
	protected static final String POINTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPoints() <em>Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoints()
	 * @generated
	 * @ordered
	 */
	protected String points = POINTS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PolylineTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMEPackage.eINSTANCE.getPolylineType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Marker getMarkerEnd() {
		return markerEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMarkerEnd(Marker newMarkerEnd) {
		Marker oldMarkerEnd = markerEnd;
		markerEnd = newMarkerEnd == null ? MARKER_END_EDEFAULT : newMarkerEnd;
		boolean oldMarkerEndESet = markerEndESet;
		markerEndESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.POLYLINE_TYPE__MARKER_END, oldMarkerEnd, markerEnd, !oldMarkerEndESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMarkerEnd() {
		Marker oldMarkerEnd = markerEnd;
		boolean oldMarkerEndESet = markerEndESet;
		markerEnd = MARKER_END_EDEFAULT;
		markerEndESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.POLYLINE_TYPE__MARKER_END, oldMarkerEnd, MARKER_END_EDEFAULT, oldMarkerEndESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMarkerEnd() {
		return markerEndESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Marker getMarkerStart() {
		return markerStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMarkerStart(Marker newMarkerStart) {
		Marker oldMarkerStart = markerStart;
		markerStart = newMarkerStart == null ? MARKER_START_EDEFAULT : newMarkerStart;
		boolean oldMarkerStartESet = markerStartESet;
		markerStartESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.POLYLINE_TYPE__MARKER_START, oldMarkerStart, markerStart, !oldMarkerStartESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMarkerStart() {
		Marker oldMarkerStart = markerStart;
		boolean oldMarkerStartESet = markerStartESet;
		markerStart = MARKER_START_EDEFAULT;
		markerStartESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.POLYLINE_TYPE__MARKER_START, oldMarkerStart, MARKER_START_EDEFAULT, oldMarkerStartESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMarkerStart() {
		return markerStartESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPoints() {
		return points;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPoints(String newPoints) {
		String oldPoints = points;
		points = newPoints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.POLYLINE_TYPE__POINTS, oldPoints, points));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OMEPackage.POLYLINE_TYPE__MARKER_END:
				return getMarkerEnd();
			case OMEPackage.POLYLINE_TYPE__MARKER_START:
				return getMarkerStart();
			case OMEPackage.POLYLINE_TYPE__POINTS:
				return getPoints();
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
			case OMEPackage.POLYLINE_TYPE__MARKER_END:
				setMarkerEnd((Marker)newValue);
				return;
			case OMEPackage.POLYLINE_TYPE__MARKER_START:
				setMarkerStart((Marker)newValue);
				return;
			case OMEPackage.POLYLINE_TYPE__POINTS:
				setPoints((String)newValue);
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
			case OMEPackage.POLYLINE_TYPE__MARKER_END:
				unsetMarkerEnd();
				return;
			case OMEPackage.POLYLINE_TYPE__MARKER_START:
				unsetMarkerStart();
				return;
			case OMEPackage.POLYLINE_TYPE__POINTS:
				setPoints(POINTS_EDEFAULT);
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
			case OMEPackage.POLYLINE_TYPE__MARKER_END:
				return isSetMarkerEnd();
			case OMEPackage.POLYLINE_TYPE__MARKER_START:
				return isSetMarkerStart();
			case OMEPackage.POLYLINE_TYPE__POINTS:
				return POINTS_EDEFAULT == null ? points != null : !POINTS_EDEFAULT.equals(points);
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
		result.append(" (markerEnd: ");
		if (markerEndESet) result.append(markerEnd); else result.append("<unset>");
		result.append(", markerStart: ");
		if (markerStartESet) result.append(markerStart); else result.append("<unset>");
		result.append(", points: ");
		result.append(points);
		result.append(')');
		return result.toString();
	}

} //PolylineTypeImpl
