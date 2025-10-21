/*
 * Copyright (c) 2012 - 2025 Data In Motion and others.
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
package de.online.adv.namespaces.adv.sk.xml.skadv.impl;

import de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage;
import de.online.adv.namespaces.adv.sk.xml.skadv.BottomEdgeType;
import de.online.adv.namespaces.adv.sk.xml.skadv.SlopeHatchLinesType;
import de.online.adv.namespaces.adv.sk.xml.skadv.TopEdgeType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Slope Hatch Lines Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.SlopeHatchLinesTypeImpl#getSecondHatchLineFactor <em>Second Hatch Line Factor</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.SlopeHatchLinesTypeImpl#getHatchDistance <em>Hatch Distance</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.SlopeHatchLinesTypeImpl#getTopEdge <em>Top Edge</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.SlopeHatchLinesTypeImpl#getBottomEdge <em>Bottom Edge</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SlopeHatchLinesTypeImpl extends PlacementRuleTypeImpl implements SlopeHatchLinesType {
	/**
	 * The default value of the '{@link #getSecondHatchLineFactor() <em>Second Hatch Line Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondHatchLineFactor()
	 * @generated
	 * @ordered
	 */
	protected static final double SECOND_HATCH_LINE_FACTOR_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSecondHatchLineFactor() <em>Second Hatch Line Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondHatchLineFactor()
	 * @generated
	 * @ordered
	 */
	protected double secondHatchLineFactor = SECOND_HATCH_LINE_FACTOR_EDEFAULT;

	/**
	 * This is true if the Second Hatch Line Factor attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean secondHatchLineFactorESet;

	/**
	 * The default value of the '{@link #getHatchDistance() <em>Hatch Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHatchDistance()
	 * @generated
	 * @ordered
	 */
	protected static final double HATCH_DISTANCE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getHatchDistance() <em>Hatch Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHatchDistance()
	 * @generated
	 * @ordered
	 */
	protected double hatchDistance = HATCH_DISTANCE_EDEFAULT;

	/**
	 * This is true if the Hatch Distance attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean hatchDistanceESet;

	/**
	 * The cached value of the '{@link #getTopEdge() <em>Top Edge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopEdge()
	 * @generated
	 * @ordered
	 */
	protected TopEdgeType topEdge;

	/**
	 * The cached value of the '{@link #getBottomEdge() <em>Bottom Edge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBottomEdge()
	 * @generated
	 * @ordered
	 */
	protected BottomEdgeType bottomEdge;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SlopeHatchLinesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AAAPackage.eINSTANCE.getSlopeHatchLinesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getSecondHatchLineFactor() {
		return secondHatchLineFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecondHatchLineFactor(double newSecondHatchLineFactor) {
		double oldSecondHatchLineFactor = secondHatchLineFactor;
		secondHatchLineFactor = newSecondHatchLineFactor;
		boolean oldSecondHatchLineFactorESet = secondHatchLineFactorESet;
		secondHatchLineFactorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.SLOPE_HATCH_LINES_TYPE__SECOND_HATCH_LINE_FACTOR, oldSecondHatchLineFactor, secondHatchLineFactor, !oldSecondHatchLineFactorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSecondHatchLineFactor() {
		double oldSecondHatchLineFactor = secondHatchLineFactor;
		boolean oldSecondHatchLineFactorESet = secondHatchLineFactorESet;
		secondHatchLineFactor = SECOND_HATCH_LINE_FACTOR_EDEFAULT;
		secondHatchLineFactorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AAAPackage.SLOPE_HATCH_LINES_TYPE__SECOND_HATCH_LINE_FACTOR, oldSecondHatchLineFactor, SECOND_HATCH_LINE_FACTOR_EDEFAULT, oldSecondHatchLineFactorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSecondHatchLineFactor() {
		return secondHatchLineFactorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getHatchDistance() {
		return hatchDistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHatchDistance(double newHatchDistance) {
		double oldHatchDistance = hatchDistance;
		hatchDistance = newHatchDistance;
		boolean oldHatchDistanceESet = hatchDistanceESet;
		hatchDistanceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.SLOPE_HATCH_LINES_TYPE__HATCH_DISTANCE, oldHatchDistance, hatchDistance, !oldHatchDistanceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetHatchDistance() {
		double oldHatchDistance = hatchDistance;
		boolean oldHatchDistanceESet = hatchDistanceESet;
		hatchDistance = HATCH_DISTANCE_EDEFAULT;
		hatchDistanceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AAAPackage.SLOPE_HATCH_LINES_TYPE__HATCH_DISTANCE, oldHatchDistance, HATCH_DISTANCE_EDEFAULT, oldHatchDistanceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetHatchDistance() {
		return hatchDistanceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TopEdgeType getTopEdge() {
		return topEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTopEdge(TopEdgeType newTopEdge, NotificationChain msgs) {
		TopEdgeType oldTopEdge = topEdge;
		topEdge = newTopEdge;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AAAPackage.SLOPE_HATCH_LINES_TYPE__TOP_EDGE, oldTopEdge, newTopEdge);
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
	public void setTopEdge(TopEdgeType newTopEdge) {
		if (newTopEdge != topEdge) {
			NotificationChain msgs = null;
			if (topEdge != null)
				msgs = ((InternalEObject)topEdge).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AAAPackage.SLOPE_HATCH_LINES_TYPE__TOP_EDGE, null, msgs);
			if (newTopEdge != null)
				msgs = ((InternalEObject)newTopEdge).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AAAPackage.SLOPE_HATCH_LINES_TYPE__TOP_EDGE, null, msgs);
			msgs = basicSetTopEdge(newTopEdge, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.SLOPE_HATCH_LINES_TYPE__TOP_EDGE, newTopEdge, newTopEdge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BottomEdgeType getBottomEdge() {
		return bottomEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBottomEdge(BottomEdgeType newBottomEdge, NotificationChain msgs) {
		BottomEdgeType oldBottomEdge = bottomEdge;
		bottomEdge = newBottomEdge;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AAAPackage.SLOPE_HATCH_LINES_TYPE__BOTTOM_EDGE, oldBottomEdge, newBottomEdge);
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
	public void setBottomEdge(BottomEdgeType newBottomEdge) {
		if (newBottomEdge != bottomEdge) {
			NotificationChain msgs = null;
			if (bottomEdge != null)
				msgs = ((InternalEObject)bottomEdge).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AAAPackage.SLOPE_HATCH_LINES_TYPE__BOTTOM_EDGE, null, msgs);
			if (newBottomEdge != null)
				msgs = ((InternalEObject)newBottomEdge).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AAAPackage.SLOPE_HATCH_LINES_TYPE__BOTTOM_EDGE, null, msgs);
			msgs = basicSetBottomEdge(newBottomEdge, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.SLOPE_HATCH_LINES_TYPE__BOTTOM_EDGE, newBottomEdge, newBottomEdge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AAAPackage.SLOPE_HATCH_LINES_TYPE__TOP_EDGE:
				return basicSetTopEdge(null, msgs);
			case AAAPackage.SLOPE_HATCH_LINES_TYPE__BOTTOM_EDGE:
				return basicSetBottomEdge(null, msgs);
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
			case AAAPackage.SLOPE_HATCH_LINES_TYPE__SECOND_HATCH_LINE_FACTOR:
				return getSecondHatchLineFactor();
			case AAAPackage.SLOPE_HATCH_LINES_TYPE__HATCH_DISTANCE:
				return getHatchDistance();
			case AAAPackage.SLOPE_HATCH_LINES_TYPE__TOP_EDGE:
				return getTopEdge();
			case AAAPackage.SLOPE_HATCH_LINES_TYPE__BOTTOM_EDGE:
				return getBottomEdge();
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
			case AAAPackage.SLOPE_HATCH_LINES_TYPE__SECOND_HATCH_LINE_FACTOR:
				setSecondHatchLineFactor((Double)newValue);
				return;
			case AAAPackage.SLOPE_HATCH_LINES_TYPE__HATCH_DISTANCE:
				setHatchDistance((Double)newValue);
				return;
			case AAAPackage.SLOPE_HATCH_LINES_TYPE__TOP_EDGE:
				setTopEdge((TopEdgeType)newValue);
				return;
			case AAAPackage.SLOPE_HATCH_LINES_TYPE__BOTTOM_EDGE:
				setBottomEdge((BottomEdgeType)newValue);
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
			case AAAPackage.SLOPE_HATCH_LINES_TYPE__SECOND_HATCH_LINE_FACTOR:
				unsetSecondHatchLineFactor();
				return;
			case AAAPackage.SLOPE_HATCH_LINES_TYPE__HATCH_DISTANCE:
				unsetHatchDistance();
				return;
			case AAAPackage.SLOPE_HATCH_LINES_TYPE__TOP_EDGE:
				setTopEdge((TopEdgeType)null);
				return;
			case AAAPackage.SLOPE_HATCH_LINES_TYPE__BOTTOM_EDGE:
				setBottomEdge((BottomEdgeType)null);
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
			case AAAPackage.SLOPE_HATCH_LINES_TYPE__SECOND_HATCH_LINE_FACTOR:
				return isSetSecondHatchLineFactor();
			case AAAPackage.SLOPE_HATCH_LINES_TYPE__HATCH_DISTANCE:
				return isSetHatchDistance();
			case AAAPackage.SLOPE_HATCH_LINES_TYPE__TOP_EDGE:
				return topEdge != null;
			case AAAPackage.SLOPE_HATCH_LINES_TYPE__BOTTOM_EDGE:
				return bottomEdge != null;
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
		result.append(" (secondHatchLineFactor: ");
		if (secondHatchLineFactorESet) result.append(secondHatchLineFactor); else result.append("<unset>");
		result.append(", hatchDistance: ");
		if (hatchDistanceESet) result.append(hatchDistance); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SlopeHatchLinesTypeImpl
