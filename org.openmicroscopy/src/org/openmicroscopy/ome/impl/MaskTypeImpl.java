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
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.openmicroscopy.ome.BinDataType;
import org.openmicroscopy.ome.MaskType;
import org.openmicroscopy.ome.OMEPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mask Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.impl.MaskTypeImpl#getBinData <em>Bin Data</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.MaskTypeImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.MaskTypeImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.MaskTypeImpl#getX <em>X</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.MaskTypeImpl#getY <em>Y</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MaskTypeImpl extends ShapeImpl implements MaskType {
	/**
	 * The cached value of the '{@link #getBinData() <em>Bin Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinData()
	 * @generated
	 * @ordered
	 */
	protected BinDataType binData;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final float HEIGHT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected float height = HEIGHT_EDEFAULT;

	/**
	 * This is true if the Height attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean heightESet;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final float WIDTH_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected float width = WIDTH_EDEFAULT;

	/**
	 * This is true if the Width attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean widthESet;

	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final float X_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected float x = X_EDEFAULT;

	/**
	 * This is true if the X attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean xESet;

	/**
	 * The default value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected static final float Y_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected float y = Y_EDEFAULT;

	/**
	 * This is true if the Y attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean yESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MaskTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMEPackage.eINSTANCE.getMaskType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BinDataType getBinData() {
		return binData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBinData(BinDataType newBinData, NotificationChain msgs) {
		BinDataType oldBinData = binData;
		binData = newBinData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OMEPackage.MASK_TYPE__BIN_DATA, oldBinData, newBinData);
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
	public void setBinData(BinDataType newBinData) {
		if (newBinData != binData) {
			NotificationChain msgs = null;
			if (binData != null)
				msgs = ((InternalEObject)binData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OMEPackage.MASK_TYPE__BIN_DATA, null, msgs);
			if (newBinData != null)
				msgs = ((InternalEObject)newBinData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OMEPackage.MASK_TYPE__BIN_DATA, null, msgs);
			msgs = basicSetBinData(newBinData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.MASK_TYPE__BIN_DATA, newBinData, newBinData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeight(float newHeight) {
		float oldHeight = height;
		height = newHeight;
		boolean oldHeightESet = heightESet;
		heightESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.MASK_TYPE__HEIGHT, oldHeight, height, !oldHeightESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetHeight() {
		float oldHeight = height;
		boolean oldHeightESet = heightESet;
		height = HEIGHT_EDEFAULT;
		heightESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.MASK_TYPE__HEIGHT, oldHeight, HEIGHT_EDEFAULT, oldHeightESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetHeight() {
		return heightESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWidth(float newWidth) {
		float oldWidth = width;
		width = newWidth;
		boolean oldWidthESet = widthESet;
		widthESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.MASK_TYPE__WIDTH, oldWidth, width, !oldWidthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetWidth() {
		float oldWidth = width;
		boolean oldWidthESet = widthESet;
		width = WIDTH_EDEFAULT;
		widthESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.MASK_TYPE__WIDTH, oldWidth, WIDTH_EDEFAULT, oldWidthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetWidth() {
		return widthESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setX(float newX) {
		float oldX = x;
		x = newX;
		boolean oldXESet = xESet;
		xESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.MASK_TYPE__X, oldX, x, !oldXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetX() {
		float oldX = x;
		boolean oldXESet = xESet;
		x = X_EDEFAULT;
		xESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.MASK_TYPE__X, oldX, X_EDEFAULT, oldXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetX() {
		return xESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getY() {
		return y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setY(float newY) {
		float oldY = y;
		y = newY;
		boolean oldYESet = yESet;
		yESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.MASK_TYPE__Y, oldY, y, !oldYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetY() {
		float oldY = y;
		boolean oldYESet = yESet;
		y = Y_EDEFAULT;
		yESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.MASK_TYPE__Y, oldY, Y_EDEFAULT, oldYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetY() {
		return yESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OMEPackage.MASK_TYPE__BIN_DATA:
				return basicSetBinData(null, msgs);
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
			case OMEPackage.MASK_TYPE__BIN_DATA:
				return getBinData();
			case OMEPackage.MASK_TYPE__HEIGHT:
				return getHeight();
			case OMEPackage.MASK_TYPE__WIDTH:
				return getWidth();
			case OMEPackage.MASK_TYPE__X:
				return getX();
			case OMEPackage.MASK_TYPE__Y:
				return getY();
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
			case OMEPackage.MASK_TYPE__BIN_DATA:
				setBinData((BinDataType)newValue);
				return;
			case OMEPackage.MASK_TYPE__HEIGHT:
				setHeight((Float)newValue);
				return;
			case OMEPackage.MASK_TYPE__WIDTH:
				setWidth((Float)newValue);
				return;
			case OMEPackage.MASK_TYPE__X:
				setX((Float)newValue);
				return;
			case OMEPackage.MASK_TYPE__Y:
				setY((Float)newValue);
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
			case OMEPackage.MASK_TYPE__BIN_DATA:
				setBinData((BinDataType)null);
				return;
			case OMEPackage.MASK_TYPE__HEIGHT:
				unsetHeight();
				return;
			case OMEPackage.MASK_TYPE__WIDTH:
				unsetWidth();
				return;
			case OMEPackage.MASK_TYPE__X:
				unsetX();
				return;
			case OMEPackage.MASK_TYPE__Y:
				unsetY();
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
			case OMEPackage.MASK_TYPE__BIN_DATA:
				return binData != null;
			case OMEPackage.MASK_TYPE__HEIGHT:
				return isSetHeight();
			case OMEPackage.MASK_TYPE__WIDTH:
				return isSetWidth();
			case OMEPackage.MASK_TYPE__X:
				return isSetX();
			case OMEPackage.MASK_TYPE__Y:
				return isSetY();
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
		result.append(" (height: ");
		if (heightESet) result.append(height); else result.append("<unset>");
		result.append(", width: ");
		if (widthESet) result.append(width); else result.append("<unset>");
		result.append(", x: ");
		if (xESet) result.append(x); else result.append("<unset>");
		result.append(", y: ");
		if (yESet) result.append(y); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //MaskTypeImpl
