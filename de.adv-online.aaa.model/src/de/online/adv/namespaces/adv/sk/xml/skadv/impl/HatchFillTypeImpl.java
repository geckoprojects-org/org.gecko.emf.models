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
import de.online.adv.namespaces.adv.sk.xml.skadv.HatchFillType;
import de.online.adv.namespaces.adv.sk.xml.skadv.StrokeType3;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hatch Fill Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.HatchFillTypeImpl#getOriginX <em>Origin X</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.HatchFillTypeImpl#getOriginY <em>Origin Y</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.HatchFillTypeImpl#getHatchRayDirectionX <em>Hatch Ray Direction X</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.HatchFillTypeImpl#getHatchRayDirectionY <em>Hatch Ray Direction Y</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.HatchFillTypeImpl#getHatchDisplacementDirectionX <em>Hatch Displacement Direction X</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.HatchFillTypeImpl#getHatchDisplacementDirectionY <em>Hatch Displacement Direction Y</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.HatchFillTypeImpl#getHatchDisplacementOffset <em>Hatch Displacement Offset</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.HatchFillTypeImpl#getStroke <em>Stroke</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HatchFillTypeImpl extends FillTypeImpl implements HatchFillType {
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
	 * The default value of the '{@link #getHatchRayDirectionX() <em>Hatch Ray Direction X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHatchRayDirectionX()
	 * @generated
	 * @ordered
	 */
	protected static final double HATCH_RAY_DIRECTION_X_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getHatchRayDirectionX() <em>Hatch Ray Direction X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHatchRayDirectionX()
	 * @generated
	 * @ordered
	 */
	protected double hatchRayDirectionX = HATCH_RAY_DIRECTION_X_EDEFAULT;

	/**
	 * This is true if the Hatch Ray Direction X attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean hatchRayDirectionXESet;

	/**
	 * The default value of the '{@link #getHatchRayDirectionY() <em>Hatch Ray Direction Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHatchRayDirectionY()
	 * @generated
	 * @ordered
	 */
	protected static final double HATCH_RAY_DIRECTION_Y_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getHatchRayDirectionY() <em>Hatch Ray Direction Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHatchRayDirectionY()
	 * @generated
	 * @ordered
	 */
	protected double hatchRayDirectionY = HATCH_RAY_DIRECTION_Y_EDEFAULT;

	/**
	 * This is true if the Hatch Ray Direction Y attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean hatchRayDirectionYESet;

	/**
	 * The default value of the '{@link #getHatchDisplacementDirectionX() <em>Hatch Displacement Direction X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHatchDisplacementDirectionX()
	 * @generated
	 * @ordered
	 */
	protected static final double HATCH_DISPLACEMENT_DIRECTION_X_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getHatchDisplacementDirectionX() <em>Hatch Displacement Direction X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHatchDisplacementDirectionX()
	 * @generated
	 * @ordered
	 */
	protected double hatchDisplacementDirectionX = HATCH_DISPLACEMENT_DIRECTION_X_EDEFAULT;

	/**
	 * This is true if the Hatch Displacement Direction X attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean hatchDisplacementDirectionXESet;

	/**
	 * The default value of the '{@link #getHatchDisplacementDirectionY() <em>Hatch Displacement Direction Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHatchDisplacementDirectionY()
	 * @generated
	 * @ordered
	 */
	protected static final double HATCH_DISPLACEMENT_DIRECTION_Y_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getHatchDisplacementDirectionY() <em>Hatch Displacement Direction Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHatchDisplacementDirectionY()
	 * @generated
	 * @ordered
	 */
	protected double hatchDisplacementDirectionY = HATCH_DISPLACEMENT_DIRECTION_Y_EDEFAULT;

	/**
	 * This is true if the Hatch Displacement Direction Y attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean hatchDisplacementDirectionYESet;

	/**
	 * The default value of the '{@link #getHatchDisplacementOffset() <em>Hatch Displacement Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHatchDisplacementOffset()
	 * @generated
	 * @ordered
	 */
	protected static final double HATCH_DISPLACEMENT_OFFSET_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getHatchDisplacementOffset() <em>Hatch Displacement Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHatchDisplacementOffset()
	 * @generated
	 * @ordered
	 */
	protected double hatchDisplacementOffset = HATCH_DISPLACEMENT_OFFSET_EDEFAULT;

	/**
	 * This is true if the Hatch Displacement Offset attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean hatchDisplacementOffsetESet;

	/**
	 * The cached value of the '{@link #getStroke() <em>Stroke</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStroke()
	 * @generated
	 * @ordered
	 */
	protected StrokeType3 stroke;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HatchFillTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AAAPackage.eINSTANCE.getHatchFillType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.HATCH_FILL_TYPE__ORIGIN_X, oldOriginX, originX, !oldOriginXESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, AAAPackage.HATCH_FILL_TYPE__ORIGIN_X, oldOriginX, ORIGIN_X_EDEFAULT, oldOriginXESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.HATCH_FILL_TYPE__ORIGIN_Y, oldOriginY, originY, !oldOriginYESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, AAAPackage.HATCH_FILL_TYPE__ORIGIN_Y, oldOriginY, ORIGIN_Y_EDEFAULT, oldOriginYESet));
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
	public double getHatchRayDirectionX() {
		return hatchRayDirectionX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHatchRayDirectionX(double newHatchRayDirectionX) {
		double oldHatchRayDirectionX = hatchRayDirectionX;
		hatchRayDirectionX = newHatchRayDirectionX;
		boolean oldHatchRayDirectionXESet = hatchRayDirectionXESet;
		hatchRayDirectionXESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.HATCH_FILL_TYPE__HATCH_RAY_DIRECTION_X, oldHatchRayDirectionX, hatchRayDirectionX, !oldHatchRayDirectionXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetHatchRayDirectionX() {
		double oldHatchRayDirectionX = hatchRayDirectionX;
		boolean oldHatchRayDirectionXESet = hatchRayDirectionXESet;
		hatchRayDirectionX = HATCH_RAY_DIRECTION_X_EDEFAULT;
		hatchRayDirectionXESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AAAPackage.HATCH_FILL_TYPE__HATCH_RAY_DIRECTION_X, oldHatchRayDirectionX, HATCH_RAY_DIRECTION_X_EDEFAULT, oldHatchRayDirectionXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetHatchRayDirectionX() {
		return hatchRayDirectionXESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getHatchRayDirectionY() {
		return hatchRayDirectionY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHatchRayDirectionY(double newHatchRayDirectionY) {
		double oldHatchRayDirectionY = hatchRayDirectionY;
		hatchRayDirectionY = newHatchRayDirectionY;
		boolean oldHatchRayDirectionYESet = hatchRayDirectionYESet;
		hatchRayDirectionYESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.HATCH_FILL_TYPE__HATCH_RAY_DIRECTION_Y, oldHatchRayDirectionY, hatchRayDirectionY, !oldHatchRayDirectionYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetHatchRayDirectionY() {
		double oldHatchRayDirectionY = hatchRayDirectionY;
		boolean oldHatchRayDirectionYESet = hatchRayDirectionYESet;
		hatchRayDirectionY = HATCH_RAY_DIRECTION_Y_EDEFAULT;
		hatchRayDirectionYESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AAAPackage.HATCH_FILL_TYPE__HATCH_RAY_DIRECTION_Y, oldHatchRayDirectionY, HATCH_RAY_DIRECTION_Y_EDEFAULT, oldHatchRayDirectionYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetHatchRayDirectionY() {
		return hatchRayDirectionYESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getHatchDisplacementDirectionX() {
		return hatchDisplacementDirectionX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHatchDisplacementDirectionX(double newHatchDisplacementDirectionX) {
		double oldHatchDisplacementDirectionX = hatchDisplacementDirectionX;
		hatchDisplacementDirectionX = newHatchDisplacementDirectionX;
		boolean oldHatchDisplacementDirectionXESet = hatchDisplacementDirectionXESet;
		hatchDisplacementDirectionXESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.HATCH_FILL_TYPE__HATCH_DISPLACEMENT_DIRECTION_X, oldHatchDisplacementDirectionX, hatchDisplacementDirectionX, !oldHatchDisplacementDirectionXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetHatchDisplacementDirectionX() {
		double oldHatchDisplacementDirectionX = hatchDisplacementDirectionX;
		boolean oldHatchDisplacementDirectionXESet = hatchDisplacementDirectionXESet;
		hatchDisplacementDirectionX = HATCH_DISPLACEMENT_DIRECTION_X_EDEFAULT;
		hatchDisplacementDirectionXESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AAAPackage.HATCH_FILL_TYPE__HATCH_DISPLACEMENT_DIRECTION_X, oldHatchDisplacementDirectionX, HATCH_DISPLACEMENT_DIRECTION_X_EDEFAULT, oldHatchDisplacementDirectionXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetHatchDisplacementDirectionX() {
		return hatchDisplacementDirectionXESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getHatchDisplacementDirectionY() {
		return hatchDisplacementDirectionY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHatchDisplacementDirectionY(double newHatchDisplacementDirectionY) {
		double oldHatchDisplacementDirectionY = hatchDisplacementDirectionY;
		hatchDisplacementDirectionY = newHatchDisplacementDirectionY;
		boolean oldHatchDisplacementDirectionYESet = hatchDisplacementDirectionYESet;
		hatchDisplacementDirectionYESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.HATCH_FILL_TYPE__HATCH_DISPLACEMENT_DIRECTION_Y, oldHatchDisplacementDirectionY, hatchDisplacementDirectionY, !oldHatchDisplacementDirectionYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetHatchDisplacementDirectionY() {
		double oldHatchDisplacementDirectionY = hatchDisplacementDirectionY;
		boolean oldHatchDisplacementDirectionYESet = hatchDisplacementDirectionYESet;
		hatchDisplacementDirectionY = HATCH_DISPLACEMENT_DIRECTION_Y_EDEFAULT;
		hatchDisplacementDirectionYESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AAAPackage.HATCH_FILL_TYPE__HATCH_DISPLACEMENT_DIRECTION_Y, oldHatchDisplacementDirectionY, HATCH_DISPLACEMENT_DIRECTION_Y_EDEFAULT, oldHatchDisplacementDirectionYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetHatchDisplacementDirectionY() {
		return hatchDisplacementDirectionYESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getHatchDisplacementOffset() {
		return hatchDisplacementOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHatchDisplacementOffset(double newHatchDisplacementOffset) {
		double oldHatchDisplacementOffset = hatchDisplacementOffset;
		hatchDisplacementOffset = newHatchDisplacementOffset;
		boolean oldHatchDisplacementOffsetESet = hatchDisplacementOffsetESet;
		hatchDisplacementOffsetESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.HATCH_FILL_TYPE__HATCH_DISPLACEMENT_OFFSET, oldHatchDisplacementOffset, hatchDisplacementOffset, !oldHatchDisplacementOffsetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetHatchDisplacementOffset() {
		double oldHatchDisplacementOffset = hatchDisplacementOffset;
		boolean oldHatchDisplacementOffsetESet = hatchDisplacementOffsetESet;
		hatchDisplacementOffset = HATCH_DISPLACEMENT_OFFSET_EDEFAULT;
		hatchDisplacementOffsetESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AAAPackage.HATCH_FILL_TYPE__HATCH_DISPLACEMENT_OFFSET, oldHatchDisplacementOffset, HATCH_DISPLACEMENT_OFFSET_EDEFAULT, oldHatchDisplacementOffsetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetHatchDisplacementOffset() {
		return hatchDisplacementOffsetESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrokeType3 getStroke() {
		return stroke;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStroke(StrokeType3 newStroke, NotificationChain msgs) {
		StrokeType3 oldStroke = stroke;
		stroke = newStroke;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AAAPackage.HATCH_FILL_TYPE__STROKE, oldStroke, newStroke);
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
	public void setStroke(StrokeType3 newStroke) {
		if (newStroke != stroke) {
			NotificationChain msgs = null;
			if (stroke != null)
				msgs = ((InternalEObject)stroke).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AAAPackage.HATCH_FILL_TYPE__STROKE, null, msgs);
			if (newStroke != null)
				msgs = ((InternalEObject)newStroke).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AAAPackage.HATCH_FILL_TYPE__STROKE, null, msgs);
			msgs = basicSetStroke(newStroke, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.HATCH_FILL_TYPE__STROKE, newStroke, newStroke));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AAAPackage.HATCH_FILL_TYPE__STROKE:
				return basicSetStroke(null, msgs);
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
			case AAAPackage.HATCH_FILL_TYPE__ORIGIN_X:
				return getOriginX();
			case AAAPackage.HATCH_FILL_TYPE__ORIGIN_Y:
				return getOriginY();
			case AAAPackage.HATCH_FILL_TYPE__HATCH_RAY_DIRECTION_X:
				return getHatchRayDirectionX();
			case AAAPackage.HATCH_FILL_TYPE__HATCH_RAY_DIRECTION_Y:
				return getHatchRayDirectionY();
			case AAAPackage.HATCH_FILL_TYPE__HATCH_DISPLACEMENT_DIRECTION_X:
				return getHatchDisplacementDirectionX();
			case AAAPackage.HATCH_FILL_TYPE__HATCH_DISPLACEMENT_DIRECTION_Y:
				return getHatchDisplacementDirectionY();
			case AAAPackage.HATCH_FILL_TYPE__HATCH_DISPLACEMENT_OFFSET:
				return getHatchDisplacementOffset();
			case AAAPackage.HATCH_FILL_TYPE__STROKE:
				return getStroke();
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
			case AAAPackage.HATCH_FILL_TYPE__ORIGIN_X:
				setOriginX((Double)newValue);
				return;
			case AAAPackage.HATCH_FILL_TYPE__ORIGIN_Y:
				setOriginY((Double)newValue);
				return;
			case AAAPackage.HATCH_FILL_TYPE__HATCH_RAY_DIRECTION_X:
				setHatchRayDirectionX((Double)newValue);
				return;
			case AAAPackage.HATCH_FILL_TYPE__HATCH_RAY_DIRECTION_Y:
				setHatchRayDirectionY((Double)newValue);
				return;
			case AAAPackage.HATCH_FILL_TYPE__HATCH_DISPLACEMENT_DIRECTION_X:
				setHatchDisplacementDirectionX((Double)newValue);
				return;
			case AAAPackage.HATCH_FILL_TYPE__HATCH_DISPLACEMENT_DIRECTION_Y:
				setHatchDisplacementDirectionY((Double)newValue);
				return;
			case AAAPackage.HATCH_FILL_TYPE__HATCH_DISPLACEMENT_OFFSET:
				setHatchDisplacementOffset((Double)newValue);
				return;
			case AAAPackage.HATCH_FILL_TYPE__STROKE:
				setStroke((StrokeType3)newValue);
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
			case AAAPackage.HATCH_FILL_TYPE__ORIGIN_X:
				unsetOriginX();
				return;
			case AAAPackage.HATCH_FILL_TYPE__ORIGIN_Y:
				unsetOriginY();
				return;
			case AAAPackage.HATCH_FILL_TYPE__HATCH_RAY_DIRECTION_X:
				unsetHatchRayDirectionX();
				return;
			case AAAPackage.HATCH_FILL_TYPE__HATCH_RAY_DIRECTION_Y:
				unsetHatchRayDirectionY();
				return;
			case AAAPackage.HATCH_FILL_TYPE__HATCH_DISPLACEMENT_DIRECTION_X:
				unsetHatchDisplacementDirectionX();
				return;
			case AAAPackage.HATCH_FILL_TYPE__HATCH_DISPLACEMENT_DIRECTION_Y:
				unsetHatchDisplacementDirectionY();
				return;
			case AAAPackage.HATCH_FILL_TYPE__HATCH_DISPLACEMENT_OFFSET:
				unsetHatchDisplacementOffset();
				return;
			case AAAPackage.HATCH_FILL_TYPE__STROKE:
				setStroke((StrokeType3)null);
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
			case AAAPackage.HATCH_FILL_TYPE__ORIGIN_X:
				return isSetOriginX();
			case AAAPackage.HATCH_FILL_TYPE__ORIGIN_Y:
				return isSetOriginY();
			case AAAPackage.HATCH_FILL_TYPE__HATCH_RAY_DIRECTION_X:
				return isSetHatchRayDirectionX();
			case AAAPackage.HATCH_FILL_TYPE__HATCH_RAY_DIRECTION_Y:
				return isSetHatchRayDirectionY();
			case AAAPackage.HATCH_FILL_TYPE__HATCH_DISPLACEMENT_DIRECTION_X:
				return isSetHatchDisplacementDirectionX();
			case AAAPackage.HATCH_FILL_TYPE__HATCH_DISPLACEMENT_DIRECTION_Y:
				return isSetHatchDisplacementDirectionY();
			case AAAPackage.HATCH_FILL_TYPE__HATCH_DISPLACEMENT_OFFSET:
				return isSetHatchDisplacementOffset();
			case AAAPackage.HATCH_FILL_TYPE__STROKE:
				return stroke != null;
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
		result.append(" (originX: ");
		if (originXESet) result.append(originX); else result.append("<unset>");
		result.append(", originY: ");
		if (originYESet) result.append(originY); else result.append("<unset>");
		result.append(", hatchRayDirectionX: ");
		if (hatchRayDirectionXESet) result.append(hatchRayDirectionX); else result.append("<unset>");
		result.append(", hatchRayDirectionY: ");
		if (hatchRayDirectionYESet) result.append(hatchRayDirectionY); else result.append("<unset>");
		result.append(", hatchDisplacementDirectionX: ");
		if (hatchDisplacementDirectionXESet) result.append(hatchDisplacementDirectionX); else result.append("<unset>");
		result.append(", hatchDisplacementDirectionY: ");
		if (hatchDisplacementDirectionYESet) result.append(hatchDisplacementDirectionY); else result.append("<unset>");
		result.append(", hatchDisplacementOffset: ");
		if (hatchDisplacementOffsetESet) result.append(hatchDisplacementOffset); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //HatchFillTypeImpl
