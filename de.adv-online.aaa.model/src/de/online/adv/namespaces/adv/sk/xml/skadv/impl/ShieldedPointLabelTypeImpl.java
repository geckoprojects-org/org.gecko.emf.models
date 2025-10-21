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
import de.online.adv.namespaces.adv.sk.xml.skadv.BackgroundBorderType;
import de.online.adv.namespaces.adv.sk.xml.skadv.BackgroundFillType;
import de.online.adv.namespaces.adv.sk.xml.skadv.ShieldedPointLabelType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shielded Point Label Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.ShieldedPointLabelTypeImpl#getBoxEnlargementLeft <em>Box Enlargement Left</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.ShieldedPointLabelTypeImpl#getBoxEnlargementRight <em>Box Enlargement Right</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.ShieldedPointLabelTypeImpl#getBoxEnlargementTop <em>Box Enlargement Top</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.ShieldedPointLabelTypeImpl#getBoxEnlargementBottom <em>Box Enlargement Bottom</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.ShieldedPointLabelTypeImpl#getRoundedCornerRadius <em>Rounded Corner Radius</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.ShieldedPointLabelTypeImpl#getBackgroundFill <em>Background Fill</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.ShieldedPointLabelTypeImpl#getBackgroundBorder <em>Background Border</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShieldedPointLabelTypeImpl extends PointLabelTypeImpl implements ShieldedPointLabelType {
	/**
	 * The default value of the '{@link #getBoxEnlargementLeft() <em>Box Enlargement Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoxEnlargementLeft()
	 * @generated
	 * @ordered
	 */
	protected static final double BOX_ENLARGEMENT_LEFT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getBoxEnlargementLeft() <em>Box Enlargement Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoxEnlargementLeft()
	 * @generated
	 * @ordered
	 */
	protected double boxEnlargementLeft = BOX_ENLARGEMENT_LEFT_EDEFAULT;

	/**
	 * This is true if the Box Enlargement Left attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean boxEnlargementLeftESet;

	/**
	 * The default value of the '{@link #getBoxEnlargementRight() <em>Box Enlargement Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoxEnlargementRight()
	 * @generated
	 * @ordered
	 */
	protected static final double BOX_ENLARGEMENT_RIGHT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getBoxEnlargementRight() <em>Box Enlargement Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoxEnlargementRight()
	 * @generated
	 * @ordered
	 */
	protected double boxEnlargementRight = BOX_ENLARGEMENT_RIGHT_EDEFAULT;

	/**
	 * This is true if the Box Enlargement Right attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean boxEnlargementRightESet;

	/**
	 * The default value of the '{@link #getBoxEnlargementTop() <em>Box Enlargement Top</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoxEnlargementTop()
	 * @generated
	 * @ordered
	 */
	protected static final double BOX_ENLARGEMENT_TOP_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getBoxEnlargementTop() <em>Box Enlargement Top</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoxEnlargementTop()
	 * @generated
	 * @ordered
	 */
	protected double boxEnlargementTop = BOX_ENLARGEMENT_TOP_EDEFAULT;

	/**
	 * This is true if the Box Enlargement Top attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean boxEnlargementTopESet;

	/**
	 * The default value of the '{@link #getBoxEnlargementBottom() <em>Box Enlargement Bottom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoxEnlargementBottom()
	 * @generated
	 * @ordered
	 */
	protected static final double BOX_ENLARGEMENT_BOTTOM_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getBoxEnlargementBottom() <em>Box Enlargement Bottom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoxEnlargementBottom()
	 * @generated
	 * @ordered
	 */
	protected double boxEnlargementBottom = BOX_ENLARGEMENT_BOTTOM_EDEFAULT;

	/**
	 * This is true if the Box Enlargement Bottom attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean boxEnlargementBottomESet;

	/**
	 * The default value of the '{@link #getRoundedCornerRadius() <em>Rounded Corner Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoundedCornerRadius()
	 * @generated
	 * @ordered
	 */
	protected static final double ROUNDED_CORNER_RADIUS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRoundedCornerRadius() <em>Rounded Corner Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoundedCornerRadius()
	 * @generated
	 * @ordered
	 */
	protected double roundedCornerRadius = ROUNDED_CORNER_RADIUS_EDEFAULT;

	/**
	 * This is true if the Rounded Corner Radius attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean roundedCornerRadiusESet;

	/**
	 * The cached value of the '{@link #getBackgroundFill() <em>Background Fill</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundFill()
	 * @generated
	 * @ordered
	 */
	protected BackgroundFillType backgroundFill;

	/**
	 * The cached value of the '{@link #getBackgroundBorder() <em>Background Border</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundBorder()
	 * @generated
	 * @ordered
	 */
	protected BackgroundBorderType backgroundBorder;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShieldedPointLabelTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AAAPackage.eINSTANCE.getShieldedPointLabelType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getBoxEnlargementLeft() {
		return boxEnlargementLeft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBoxEnlargementLeft(double newBoxEnlargementLeft) {
		double oldBoxEnlargementLeft = boxEnlargementLeft;
		boxEnlargementLeft = newBoxEnlargementLeft;
		boolean oldBoxEnlargementLeftESet = boxEnlargementLeftESet;
		boxEnlargementLeftESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.SHIELDED_POINT_LABEL_TYPE__BOX_ENLARGEMENT_LEFT, oldBoxEnlargementLeft, boxEnlargementLeft, !oldBoxEnlargementLeftESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetBoxEnlargementLeft() {
		double oldBoxEnlargementLeft = boxEnlargementLeft;
		boolean oldBoxEnlargementLeftESet = boxEnlargementLeftESet;
		boxEnlargementLeft = BOX_ENLARGEMENT_LEFT_EDEFAULT;
		boxEnlargementLeftESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AAAPackage.SHIELDED_POINT_LABEL_TYPE__BOX_ENLARGEMENT_LEFT, oldBoxEnlargementLeft, BOX_ENLARGEMENT_LEFT_EDEFAULT, oldBoxEnlargementLeftESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetBoxEnlargementLeft() {
		return boxEnlargementLeftESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getBoxEnlargementRight() {
		return boxEnlargementRight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBoxEnlargementRight(double newBoxEnlargementRight) {
		double oldBoxEnlargementRight = boxEnlargementRight;
		boxEnlargementRight = newBoxEnlargementRight;
		boolean oldBoxEnlargementRightESet = boxEnlargementRightESet;
		boxEnlargementRightESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.SHIELDED_POINT_LABEL_TYPE__BOX_ENLARGEMENT_RIGHT, oldBoxEnlargementRight, boxEnlargementRight, !oldBoxEnlargementRightESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetBoxEnlargementRight() {
		double oldBoxEnlargementRight = boxEnlargementRight;
		boolean oldBoxEnlargementRightESet = boxEnlargementRightESet;
		boxEnlargementRight = BOX_ENLARGEMENT_RIGHT_EDEFAULT;
		boxEnlargementRightESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AAAPackage.SHIELDED_POINT_LABEL_TYPE__BOX_ENLARGEMENT_RIGHT, oldBoxEnlargementRight, BOX_ENLARGEMENT_RIGHT_EDEFAULT, oldBoxEnlargementRightESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetBoxEnlargementRight() {
		return boxEnlargementRightESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getBoxEnlargementTop() {
		return boxEnlargementTop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBoxEnlargementTop(double newBoxEnlargementTop) {
		double oldBoxEnlargementTop = boxEnlargementTop;
		boxEnlargementTop = newBoxEnlargementTop;
		boolean oldBoxEnlargementTopESet = boxEnlargementTopESet;
		boxEnlargementTopESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.SHIELDED_POINT_LABEL_TYPE__BOX_ENLARGEMENT_TOP, oldBoxEnlargementTop, boxEnlargementTop, !oldBoxEnlargementTopESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetBoxEnlargementTop() {
		double oldBoxEnlargementTop = boxEnlargementTop;
		boolean oldBoxEnlargementTopESet = boxEnlargementTopESet;
		boxEnlargementTop = BOX_ENLARGEMENT_TOP_EDEFAULT;
		boxEnlargementTopESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AAAPackage.SHIELDED_POINT_LABEL_TYPE__BOX_ENLARGEMENT_TOP, oldBoxEnlargementTop, BOX_ENLARGEMENT_TOP_EDEFAULT, oldBoxEnlargementTopESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetBoxEnlargementTop() {
		return boxEnlargementTopESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getBoxEnlargementBottom() {
		return boxEnlargementBottom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBoxEnlargementBottom(double newBoxEnlargementBottom) {
		double oldBoxEnlargementBottom = boxEnlargementBottom;
		boxEnlargementBottom = newBoxEnlargementBottom;
		boolean oldBoxEnlargementBottomESet = boxEnlargementBottomESet;
		boxEnlargementBottomESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.SHIELDED_POINT_LABEL_TYPE__BOX_ENLARGEMENT_BOTTOM, oldBoxEnlargementBottom, boxEnlargementBottom, !oldBoxEnlargementBottomESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetBoxEnlargementBottom() {
		double oldBoxEnlargementBottom = boxEnlargementBottom;
		boolean oldBoxEnlargementBottomESet = boxEnlargementBottomESet;
		boxEnlargementBottom = BOX_ENLARGEMENT_BOTTOM_EDEFAULT;
		boxEnlargementBottomESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AAAPackage.SHIELDED_POINT_LABEL_TYPE__BOX_ENLARGEMENT_BOTTOM, oldBoxEnlargementBottom, BOX_ENLARGEMENT_BOTTOM_EDEFAULT, oldBoxEnlargementBottomESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetBoxEnlargementBottom() {
		return boxEnlargementBottomESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getRoundedCornerRadius() {
		return roundedCornerRadius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoundedCornerRadius(double newRoundedCornerRadius) {
		double oldRoundedCornerRadius = roundedCornerRadius;
		roundedCornerRadius = newRoundedCornerRadius;
		boolean oldRoundedCornerRadiusESet = roundedCornerRadiusESet;
		roundedCornerRadiusESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.SHIELDED_POINT_LABEL_TYPE__ROUNDED_CORNER_RADIUS, oldRoundedCornerRadius, roundedCornerRadius, !oldRoundedCornerRadiusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetRoundedCornerRadius() {
		double oldRoundedCornerRadius = roundedCornerRadius;
		boolean oldRoundedCornerRadiusESet = roundedCornerRadiusESet;
		roundedCornerRadius = ROUNDED_CORNER_RADIUS_EDEFAULT;
		roundedCornerRadiusESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AAAPackage.SHIELDED_POINT_LABEL_TYPE__ROUNDED_CORNER_RADIUS, oldRoundedCornerRadius, ROUNDED_CORNER_RADIUS_EDEFAULT, oldRoundedCornerRadiusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRoundedCornerRadius() {
		return roundedCornerRadiusESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BackgroundFillType getBackgroundFill() {
		return backgroundFill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBackgroundFill(BackgroundFillType newBackgroundFill, NotificationChain msgs) {
		BackgroundFillType oldBackgroundFill = backgroundFill;
		backgroundFill = newBackgroundFill;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AAAPackage.SHIELDED_POINT_LABEL_TYPE__BACKGROUND_FILL, oldBackgroundFill, newBackgroundFill);
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
	public void setBackgroundFill(BackgroundFillType newBackgroundFill) {
		if (newBackgroundFill != backgroundFill) {
			NotificationChain msgs = null;
			if (backgroundFill != null)
				msgs = ((InternalEObject)backgroundFill).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AAAPackage.SHIELDED_POINT_LABEL_TYPE__BACKGROUND_FILL, null, msgs);
			if (newBackgroundFill != null)
				msgs = ((InternalEObject)newBackgroundFill).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AAAPackage.SHIELDED_POINT_LABEL_TYPE__BACKGROUND_FILL, null, msgs);
			msgs = basicSetBackgroundFill(newBackgroundFill, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.SHIELDED_POINT_LABEL_TYPE__BACKGROUND_FILL, newBackgroundFill, newBackgroundFill));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BackgroundBorderType getBackgroundBorder() {
		return backgroundBorder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBackgroundBorder(BackgroundBorderType newBackgroundBorder, NotificationChain msgs) {
		BackgroundBorderType oldBackgroundBorder = backgroundBorder;
		backgroundBorder = newBackgroundBorder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AAAPackage.SHIELDED_POINT_LABEL_TYPE__BACKGROUND_BORDER, oldBackgroundBorder, newBackgroundBorder);
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
	public void setBackgroundBorder(BackgroundBorderType newBackgroundBorder) {
		if (newBackgroundBorder != backgroundBorder) {
			NotificationChain msgs = null;
			if (backgroundBorder != null)
				msgs = ((InternalEObject)backgroundBorder).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AAAPackage.SHIELDED_POINT_LABEL_TYPE__BACKGROUND_BORDER, null, msgs);
			if (newBackgroundBorder != null)
				msgs = ((InternalEObject)newBackgroundBorder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AAAPackage.SHIELDED_POINT_LABEL_TYPE__BACKGROUND_BORDER, null, msgs);
			msgs = basicSetBackgroundBorder(newBackgroundBorder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.SHIELDED_POINT_LABEL_TYPE__BACKGROUND_BORDER, newBackgroundBorder, newBackgroundBorder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AAAPackage.SHIELDED_POINT_LABEL_TYPE__BACKGROUND_FILL:
				return basicSetBackgroundFill(null, msgs);
			case AAAPackage.SHIELDED_POINT_LABEL_TYPE__BACKGROUND_BORDER:
				return basicSetBackgroundBorder(null, msgs);
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
			case AAAPackage.SHIELDED_POINT_LABEL_TYPE__BOX_ENLARGEMENT_LEFT:
				return getBoxEnlargementLeft();
			case AAAPackage.SHIELDED_POINT_LABEL_TYPE__BOX_ENLARGEMENT_RIGHT:
				return getBoxEnlargementRight();
			case AAAPackage.SHIELDED_POINT_LABEL_TYPE__BOX_ENLARGEMENT_TOP:
				return getBoxEnlargementTop();
			case AAAPackage.SHIELDED_POINT_LABEL_TYPE__BOX_ENLARGEMENT_BOTTOM:
				return getBoxEnlargementBottom();
			case AAAPackage.SHIELDED_POINT_LABEL_TYPE__ROUNDED_CORNER_RADIUS:
				return getRoundedCornerRadius();
			case AAAPackage.SHIELDED_POINT_LABEL_TYPE__BACKGROUND_FILL:
				return getBackgroundFill();
			case AAAPackage.SHIELDED_POINT_LABEL_TYPE__BACKGROUND_BORDER:
				return getBackgroundBorder();
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
			case AAAPackage.SHIELDED_POINT_LABEL_TYPE__BOX_ENLARGEMENT_LEFT:
				setBoxEnlargementLeft((Double)newValue);
				return;
			case AAAPackage.SHIELDED_POINT_LABEL_TYPE__BOX_ENLARGEMENT_RIGHT:
				setBoxEnlargementRight((Double)newValue);
				return;
			case AAAPackage.SHIELDED_POINT_LABEL_TYPE__BOX_ENLARGEMENT_TOP:
				setBoxEnlargementTop((Double)newValue);
				return;
			case AAAPackage.SHIELDED_POINT_LABEL_TYPE__BOX_ENLARGEMENT_BOTTOM:
				setBoxEnlargementBottom((Double)newValue);
				return;
			case AAAPackage.SHIELDED_POINT_LABEL_TYPE__ROUNDED_CORNER_RADIUS:
				setRoundedCornerRadius((Double)newValue);
				return;
			case AAAPackage.SHIELDED_POINT_LABEL_TYPE__BACKGROUND_FILL:
				setBackgroundFill((BackgroundFillType)newValue);
				return;
			case AAAPackage.SHIELDED_POINT_LABEL_TYPE__BACKGROUND_BORDER:
				setBackgroundBorder((BackgroundBorderType)newValue);
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
			case AAAPackage.SHIELDED_POINT_LABEL_TYPE__BOX_ENLARGEMENT_LEFT:
				unsetBoxEnlargementLeft();
				return;
			case AAAPackage.SHIELDED_POINT_LABEL_TYPE__BOX_ENLARGEMENT_RIGHT:
				unsetBoxEnlargementRight();
				return;
			case AAAPackage.SHIELDED_POINT_LABEL_TYPE__BOX_ENLARGEMENT_TOP:
				unsetBoxEnlargementTop();
				return;
			case AAAPackage.SHIELDED_POINT_LABEL_TYPE__BOX_ENLARGEMENT_BOTTOM:
				unsetBoxEnlargementBottom();
				return;
			case AAAPackage.SHIELDED_POINT_LABEL_TYPE__ROUNDED_CORNER_RADIUS:
				unsetRoundedCornerRadius();
				return;
			case AAAPackage.SHIELDED_POINT_LABEL_TYPE__BACKGROUND_FILL:
				setBackgroundFill((BackgroundFillType)null);
				return;
			case AAAPackage.SHIELDED_POINT_LABEL_TYPE__BACKGROUND_BORDER:
				setBackgroundBorder((BackgroundBorderType)null);
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
			case AAAPackage.SHIELDED_POINT_LABEL_TYPE__BOX_ENLARGEMENT_LEFT:
				return isSetBoxEnlargementLeft();
			case AAAPackage.SHIELDED_POINT_LABEL_TYPE__BOX_ENLARGEMENT_RIGHT:
				return isSetBoxEnlargementRight();
			case AAAPackage.SHIELDED_POINT_LABEL_TYPE__BOX_ENLARGEMENT_TOP:
				return isSetBoxEnlargementTop();
			case AAAPackage.SHIELDED_POINT_LABEL_TYPE__BOX_ENLARGEMENT_BOTTOM:
				return isSetBoxEnlargementBottom();
			case AAAPackage.SHIELDED_POINT_LABEL_TYPE__ROUNDED_CORNER_RADIUS:
				return isSetRoundedCornerRadius();
			case AAAPackage.SHIELDED_POINT_LABEL_TYPE__BACKGROUND_FILL:
				return backgroundFill != null;
			case AAAPackage.SHIELDED_POINT_LABEL_TYPE__BACKGROUND_BORDER:
				return backgroundBorder != null;
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
		result.append(" (boxEnlargementLeft: ");
		if (boxEnlargementLeftESet) result.append(boxEnlargementLeft); else result.append("<unset>");
		result.append(", boxEnlargementRight: ");
		if (boxEnlargementRightESet) result.append(boxEnlargementRight); else result.append("<unset>");
		result.append(", boxEnlargementTop: ");
		if (boxEnlargementTopESet) result.append(boxEnlargementTop); else result.append("<unset>");
		result.append(", boxEnlargementBottom: ");
		if (boxEnlargementBottomESet) result.append(boxEnlargementBottom); else result.append("<unset>");
		result.append(", roundedCornerRadius: ");
		if (roundedCornerRadiusESet) result.append(roundedCornerRadius); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ShieldedPointLabelTypeImpl
