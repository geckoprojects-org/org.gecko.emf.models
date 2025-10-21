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
import de.online.adv.namespaces.adv.sk.xml.skadv.GraphicType3;
import de.online.adv.namespaces.adv.sk.xml.skadv.HaloType2;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Graphic Type3</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.GraphicType3Impl#getDisplacementX <em>Displacement X</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.GraphicType3Impl#getDisplacementY <em>Displacement Y</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.GraphicType3Impl#getRotation <em>Rotation</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.GraphicType3Impl#getScalefactor <em>Scalefactor</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.GraphicType3Impl#getHalo <em>Halo</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class GraphicType3Impl extends ElementType1Impl implements GraphicType3 {
	/**
	 * The default value of the '{@link #getDisplacementX() <em>Displacement X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplacementX()
	 * @generated
	 * @ordered
	 */
	protected static final double DISPLACEMENT_X_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDisplacementX() <em>Displacement X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplacementX()
	 * @generated
	 * @ordered
	 */
	protected double displacementX = DISPLACEMENT_X_EDEFAULT;

	/**
	 * This is true if the Displacement X attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean displacementXESet;

	/**
	 * The default value of the '{@link #getDisplacementY() <em>Displacement Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplacementY()
	 * @generated
	 * @ordered
	 */
	protected static final double DISPLACEMENT_Y_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDisplacementY() <em>Displacement Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplacementY()
	 * @generated
	 * @ordered
	 */
	protected double displacementY = DISPLACEMENT_Y_EDEFAULT;

	/**
	 * This is true if the Displacement Y attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean displacementYESet;

	/**
	 * The default value of the '{@link #getRotation() <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotation()
	 * @generated
	 * @ordered
	 */
	protected static final double ROTATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRotation() <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotation()
	 * @generated
	 * @ordered
	 */
	protected double rotation = ROTATION_EDEFAULT;

	/**
	 * This is true if the Rotation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rotationESet;

	/**
	 * The default value of the '{@link #getScalefactor() <em>Scalefactor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScalefactor()
	 * @generated
	 * @ordered
	 */
	protected static final double SCALEFACTOR_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getScalefactor() <em>Scalefactor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScalefactor()
	 * @generated
	 * @ordered
	 */
	protected double scalefactor = SCALEFACTOR_EDEFAULT;

	/**
	 * This is true if the Scalefactor attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean scalefactorESet;

	/**
	 * The cached value of the '{@link #getHalo() <em>Halo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHalo()
	 * @generated
	 * @ordered
	 */
	protected HaloType2 halo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphicType3Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AAAPackage.eINSTANCE.getGraphicType3();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getDisplacementX() {
		return displacementX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDisplacementX(double newDisplacementX) {
		double oldDisplacementX = displacementX;
		displacementX = newDisplacementX;
		boolean oldDisplacementXESet = displacementXESet;
		displacementXESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.GRAPHIC_TYPE3__DISPLACEMENT_X, oldDisplacementX, displacementX, !oldDisplacementXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetDisplacementX() {
		double oldDisplacementX = displacementX;
		boolean oldDisplacementXESet = displacementXESet;
		displacementX = DISPLACEMENT_X_EDEFAULT;
		displacementXESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AAAPackage.GRAPHIC_TYPE3__DISPLACEMENT_X, oldDisplacementX, DISPLACEMENT_X_EDEFAULT, oldDisplacementXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetDisplacementX() {
		return displacementXESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getDisplacementY() {
		return displacementY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDisplacementY(double newDisplacementY) {
		double oldDisplacementY = displacementY;
		displacementY = newDisplacementY;
		boolean oldDisplacementYESet = displacementYESet;
		displacementYESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.GRAPHIC_TYPE3__DISPLACEMENT_Y, oldDisplacementY, displacementY, !oldDisplacementYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetDisplacementY() {
		double oldDisplacementY = displacementY;
		boolean oldDisplacementYESet = displacementYESet;
		displacementY = DISPLACEMENT_Y_EDEFAULT;
		displacementYESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AAAPackage.GRAPHIC_TYPE3__DISPLACEMENT_Y, oldDisplacementY, DISPLACEMENT_Y_EDEFAULT, oldDisplacementYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetDisplacementY() {
		return displacementYESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getRotation() {
		return rotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRotation(double newRotation) {
		double oldRotation = rotation;
		rotation = newRotation;
		boolean oldRotationESet = rotationESet;
		rotationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.GRAPHIC_TYPE3__ROTATION, oldRotation, rotation, !oldRotationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetRotation() {
		double oldRotation = rotation;
		boolean oldRotationESet = rotationESet;
		rotation = ROTATION_EDEFAULT;
		rotationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AAAPackage.GRAPHIC_TYPE3__ROTATION, oldRotation, ROTATION_EDEFAULT, oldRotationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRotation() {
		return rotationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getScalefactor() {
		return scalefactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScalefactor(double newScalefactor) {
		double oldScalefactor = scalefactor;
		scalefactor = newScalefactor;
		boolean oldScalefactorESet = scalefactorESet;
		scalefactorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.GRAPHIC_TYPE3__SCALEFACTOR, oldScalefactor, scalefactor, !oldScalefactorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetScalefactor() {
		double oldScalefactor = scalefactor;
		boolean oldScalefactorESet = scalefactorESet;
		scalefactor = SCALEFACTOR_EDEFAULT;
		scalefactorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AAAPackage.GRAPHIC_TYPE3__SCALEFACTOR, oldScalefactor, SCALEFACTOR_EDEFAULT, oldScalefactorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetScalefactor() {
		return scalefactorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HaloType2 getHalo() {
		return halo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHalo(HaloType2 newHalo, NotificationChain msgs) {
		HaloType2 oldHalo = halo;
		halo = newHalo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AAAPackage.GRAPHIC_TYPE3__HALO, oldHalo, newHalo);
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
	public void setHalo(HaloType2 newHalo) {
		if (newHalo != halo) {
			NotificationChain msgs = null;
			if (halo != null)
				msgs = ((InternalEObject)halo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AAAPackage.GRAPHIC_TYPE3__HALO, null, msgs);
			if (newHalo != null)
				msgs = ((InternalEObject)newHalo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AAAPackage.GRAPHIC_TYPE3__HALO, null, msgs);
			msgs = basicSetHalo(newHalo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.GRAPHIC_TYPE3__HALO, newHalo, newHalo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AAAPackage.GRAPHIC_TYPE3__HALO:
				return basicSetHalo(null, msgs);
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
			case AAAPackage.GRAPHIC_TYPE3__DISPLACEMENT_X:
				return getDisplacementX();
			case AAAPackage.GRAPHIC_TYPE3__DISPLACEMENT_Y:
				return getDisplacementY();
			case AAAPackage.GRAPHIC_TYPE3__ROTATION:
				return getRotation();
			case AAAPackage.GRAPHIC_TYPE3__SCALEFACTOR:
				return getScalefactor();
			case AAAPackage.GRAPHIC_TYPE3__HALO:
				return getHalo();
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
			case AAAPackage.GRAPHIC_TYPE3__DISPLACEMENT_X:
				setDisplacementX((Double)newValue);
				return;
			case AAAPackage.GRAPHIC_TYPE3__DISPLACEMENT_Y:
				setDisplacementY((Double)newValue);
				return;
			case AAAPackage.GRAPHIC_TYPE3__ROTATION:
				setRotation((Double)newValue);
				return;
			case AAAPackage.GRAPHIC_TYPE3__SCALEFACTOR:
				setScalefactor((Double)newValue);
				return;
			case AAAPackage.GRAPHIC_TYPE3__HALO:
				setHalo((HaloType2)newValue);
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
			case AAAPackage.GRAPHIC_TYPE3__DISPLACEMENT_X:
				unsetDisplacementX();
				return;
			case AAAPackage.GRAPHIC_TYPE3__DISPLACEMENT_Y:
				unsetDisplacementY();
				return;
			case AAAPackage.GRAPHIC_TYPE3__ROTATION:
				unsetRotation();
				return;
			case AAAPackage.GRAPHIC_TYPE3__SCALEFACTOR:
				unsetScalefactor();
				return;
			case AAAPackage.GRAPHIC_TYPE3__HALO:
				setHalo((HaloType2)null);
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
			case AAAPackage.GRAPHIC_TYPE3__DISPLACEMENT_X:
				return isSetDisplacementX();
			case AAAPackage.GRAPHIC_TYPE3__DISPLACEMENT_Y:
				return isSetDisplacementY();
			case AAAPackage.GRAPHIC_TYPE3__ROTATION:
				return isSetRotation();
			case AAAPackage.GRAPHIC_TYPE3__SCALEFACTOR:
				return isSetScalefactor();
			case AAAPackage.GRAPHIC_TYPE3__HALO:
				return halo != null;
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
		result.append(" (displacementX: ");
		if (displacementXESet) result.append(displacementX); else result.append("<unset>");
		result.append(", displacementY: ");
		if (displacementYESet) result.append(displacementY); else result.append("<unset>");
		result.append(", rotation: ");
		if (rotationESet) result.append(rotation); else result.append("<unset>");
		result.append(", scalefactor: ");
		if (scalefactorESet) result.append(scalefactor); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //GraphicType3Impl
