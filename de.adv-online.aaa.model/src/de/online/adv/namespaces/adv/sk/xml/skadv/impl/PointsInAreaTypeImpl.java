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
import de.online.adv.namespaces.adv.sk.xml.skadv.PointsInAreaType;
import de.online.adv.namespaces.adv.sk.xml.skadv.RegularityType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Points In Area Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.PointsInAreaTypeImpl#getHorizontalDisplacementX <em>Horizontal Displacement X</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.PointsInAreaTypeImpl#getHorizontalDisplacementY <em>Horizontal Displacement Y</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.PointsInAreaTypeImpl#getVerticalDisplacementX <em>Vertical Displacement X</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.PointsInAreaTypeImpl#getVerticalDisplacementY <em>Vertical Displacement Y</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.PointsInAreaTypeImpl#getOriginX <em>Origin X</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.PointsInAreaTypeImpl#getOriginY <em>Origin Y</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.PointsInAreaTypeImpl#getPlacement <em>Placement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PointsInAreaTypeImpl extends PlacementRuleTypeImpl implements PointsInAreaType {
	/**
	 * The default value of the '{@link #getHorizontalDisplacementX() <em>Horizontal Displacement X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalDisplacementX()
	 * @generated
	 * @ordered
	 */
	protected static final double HORIZONTAL_DISPLACEMENT_X_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getHorizontalDisplacementX() <em>Horizontal Displacement X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalDisplacementX()
	 * @generated
	 * @ordered
	 */
	protected double horizontalDisplacementX = HORIZONTAL_DISPLACEMENT_X_EDEFAULT;

	/**
	 * This is true if the Horizontal Displacement X attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean horizontalDisplacementXESet;

	/**
	 * The default value of the '{@link #getHorizontalDisplacementY() <em>Horizontal Displacement Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalDisplacementY()
	 * @generated
	 * @ordered
	 */
	protected static final double HORIZONTAL_DISPLACEMENT_Y_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getHorizontalDisplacementY() <em>Horizontal Displacement Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalDisplacementY()
	 * @generated
	 * @ordered
	 */
	protected double horizontalDisplacementY = HORIZONTAL_DISPLACEMENT_Y_EDEFAULT;

	/**
	 * This is true if the Horizontal Displacement Y attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean horizontalDisplacementYESet;

	/**
	 * The default value of the '{@link #getVerticalDisplacementX() <em>Vertical Displacement X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalDisplacementX()
	 * @generated
	 * @ordered
	 */
	protected static final double VERTICAL_DISPLACEMENT_X_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getVerticalDisplacementX() <em>Vertical Displacement X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalDisplacementX()
	 * @generated
	 * @ordered
	 */
	protected double verticalDisplacementX = VERTICAL_DISPLACEMENT_X_EDEFAULT;

	/**
	 * This is true if the Vertical Displacement X attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean verticalDisplacementXESet;

	/**
	 * The default value of the '{@link #getVerticalDisplacementY() <em>Vertical Displacement Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalDisplacementY()
	 * @generated
	 * @ordered
	 */
	protected static final double VERTICAL_DISPLACEMENT_Y_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getVerticalDisplacementY() <em>Vertical Displacement Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalDisplacementY()
	 * @generated
	 * @ordered
	 */
	protected double verticalDisplacementY = VERTICAL_DISPLACEMENT_Y_EDEFAULT;

	/**
	 * This is true if the Vertical Displacement Y attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean verticalDisplacementYESet;

	/**
	 * The default value of the '{@link #getOriginX() <em>Origin X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginX()
	 * @generated
	 * @ordered
	 */
	protected static final double ORIGIN_X_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getOriginX() <em>Origin X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginX()
	 * @generated
	 * @ordered
	 */
	protected double originX = ORIGIN_X_EDEFAULT;

	/**
	 * This is true if the Origin X attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean originXESet;

	/**
	 * The default value of the '{@link #getOriginY() <em>Origin Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginY()
	 * @generated
	 * @ordered
	 */
	protected static final double ORIGIN_Y_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getOriginY() <em>Origin Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginY()
	 * @generated
	 * @ordered
	 */
	protected double originY = ORIGIN_Y_EDEFAULT;

	/**
	 * This is true if the Origin Y attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean originYESet;

	/**
	 * The default value of the '{@link #getPlacement() <em>Placement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlacement()
	 * @generated
	 * @ordered
	 */
	protected static final RegularityType PLACEMENT_EDEFAULT = RegularityType.REGULAR;

	/**
	 * The cached value of the '{@link #getPlacement() <em>Placement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlacement()
	 * @generated
	 * @ordered
	 */
	protected RegularityType placement = PLACEMENT_EDEFAULT;

	/**
	 * This is true if the Placement attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean placementESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PointsInAreaTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AAAPackage.eINSTANCE.getPointsInAreaType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getHorizontalDisplacementX() {
		return horizontalDisplacementX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHorizontalDisplacementX(double newHorizontalDisplacementX) {
		double oldHorizontalDisplacementX = horizontalDisplacementX;
		horizontalDisplacementX = newHorizontalDisplacementX;
		boolean oldHorizontalDisplacementXESet = horizontalDisplacementXESet;
		horizontalDisplacementXESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.POINTS_IN_AREA_TYPE__HORIZONTAL_DISPLACEMENT_X, oldHorizontalDisplacementX, horizontalDisplacementX, !oldHorizontalDisplacementXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetHorizontalDisplacementX() {
		double oldHorizontalDisplacementX = horizontalDisplacementX;
		boolean oldHorizontalDisplacementXESet = horizontalDisplacementXESet;
		horizontalDisplacementX = HORIZONTAL_DISPLACEMENT_X_EDEFAULT;
		horizontalDisplacementXESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AAAPackage.POINTS_IN_AREA_TYPE__HORIZONTAL_DISPLACEMENT_X, oldHorizontalDisplacementX, HORIZONTAL_DISPLACEMENT_X_EDEFAULT, oldHorizontalDisplacementXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetHorizontalDisplacementX() {
		return horizontalDisplacementXESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getHorizontalDisplacementY() {
		return horizontalDisplacementY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHorizontalDisplacementY(double newHorizontalDisplacementY) {
		double oldHorizontalDisplacementY = horizontalDisplacementY;
		horizontalDisplacementY = newHorizontalDisplacementY;
		boolean oldHorizontalDisplacementYESet = horizontalDisplacementYESet;
		horizontalDisplacementYESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.POINTS_IN_AREA_TYPE__HORIZONTAL_DISPLACEMENT_Y, oldHorizontalDisplacementY, horizontalDisplacementY, !oldHorizontalDisplacementYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetHorizontalDisplacementY() {
		double oldHorizontalDisplacementY = horizontalDisplacementY;
		boolean oldHorizontalDisplacementYESet = horizontalDisplacementYESet;
		horizontalDisplacementY = HORIZONTAL_DISPLACEMENT_Y_EDEFAULT;
		horizontalDisplacementYESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AAAPackage.POINTS_IN_AREA_TYPE__HORIZONTAL_DISPLACEMENT_Y, oldHorizontalDisplacementY, HORIZONTAL_DISPLACEMENT_Y_EDEFAULT, oldHorizontalDisplacementYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetHorizontalDisplacementY() {
		return horizontalDisplacementYESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getVerticalDisplacementX() {
		return verticalDisplacementX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVerticalDisplacementX(double newVerticalDisplacementX) {
		double oldVerticalDisplacementX = verticalDisplacementX;
		verticalDisplacementX = newVerticalDisplacementX;
		boolean oldVerticalDisplacementXESet = verticalDisplacementXESet;
		verticalDisplacementXESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.POINTS_IN_AREA_TYPE__VERTICAL_DISPLACEMENT_X, oldVerticalDisplacementX, verticalDisplacementX, !oldVerticalDisplacementXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetVerticalDisplacementX() {
		double oldVerticalDisplacementX = verticalDisplacementX;
		boolean oldVerticalDisplacementXESet = verticalDisplacementXESet;
		verticalDisplacementX = VERTICAL_DISPLACEMENT_X_EDEFAULT;
		verticalDisplacementXESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AAAPackage.POINTS_IN_AREA_TYPE__VERTICAL_DISPLACEMENT_X, oldVerticalDisplacementX, VERTICAL_DISPLACEMENT_X_EDEFAULT, oldVerticalDisplacementXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetVerticalDisplacementX() {
		return verticalDisplacementXESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getVerticalDisplacementY() {
		return verticalDisplacementY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVerticalDisplacementY(double newVerticalDisplacementY) {
		double oldVerticalDisplacementY = verticalDisplacementY;
		verticalDisplacementY = newVerticalDisplacementY;
		boolean oldVerticalDisplacementYESet = verticalDisplacementYESet;
		verticalDisplacementYESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.POINTS_IN_AREA_TYPE__VERTICAL_DISPLACEMENT_Y, oldVerticalDisplacementY, verticalDisplacementY, !oldVerticalDisplacementYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetVerticalDisplacementY() {
		double oldVerticalDisplacementY = verticalDisplacementY;
		boolean oldVerticalDisplacementYESet = verticalDisplacementYESet;
		verticalDisplacementY = VERTICAL_DISPLACEMENT_Y_EDEFAULT;
		verticalDisplacementYESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AAAPackage.POINTS_IN_AREA_TYPE__VERTICAL_DISPLACEMENT_Y, oldVerticalDisplacementY, VERTICAL_DISPLACEMENT_Y_EDEFAULT, oldVerticalDisplacementYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetVerticalDisplacementY() {
		return verticalDisplacementYESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getOriginX() {
		return originX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOriginX(double newOriginX) {
		double oldOriginX = originX;
		originX = newOriginX;
		boolean oldOriginXESet = originXESet;
		originXESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.POINTS_IN_AREA_TYPE__ORIGIN_X, oldOriginX, originX, !oldOriginXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetOriginX() {
		double oldOriginX = originX;
		boolean oldOriginXESet = originXESet;
		originX = ORIGIN_X_EDEFAULT;
		originXESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AAAPackage.POINTS_IN_AREA_TYPE__ORIGIN_X, oldOriginX, ORIGIN_X_EDEFAULT, oldOriginXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOriginX() {
		return originXESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getOriginY() {
		return originY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOriginY(double newOriginY) {
		double oldOriginY = originY;
		originY = newOriginY;
		boolean oldOriginYESet = originYESet;
		originYESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.POINTS_IN_AREA_TYPE__ORIGIN_Y, oldOriginY, originY, !oldOriginYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetOriginY() {
		double oldOriginY = originY;
		boolean oldOriginYESet = originYESet;
		originY = ORIGIN_Y_EDEFAULT;
		originYESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AAAPackage.POINTS_IN_AREA_TYPE__ORIGIN_Y, oldOriginY, ORIGIN_Y_EDEFAULT, oldOriginYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOriginY() {
		return originYESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RegularityType getPlacement() {
		return placement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlacement(RegularityType newPlacement) {
		RegularityType oldPlacement = placement;
		placement = newPlacement == null ? PLACEMENT_EDEFAULT : newPlacement;
		boolean oldPlacementESet = placementESet;
		placementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.POINTS_IN_AREA_TYPE__PLACEMENT, oldPlacement, placement, !oldPlacementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPlacement() {
		RegularityType oldPlacement = placement;
		boolean oldPlacementESet = placementESet;
		placement = PLACEMENT_EDEFAULT;
		placementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AAAPackage.POINTS_IN_AREA_TYPE__PLACEMENT, oldPlacement, PLACEMENT_EDEFAULT, oldPlacementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPlacement() {
		return placementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AAAPackage.POINTS_IN_AREA_TYPE__HORIZONTAL_DISPLACEMENT_X:
				return getHorizontalDisplacementX();
			case AAAPackage.POINTS_IN_AREA_TYPE__HORIZONTAL_DISPLACEMENT_Y:
				return getHorizontalDisplacementY();
			case AAAPackage.POINTS_IN_AREA_TYPE__VERTICAL_DISPLACEMENT_X:
				return getVerticalDisplacementX();
			case AAAPackage.POINTS_IN_AREA_TYPE__VERTICAL_DISPLACEMENT_Y:
				return getVerticalDisplacementY();
			case AAAPackage.POINTS_IN_AREA_TYPE__ORIGIN_X:
				return getOriginX();
			case AAAPackage.POINTS_IN_AREA_TYPE__ORIGIN_Y:
				return getOriginY();
			case AAAPackage.POINTS_IN_AREA_TYPE__PLACEMENT:
				return getPlacement();
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
			case AAAPackage.POINTS_IN_AREA_TYPE__HORIZONTAL_DISPLACEMENT_X:
				setHorizontalDisplacementX((Double)newValue);
				return;
			case AAAPackage.POINTS_IN_AREA_TYPE__HORIZONTAL_DISPLACEMENT_Y:
				setHorizontalDisplacementY((Double)newValue);
				return;
			case AAAPackage.POINTS_IN_AREA_TYPE__VERTICAL_DISPLACEMENT_X:
				setVerticalDisplacementX((Double)newValue);
				return;
			case AAAPackage.POINTS_IN_AREA_TYPE__VERTICAL_DISPLACEMENT_Y:
				setVerticalDisplacementY((Double)newValue);
				return;
			case AAAPackage.POINTS_IN_AREA_TYPE__ORIGIN_X:
				setOriginX((Double)newValue);
				return;
			case AAAPackage.POINTS_IN_AREA_TYPE__ORIGIN_Y:
				setOriginY((Double)newValue);
				return;
			case AAAPackage.POINTS_IN_AREA_TYPE__PLACEMENT:
				setPlacement((RegularityType)newValue);
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
			case AAAPackage.POINTS_IN_AREA_TYPE__HORIZONTAL_DISPLACEMENT_X:
				unsetHorizontalDisplacementX();
				return;
			case AAAPackage.POINTS_IN_AREA_TYPE__HORIZONTAL_DISPLACEMENT_Y:
				unsetHorizontalDisplacementY();
				return;
			case AAAPackage.POINTS_IN_AREA_TYPE__VERTICAL_DISPLACEMENT_X:
				unsetVerticalDisplacementX();
				return;
			case AAAPackage.POINTS_IN_AREA_TYPE__VERTICAL_DISPLACEMENT_Y:
				unsetVerticalDisplacementY();
				return;
			case AAAPackage.POINTS_IN_AREA_TYPE__ORIGIN_X:
				unsetOriginX();
				return;
			case AAAPackage.POINTS_IN_AREA_TYPE__ORIGIN_Y:
				unsetOriginY();
				return;
			case AAAPackage.POINTS_IN_AREA_TYPE__PLACEMENT:
				unsetPlacement();
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
			case AAAPackage.POINTS_IN_AREA_TYPE__HORIZONTAL_DISPLACEMENT_X:
				return isSetHorizontalDisplacementX();
			case AAAPackage.POINTS_IN_AREA_TYPE__HORIZONTAL_DISPLACEMENT_Y:
				return isSetHorizontalDisplacementY();
			case AAAPackage.POINTS_IN_AREA_TYPE__VERTICAL_DISPLACEMENT_X:
				return isSetVerticalDisplacementX();
			case AAAPackage.POINTS_IN_AREA_TYPE__VERTICAL_DISPLACEMENT_Y:
				return isSetVerticalDisplacementY();
			case AAAPackage.POINTS_IN_AREA_TYPE__ORIGIN_X:
				return isSetOriginX();
			case AAAPackage.POINTS_IN_AREA_TYPE__ORIGIN_Y:
				return isSetOriginY();
			case AAAPackage.POINTS_IN_AREA_TYPE__PLACEMENT:
				return isSetPlacement();
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
		result.append(" (horizontalDisplacementX: ");
		if (horizontalDisplacementXESet) result.append(horizontalDisplacementX); else result.append("<unset>");
		result.append(", horizontalDisplacementY: ");
		if (horizontalDisplacementYESet) result.append(horizontalDisplacementY); else result.append("<unset>");
		result.append(", verticalDisplacementX: ");
		if (verticalDisplacementXESet) result.append(verticalDisplacementX); else result.append("<unset>");
		result.append(", verticalDisplacementY: ");
		if (verticalDisplacementYESet) result.append(verticalDisplacementY); else result.append("<unset>");
		result.append(", originX: ");
		if (originXESet) result.append(originX); else result.append("<unset>");
		result.append(", originY: ");
		if (originYESet) result.append(originY); else result.append("<unset>");
		result.append(", placement: ");
		if (placementESet) result.append(placement); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //PointsInAreaTypeImpl
