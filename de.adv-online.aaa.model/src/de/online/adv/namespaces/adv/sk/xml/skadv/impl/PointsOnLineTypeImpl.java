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
import de.online.adv.namespaces.adv.sk.xml.skadv.AdjustmentType;
import de.online.adv.namespaces.adv.sk.xml.skadv.PointsOnLineType;
import de.online.adv.namespaces.adv.sk.xml.skadv.RelativeRotationType;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Points On Line Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.PointsOnLineTypeImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.PointsOnLineTypeImpl#getRelativeRotation <em>Relative Rotation</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.PointsOnLineTypeImpl#getAdjustment <em>Adjustment</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.PointsOnLineTypeImpl#getPreGap <em>Pre Gap</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.PointsOnLineTypeImpl#getPostGap <em>Post Gap</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PointsOnLineTypeImpl extends PlacementRuleTypeImpl implements PointsOnLineType {
	/**
	 * The default value of the '{@link #getPattern() <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPattern()
	 * @generated
	 * @ordered
	 */
	protected static final List<Double> PATTERN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPattern() <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPattern()
	 * @generated
	 * @ordered
	 */
	protected List<Double> pattern = PATTERN_EDEFAULT;

	/**
	 * The default value of the '{@link #getRelativeRotation() <em>Relative Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativeRotation()
	 * @generated
	 * @ordered
	 */
	protected static final RelativeRotationType RELATIVE_ROTATION_EDEFAULT = RelativeRotationType.NONE;

	/**
	 * The cached value of the '{@link #getRelativeRotation() <em>Relative Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativeRotation()
	 * @generated
	 * @ordered
	 */
	protected RelativeRotationType relativeRotation = RELATIVE_ROTATION_EDEFAULT;

	/**
	 * This is true if the Relative Rotation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean relativeRotationESet;

	/**
	 * The default value of the '{@link #getAdjustment() <em>Adjustment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdjustment()
	 * @generated
	 * @ordered
	 */
	protected static final AdjustmentType ADJUSTMENT_EDEFAULT = AdjustmentType.NONE;

	/**
	 * The cached value of the '{@link #getAdjustment() <em>Adjustment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdjustment()
	 * @generated
	 * @ordered
	 */
	protected AdjustmentType adjustment = ADJUSTMENT_EDEFAULT;

	/**
	 * This is true if the Adjustment attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean adjustmentESet;

	/**
	 * The default value of the '{@link #getPreGap() <em>Pre Gap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreGap()
	 * @generated
	 * @ordered
	 */
	protected static final double PRE_GAP_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPreGap() <em>Pre Gap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreGap()
	 * @generated
	 * @ordered
	 */
	protected double preGap = PRE_GAP_EDEFAULT;

	/**
	 * This is true if the Pre Gap attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean preGapESet;

	/**
	 * The default value of the '{@link #getPostGap() <em>Post Gap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostGap()
	 * @generated
	 * @ordered
	 */
	protected static final double POST_GAP_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPostGap() <em>Post Gap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostGap()
	 * @generated
	 * @ordered
	 */
	protected double postGap = POST_GAP_EDEFAULT;

	/**
	 * This is true if the Post Gap attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean postGapESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PointsOnLineTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AAAPackage.eINSTANCE.getPointsOnLineType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<Double> getPattern() {
		return pattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPattern(List<Double> newPattern) {
		List<Double> oldPattern = pattern;
		pattern = newPattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.POINTS_ON_LINE_TYPE__PATTERN, oldPattern, pattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelativeRotationType getRelativeRotation() {
		return relativeRotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelativeRotation(RelativeRotationType newRelativeRotation) {
		RelativeRotationType oldRelativeRotation = relativeRotation;
		relativeRotation = newRelativeRotation == null ? RELATIVE_ROTATION_EDEFAULT : newRelativeRotation;
		boolean oldRelativeRotationESet = relativeRotationESet;
		relativeRotationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.POINTS_ON_LINE_TYPE__RELATIVE_ROTATION, oldRelativeRotation, relativeRotation, !oldRelativeRotationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetRelativeRotation() {
		RelativeRotationType oldRelativeRotation = relativeRotation;
		boolean oldRelativeRotationESet = relativeRotationESet;
		relativeRotation = RELATIVE_ROTATION_EDEFAULT;
		relativeRotationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AAAPackage.POINTS_ON_LINE_TYPE__RELATIVE_ROTATION, oldRelativeRotation, RELATIVE_ROTATION_EDEFAULT, oldRelativeRotationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRelativeRotation() {
		return relativeRotationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdjustmentType getAdjustment() {
		return adjustment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdjustment(AdjustmentType newAdjustment) {
		AdjustmentType oldAdjustment = adjustment;
		adjustment = newAdjustment == null ? ADJUSTMENT_EDEFAULT : newAdjustment;
		boolean oldAdjustmentESet = adjustmentESet;
		adjustmentESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.POINTS_ON_LINE_TYPE__ADJUSTMENT, oldAdjustment, adjustment, !oldAdjustmentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetAdjustment() {
		AdjustmentType oldAdjustment = adjustment;
		boolean oldAdjustmentESet = adjustmentESet;
		adjustment = ADJUSTMENT_EDEFAULT;
		adjustmentESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AAAPackage.POINTS_ON_LINE_TYPE__ADJUSTMENT, oldAdjustment, ADJUSTMENT_EDEFAULT, oldAdjustmentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetAdjustment() {
		return adjustmentESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getPreGap() {
		return preGap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPreGap(double newPreGap) {
		double oldPreGap = preGap;
		preGap = newPreGap;
		boolean oldPreGapESet = preGapESet;
		preGapESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.POINTS_ON_LINE_TYPE__PRE_GAP, oldPreGap, preGap, !oldPreGapESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPreGap() {
		double oldPreGap = preGap;
		boolean oldPreGapESet = preGapESet;
		preGap = PRE_GAP_EDEFAULT;
		preGapESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AAAPackage.POINTS_ON_LINE_TYPE__PRE_GAP, oldPreGap, PRE_GAP_EDEFAULT, oldPreGapESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPreGap() {
		return preGapESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getPostGap() {
		return postGap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPostGap(double newPostGap) {
		double oldPostGap = postGap;
		postGap = newPostGap;
		boolean oldPostGapESet = postGapESet;
		postGapESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.POINTS_ON_LINE_TYPE__POST_GAP, oldPostGap, postGap, !oldPostGapESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPostGap() {
		double oldPostGap = postGap;
		boolean oldPostGapESet = postGapESet;
		postGap = POST_GAP_EDEFAULT;
		postGapESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AAAPackage.POINTS_ON_LINE_TYPE__POST_GAP, oldPostGap, POST_GAP_EDEFAULT, oldPostGapESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPostGap() {
		return postGapESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AAAPackage.POINTS_ON_LINE_TYPE__PATTERN:
				return getPattern();
			case AAAPackage.POINTS_ON_LINE_TYPE__RELATIVE_ROTATION:
				return getRelativeRotation();
			case AAAPackage.POINTS_ON_LINE_TYPE__ADJUSTMENT:
				return getAdjustment();
			case AAAPackage.POINTS_ON_LINE_TYPE__PRE_GAP:
				return getPreGap();
			case AAAPackage.POINTS_ON_LINE_TYPE__POST_GAP:
				return getPostGap();
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
			case AAAPackage.POINTS_ON_LINE_TYPE__PATTERN:
				setPattern((List<Double>)newValue);
				return;
			case AAAPackage.POINTS_ON_LINE_TYPE__RELATIVE_ROTATION:
				setRelativeRotation((RelativeRotationType)newValue);
				return;
			case AAAPackage.POINTS_ON_LINE_TYPE__ADJUSTMENT:
				setAdjustment((AdjustmentType)newValue);
				return;
			case AAAPackage.POINTS_ON_LINE_TYPE__PRE_GAP:
				setPreGap((Double)newValue);
				return;
			case AAAPackage.POINTS_ON_LINE_TYPE__POST_GAP:
				setPostGap((Double)newValue);
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
			case AAAPackage.POINTS_ON_LINE_TYPE__PATTERN:
				setPattern(PATTERN_EDEFAULT);
				return;
			case AAAPackage.POINTS_ON_LINE_TYPE__RELATIVE_ROTATION:
				unsetRelativeRotation();
				return;
			case AAAPackage.POINTS_ON_LINE_TYPE__ADJUSTMENT:
				unsetAdjustment();
				return;
			case AAAPackage.POINTS_ON_LINE_TYPE__PRE_GAP:
				unsetPreGap();
				return;
			case AAAPackage.POINTS_ON_LINE_TYPE__POST_GAP:
				unsetPostGap();
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
			case AAAPackage.POINTS_ON_LINE_TYPE__PATTERN:
				return PATTERN_EDEFAULT == null ? pattern != null : !PATTERN_EDEFAULT.equals(pattern);
			case AAAPackage.POINTS_ON_LINE_TYPE__RELATIVE_ROTATION:
				return isSetRelativeRotation();
			case AAAPackage.POINTS_ON_LINE_TYPE__ADJUSTMENT:
				return isSetAdjustment();
			case AAAPackage.POINTS_ON_LINE_TYPE__PRE_GAP:
				return isSetPreGap();
			case AAAPackage.POINTS_ON_LINE_TYPE__POST_GAP:
				return isSetPostGap();
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
		result.append(" (pattern: ");
		result.append(pattern);
		result.append(", relativeRotation: ");
		if (relativeRotationESet) result.append(relativeRotation); else result.append("<unset>");
		result.append(", adjustment: ");
		if (adjustmentESet) result.append(adjustment); else result.append("<unset>");
		result.append(", preGap: ");
		if (preGapESet) result.append(preGap); else result.append("<unset>");
		result.append(", postGap: ");
		if (postGapESet) result.append(postGap); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //PointsOnLineTypeImpl
