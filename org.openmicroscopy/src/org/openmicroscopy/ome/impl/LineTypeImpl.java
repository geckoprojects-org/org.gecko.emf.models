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

import org.openmicroscopy.ome.LineType;
import org.openmicroscopy.ome.Marker;
import org.openmicroscopy.ome.OMEPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Line Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.impl.LineTypeImpl#getMarkerEnd <em>Marker End</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.LineTypeImpl#getMarkerStart <em>Marker Start</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.LineTypeImpl#getX1 <em>X1</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.LineTypeImpl#getX2 <em>X2</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.LineTypeImpl#getY1 <em>Y1</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.LineTypeImpl#getY2 <em>Y2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LineTypeImpl extends ShapeImpl implements LineType {
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
	 * The default value of the '{@link #getX1() <em>X1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX1()
	 * @generated
	 * @ordered
	 */
	protected static final float X1_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getX1() <em>X1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX1()
	 * @generated
	 * @ordered
	 */
	protected float x1 = X1_EDEFAULT;

	/**
	 * This is true if the X1 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean x1ESet;

	/**
	 * The default value of the '{@link #getX2() <em>X2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX2()
	 * @generated
	 * @ordered
	 */
	protected static final float X2_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getX2() <em>X2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX2()
	 * @generated
	 * @ordered
	 */
	protected float x2 = X2_EDEFAULT;

	/**
	 * This is true if the X2 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean x2ESet;

	/**
	 * The default value of the '{@link #getY1() <em>Y1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY1()
	 * @generated
	 * @ordered
	 */
	protected static final float Y1_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getY1() <em>Y1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY1()
	 * @generated
	 * @ordered
	 */
	protected float y1 = Y1_EDEFAULT;

	/**
	 * This is true if the Y1 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean y1ESet;

	/**
	 * The default value of the '{@link #getY2() <em>Y2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY2()
	 * @generated
	 * @ordered
	 */
	protected static final float Y2_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getY2() <em>Y2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY2()
	 * @generated
	 * @ordered
	 */
	protected float y2 = Y2_EDEFAULT;

	/**
	 * This is true if the Y2 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean y2ESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LineTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMEPackage.eINSTANCE.getLineType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.LINE_TYPE__MARKER_END, oldMarkerEnd, markerEnd, !oldMarkerEndESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.LINE_TYPE__MARKER_END, oldMarkerEnd, MARKER_END_EDEFAULT, oldMarkerEndESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.LINE_TYPE__MARKER_START, oldMarkerStart, markerStart, !oldMarkerStartESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.LINE_TYPE__MARKER_START, oldMarkerStart, MARKER_START_EDEFAULT, oldMarkerStartESet));
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
	public float getX1() {
		return x1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setX1(float newX1) {
		float oldX1 = x1;
		x1 = newX1;
		boolean oldX1ESet = x1ESet;
		x1ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.LINE_TYPE__X1, oldX1, x1, !oldX1ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetX1() {
		float oldX1 = x1;
		boolean oldX1ESet = x1ESet;
		x1 = X1_EDEFAULT;
		x1ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.LINE_TYPE__X1, oldX1, X1_EDEFAULT, oldX1ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetX1() {
		return x1ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getX2() {
		return x2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setX2(float newX2) {
		float oldX2 = x2;
		x2 = newX2;
		boolean oldX2ESet = x2ESet;
		x2ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.LINE_TYPE__X2, oldX2, x2, !oldX2ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetX2() {
		float oldX2 = x2;
		boolean oldX2ESet = x2ESet;
		x2 = X2_EDEFAULT;
		x2ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.LINE_TYPE__X2, oldX2, X2_EDEFAULT, oldX2ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetX2() {
		return x2ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getY1() {
		return y1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setY1(float newY1) {
		float oldY1 = y1;
		y1 = newY1;
		boolean oldY1ESet = y1ESet;
		y1ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.LINE_TYPE__Y1, oldY1, y1, !oldY1ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetY1() {
		float oldY1 = y1;
		boolean oldY1ESet = y1ESet;
		y1 = Y1_EDEFAULT;
		y1ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.LINE_TYPE__Y1, oldY1, Y1_EDEFAULT, oldY1ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetY1() {
		return y1ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getY2() {
		return y2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setY2(float newY2) {
		float oldY2 = y2;
		y2 = newY2;
		boolean oldY2ESet = y2ESet;
		y2ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.LINE_TYPE__Y2, oldY2, y2, !oldY2ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetY2() {
		float oldY2 = y2;
		boolean oldY2ESet = y2ESet;
		y2 = Y2_EDEFAULT;
		y2ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.LINE_TYPE__Y2, oldY2, Y2_EDEFAULT, oldY2ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetY2() {
		return y2ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OMEPackage.LINE_TYPE__MARKER_END:
				return getMarkerEnd();
			case OMEPackage.LINE_TYPE__MARKER_START:
				return getMarkerStart();
			case OMEPackage.LINE_TYPE__X1:
				return getX1();
			case OMEPackage.LINE_TYPE__X2:
				return getX2();
			case OMEPackage.LINE_TYPE__Y1:
				return getY1();
			case OMEPackage.LINE_TYPE__Y2:
				return getY2();
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
			case OMEPackage.LINE_TYPE__MARKER_END:
				setMarkerEnd((Marker)newValue);
				return;
			case OMEPackage.LINE_TYPE__MARKER_START:
				setMarkerStart((Marker)newValue);
				return;
			case OMEPackage.LINE_TYPE__X1:
				setX1((Float)newValue);
				return;
			case OMEPackage.LINE_TYPE__X2:
				setX2((Float)newValue);
				return;
			case OMEPackage.LINE_TYPE__Y1:
				setY1((Float)newValue);
				return;
			case OMEPackage.LINE_TYPE__Y2:
				setY2((Float)newValue);
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
			case OMEPackage.LINE_TYPE__MARKER_END:
				unsetMarkerEnd();
				return;
			case OMEPackage.LINE_TYPE__MARKER_START:
				unsetMarkerStart();
				return;
			case OMEPackage.LINE_TYPE__X1:
				unsetX1();
				return;
			case OMEPackage.LINE_TYPE__X2:
				unsetX2();
				return;
			case OMEPackage.LINE_TYPE__Y1:
				unsetY1();
				return;
			case OMEPackage.LINE_TYPE__Y2:
				unsetY2();
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
			case OMEPackage.LINE_TYPE__MARKER_END:
				return isSetMarkerEnd();
			case OMEPackage.LINE_TYPE__MARKER_START:
				return isSetMarkerStart();
			case OMEPackage.LINE_TYPE__X1:
				return isSetX1();
			case OMEPackage.LINE_TYPE__X2:
				return isSetX2();
			case OMEPackage.LINE_TYPE__Y1:
				return isSetY1();
			case OMEPackage.LINE_TYPE__Y2:
				return isSetY2();
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
		result.append(", x1: ");
		if (x1ESet) result.append(x1); else result.append("<unset>");
		result.append(", x2: ");
		if (x2ESet) result.append(x2); else result.append("<unset>");
		result.append(", y1: ");
		if (y1ESet) result.append(y1); else result.append("<unset>");
		result.append(", y2: ");
		if (y2ESet) result.append(y2); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //LineTypeImpl
